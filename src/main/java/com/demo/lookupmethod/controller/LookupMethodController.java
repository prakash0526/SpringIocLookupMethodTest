package com.demo.lookupmethod.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.lookupmethod.service.LookupService;

@RestController
public class LookupMethodController {
	
	@Autowired
    private LookupService lookupService;

    /**
     * Here calling 2 times same method to see prototype scope by using lookup method injection
     *
     * @return
     * @throws InterruptedException
     */
    @GetMapping("/details")
    public List<String> getDateAndTime() throws InterruptedException {
    	
        String response1 = lookupService.getDetails();
        Thread.sleep(3000);
        String response2 = lookupService.getDetails();
        
        return Arrays.asList(response1, response2);
    }

}
