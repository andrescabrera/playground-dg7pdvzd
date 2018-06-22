package io.pivotal.literx;

//generic imports to help with simpler IDEs (ie tech.io)
import java.util.*;
import java.util.function.*;
import java.time.*;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Aprende a convertir un API Reactivo en uno bloqueante.
 *
 * @author Sebastien Deleuze
 */
public class Part10ReactiveToBlocking {

//========================================================================================

	// TODO Devuelve el usuario contenido en el Mono
	User monoToValue(Mono<User> mono) {
		return null;
	}

//========================================================================================

	// TODO Devuelve los usuario contenidos en el Flux
	Iterable<User> fluxToValues(Flux<User> flux) {
		return null;
	}

}
