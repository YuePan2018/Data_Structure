public class SquareList {
	static class IntList{
		int item;
		IntList next;
		IntList(int a, IntList b){
			item = a;
			next = b;
		}
	}
	public static IntList squareMutative(IntList L) {
		IntList p = L;
		do{
			p.item = p.item * p.item;
			p = p.next;
			}
		while(p != null);
		return L;
		}
	public static void main(String argv[]){
		IntList	L = new IntList(3,null);
		L = new IntList(2,L);
		L = new IntList(1,L);
		L = squareMutative(L);
		System.out.println(L.item);
		System.out.println(L.next.item);
		System.out.println(L.next.next.item);
	}
}