public class DLList<anytype> {	//generic type class
	/*each IntNode is an element of list, 
	each element contains an item and the next IntNode
	and SSList is the methods to gather these elements to a list*/
	private IntNode sentinel;
	private int size;
	private IntNode last; 

	//nested class
	class IntNode {
	anytype item;
	IntNode next;
	IntNode prev;
	IntNode(IntNode x, anytype y, IntNode z){
		prev = x;
		item = y;
		next = z;	
	}
}
	//constructor
	DLList(){
		sentinel = new IntNode(null,null,null);	//item in sentinel dosen't matter
		size = 0;
	}
	
	//circular lists: each direction points to the same sentinel
	void add_first(anytype a){
		sentinel.next = new IntNode(sentinel, a, sentinel.next);
		size += 1;
	}
	void add_last(anytype a){
		sentinel.prev = new IntNode(sentinel.prev,a,sentinel);
		size += 1;
	}
	anytype get_first() {
		return sentinel.next.item;
	}
	anytype get_last() {
    	return sentinel.prev.item;
	}
	
	/* since we don't want the int size in class be modified by others but still need get the size, 
	then set int size private with a public size() method to only return int size but can't modify it 
	*/
	public int size(){
        return size;
    }
}



class launcher{
	public static void main(String args[]){
		DLList<String> a = new DLList<>();
		/* System.out.println("first = "+a.get_first());
		runtime error:	get_first won't work when list empty 
		*/
		a.add_last("c");
		a.add_first("b");
		a.add_last("d");
		a.add_first("a");
		System.out.println("last = "+a.get_last());
		System.out.println("first = "+a.get_first());
		//System.out.println("last = "+a.get_last());
		System.out.println("size = "+a.size());

		/* 	a.first.next.next = a.first.next;
			this will error in compiling because first is private and can only be accessed in DLList
		*/
	}
}