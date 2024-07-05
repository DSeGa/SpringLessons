package ru.lessons.demo;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "ClassicalMusic song name";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("doMyInit called");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("doMyDestroy called");
    }
    
}
