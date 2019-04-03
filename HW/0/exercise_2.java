public class exercise_2{	
	public static int Max(int[] numbers){
		int ArrayLength = numbers.length;	
		int i = 0;
		int MaxNumber = 0; 
		while(i < ArrayLength){
			if(MaxNumber < numbers[i]){
				MaxNumber = numbers[i];
			}
			i++;
		}
		return MaxNumber;
	}

	public static void main(String[] args){
		int[] numbers = new int[] {4,10,7,6};	
		System.out.println("maximum is " + Max(numbers));
	}
}