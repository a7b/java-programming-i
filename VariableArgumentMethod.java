/**
 * @(#)VariableArgumentMethod.java
 *
 *
 * @author 
 * @version 1.00 2013/5/17
 */


public class VariableArgumentMethod {
	public void print_Model(String ... str)
	{
		for(String i: str)//Lay tung doi cua ham
		{
			System.out.println ("Model number is " + i + ";");
		}
	}
	public static void main (String [] args)
	{
		VariableArgumentMethod var = new VariableArgumentMethod();
		var.print_Model("Hell", "12", "17", "-9", "2000", "Het gio");
		var.print_Model("Het", "gio", "roi");
	}
}