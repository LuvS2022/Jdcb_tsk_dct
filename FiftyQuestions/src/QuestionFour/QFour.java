package QuestionFour;
import oneInput.One;
public class QFour extends One{
	int no;
	int r;
	int oddRounder(int a)
	{
		if(a < 0)
			return -1;
		else if( a == 0)
			return -2;
		else if(a%2 == 0)
			return this.no;
		else 
		{
			r = a%10;
			return a + (10-r);
		}
	}
public static void main(String[] args) {
	QFour cobj = new QFour();
	cobj.no = cobj.OneI();
	System.out.println("for  "+ cobj.no + " return is :  " + cobj.oddRounder(cobj.no));
}
}
