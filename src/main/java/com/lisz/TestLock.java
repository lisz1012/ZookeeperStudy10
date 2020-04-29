package com.lisz;

import org.apache.zookeeper.ZooKeeper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class TestLock {
    private ZooKeeper zk;

    @Before
    public void init() {
        zk = ZkUtils.getZk();
    }

    @After
    public void close() {
        try {
            zk.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLock() {
        for (int i = 0; i < 10; i++) {
            String threadName = Thread.currentThread().getName();
            WatcherCallback watcherCallback = new WatcherCallback(threadName);
        }

        while (true) {
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
