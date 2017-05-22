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

import java.time.Duration;
import java.util.function.Supplier;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

/**
 * Learn how to use StepVerifier to test Mono, Flux or any other kind of Reactive Streams Publisher.
 *
 * @author Sebastien Deleuze
 * @see <a href="http://projectreactor.io/docs/test/release/api/reactor/test/StepVerifier.html">StepVerifier Javadoc</a>
 */
public class Part03StepVerifier {

//========================================================================================

	// TODO Use StepVerifier to check that the flux parameter emits "foo" and "bar" elements then completes successfully.
	void expectFooBarComplete(Flux<String> flux) {
		StepVerifier.create(flux)
				.expectNext("foo", "bar")
				.verifyComplete(); // TO BE REMOVED
	}

//========================================================================================

	// TODO Use StepVerifier to check that the flux parameter emits "foo" and "bar" elements then a RuntimeException error.
	void expectFooBarError(Flux<String> flux) {
		StepVerifier.create(flux)
				.expectNext("foo", "bar")
				.verifyError(RuntimeException.class); // TO BE REMOVED
	}

//========================================================================================

	// TODO Use StepVerifier to check that the flux parameter emits a User with "swhite" username and another one with "jpinkman" then completes successfully.
	void expectSkylerJesseComplete(Flux<User> flux) {
		StepVerifier.create(flux)
				.expectNextMatches(user -> user.getUsername().equals("swhite"))
				.expectNextMatches(user -> user.getUsername().equals("jpinkman"))
				.verifyComplete(); // TO BE REMOVED
	}

//========================================================================================

	// TODO Expect 10 elements then complete and notice how long it takes for running the test
	void expect10Elements(Flux<Long> flux) {
		StepVerifier.create(flux)
                .expectNextCount(10)
                .verifyComplete(); // TO BE REMOVED
	}

//========================================================================================

	// TODO Expect 3600 elements then complete using the virtual time capabilities provided via StepVerifier.withVirtualTime() and notice how long it takes for running the test
	void expect3600Elements(Supplier<Flux<Long>> supplier) {
		StepVerifier.withVirtualTime(supplier)
		            .thenAwait(Duration.ofHours(1))
		            .expectNextCount(3600)
		            .verifyComplete(); // TO BE REMOVED
	}

	private void fail() {
		throw new AssertionError("workshop not implemented");
	}

}