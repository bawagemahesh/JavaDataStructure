package Thread;

public class Consumer implements Runnable{

    SharedQueue sharedQueue;
    String consumerName;
    int consumerCapacity;

    public Consumer(SharedQueue sharedQueue, String consumerName, int consumerCapacity) {
        this.sharedQueue = sharedQueue;
        this.consumerName = consumerName;
        this.consumerCapacity = consumerCapacity;
    }

    String [] item = {"ItemOne", "ItemTwo","ItemThree","ItemFour","ItemFive","ItemSix","ItemSeven","ItemEight",
            "ItemNine","ItemTen"};
    public void consume() throws InterruptedException{
        synchronized (sharedQueue){
            if(sharedQueue.queue.size() == 0){
                System.out.println("Queue is Empty. "+ consumerName+ " is waiting...");
                sharedQueue.wait();
                System.out.println(consumerName + " has woken up ");
            }
        }
        synchronized (sharedQueue){
            String item = sharedQueue.queue.remove();
            System.out.println(consumerName + " has consumed " +item);
            sharedQueue.notify();
        }
    }

    @Override
    public void run() {

        for(int i = 0; i < item.length; i++) {
            try {
                Thread.sleep((long) (Math.random() * 1000) * 5);
                consume();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Consumar has run its course");
    }
}
