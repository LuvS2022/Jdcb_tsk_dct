package questionThree;

import java.util.Scanner;

public class Qthree {
	int getLeastNum(int a, int b)
	 {
//		 If any of the given numbers are negative, return -1.
		 if (a < 0 || b < 0 )
			 return -1;
//		 If any of the given numbers are zero, return -2.
		 else if (a == 0 || b == 0)
			 return -2;
		 else if (a < b)
			 return a;
		 return b;
	 }
	 public static void main(String[] args) {
		 Qthree obj1 = new Qthree();
		try (Scanner obj = new Scanner(System.in)) {
			System.out.print("Enter the 1st no : ");
			int i = obj.nextInt();
			System.out.print("Enter the 2st no : ");
			int j = obj.nextInt();
			System.out.println("Ans : " + obj1.getLeastNum(i, j));
		}
	}
}
