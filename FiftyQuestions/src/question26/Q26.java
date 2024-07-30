package question26;

import java.util.Scanner;


public class Q26 {
	int num1, num2;
	String sum = " ";
	
	public String prt(int x, int y) {
		for(int i = x; i <= y; i++)
			if(i%2 == 0)
				sum = sum + String.valueOf(i)+ " ";
		return sum;
	}
	
	public String getEvenNumbers(int a, int b) {
		//If the input value is negative, return "-1" as string
		if(a < 0 || b < 0)
			return "-1";
//		If the input value is not a 4-digit number, return "-2" as string.  
		else if(a == 0 || b == 0 || a == b)
			return "-2";
		else {
			if(a < b)// (10 > 20)false
				return prt(a, b);
			else
				return prt(b, a);
		}
	}
	public static void main(String[] args) {
		Scanner sref  = new Scanner(System.in);
		Q26 cref = new Q26();
		System.out.print("Enter the 1ts no : ");
		cref.num1 = sref.nextInt();
		System.out.print("Enter the no : ");
		cref.num2 = sref.nextInt();
		System.out.println(cref.getEvenNumbers(cref.num1, cref.num2));
		sref.close();
	}
}
