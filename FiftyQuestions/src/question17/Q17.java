package question17;

import java.util.Scanner;

import question17.Q17;

public class Q17 {
	Q17()
	{
		System.out.println("this is question no 17");
	}
	int row, col;
	public String createBoxPattern(int r, int c) {
	if(r < 0 || c < 0)
		return "-1";
	else if(r == 0 || c == 0)
		return "-2";
	else
				if(r == 1 || c  == this.col || c == 1 || r == this.row )
					return "* ";
				else
					return "  ";
		
	}
public static void main(String[] args) {
	Q17 ref = new Q17();
	Scanner sref = new Scanner(System.in);
	System.out.print("Enter no of row : ");
	ref.row = sref.nextInt();
	System.out.print("Enter no of col : ");
	ref.col = sref.nextInt();
	for(int i = ref.row; i >= 1; i--)
	{
		for(int j = ref.col; j >= 1; j--)
				System.out.print(ref.createBoxPattern(i, j));
			System.out.println();
	}
	sref.close();
	if(ref.row <= 0 || ref.col <= 0)
		System.out.println(ref.createBoxPattern(ref.row, ref.col));
}
}
