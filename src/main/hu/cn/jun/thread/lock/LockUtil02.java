package cn.jun.thread.lock;

import java.util.concurrent.Semaphore;

public class LockUtil02
{

    private Semaphore semaphore = new Semaphore(1);

    public void lock() throws InterruptedException {
        semaphore.acquire();
    }

    public void unlock(){
        semaphore.release();
    }
}
