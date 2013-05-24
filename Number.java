/**
 * @(#)Number.java
 *
 *
 * @author 
 * @version 1.00 2013/5/17
 */
import java.util.Scanner;

public class Number {

    public Number() {
    }
    
    public static void main (String[] args) {
    	//int number1;
    	//int number2;
    	long number1;
    	long number2;
    	Scanner input = new Scanner (System.in);
    	System.out.print ("Number 1: ");
    	//number1 = input.nextInt();
    	number1 = input.nextLong();
    	System.out.print ("Number 2: ");
    	//number2 = input.nextInt();
    	number2 = input.nextLong();
    	System.out.println (number1 + " & " + number2 + " = " + (number1 & number2));
    	System.out.println (number1 + " | " + number2 + " = " + (number1 | number2));
    	System.out.println ("~" + number1 + " = " + (~number1));
    	System.out.println ("~" + number2 + " = " + (~number2));
    	System.out.println ("(~" + number1 + ") & (~" + number2 + ") = " + ((~number1) & (~number2)));
    	System.out.println ("(~" + number1 + ") | (~" + number2 + ") = " + ((~number1) | (~number2)));
    	System.out.println (number1 + " >> " + number2 + " = " + (number1 >> number2));
    	System.out.println (number1 + " << " + number2 + " = " + (number1 << number2));
    	System.out.println (number2 + " >> " + number1 + " = " + (number2 >> number1));
    	System.out.println (number2 + " << " + number1 + " = " + (number2 << number1));
    }
}