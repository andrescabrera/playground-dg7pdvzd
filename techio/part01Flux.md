# Flux

## Descripción

Un `Flux<T>` es un `Publisher` de Reactive Streams, aumentado con un montón de operadores que puedan ser
usados para generar, transformar, orquestar secuencias Flux.

Este puede emitir de 0 a _n_ `<T>` elementos (eventos `onNext`) entonces se completa o finaliza con error
(eventos terminales `onComplete` y `onError`). Si no hay eventos terminales disparados, el
`Flux` es infinito.

- Factorias Estaticas en el Flux permite crear origenes, o generarlos desde distintos tipos de callbacks.
- Los metodos de instancia, llamados operadores, te permiten construir tuberias (`pipelines`) de procesamiento asíncrono que
  producirán una secuencia asíncrona.
- Cada `Flux#subscribe()` o la operación de multidifusión, como `Flux#publish` y `Flux#publishNext`
  permitirán materializar una instancia dedicada del pipeline y disparar el flujo de datos dentro de este.

Mirá el javadoc [aqui](http://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html).

![Diagrama Marble representando un Flux](/techio/assets/flux.png)

`Flux` en acción :

```java
Flux.fromIterable(getSomeLongList())
    .delayElements(Duration.ofMillis(100))
    .doOnNext(serviceA::someObserver)
    .map(d -> d * 2)
    .take(3)
    .onErrorResumeWith(errorHandler::fallback)
    .doAfterTerminate(serviceM::incrementTerminate)
    .subscribe(System.out::println);
```

## Práctica

En esta leccion veremos los distintos metodos factoría para crear un `Flux`.

> ![Consejo](/techio/assets/tip.png) **TIP**: Si quieres algo de información sobre lo que está pasando
dentro de un `Flux` o `Mono` estás a punto de regresar durante uno de estos ejercicios, puedes
siempre anexar `.log()` al flujo justo antes de devolverlo. La Parte 6 se hace uso de eso. 

Probemos un ejemplo muy simple: simplemente devuelve un flujo vacío.


```java
static <T> Flux<T> empty()
// Crea un flujo que se completa sin emitir ningún elemento.
```
@[Empty flux]({"stubs": ["/src/main/java/io/pivotal/literx/Part01Flux.java"], "command": "io.pivotal.literx.Part01FluxTest#empty", "layout":"aside"})



Uno también puede crear fácilmente un `Flux` de datos previamente disponibles:

```java
static <T> Flux<T> just(T... data)
// Crea un nuevo Flux que emita el (los) elemento(s) especificado(s) y luego completa.
```

@[Flux from values]({"stubs": ["/src/main/java/io/pivotal/literx/Part01Flux.java"], "command": "io.pivotal.literx.Part01FluxTest#fromValues", "layout":"aside"})


Esta vez utilizaremos elementos de una lista para publicar en el flujo con `fromIterable`:
```java
static <T> Flux<T> fromIterable(Iterable<? extends T> it)
// Cree un flujo que emita los elementos contenidos en el Iterable proporcionado.
```

@[Create a Flux from a List]({"stubs": ["/src/main/java/io/pivotal/literx/Part01Flux.java"], "command": "io.pivotal.literx.Part01FluxTest#fromList", "layout":"aside"})


En el código síncrono imperativo, es fácil administrar las excepciones con el familiar bloque `try`-`catch`
, instrucciones `throw`...

Pero en un contexto asincrónico, tenemos que hacer las cosas de forma un poco diferente. Reactive Streams
define la señal `onError` para tratar con excepciones. Nota que tal evento **es terminal:
este es el último evento que el `Flux` producirá**.

`Flux#error` produce un `Flux` que simplemente emita una señal, terminando inmediatamente:

```java
static <T> Flux<T> error(Throwable error)
// Crea un flujo que se complete con el error especificado.
```

@[Create a Flux that emits an IllegalStateException]({"stubs": ["/src/main/java/io/pivotal/literx/Part01Flux.java"], "command": "io.pivotal.literx.Part01FluxTest#error", "layout":"aside"})


Para finalizar con `Flux`, intentemos crear un flujo que produzca diez elementos a un ritmo regular.
Para hacer esa publicación regular, podemos usar `interval`.
Pero produce una corriente infinita (como tics de un reloj), y queremos tomar (`take`) solo
10 elementos, por lo que no olvides de precisarlo.

```java
static Flux<Long> interval(Duration period)
// Crea un nuevo Flux que emite para siempre un Long de forma incremental, comenzando con 0, por cada periodo en el temporizador global.
```

@[Create a Flux that emits 10 increasing values]({"stubs": ["/src/main/java/io/pivotal/literx/Part01Flux.java"], "command": "io.pivotal.literx.Part01FluxTest#countEach100ms", "layout":"aside"})
