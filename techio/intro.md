¿Quieres mejorar el contenido? [Fork me on GitHub](https://github.com/reactor/lite-rx-api-hands-on/tree/techio_course)

# Introducción a la Programación Reactiva

Reactor 3 es una librería construida alrededor de la especificación `Reactive Streams`, trayendo el paradigma de la  **Programación Reactiva** en la JVM.

In this course, you'll familiarize with the Reactor API. So let's make a quick introduction
to the more general concepts in Reactive Streams and Reactive Programming.

## Por que?

La Programación Reactiva es un nuevo paradigma en el cual tu usas _código declarativo_ (de una forma similar que en la _programación funcional_) de tal forma de construir tuberías de procesamiento asíncrono.
Este es un modelo basado en eventos, donde los datos son empujados hacia el consumidor, a medida que están disponibles:
nosotros trabajamos con secuencias asíncronas de eventos.

Esto es importante si queremos conseguir ser más eficientes con los mismos recursos e incrementar la capacidad de la
aplicación de atender un mayor número de clientes, sin el dolor de cabeza de escribir código concurrente de bajo nivel
ó código paralelo.

Al ser construida alrededor de los pilares centrales de ser complemente **asíncrona** y **no-bloqueante**,
la Programación Reactiva es una alternativa a las formas más limitadas de hacer código asíncrono
en el JDK: tales como APIs basados en _Callbacks_ y `Future`.

Esta también facilita la composición, que a su vez hace el código asíncrono más legible y
mantenible.

## Reactive Streams

La especificación **Reactive Streams** es un esfuerzo conducido por la industria para estandarizar 
librerías de Programacion Reactiva en la JVM, y más importante, especificar como estas deben comportarse, de tal forma de
que estas sean interoperables. Entre las implementaciones se incluyen tanto Reactor 3 como también RxJava 2, Akka Streams,
Vert.x and Ratpack.

Esta contiene 4 interfaces muy simples como también un TCK, que no debe pasarse por alto dado que
ya que son las reglas de la especificación las que le aportan mayor valor.

Sin embargo, desde la perspectiva del usuario, es bastante bajo nivel. Reactor 3 apunta a ofrecer un
API de alto nivel que que pueda utilizarse en una amplia variedad de situaciones, construida por sobre
el `Publisher` de Reactive Streams.

## Interacciones

En las secuencias reactivas, el `Publisher` originante produce datos. Pero por defecto, este no hace
nada hasta que un `Subscriber` sea registrado (**suscripto**), en este momento este hará un _push_
de datos hacia el.

![Publisher and Subscriber](/techio/assets/PublisherSubscriber.png)

Reactor agrega el concepto de **operadores**, los cuales son combinados entre sí para describir que
procesamiento aplicar en cada etapa de los datos. El aplicar un operador devuelve un nuevo `Publisher` intermediario 
 (de hecho, se puede pensar que es un Subscriber para el operator en el upstream
y un Publisher en el downstream). La forma final de los datos termina finalizando en un `Subscriber`
el que define que hacer desde la perspectiva del usuario.

## Preguntas

?[Cual de estos tipos estan definidos en la especificación Reactive Streams?]
 - [ ] `Observable`
 - [X] `Subscriber`
 - [ ] `Listener`
 - [X] `Publisher`
 - [ ] `Operator`

?[Para crear un Publisher o Subscriber de Reactive Stream...]
 - [ ] ... Simplemente necesito implementar 4 interfaces
 - [X] ... su código debe cumplir con la especificación y pasar el TCK
 - [X] ... Debo favorecer el uso de una biblioteca existente como Reactor

```java
Publisher<Integer> source = Flux.range(1, 10);
```

?[En el código anterior, ¿qué olvidé?]
 - [ ] De aplicar un operador
 - [X] De suscribirme
 - [ ] De registrar un callback

```java
Flux<String> flux = Flux.just("A");
flux.map(s -> "foo" + s);
flux.subscribe(System.out::println);
```

?[Esperaba que el código anterior emitiera "fooA" pero no fue así, ¿por qué?]
 - [ ] Olvidé suscribirme
 - [X] El resultado del operador `map` es un nuevo Flux que se descartó
 - [ ] Tuve un error de sintaxis

## En la próxima lección, profundizaremos en la API de Reactor, siguiendo con sus dos `Publisher` especializados.