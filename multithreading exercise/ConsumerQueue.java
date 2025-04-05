import java.util.Queue;

public class ConsumerQueue implements Runnable {
    private SharedResource sharedResource;

    public ConsumerQueue(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            sharedResource.consume();
        }
    }

    
}
