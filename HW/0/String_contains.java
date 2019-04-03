public class String_contains{

	public static void main(String[] args){
		int b[] = {1,2,3};
		System.out.println(b[2]);
		String a[] = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};
		for(String s:a){
			if (s.contains("horse")){
				System.out.println("horse");
			}
			if (s.equals("horse")){
				System.out.println("exact" + s);
			}
		}
	}
}