package com.aashicodes.springcoredemo.rest;

import com.aashicodes.springcoredemo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //Define a private field for dependency

    private Coach myCoach;

    //define a constructor for dependency injection
    @Autowired
    //Optional when we have only one constructor
    public DemoController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkouts(){
        return myCoach.getDailyWorkout();
    }
}