package QuestionFive;
import oneInput.One;
public class QFive extends One {
int num;
int findSign(int num)
{
	if(this.num > 0)
		return 1;
	else if(this.num < 0)
		return -1;
	else
		return 0;
}
public static void main(String[] args)
{
	QFive cobj = new QFive();
	cobj.num = cobj.OneI();
	System.out.println("for " + cobj.num + " return is " + cobj.findSign(cobj.num));
}
}
