package example.java8.optional;

import java.util.Optional;

import example.java8.optional.beans.Soundcard;

public class CreatingOptionalMain {

	public static void main(String[] args) {

		//Crating optional objects

		//An empty Optional
		Optional<Soundcard> sc1 = Optional.empty();
		sc1.ifPresent(System.out::println);
		System.out.println(sc1.isPresent());
		
		//An Optional with a non-null value
		Soundcard soundcard = new Soundcard();
		Optional<Soundcard> sc2 = Optional.of(soundcard);
		sc2.ifPresent(System.out::println);
		System.out.println(sc2.isPresent());
		//f soundcard were null, a NullPointerException would be immediately thrown
		
		soundcard = null;
		sc2 = Optional.ofNullable(soundcard);
		sc2.ifPresent(System.out::println);
		System.out.println(sc2.isPresent());
		//If soundcard were null, the resulting Optional object would be empty.
		
		
		//Defaults values and actions
		soundcard = sc2.orElse(new Soundcard());
		System.out.println(soundcard);
		
		
	}

}
