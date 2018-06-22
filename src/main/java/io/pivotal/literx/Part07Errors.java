/*
 * Copyright (c) 2011-2017 Pivotal Software Inc, All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.pivotal.literx;

import io.pivotal.literx.domain.User;
import reactor.core.Exceptions;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Aprende como trabajar con errores.
 *
 * @author Sebastien Deleuze
 * @see Exceptions#propagate(Throwable)
 */
public class Part07Errors {

//========================================================================================

	// TODO Devuelve un Mono<User> conteniendo User.SAUL cuando un error ocurre en el Mono de entrada, sino no cambia el Mono de entrada.
	Mono<User> betterCallSaulForBogusMono(Mono<User> mono) {
		return null;
	}

//========================================================================================

	// TODO Devuelve un Flux<User> conteniendo User.SAUL y User.JESSE cuando un error ocurre en el Flux de entrada, sino no cambia el Flux de entrada.
	Flux<User> betterCallSaulAndJesseForBogusFlux(Flux<User> flux) {
		return null;
	}

//========================================================================================

	// TODO Implementa un metodo que ponga en mayuscula cada usuario del flux entrante utilizando un
	// metodo #capitalizeUser y emita un error conteniendo una excepcioón del tipo GetOutOfHereException
	Flux<User> capitalizeMany(Flux<User> flux) {
		return null;
	}

	User capitalizeUser(User user) throws GetOutOfHereException {
		if (user.equals(User.SAUL)) {
			throw new GetOutOfHereException();
		}
		return new User(user.getUsername(), user.getFirstname(), user.getLastname());
	}

	protected final class GetOutOfHereException extends Exception {
	}

}
