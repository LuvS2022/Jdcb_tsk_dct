package questionSven;

import oneInput.One;

public class QSeven extends One {
int num;
int calculate()
{
	if(this.num < 0 || this.num ==0)
		return -1;
	else if (this.num%2 == 0)
		return (int) Math.pow(this.num, 2);
	else 
		return (int) Math.pow(this.num, 3);
}
public static void main(String[] args) {
	QSeven cobj = new QSeven();
	cobj.num = cobj.OneI();
	System.out.println("for " + cobj.num + " return is " + cobj.calculate());
}
}
