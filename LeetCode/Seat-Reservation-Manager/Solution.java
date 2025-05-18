class SeatManager {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public SeatManager(int n) {
        int i=1;
        while(i<=n)
         minHeap.add(i++);
    }
    
    public int reserve() {
        return minHeap.remove();
    }
    
    public void unreserve(int seatNumber) {
        minHeap.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */