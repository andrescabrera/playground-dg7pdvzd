package io.pivotal.literx;

//generic imports to help with simpler IDEs (ie tech.io)
import java.util.*;
import java.util.function.*;
import java.time.*;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Aprende a transformar valores
 *
 * @author Sebastien Deleuze
 */
public class Part04Transform {

//========================================================================================

	// TODO Pone en mayúsculas el username, firstname y lastname del User
	Mono<User> capitalizeOne(Mono<User> mono) {
		return null;
	}

//========================================================================================

	// TODO Pone en mayúsculas el username, firstname y lastname de cada User
	Flux<User> capitalizeMany(Flux<User> flux) {
		return null;
	}

//========================================================================================

	// TODO Pone en mayúsculas el username, firstname y lastname de cada User, usando #asyncCapitalizeUser
	Flux<User> asyncCapitalizeMany(Flux<User> flux) {
		return null;
	}

	Mono<User> asyncCapitalizeUser(User u) {
		return Mono.just(new User(u.getUsername().toUpperCase(), u.getFirstname().toUpperCase(), u.getLastname().toUpperCase()));
	}

}
