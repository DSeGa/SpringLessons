package ru.lessons.demo;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music {

    @Override
    public String getSong() {
        return "RapMusic song name";
    }
    
}
