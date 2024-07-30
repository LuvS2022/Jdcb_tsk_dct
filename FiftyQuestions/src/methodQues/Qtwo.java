package methodQues;

import java.util.Scanner;

public class Qtwo {
 int getGreatest(int a, int b)
 {
//	 If any of the given numbers are negative, return -1.
	 if (a < 0 || b < 0 )
		 return -1;
//	 If any of the given numbers are zero, return -2.
	 else if (a == 0 || b == 0)
		 return -2;
	 else if (a > b)
		 return a;
	 return b;
 }
 public static void main(String[] args) {
	 Qtwo obj1 = new Qtwo();
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter the 1st no : ");
	int i = obj.nextInt();
	System.out.print("Enter the 2st no : ");
	int j = obj.nextInt();
	System.out.println("Ans : " + obj1.getGreatest(i, j));
}
}
