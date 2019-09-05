package synthesizer;
import org.junit.Test;
import static org.junit.Assert.*;

/** Tests the ArrayRingBuffer class.
 *  @author Josh Hug
 */

public class TestArrayRingBuffer {
    /*
    @Test
    public void someTest() {


    }
    */

    /** Calls tests for ArrayRingBuffer. */
    public static void main(String[] args) {
        /*
        BoundedQueue<Integer> arb = new ArrayRingBuffer(3);
        arb.enqueue(1);
        arb.enqueue(2);
        int temp = arb.dequeue();
        temp = arb.peek();
        arb.enqueue(3);
        arb.enqueue(4);
        temp = arb.dequeue();
        temp = arb.dequeue();
        temp = arb.dequeue();
        */
        BoundedQueue<Integer> arb = new ArrayRingBuffer(1);
        arb.dequeue();
    }
} 
