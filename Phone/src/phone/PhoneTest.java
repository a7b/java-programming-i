/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class PhoneTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MobilePhone objNokia = new MobilePhone();
        
        Scanner input = new Scanner(System.in);
        
        byte choice = 0;
        
        do{
            System.out.println("Select an operation from the following:");
            System.out.println("1. Add phone numbers\n2. Send Message\n3. Exit");
            
            System.out.print("Enter the choice: ");
            choice = input.nextByte();
            
            switch(choice){
                case 1:
                    objNokia.setPhoneNumbers();
                    break;
                case 2:
                    objNokia.sendMessage();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }            
        }while(choice != 3);
    }
}
