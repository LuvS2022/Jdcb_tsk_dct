package question20;

import java.util.Scanner;

public class Q20 {
int no;
public String checkPrime(Q20 r) {
	int count = 0;
	if(this.no < 0)
		return "-1";
	else if(this.no == 0)
		return "-2";
	else {
		for(int i = 1; i <= this.no; i++)
			if(this.no%i == 0)
				count++;
		if(count == 2)
			return "true";
		else
			return "false";
	}
}
public static void main(String[] args) {
	Scanner sref  = new Scanner(System.in);
	Q20 cref = new Q20();
	System.out.print("Enter the no : ");
	cref.no = sref.nextInt();
	System.out.println(cref.checkPrime(cref));
	sref.close();
}
}
