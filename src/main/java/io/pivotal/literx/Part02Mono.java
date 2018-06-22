package io.pivotal.literx;

//generic imports to help with simpler IDEs (ie tech.io)
import java.util.*;
import java.util.function.*;
import java.time.*;

import reactor.core.publisher.Mono;

/**
 * Aprende a crear instancias de Mono.
 *
 * @author Sebastien Deleuze
 * @see <a href="http://projectreactor.io/docs/core/release/api/reactor/core/publisher/Mono.html">Mono Javadoc</a>
 */
public class Part02Mono {

//========================================================================================

	// TODO Devuelve un Mono vacío
	Mono<String> emptyMono() {
		return null;
	}

//========================================================================================

	// TODO Devuelve un Mono que nunca emite una señal
	Mono<String> monoWithNoSignal() {
		return null;
	}

//========================================================================================

	// TODO Devuelve un Mono que contiene un valor "foo"
	Mono<String> fooMono() {
		return null;
	}

//========================================================================================

	// TODO Crea un Mono que emite una IllegalStateException
	Mono<String> errorMono() {
		return null;
	}

}
