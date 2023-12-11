package Thread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("This is from Runnable interface run method");
    }

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread myThread1 = new Thread(new MyRunnable());
        myRunnable.run();
        myThread1.start();
        myThread1.run();
        System.out.println("This is from Main method");
    }
}
