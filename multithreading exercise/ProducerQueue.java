import java.util.Queue;

public class ProducerQueue implements Runnable {
    private SharedResource sharedResource;

    public ProducerQueue(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            sharedResource.produce(i);
        }
    }

}
