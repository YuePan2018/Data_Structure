package synthesizer;
import java.util.Iterator;

public class ArrayRingBuffer<T> extends AbstractBoundedQueue<T>{
    private int first;  //stores the index of the least recently inserted item;
    private int last;   // stores the index one beyond the most recently inserted item
    private T[] rb;
    public Iterator<T> iterator(){
        return new MyIterator();
    }
    private class MyIterator implements Iterator{       //don't add <T> here, because nested class T not equal to superclass T
        private int pointer;
        public MyIterator(){
            pointer = 0;
        }
        public boolean hasNext(){
            return pointer < fillCount;
        }
        public T next(){
            T temp = rb[pointer];
            pointer ++;
            return temp;
        }


    }
    public ArrayRingBuffer(int capacity) {
        rb = (T[]) new Object[capacity];
        first = 0;
        last = 0;
        fillCount = 0;
        this.capacity = capacity;
        /*     Note that the local variable here shadows the field we inherit from AbstractBoundedQueue, so
               you'll need to use this.capacity to set the capacity.    */
    }

    public void enqueue(T x) {
        if(fillCount == capacity){
            throw new RuntimeException("enqueue: exceed capacity");
        }else{
            rb[last] = x;
            if(last == capacity - 1){
                last = 0;
            }else{
                last ++;
            }
            fillCount ++;
            return;
        }
    }

    /* move pointer "first" rather than remove items from array box*/
    public T dequeue() {
        if(fillCount == 0){
            throw new RuntimeException("dequeue: no item");
        }else{
            T temp = rb[first];
            if(first == capacity - 1){
                first = 0;
            }else{
                first ++;
            }
            fillCount --;
            return temp;
        }
    }

    public T peek() {
        if(fillCount == 0){
            return null;
        }else{
            T temp = rb[first];
            return temp;
        }
    }
    // TODO: When you get to part 5, implement the needed code to support iteration.
}
