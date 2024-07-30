package question16;

import java.util.Scanner;

public class Q16 {
	int num;
	Q16()
	{
		System.out.println("This Questiion 16");
	}
	public String getFourPerLine(Q16 obj)
	{
		String sum = " "; 
		if(this.num < 0)
			return "-1";
		else if(this.num == 0)
			return "-2";
		else if (this.num > 99)
			return "-3";
		else 
		{
			for(int i = 2; i < this.num; i++)
				sum = sum + String.valueOf(i) + " "; 
			return sum;
		}
	}
public static void main(String[] args) {
	Q16 crobj = new Q16();
	Scanner sobj = new Scanner(System.in);
	System.out.print("Enter the number : ");
	crobj.num = sobj.nextInt();
	System.out.println(crobj.getFourPerLine(crobj));
	sobj.close();
}
}
