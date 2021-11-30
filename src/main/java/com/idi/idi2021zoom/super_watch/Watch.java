package com.idi.idi2021zoom.super_watch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class Watch {

    private int i;

    @Autowired
    private List<ModeService> modes;

    public void setModes(List<ModeService> modes) {
        this.modes = modes;
    }

    public void addMode(ModeService modeService) {
        modes.add(modeService);
    }

    public Watch(List<ModeService> modes) {
        this.modes = modes;
    }

    public void doA() {


        modes.get(i).doA();
        //todo
        //in mode clock this method print minutes
        // in mode calendar this method print daw of week
        // in mode stopwatch it should print stopwatch started

    }


    public void doB() {
        modes.get(i).doB();
        //in mode clock this method print hours
        // in mode calendar this method print month
        // in mode stopwatch it should print stopwatch stopped

    }


    //3 modes - (1-clock, 2-calendar, 3-stopwatch
    public void changeMode() {
        i++;
        if (i == modes.size()) {
            i = 0;
        }

        // will change the mode to next on, if it is last one go to first mode
    }


}
