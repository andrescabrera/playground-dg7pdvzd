# Mono

## Descripción

Un `Mono<T>` es un `Publisher` de Reactive Streams, también aumentado con un conjunto de operadores que
se pueden usar para generar, transformar, orquestar secuencias de Mono.

Es una especialización de `Flux` que puede emitir **al menos 1 elemento `<T>`**: un Mono es tanto
valuado (completo con un elemento), vacío (completo sin elemento) o fallido (error).

Un `Mono<Void>` puede usarse en casos donde solo interesa la señal de finalización (el
equivalente en Reactive Streams de la compleción de una tarea `Runnable`).

Tal como con `Flux`, los operadores pueden usarse para definir un pipeline asincróno que será
materializado de nuevo para cada `Subscription`.

Tenga en cuenta que algunas API que cambian la cardinalidad de la secuencia retornarán un `Flux` (y vice-versa,
existen APIs que reducen la cardinalidad a 1 en un `Flux` las cuales retornarán un `Mono`).

Mira el javadoc [aquí](http://projectreactor.io/docs/core/release/api/reactor/core/publisher/Mono.html).

![Diagrama Marble representación de un Mono](/techio/assets/mono.png)

`Mono` en acción:

```java
Mono.just(1)
    .map(integer -> "foo" + integer)
    .or(Mono.delay(Duration.ofMillis(100)))
    .subscribe(System.out::println);
```

## Práctica 


Como con el Flux, vamos a retornar un `Mono` usando la factoría estática.

```java
static <T> Mono<T> empty()
// Crea un Mono que se completa sin emitir ningún elemento.
```
@[Empty Mono]({"stubs": ["/src/main/java/io/pivotal/literx/Part02Mono.java"], "command": "io.pivotal.literx.Part02MonoTest#empty", "layout":"aside"})



Ahora, intentaremos crear un `Mono` que nunca emita nada.
A diferencia de `empty()`, ni siquiera emitirá un evento `onComplete`.

@[No Emission]({"stubs": ["/src/main/java/io/pivotal/literx/Part02Mono.java"], "command": "io.pivotal.literx.Part02MonoTest#noSignal", "layout":"aside"})


Al igual que con `Flux`, podemos crear un `Mono` a partir de un (único) valor ya disponible.

@[Create a Mono from an item]({"stubs": ["/src/main/java/io/pivotal/literx/Part02Mono.java"], "command": "io.pivotal.literx.Part02MonoTest#fromValue", "layout":"aside"})


Y exactamente como lo hicimos con flux, podemos propagar excepciones.


@[Create a Mono that emits an IllegalStateException]({"stubs": ["/src/main/java/io/pivotal/literx/Part02Mono.java"], "command": "io.pivotal.literx.Part02MonoTest#error", "layout":"aside"})


