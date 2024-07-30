package question23;

import java.util.Scanner;

public class Q23 {
	int no;
	public String getFactorial(Q23 r) {
		int sum = 1;
		if(r.no < 0)
			return "-1";	
		else if(r.no == 0)
			return "-2";
		else {
			while(r.no > 0)
			{
				sum = sum*r.no;
				r.no--;
			}
			return String.valueOf(sum);
		}
	}
	public static void main(String[] args) {
		Scanner sref  = new Scanner(System.in);
		Q23 cref = new Q23();
		System.out.print("Enter the no : ");
		cref.no = sref.nextInt();
		System.out.println(cref.no);
		System.out.println(cref.getFactorial(cref));
		System.out.println(cref.no);
		sref.close();
	}
}
