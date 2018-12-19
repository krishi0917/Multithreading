package Multithreading.ThreadPool;

import java.util.concurrent.BlockingQueue;

/**
 * Created by rkhurana on 12/1/18.
 */
public class PoolThread extends Thread {
    private BlockingQueue taskQueue = null;
    private boolean isStopped = false;
    public PoolThread(BlockingQueue queue){
        taskQueue = queue;
    }

    public void run(){
        while(!isStopped()){   // if not stopped then pick up the task
            try {
                Runnable runnable =(Runnable)taskQueue.take();
                runnable.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public  synchronized  void stopThread(){
        isStopped = true;
        this.interrupt();
    }
    public synchronized  boolean isStopped(){
        return  isStopped;
    }
}
