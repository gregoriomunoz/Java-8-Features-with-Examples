package example.java8.optional.beans;

import java.util.Optional;

public class Computer {

	private Optional<Soundcard> soundcard;

	public Optional<Soundcard> getSoundcard() {
		return soundcard;
	};
	
	public void setSoundCard(Optional<Soundcard> soundcard) {
		this.soundcard = soundcard;
	}

}