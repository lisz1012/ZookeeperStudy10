package com.lisz;

import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

public class ZkUtils {
    private static final String addresses = "";
    private static CountDownLatch latch = new CountDownLatch(1);
    private static Watcher watcher = new DefaultWatcher(latch);


    public static ZooKeeper getZk() {
        ZooKeeper zk = null;
        try {
            zk = new ZooKeeper(addresses, 1000, watcher);
            latch.countDown();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return zk;
    }
}
