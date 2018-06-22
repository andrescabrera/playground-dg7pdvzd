/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.pivotal.literx;

//generic imports to help with simpler IDEs (ie tech.io)
import java.util.*;
import java.util.function.*;
import java.time.*;

import java.util.concurrent.CompletableFuture;

import io.pivotal.literx.domain.User;
import io.pivotal.literx.repository.ReactiveRepository;
import io.pivotal.literx.repository.ReactiveUserRepository;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Aprende como adaptar desde/hacia Observable/Single/Flowable de RxJava 2 y Java 8+ CompletableFuture.
 *
 * Mono y Flux ya implementan las interfaces de Reactive Streams por lo que son compatibles nativamente
 * con Reactive Streams + aqui hay {@link Mono#from(Publisher)} y {@link Flux#from(Publisher)}
 * factory methods.
 *
 * Para RxJava 2, no deberías usar el Reactor Adapter pero solo entre RxJava 2 y Reactor Core.
 *
 * @author Sebastien Deleuze
 */
public class Part09Adapt {

	ReactiveRepository<User> repository = new ReactiveUserRepository();

//========================================================================================

	// TODO Adapta Flux a un Flowable de RxJava
	Flowable<User> fromFluxToFlowable(Flux<User> flux) {
		return null;
	}

	// TODO Adapta un Flowable de RxJava a un Flux
	Flux<User> fromFlowableToFlux(Flowable<User> flowable) {
		return null;
	}

//========================================================================================

	// TODO Adapta un Flux a RxJava Observable
	Observable<User> fromFluxToObservable(Flux<User> flux) {
		return null;
	}

	// TODO Adapta un Observable de RxJava a Flux
	Flux<User> fromObservableToFlux(Observable<User> observable) {
		return null;
	}

//========================================================================================

	// TODO Adapta un Mono a un Single de RxJava
	Single<User> fromMonoToSingle(Mono<User> mono) {
		return null;
	}

	// TODO Adapta un Single de RxJava a un Mono
	Mono<User> fromSingleToMono(Single<User> single) {
		return null;
	}

//========================================================================================

	// TODO Adapta un Mono a un CompletableFuture de Java 8+
	CompletableFuture<User> fromMonoToCompletableFuture(Mono<User> mono) {
		return null;
	}

	// TODO Adapta un CompletableFuture Java 8+ a un Mono
	Mono<User> fromCompletableFutureToMono(CompletableFuture<User> future) {
		return null;
	}

}
