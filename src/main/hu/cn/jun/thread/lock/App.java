package cn.jun.thread.lock;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

       final LockUtil02 lock = new LockUtil02();

        for(int i= 0;i<5;i++){
            Thread thread = new Thread(){
                @Override
                public void run() {
                    try {
                        lock.lock();
                        System.out.println(Thread.currentThread().getName()+" doing somethis ,other thread pealse wait sometime..");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println(Thread.currentThread().getName()+" done thing,release lock");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally{
                        lock.unlock();
                    }

                }
            };
            thread.start();
        }
    }






}
