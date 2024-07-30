package question32;

import java.util.Scanner;

public class Q32 {
	
	static boolean checkNumber(int a)
	{ 
		int i = 2;
		while( i <= a )
		{
			if( a == Math.pow(2, i) )
				return true;
			i++;
		}
		return false;
	}
public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
			System.out.print("Enter the no : ");
	int n = sr.nextInt();
	System.out.println(checkNumber(n));
	sr.close();
}
}
