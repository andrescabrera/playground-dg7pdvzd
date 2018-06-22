package io.pivotal.literx;

//generic imports to help with simpler IDEs (ie tech.io)
import java.util.*;
import java.util.function.*;
import java.time.*;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Aprende como usar otros operadores varios.
 *
 * @author Sebastien Deleuze
 */
public class Part08OtherOperations {

//========================================================================================

	// TODO Crea un Flux de user desde un Flux de username, firstname y lastname.
	Flux<User> userFluxFromStringFlux(Flux<String> usernameFlux, Flux<String> firstnameFlux, Flux<String> lastnameFlux) {
		return null;
	}

//========================================================================================

	// TODO Devuelve el mono el cual devuelva su valor más rápido
	Mono<User> useFastestMono(Mono<User> mono1, Mono<User> mono2) {
		return null;
	}

//========================================================================================

	// TODO Devuelve el flux el cual devuelva el primer valor más rápido
	Flux<User> useFastestFlux(Flux<User> flux1, Flux<User> flux2) {
		return null;
	}

//========================================================================================

	// TODO Convierte el input Flux<User> en un Mono<Void> que representa la señal de compleción del flux
	Mono<Void> fluxCompletion(Flux<User> flux) {
		return null;
	}

//========================================================================================

	// TODO Devuelve un Mono válido, tanto para un input user de valor null como para uno de valor no nulo (pista: Reactive Streams no acepta nulos)
	Mono<User> nullAwareUserToMono(User user) {
		return null;
	}

//========================================================================================

	// TODO Devuelve el mismo mono pasado como parámetro de entrada, esperando que este emita User.SKYLER cuando esté vacío
	Mono<User> emptyToSkyler(Mono<User> mono) {
		return null;
	}

}
