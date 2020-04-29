package com.lisz;

import java.util.concurrent.CountDownLatch;

public class WatcherCallback {
    private String threadName;
    private String pathName;
    private CountDownLatch latch = new CountDownLatch(1);

    public WatcherCallback(String threadName) {
        this.threadName = threadName;
    }
}
