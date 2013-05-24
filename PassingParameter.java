/**
 * @(#)PassingParameter.java
 *
 *
 * @author 
 * @version 1.00 2013/5/17
 */


public class PassingParameter {
	int i;
}

class TestDemo
{
	
	public static void checkval(PassingParameter p1, int n)
	{
		p1.i = p1.i + n;
	}
	
	public static void main (String [] args)
	{
		PassingParameter p = new PassingParameter();
		System.out.println ("Value i of p befor assigment i is: \t" + p.i);
		p.i = 3;
		System.out.println ("Value i of p befor calling method is: \t" + p.i);
		checkval(p, 10);
		System.out.println ("Value i of p after calling method is: \t" + p.i);
	}
}