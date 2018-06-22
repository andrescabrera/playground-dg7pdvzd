package io.pivotal.literx;

//generic imports to help with simpler IDEs (ie tech.io)
import java.util.*;
import java.util.function.*;
import java.time.*;

import io.pivotal.literx.domain.User;
import io.pivotal.literx.repository.BlockingRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

/**
 * Aprende como llamar código bloqueante desde uno Reactivo, con una estrategia de concurrencia adaptada para
 * codigo bloqueante el cual produce o recibe datos.
 *
 * Para aquellos que ya conocen RxJava:
 *  - RxJava subscribeOn = Reactor subscribeOn
 *  - RxJava observeOn = Reactor publishOn
 *  - RxJava Schedulers.io <==> Reactor Schedulers.elastic
 *
 * @author Sebastien Deleuze
 * @see Flux#subscribeOn(Scheduler)
 * @see Flux#publishOn(Scheduler)
 * @see Schedulers
 */
public class Part11BlockingToReactive {

//========================================================================================

	// TODO Crea un Flux para la lectura de los usuario desde un repository bloqueante diferido mientras
	// el flux esta suscripto, y lo ejecuta con un elastic scheduler
	Flux<User> blockingRepositoryToFlux(BlockingRepository<User> repository) {
		return null;
	}

//========================================================================================

	// TODO Inserta usuarios contenidos en el parametro Flux en el repositorio bloqueante,
	// usando un elastic scheduler y devuelve un Mono<Void> el cual informa la señal de fin de la operación.
	Mono<Void> fluxToBlockingRepository(Flux<User> flux, BlockingRepository<User> repository) {
		return null;
	}

}
