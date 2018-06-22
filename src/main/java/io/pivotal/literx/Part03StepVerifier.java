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
import reactor.test.StepVerifier;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;

import static org.assertj.core.api.Assertions.*;

/**
 * Aprende a utilizar StepVerifier para testear un Mono, Flux o cualquier otro tipo de Publisher de Reactive Streams.
 *
 * @author Sebastien Deleuze
 * @see <a href="http://projectreactor.io/docs/test/release/api/reactor/test/StepVerifier.html">StepVerifier Javadoc</a>
 */
public class Part03StepVerifier {

//========================================================================================

	// TODO Usa StepVerifier para comprobar que un parametro flux emita un elemento "foo" y un "bar"
	// y luego se complete satisfactoriamente.
	void expectFooBarComplete(Flux<String> flux) {
		fail();
	}

//========================================================================================

	// TODO Usa StepVerifier para comprobar que un parametro flux emita un elemento "foo" y un "bar"
	// y luego un error RuntimeException.
	void expectFooBarError(Flux<String> flux) {
		fail();
	}

//========================================================================================

	// TODO Usa StepVerifier para comprobar que un parametro flux emita un User con un nombre de usuario "swhite"
	// y otro con "jpinkman" y luego se complete de forma satisfactoria.
	void expectSkylerJesseComplete(Flux<User> flux) {
		fail();
	}

//========================================================================================

	// TODO Espera 10 elementos y luego se completa, luego te informa cuanto tiempo tomó el test.
	void expect10Elements(Flux<Long> flux) {
		fail();
	}

//========================================================================================

	// TODO Espera 3600 elementos cada intervalos de 1 segundo, y verifica los mas rapidos de 3600s
	// mediante la manipulacioón virtual del tiempo gracias a StepVerifier#withVirtualTime,
	// luego informa cuanto tiempo tomó la prueba
	void expect3600Elements(Supplier<Flux<Long>> supplier) {
		fail();
	}

	private void fail() {
		throw new AssertionError("workshop not implemented");
	}

}
