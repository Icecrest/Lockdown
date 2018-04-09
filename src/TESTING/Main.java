package TESTING;

import time.Timer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        Timer testTimer = new Timer(1);

        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println(testTimer.checkTimeRemaining());
            }
        };

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        executor.scheduleAtFixedRate(runner, 0, 1 , TimeUnit.SECONDS);

    }

}
