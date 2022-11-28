package com.demo.lookupmethod.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Random;

@Service
@Scope("prototype")
public class DateAndTimeService {

    Random random = new Random();
    int randomValue = random.nextInt(50);
    String localtime = LocalTime.now().toString();
    public String getDateAndTime(){

        return "current Date and time is: "+ localtime+"------> Random Value is: "+randomValue;
    }
}
