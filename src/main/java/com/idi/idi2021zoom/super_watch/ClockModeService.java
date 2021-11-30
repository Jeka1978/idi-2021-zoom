package com.idi.idi2021zoom.super_watch;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class ClockModeService implements ModeService {

    @Override
    public void doA(){
        //50 lines of code
        System.out.println("minutes: 44");
    }

    @Override
    public void doB(){
        System.out.println("hours : 3");
    }
}
