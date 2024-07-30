package question21;

import java.util.Scanner;


public class Q21 {

	int no;
	public String checkPalindrome(Q21 r) {
		int store = this.no, rev = 0;
		if(this.no < 0)
			return "-1";
		else if(this.no == 0)
			return "-2";
		else {
			while(this.no > 0)
			{
				rev = rev * 10 + (this.no%10);
				this.no = this.no/10;
			}
			if(store == rev)
				return "true";
			else
				return "false";
		}
	}
	public static void main(String[] args) {
		Scanner sref  = new Scanner(System.in);
		Q21 cref = new Q21();
		System.out.print("Enter the no : ");
		cref.no = sref.nextInt();
		System.out.println(cref.checkPalindrome(cref));
		sref.close();
	}
}
