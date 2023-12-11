package Thread;

public class Producer implements Runnable{

    SharedQueue sharedQueue;

    public Producer(SharedQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    String [] item = {"ItemOne", "ItemTwo","ItemThree","ItemFour","ItemFive","ItemSix","ItemSeven","ItemEight",
            "ItemNine","ItemTen"};
    public void produce(String item) throws InterruptedException{
        synchronized (sharedQueue){
            if(sharedQueue.queue.size() >= sharedQueue.capacity){
                System.out.println("Queue is Full. Producer is waiting");
                sharedQueue.wait();
                System.out.println("Producer has woken up ");
            }
        }
        synchronized (sharedQueue){
            sharedQueue.queue.add(item);
            System.out.println("Produced: "+item);
            sharedQueue.notify();
        }
    }

    @Override
    public void run() {

        for(int i = 0; i < item.length; i++) {
            try {
                Thread.sleep((long) (Math.random() * 1000) * 5);
                produce(item[i]);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Producer has run its course");
    }
}
