package ru.lessons.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Computer computer = context.getBean("computer", Computer.class);
		System.out.println(computer);

		context.close();
	}

}
