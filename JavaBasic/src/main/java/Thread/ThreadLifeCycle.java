package Thread;

public class ThreadLifeCycle {
    public static class  Walk implements Runnable{
        @Override
        public void run() {
            for (int i = 1; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException interruptedException){
                    interruptedException.printStackTrace();
                }
                System.out.println("I am walking");
            }
        }
    }

    public static class  ChewGum implements Runnable{
        @Override
        public void run() {
            for (int i = 1; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException interruptedException){
                    interruptedException.printStackTrace();
                }
                System.out.println("I am chewing gum...");
            }
        }
    }

    public static void main(String[] args) {

        Thread  walkThread = new Thread((new Walk()));
        Thread  chewThread = new Thread((new ChewGum()));
        try {
            walkThread.start();
            walkThread.join(1000);
            chewThread.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
