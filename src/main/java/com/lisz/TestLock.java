package com.lisz;

import org.apache.zookeeper.ZooKeeper;
import org.junit.After;
import org.junit.Before;

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
}
