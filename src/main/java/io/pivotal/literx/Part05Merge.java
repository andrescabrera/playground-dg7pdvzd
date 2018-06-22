package io.pivotal.literx;

//generic imports to help with simpler IDEs (ie tech.io)
import java.util.*;
import java.util.function.*;
import java.time.*;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Aprende como mezclar un flux.
 *
 * @author Sebastien Deleuze
 */
public class Part05Merge {

//========================================================================================

	// TODO Mezcla los valores del flux1 y flux2 con entremezclado
	Flux<User> mergeFluxWithInterleave(Flux<User> flux1, Flux<User> flux2) {
		return null;
	}

//========================================================================================

	// TODO Mezcla los valores del flux1 y del flux2 sin entremezclar (valores del flux1 y luego valores del flux2)
	Flux<User> mergeFluxWithNoInterleave(Flux<User> flux1, Flux<User> flux2) {
		return null;
	}

//========================================================================================

	// TODO Crea un Flux que contenga el valor del mono1 y luego el valor del mono2
	Flux<User> createFluxFromMultipleMono(Mono<User> mono1, Mono<User> mono2) {
		return null;
	}

}
