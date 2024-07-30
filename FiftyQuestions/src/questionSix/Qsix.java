package questionSix;
import java.util.Scanner;
public class Qsix {
	int num;
String isEvenOdd()
{
	if(this.num < 0 || this.num == 0)
		return "Invalid Input";
	else if(this.num%2 == 0)
		return "Even";
	else
		return "Odd";
}
public static void main(String[] args)
{
	Qsix cobj = new Qsix();
	try(Scanner sobj = new Scanner(System.in))
	{
		System.out.print("enter no : ");
		cobj.num = sobj.nextInt();
	}
	System.out.println("for "+cobj.num+" return is " + cobj.isEvenOdd());
}
}
