public class LinkedListDeque <T> implements Deque<T>{
    static class Node <T>{
        Node prev;
        T item;
        Node next;
        Node(Node a, T b, Node c){
            prev = a;
            item = b;
            next = c;
        }
    }
    private Node sentinel;
    private int size;
    public LinkedListDeque(){
        sentinel = new Node(null,0,null);
        sentinel.prev = sentinel;
        sentinel.next = sentinel;
        size = 0;
    }
    @Override
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public void printDeque(){
        Node temp = sentinel.next;
        for(int i = 0; i < size; i++){
            System.out.print(temp.item + " ");
            temp = temp.next;
        }
    }
    @Override
    public void addFirst(T a){
        sentinel.next.prev = new Node(sentinel, a, sentinel.next);
        sentinel.next = sentinel.next.prev;
        size ++;
    }
    @Override
    public void addLast(T a){
        sentinel.prev.next = new Node(sentinel.prev, a, sentinel);
        sentinel.prev = sentinel.prev.next;
        size ++;
    }
    @Override
    public T removeFirst(){
        T temp;
        sentinel.next.next.prev = sentinel;
        temp = (T)sentinel.next.item;
        sentinel.next = sentinel.next.next;
        size --;
        return temp;
    }
    @Override
    public T removeLast(){
        T temp;
        sentinel.prev.prev.next = sentinel;
        temp = (T)sentinel.prev.item;
        sentinel.prev = sentinel.prev.prev;
        size --;
        return temp;
    }
    @Override
    public T get(int index){
        Node temp = sentinel.next;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return  (T) temp.item;
    }
}
