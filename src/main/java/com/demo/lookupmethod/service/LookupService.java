package com.demo.lookupmethod.service;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class LookupService {
//    @Autowired //can't achieve prototype scope
//    private DateAndTimeService dateAndTimeService;

//    @Autowired //can achieve prototype scope but here just bypassing IOC here (not recommended)
//    ApplicationContext applicationContext;

//    @Autowired //can achieve prototype scope but objectfactory always eager initialize so (not recommended)
//    ObjectFactory<DateAndTimeService> objDateAndTimeService;

    public String getDetails(){
        //return dateAndTimeService().getDateAndTime();
        //return applicationContext.getBean(DateAndTimeService.class).getDateAndTime();
        //return objDateAndTimeService.getObject().getDateAndTime();
        return dateAndTimeService().getDateAndTime();
    }

    /**
     * Recommended approach but this method should not private or static or final
     * And caller class like "DateAndTimeService" should public in nature
     *
     * @return
     */
    @Lookup
    public DateAndTimeService dateAndTimeService(){
        return  null;
    }
}
