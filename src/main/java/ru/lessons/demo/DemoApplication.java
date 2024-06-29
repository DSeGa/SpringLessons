package ru.lessons.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		TestBean testBean = context.getBean("testBean", TestBean.class);
		System.out.println(testBean.getName());


		context.close();
	}

}
