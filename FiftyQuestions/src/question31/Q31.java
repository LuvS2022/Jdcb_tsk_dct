package question31;

import java.util.Scanner;


public class Q31 {
	int n;
	int round = 2;
	int calculateSum(int a)
	{
		double sum = 0;
		for(int i = 1; i <= a; i++)
			sum = sum + Math.pow(i, round);
		round--;
		return (int)sum;
	}
	public static void main(String[] args) {
		Q31 cr = new Q31();
		Scanner sr = new Scanner(System.in);
				System.out.print("ENETR THE NO : ");
		cr.n = sr.nextInt();
		int dif = (int) (cr.calculateSum(cr.n) - Math.pow(cr.calculateSum(cr.n), 2));
		System.out.println("dif : " + dif);
		sr.close();
		}
}
