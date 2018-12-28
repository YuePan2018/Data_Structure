/**A leap year is either: divisible by 400 or divisible by 4 and not by 100.
*/

public class LeapYear{
	public static void main(String[] args){
		int year = Integer.parseInt(args[0]);				// convert String to Int
		if(((year%400)==0)||((year%4==0)&&(year%100!=0))){
			System.out.println(args[0]+" is a leap year.");
		}
		else{
			System.out.println(args[0]+" is not a leap year.");
		}
	}
}