package ru.lessons.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Music music = context.getBean("musicBean", Music.class);
		MusicPlayer musicPlayer = new MusicPlayer(music);

		musicPlayer.playMusic();

		context.close();
	}

}
