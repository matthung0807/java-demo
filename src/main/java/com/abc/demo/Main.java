package com.abc.demo;

import com.abc.demo.timer.task.DemoTimerTask;

import java.util.Timer;

public class Main {

    public static void main(String[] arges) {

        long delay = 3000L; // 延遲開始執行的時間（毫秒），延遲3秒
        long period = 1000L; // 重複的時間（毫秒），間隔1秒

        Timer simpleTimer = new Timer();
        simpleTimer.schedule(new DemoTimerTask(), delay); // 只會執行一次

        Timer repeatTimer = new Timer();
        repeatTimer.schedule(new DemoTimerTask(), delay, period); // 會依設定的時間間隔重複執行

    }

}
