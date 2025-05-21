class BoundedBlockingQueue {

    private Queue<Integer> boundedBlockingQueue;
    private int capacity;

    public BoundedBlockingQueue(int capacity) {
        boundedBlockingQueue = new LinkedList<>();
        this.capacity = capacity;
    }
    
    public synchronized void enqueue(int element) throws InterruptedException {
        while(boundedBlockingQueue.size() > capacity) wait();
        boundedBlockingQueue.add(element);
        notifyAll();
    }
    
    public synchronized int dequeue() throws InterruptedException {
        while(boundedBlockingQueue.size() == 0) wait();
        int result = boundedBlockingQueue.poll();
        notifyAll();
        return result;
    }
    
    public int size() {
        return boundedBlockingQueue.size();
    }
}