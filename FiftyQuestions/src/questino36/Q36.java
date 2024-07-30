package questino36;

import java.util.Scanner;

public class Q36 {
	int n, sum = 0, round = 0;
	int getPrimeSum(int a)
	{
		for(int i = 1; i <= Integer.MAX_VALUE; i++)
		{
			int c = 0;
			for(int j = 1; j <= i; j++)
			{
				if(i%j == 0)
					c++;
			}
			if(c == 2) {
				sum = sum + i;
				round++;
			}
			if(round == a)
				break;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		Q36 cr = new Q36();
		System.out.print("sum of how much prime no : ");
		cr.n = sr.nextInt();
		System.out.println("sum of " +  cr.n + " prime no is : "+ cr.getPrimeSum(cr.n));
}
}
