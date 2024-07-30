package question30;

import java.util.Scanner;

public class Q30 {
int n;
int sum = 0;
int calculateSum(int a)
{
	for(int i = 1; i <= a; i++)
		if(i%3 == 0 || i%5 == 0)
			sum = sum + i;
	return sum;
}
public static void main(String[] args) {
	Q30 cr = new Q30();
	Scanner sr = new Scanner(System.in);
			System.out.print("ENETR THE NO : ");
	cr.n = sr.nextInt();
	System.out.println(cr.calculateSum(cr.n));
	sr.close();
	}
}
