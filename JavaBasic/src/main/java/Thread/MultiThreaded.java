package Thread;

public class ThreadTest extends Thread {
    ThreadTest(){
        super("My Thread");
        start();
    }
    public void run(){
        System.out.println(this);
    }
}
class MultiThreaded{
    public static void main(String[] args) {
        new ThreadTest();
    }
}
