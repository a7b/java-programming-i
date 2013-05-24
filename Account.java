/**
 * @(#)Account.java
 *
 *
 * @author 
 * @version 1.00 2013/5/16
 */


public class Account {

    public Account() {
    }
    
    public static void main (String[] args) {
    	int accountNumber = 192834;
    	double accountBalance = 11423.79;
    	char accoutType = 'S';
    	boolean active = true;
    	System.out.println ("------------ ACCOUNT ------------");
    	System.out.println ("Account Number: " + accountNumber);
    	System.out.println ("Account Active: " + active);
    	System.out.println ("Account Type (S: Savings C: Current): " + accoutType);
    	System.out.println ("Account Balance: $" + accountBalance);
    }
    
}