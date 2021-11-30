package com.idi.idi2021zoom.super_watch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class CalendarModeService implements ModeService {

    @Override
    public void doA(){
        System.out.println("Tuesday");
    }

    @Override
    public void doB(){
        System.out.println("30/11");
    }
}
