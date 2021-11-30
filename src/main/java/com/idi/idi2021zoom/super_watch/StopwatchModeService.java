package com.idi.idi2021zoom.super_watch;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Component
public class StopwatchModeService implements ModeService {

    @Override
    public void doA(){
        //50 lines of code
        System.out.println("stopwatch started");
    }

    @Override
    public void doB(){
        System.out.println("stopwatch ended");
    }
}
