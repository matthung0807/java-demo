package com.abc.demo.timer.task;

import java.time.LocalDateTime;
import java.util.TimerTask;

public class DemoTimerTask extends TimerTask {

    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + LocalDateTime.now().getSecond());
    }

}
