package question24;

import java.util.Scanner;


public class Q24 {
	int no;
	public String getFactors(Q24 r) {
		String sum = " ";
		if(r.no < 0)
			return "-1";	
		else if(r.no == 0)
			return "-2";
		else {
			int i = 1;
			while(i <= this.no)
			{
				if(r.no%i == 0)
					sum = sum + String.valueOf(i)+ " ";
				i++;
			}
			return sum;
		}
	}
	public static void main(String[] args) {
		Scanner sref  = new Scanner(System.in);
		Q24 cref = new Q24();
		System.out.print("Enter the no : ");
		cref.no = sref.nextInt();
		System.out.println(cref.getFactors(cref));
		sref.close();
	}
}
