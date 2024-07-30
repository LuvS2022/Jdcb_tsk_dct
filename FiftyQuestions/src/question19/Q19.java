package question19;

import java.util.Scanner;


public class Q19 {
	Q19()
	{
		System.out.println("this is question no 18");
	}
	int row;
	public String createStarPattern(int r) {
	if(r < 0)
		return "-1";
	else if(r == 0)
		return "-2";
	else
		return String.valueOf(r)+ " ";
			}
public static void main(String[] args) {
	Q19 ref = new Q19();
	Scanner sref = new Scanner(System.in);
	System.out.print("Enter no of line : ");
	ref.row = sref.nextInt();
	if(ref.row <= 0)
	{
		System.out.println(ref.createStarPattern(ref.row));
		System.exit(0);
	}
	for(int i = 1; i <= ref.row; i++)
	{
		for(int j = 1; j <= i; j++)
				System.out.print(ref.createStarPattern(j*i));
			System.out.println();
	}
	sref.close();
}
}
