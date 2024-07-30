package oneInput;

import java.util.Scanner;

public class One {
	public int num;
	
public int OneI()
{
	try(Scanner sobj = new Scanner(System.in))
	{
		System.out.print("Enter no : ");
		num = sobj.nextInt();
	}
		return this.num;
}
}
