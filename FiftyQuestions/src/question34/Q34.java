package question34;

import java.util.Scanner;

public class Q34 {
	int n;
	double sum;
int findSum(Q34 rm)
{
	int  p = String.valueOf(this.n).length();
	while(this.n > 0)
	{
		sum = sum + Math.pow(this.n%10, p);
		this.n = this.n/10;
	}
	this.n = (int)sum;
	return this.n;
}
public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	Q34 cr = new Q34();
	System.out.print("Enter the Num : ");
	cr.n = sr.nextInt();
	System.out.println("the sum of the cubes of the digits of an n digit number"
			+ " : " + cr.findSum(cr));
	sr.close();
}
}
