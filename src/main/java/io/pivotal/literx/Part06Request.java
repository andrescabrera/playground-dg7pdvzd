package io.pivotal.literx;

//generic imports to help with simpler IDEs (ie tech.io)
import java.util.*;
import java.util.function.*;
import java.time.*;

import io.pivotal.literx.domain.User;
import io.pivotal.literx.repository.ReactiveRepository;
import io.pivotal.literx.repository.ReactiveUserRepository;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

/**
 * Aprende a controlar la demanda
 *
 * @author Sebastien Deleuze
 */
public class Part06Request {

	ReactiveRepository<User> repository = new ReactiveUserRepository();

//========================================================================================

	// TODO Crea un StepVerifier que inicialmente solicita todos los valores y espera recibir 4 valores
	StepVerifier requestAllExpectFour(Flux<User> flux) {
		return null;
	}

//========================================================================================

	// TODO Crea un StepVerifier que inicialmente solicita 1 valor y espera un User.SKYLER entonces
	// solicita otro valor y espera User.JESSE.
	StepVerifier requestOneExpectSkylerThenRequestOneExpectJesse(Flux<User> flux) {
		return null;
	}

//========================================================================================

	// TODO Devuelve un Flux con todos los usuarios almacenados en el repositorio e imprime logs automáticamente
	// en cada señal de Reactive Streams
	Flux<User> fluxWithLog() {
		return null;
	}

//========================================================================================

	// TODO Devuelve un Flux con todos los usuarios almacenados en el repositorio e imprime
	// "Starring:" en la suscripción, "firstname lastname" para cada uno de los valores y "The end!" en la compleción.
	Flux<User> fluxWithDoOnPrintln() {
		return null;
	}

}
