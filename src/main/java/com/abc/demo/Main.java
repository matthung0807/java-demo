package com.abc.demo;

import com.abc.demo.timer.task.DemoTimerTask;

import java.util.Timer;

public class Main {

    public static void main(String[] arges) {

        long delay = 3000L; // 延遲開始執行的時間（毫秒）
        long period = 1000L; // 重複的時間（毫秒）

        Timer simpleTimer = new Timer();
        simpleTimer.schedule(new DemoTimerTask(), delay);

        Timer repeatTimer = new Timer();
        repeatTimer.schedule(new DemoTimerTask(), delay, period);

    }

}
