package questionTwelve;

import java.util.Scanner;
//String s=String.valueOf(i);  
public class Qtwl {
	static int no;
	static String sum = " ";
	static String btwNO(int p, int q)
	{
		if(p < q-1)
		{
			++p;
			sum = sum + String.valueOf(p) + " ";
			return btwNO(p, q);
		}
		else 
			return sum;
	}
	
	static String getNaturalNumbers(int x, int y)
	{
		if(x < 0 || y < 0)
			return "-1";
		else if(x == 0 || y == 0)
			return "-2";
		else if(x>y )
			return "-3";
		else if (y-x == 1)
			return "-4";
		else 
			return btwNO(x, y);
	}
public static void main(String[] args) {
	int i, j;
	try (Scanner sobj = new Scanner(System.in)) {
		System.out.print("enter First No : ");
		i  = sobj.nextInt();
		System.out.print("enter Second No : ");
		j  = sobj.nextInt();
	}
	System.out.println("N-no between "+ i +" and " + j + " is "+ getNaturalNumbers(i, j));
}
}
