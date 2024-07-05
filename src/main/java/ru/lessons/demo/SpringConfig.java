package ru.lessons.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.lessons.demo")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
