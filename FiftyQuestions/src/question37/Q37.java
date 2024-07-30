package question37;

public class Q37 {
	static String[] s = new String[4];
	public 
static String[] getFormats(int a)
{
	String b = " ";
	while(a >= 1) 
	{
		if(a%2 == 0)
			b = b + "0 ";
		else 
			b = b + "1 ";
		a = a/2;
	}
	
	s[0] = b;
	System.out.println("b = " + b);
	return s;
}
public static void main(String[] args) {
	int n = 10;
	System.out.println(getFormats(n).toString());
}
}
