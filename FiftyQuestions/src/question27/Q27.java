package question27;

import java.util.Scanner;

public class Q27 {
int a, b, c;

String findTriangle(Q27 r)
{
	if(r.a < 0 || r.b < 0 || r.c < 0)
		return "-2";
	else if(r.a == 0 || r.b == 0 || r.c == 0)
		return "-1";
	else {
		if(r.a == r.b && r.b == r.c)
			return "EQUILATERAL";
		else if ((r.a == r.b && (r.b != r.c || r.a != r.c)) ||
			   (r.b == r.c && (r.b != r.a || r.a != r.c)) ||
			   (r.a == r.c && (r.b != r.c || r.a != r.c)) )
			return "ISOSCELES";
		else 
			return "SCALENE";
	}
}
public static void main(String[] args) {
	Scanner sr = new Scanner(System.in);
	Q27 cr = new Q27();
	System.out.print("Enter 1st side measure : ");
	cr.a = sr.nextInt();
	System.out.print("Enter 2st side measure : ");
	cr.b = sr.nextInt();
	System.out.print("Enter 3st side measure : ");
	cr.c = sr.nextInt();
	System.out.println(cr.findTriangle(cr));
	sr.close();
}
}
