package com.aashicodes.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Swim everyday for an Hour!!!";
    }
}
