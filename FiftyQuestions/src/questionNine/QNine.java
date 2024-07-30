package questionNine;

import java.util.Scanner;
public class QNine {
	int n;
	String bb;
	// method
	String ringAlaram(int d, boolean b)
	{
		System.out.println("d = " + d + " b = " + b);
//		if((d < 0 || d > 6) && (b != true || b != false))
//			return "Invalid Inputs";
		if(d >= 1 && d <= 5 && b == true )
			return "10:00";
		else if(d >= 1 && d <= 5 && b == false)
			return "07:00";
		else if(d == 0 || d == 6 && b == true)
			return "OFF";
		else if(d == 0 || d == 6 && b == false)
			return "10:00";
		else {
			return "Invalid Inputs";
		}
	}
	public static void main(String[] args) {
		try (Scanner sobj = new Scanner(System.in)) {
			QNine cobj = new QNine();
			System.out.println("Enter no : ");
			cobj.n = sobj.nextInt();
			cobj.bb = sobj.nextLine();
			System.out.println("Enter True or false : ");
			cobj.bb = sobj.next();
			System.out.println("cobj.n = " + cobj.n + " cobj.bb = " + cobj.bb);
			System.out.println(cobj.ringAlaram(cobj.n, Boolean.parseBoolean(cobj.bb)));
		}
		}
}
