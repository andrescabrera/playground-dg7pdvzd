package io.pivotal.literx;

//generic imports to help with simpler IDEs (ie tech.io)
import java.util.*;
import java.util.function.*;
import java.time.*;

import reactor.core.publisher.Flux;

/**
 * Aprende a crear instancias de Flux.
 *
 * @author Sebastien Deleuze
 * @see <a href="http://projectreactor.io/docs/core/release/api/reactor/core/publisher/Flux.html">Flux Javadoc</a>
 */
public class Part01Flux {

//========================================================================================

	// TODO Devuelve un Flux vacío
	Flux<String> emptyFlux() {
		return null;
	}

//========================================================================================

	// TODO Devuelve un Flux que contiene 2 valores "foo" y "bar", sin usar colecciones ni vectores
	Flux<String> fooBarFluxFromValues() {
		return null;
	}

//========================================================================================

	// TODO Crea un Flux a partir de una lista que contiene 2 valores "foo" y "bar"
	Flux<String> fooBarFluxFromList() {
		return null;
	}

//========================================================================================

	// TODO Crea un Flux el cual emite una IllegalStateException
	Flux<String> errorFlux() {
		return null;
	}

//========================================================================================

		// TODO Crea un Flux que emite valores incrementales desde 0 hasta 9 cada 100ms
	Flux<Long> counter() {
		return null;
	}

}
