package junit;

public class CompareNum {

	public static boolean isGreater(int num1, int num2){
		return num1 > num2;
	}
	
	public static boolean isLesser(int num1, int num2){
		return num1 < num2;
	}
	
	public static boolean isEqual(int num1, int num2){
		return num1 == num2;
	}
	
	public static void main (String args[]) {
		
		System.out.println("Greater number between two give numbers "+isGreater(10,9));
		
		System.out.println("Lesser number between two give numbers "+isLesser(8,9));
		
		System.out.println("Both the numbers are equal "+isEqual(9,9));
	}
}
