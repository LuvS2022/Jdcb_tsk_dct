package program;

public class Fac {

	public static void main(String[] args) {
		int n = 5;
		int mul = 1;
		int sum = 0;
		for(int i = n; i >= 0; i--)
		{
			if(i == 0 || i == 1)
			{
				System.out.println("mul = " + mul);
				mul = 1;
				sum = sum + mul;
				break;
			}
			mul = mul * i;
			sum = sum + mul;
		}
		System.out.println("sum = " + sum);
	}
	
}
