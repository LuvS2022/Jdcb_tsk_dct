package questionEight;

import java.util.Scanner;

public class QEight {
int num1, num2, num3, sum = 0;
int check(int n)
{
	if(n < 0 || n == 0)
		return -1;
	return roundOff(n);
}
int roundOff(int s)
{
	sum = sum + (s + (10-s%10));
	return sum;
}
int sumOfMultiples(int a, int b, int c)
{
	if(true)
	{
		check(a);
		check(b);
		check(c);
		return -1;  
	}
	else
		return sum;
}
public static void main(String[] args) {
	QEight cobj = new QEight();
	try (Scanner sobj = new Scanner(System.in)) {
		System.out.print("Enter 1st no : ");
		cobj.num1 = sobj.nextInt();
		System.out.print("Enter 2nd no : ");
		cobj.num2 = sobj.nextInt();
		System.out.print("Enter 3rd no : ");
		cobj.num3 = sobj.nextInt();
	}
	System.out.println(cobj.sumOfMultiples(cobj.num1, cobj.num2, cobj.num3));
}
}
