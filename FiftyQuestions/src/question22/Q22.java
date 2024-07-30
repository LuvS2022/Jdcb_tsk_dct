package question22;

import java.util.Scanner;

public class Q22 {
	int no;
	public String checkArmStrong(Q22 r) {
		int l = String.valueOf(r.no).length();
		int store = this.no;
		double sum = 0;
		//If the input value is negative, return "-1" as string
		if(r.no < 0)
			return "-1";
//		If the input value is not a 4-digit number, return "-2" as string.  
		else if(l != 4)
			return "-2";
		else {
			while(r.no > 0)
			{
				sum = sum + Math.pow(this.no%10, l);
				this.no = this.no/10;
			}
			if(store == sum)
				return "true";
			else
				return "false";
		}
	}
	public static void main(String[] args) {
		Scanner sref  = new Scanner(System.in);
		Q22 cref = new Q22();
		System.out.print("Enter the no : ");
		cref.no = sref.nextInt();
		System.out.println(cref.checkArmStrong(cref));
		sref.close();
	}
}
