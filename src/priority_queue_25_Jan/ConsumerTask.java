package priority_queue_25_Jan;

public class ConsumerTask implements Runnable{
    private Buffer buffer;
    public ConsumerTask(Buffer buffer){
        this.buffer = buffer;
    }
    
    @Override
    public void run() {
        try {
            // delay to make sure producer starts first
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        buffer.get();
    }    
}
