package Thread;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("This is from Runnable interface run method");
        for (int i = 1; i < 10; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("threadName - "+threadName+"  i : "+i);
        }

    }

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread myThread1 = new Thread(new MyThread());
        myThread.start();
        myThread1.run();
        myThread.run();
        System.out.println("This is from Main method");

//        System.out.println("Is myThread a Runnable : " + (myThread instanceof Runnable));
//        System.out.println("Is myThread a Runnable : " + (myThread instanceof Thread));
//        System.out.println("Is myThread a Runnable : " + (myThread instanceof Object));
//        System.out.println("Is myThread1 a Runnable : " + (myThread1 instanceof Runnable));
//        System.out.println("Is myThread1 a Runnable : " + (myThread1 instanceof Thread));
//        System.out.println("Is myThread1 a Runnable : " + (myThread1 instanceof Object));

    }
}
