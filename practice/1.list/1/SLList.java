public class SLList{
	private IntNode first;
	private int size;
	//nested class
	static class IntNode{
	int item;
	IntNode next;
	IntNode(int x, IntNode y){
		item = x;
		next = y;
	}
}
	

	SLList(int a){
		first = new IntNode(a,null);
		size = 1;
	}
	void add_first(int a){
		first = new IntNode(a,first);
		size += 1;
	}
	int get_first() {
    	return first.item;
	}
	public void add_last(int x) {
    	IntNode p = first;
		while (p.next != null) {
        	p = p.next;
    	}
    	p.next = new IntNode(x, null);
    	size += 1;
	}
	/* if we don't want the int size in class be modified by others but still need get the size, 
	then set int size private with a public size() method to only return int size but can't modify it 
	*/
	public int size(){
        return size;
    }
}



class launcher{
	public static void main(String args[]){
		SLList a = new SLList(2);
		
		a.add_first(1);
		a.add_last(3);
		System.out.println("first = "+a.get_first());
		//System.out.println("last = "+a.get_last());
		System.out.println("size = "+a.size());

		/* 	a.first.next.next = a.first.next;
			this will error in compiling because first is private and can only be accessed in SLList
		*/
	}
}