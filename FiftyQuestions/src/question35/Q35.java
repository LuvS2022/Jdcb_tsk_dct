package question35;

import java.util.Scanner;

public class Q35 {
	int n;
	int t1 = 0;
	int t2 = 1;
	int t3 = t1 + t2;
	int sum = 0;
int t3OfFactorial(int no)
{
	for(int i  = 1; i<= no; i++)
	{
		System.out.println("t1 : " + t1);
		int s = t1;
		int mul = 1;
		while(s >= 0)
		{
			if(s == 0 && sum == 0)
				sum = sum + mul;
			else if(s == 1)
				sum = sum + mul;
			else 
				mul = mul * s;
			s--;
		}
		System.out.println("fact + sum = " + sum);
		t1 = t2;
		t2 = t3;
		t3 = t1+t2;
	}
	return sum;
}
public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	Q35 cr = new Q35();
	System.out.print("Enter the Num : ");
	cr.n = sr.nextInt();
	System.out.println("sum of factorl of each element of Fibonacci series"
			+ " : " + cr.t3OfFactorial(cr.n));
	sr.close();
}
}
