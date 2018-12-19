package Multithreading.AnonymousThread;

/**
 * Created by rkhurana on 8/22/18.
 */
public class Application {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hello: " + i);

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }

            }

        }); //.start();

        thread1.start();
    }
}