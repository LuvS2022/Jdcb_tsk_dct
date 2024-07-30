package question18;

import java.util.Scanner;

import question18.Q18;

public class Q18 {
	Q18()
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
		return "* ";
			}
public static void main(String[] args) {
	Q18 ref = new Q18();
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
				System.out.print(ref.createStarPattern(i));
			System.out.println();
	}
	sref.close();
}
}
