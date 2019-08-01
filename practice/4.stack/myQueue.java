/** implement a queue(first in first out) class with a stack(first in last out) class
 *
 */
import java.util.Stack;
public class myQueue<E> {
    private Stack <E> queue = new Stack();
    public void push(E temp){
        queue.push(temp);
    }
    public E pop(){
        Stack <E> temp = new Stack();
        while(! queue.empty()){
            temp.push(queue.pop()) ;
        }
        E value = temp.pop();
        while(! temp.empty()){
            queue.push(temp.pop()) ;
        }
        return value;
    }
}
