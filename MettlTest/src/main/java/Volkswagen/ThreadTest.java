package Volkswagen;

public class ThreadTest {

    private  int count=0;
    public synchronized void doSomething(){
        for (int i = 0; i < 10; i++) {
            System.out.println(count++);
        }
    }

    public static void main(String[] args) {
        ThreadTest demo = new ThreadTest();
        Thread t1= new Example(demo);
        Thread t2= new Example(demo);
        t1.start();
        t2.start();
    }
}
 class Example extends  Thread{
    ThreadTest demo;
    public Example(ThreadTest t1){
        demo = t1;
    }
    public void run(){
        demo.doSomething();
    }
 }