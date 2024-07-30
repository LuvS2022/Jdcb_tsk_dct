package question28;

import java.util.Scanner;

public class Q28 {
	int num1, num2;
	
	public String getPrimeNumbers(int a, int b) {
		//If the input value is negative, return "-1" as string
		if(a < 0 || b < 0)
			return "-1";
//		If the input value is not a 4-digit number, return "-2" as string.  
		else if(a == 0 || b == 0 || a > b)
			return "-2";
		else {
			String sum = " ";
			for(int i = a+1; i < b; i++)
			{
				int c = 0;
				for(int j = 1; j <= i; j++)
					if(i%j == 0)
						c++;
				if(c == 2)
					sum = sum + String.valueOf(i)+" ";
			}
				return sum;
		}
	}
	public static void main(String[] args) {
		Scanner sref  = new Scanner(System.in);
		Q28 cref = new Q28();
		System.out.print("Enter the 1ts no : ");
		cref.num1 = sref.nextInt();
		System.out.print("Enter the no : ");
		cref.num2 = sref.nextInt();
		System.out.println(cref.getPrimeNumbers(cref.num1, cref.num2));
		sref.close();
	}
}
