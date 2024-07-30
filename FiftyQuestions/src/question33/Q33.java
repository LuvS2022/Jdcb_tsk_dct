package question33;

import java.util.Scanner;

public class Q33 {
	int n;
	int sum;
int findSum(Q33 rm)
{
	int i = 1;
	while(i <= this.n)
	{
		if((i%2 == 0) && (i%3 == 0 && i%8 == 0))
			sum = sum + i;
		i++;
	}
	return sum;
}
public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	Q33 cr = new Q33();
	System.out.print("Enter the limit of Natural_no : ");
	cr.n = sr.nextInt();
	System.out.println("sum of first n even numbers that are divisible by 3 and 8 : " + cr.findSum(cr));
	sr.close();
}
}
