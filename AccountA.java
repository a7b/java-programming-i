/**
 * @(#)AccountA.java
 *
 *
 * @author 
 * @version 1.00 2013/5/16
 */
import java.util.Scanner;

public class AccountA {

    public AccountA() {
    }
    
    public static void main (String[] args) {
    	int accountNumber;
    	double accountBalance;
    	
    	System.out.println ("NHAP THONG TIN ACCOUNT");
    	System.out.println ("Account Number: ");
    	Scanner scan = new Scanner(System.in);
    	accountNumber = scan.nextInt();
    	System.out.println ("Account Balance: ");
    	accountBalance = scan.nextDouble();
    	//System.out.println("\f");
		//if( System.getProperty( "os.name" ).startsWith( "Window" ) )
		//	Runtime.getRuntime().exec("cls");
		//else
		//	Runtime.getRuntime().exec("clear");
    	System.out.println ("------------ ACCOUNT ------------");
    	System.out.printf ("Account Number: %d\n", accountNumber);
    	System.out.printf ("Account Balance: $%.2f", accountBalance);    	
    }
}