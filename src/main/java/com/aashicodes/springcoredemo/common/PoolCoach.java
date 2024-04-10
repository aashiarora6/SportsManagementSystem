package com.aashicodes.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class PoolCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Play atleast 3 games of Pool everyday";
    }
}
