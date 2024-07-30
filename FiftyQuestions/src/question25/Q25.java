package question25;

import java.util.Scanner;


public class Q25 {
	int no;
	public int getSumOfFactors(Q25 r) {
		int sum = 0;
		if(r.no < 0)
			return -1;	
		else if(r.no == 0)
			return -2;
		else {
			int i = 1;
			while(i <= this.no)
			{
				if(r.no%i == 0)
					sum = sum + i;
				i++;
			}
			return sum;
		}
	}
	public static void main(String[] args) {
		Scanner sref  = new Scanner(System.in);
		Q25 cref = new Q25();
		System.out.print("Enter the no : ");
		cref.no = sref.nextInt();
		System.out.println(cref.getSumOfFactors(cref));
		sref.close();
	}
}
