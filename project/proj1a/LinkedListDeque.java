public class LinkedListDeque <Mytype>{
    static class Node <Mytype>{
        Node prev;
        Mytype item;
        Node next;
        Node(Node a, Mytype b, Node c){
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

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }
    public int size(){
        return size;
    }
    public void printDeque(){
        Node temp = sentinel.next;
        for(int i = 0; i < size; i++){
            System.out.print(temp.item + " ");
            temp = temp.next;
        }
    }
    public void addFirst(Mytype a){
        sentinel.next.prev = new Node(sentinel, a, sentinel.next);
        sentinel.next = sentinel.next.prev;
        size ++;
    }
    public void addLast(Mytype a){
        sentinel.prev.next = new Node(sentinel.prev, a, sentinel);
        sentinel.prev = sentinel.prev.next;
        size ++;
    }
    public Mytype removeFirst(){
        Mytype temp;
        sentinel.next.next.prev = sentinel;
        temp = (Mytype)sentinel.next.item;
        sentinel.next = sentinel.next.next;
        size --;
        return temp;
    }
    public Mytype removeLast(){
        Mytype temp;
        sentinel.prev.prev.next = sentinel;
        temp = (Mytype)sentinel.prev.item;
        sentinel.prev = sentinel.prev.prev;
        size --;
        return temp;
    }
    public Mytype get(int index){
        Node temp = sentinel.next;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return  (Mytype) temp.item;
    }
}
