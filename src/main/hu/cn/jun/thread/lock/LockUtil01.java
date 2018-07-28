package cn.jun.thread.lock;

public class LockUtil01 {

    private volatile boolean lockFlag = false;

    public synchronized void lock() throws InterruptedException {
        while(lockFlag){
            this.wait();
        }
        lockFlag = true;
    }

    public synchronized  void unlock(){
        lockFlag = false;
        this.notifyAll();
    }
}
