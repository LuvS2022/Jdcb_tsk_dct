package question29;

import java.util.Scanner;

public class Q29 {
	int num1, num2;
	String sum = " ";
	int total = 0 ;
	
	public int getPrimeNumbersSum(int a, int b) {
		//If the input value is negative, return "-1" as string
		if(a < 0 || b < 0)
			return -1;
//		If the input value is not a 4-digit number, return "-2" as string.  
		else if(a == 0 || b == 0)
			return -2;
		else if( a > b)
			return -3;
		else {
			for(int i = a+1; i < b; i++)
			{
				int c = 0;
				for(int j = 1; j <= i; j++)
					if(i%j == 0)
						c++;
				if(c == 2)
					total = total + i;
			}
				return total;
		}
	}
	public static void main(String[] args) {
		Scanner sref  = new Scanner(System.in);
		Q29 cref = new Q29();
		System.out.print("Enter the 1ts no : ");
		cref.num1 = sref.nextInt();
		System.out.print("Enter the no : ");
		cref.num2 = sref.nextInt();
		System.out.println(cref.getPrimeNumbersSum(cref.num1, cref.num2));
		sref.close();
	}
}
