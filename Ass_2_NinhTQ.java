/**
 * @(#)Ass_2_NinhTQ.java
 *
 *
 * @author 
 * @version 1.00 2013/5/17
 */
import java.util.Scanner;

class Ass_2_NinhTQ {

    public Ass_2_NinhTQ() {
    }
    
    public static void main (String[] args) {
    	//Bank Account
    	float rate;
    	long mouney;
    	int time;
		Scanner input = new Scanner (System.in);
    	System.out.println ("-------- BANK ACCOUNT --------");
    	System.out.print ("Lai suat \t(dvt: %nam): \t\t");
    	rate = input.nextFloat();
    	System.out.print ("So tien \t(dvt: 1000VND): \t");
    	mouney = input.nextLong();
    	System.out.print ("Thoi gian \t(dvt: nam): \t\t");
    	time = input.nextInt();
    	System.out.printf ("Tien loi \t(dvt: 1000VND): \t%.0f VND\n", mouney*(rate/100)*time);
    	//Number
    	long number1;
    	long number2;
    	System.out.println ("-------- NUMBER --------");
    	System.out.print ("Number 1: ");
    	number1 = input.nextLong();
    	System.out.print ("Number 2: ");
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