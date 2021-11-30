package com.idi.idi2021zoom.super_watch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Human {
    @Autowired
    private Watch watch;


    public void checkWatch(){
        watch.doA();
        watch.changeMode();
        watch.doB();
    }
}
