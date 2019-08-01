import org.junit.Test;
import static org.junit.Assert.*;
public class myTest {
    @Test   // push 1,2,3 and then pop
    public void test(){
        myQueue<Integer> queue = new myQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        assertEquals(1, (long) queue.pop());
        assertEquals(2, (long) queue.pop());
    }
}
