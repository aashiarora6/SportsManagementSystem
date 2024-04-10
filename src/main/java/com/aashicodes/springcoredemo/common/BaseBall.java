package com.aashicodes.springcoredemo.common;


import org.springframework.stereotype.Component;

@Component
public class BaseBall implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practise with Base Ball 20 mins everyday";
    }
}
