/* next: print deque and addfirst */

public class ArrayDeque <MyType>{
    private MyType[] item;
    private int size;
    /* implement a circular arrary */
    private int first, last;
    public ArrayDeque(){
        item = (MyType[]) new Object[8];
        /* index of first and last */
        first = 3;
        last = 4;
        size = 0;
    }
    public void resize(int L){
        MyType[] temp = (MyType[]) new Object[L];
        if(first == item.length - 1) {
            System.arraycopy(item,0, temp,0, size);
            first = temp.length - 1;
            last = size;
        }
        else if (first + 1 > last - 1){
            System.arraycopy(item,first + 1,temp,0,item.length - first - 1);
            System.arraycopy(item,0,temp,item.length - first - 1,last);
            first = temp.length - 1;
            last = size;
        }
        item = temp;
    }

    public MyType get(int index){
        return item[index];
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
        printRec(0);
    }
    private void printRec(int index){
        System.out.print(item[index] + " ");
        if(index == (size-1)){
            System.out.println();
            return;
        }
        printRec(index + 1);
        return;
    }

    public void addFirst(MyType a){
        if(size == item.length){
            resize(4*size);
        }
        item[first] = a;
        size ++;
        /* shift first index */
        if(first != 0) {
            first --;
        }
        else{
            first = item.length - 1;
        }
    }
    public void addLast(MyType a){
        if(size == item.length){
            resize(4*size);
        }
        item[last] = a;
        size ++;
        /* shift last index */
        if(last != item.length - 1) {
            last ++;
        }
        else{
            last = 0;
        }
    }
    public MyType removeLast(){
        MyType a = get(size-1);
        item[size-1] = null;
        size --;
        return a;
    }


}
