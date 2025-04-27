package springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  //init bean and name is decapitalized  @Component("customname");
public class Car implements Vehicle{
	
	@Autowired
	private Audio audio;
	
	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	public void drive() {
		System.out.println("Car "+audio);
	}
}
