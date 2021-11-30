package com.idi.idi2021zoom.super_watch;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
/**
* @author Evgeny Borisov
*/public class WatchTest {

    @Test
    public void testModes() {
        List<ModeService> modeServices =
                List.of(new ClockModeService(), new CalendarModeService(), new StopwatchModeService());
        Watch watch = new Watch(modeServices);
        for (int i = 0; i < 4; i++) {
            watch.doA();
            watch.doB();
            watch.changeMode();

        }


    }
}