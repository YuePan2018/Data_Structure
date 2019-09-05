package synthesizer;


public class TestIterable {
    public static void main(String args[]){
        BoundedQueue<Integer> arb = new ArrayRingBuffer(3);
        arb.enqueue(1);
        arb.enqueue(2);
        arb.enqueue(2);
        for(int s : arb){
            System.out.print(s);
        }
        return;
    }
}

