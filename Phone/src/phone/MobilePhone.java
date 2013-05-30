/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package phone;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class MobilePhone {
    int phoneNumbers[];
    String message;
    
    public MobilePhone()
    {
        message = "";
    }
    
    public void setPhoneNumbers()
    {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Enter the number of mobile numbers to store: ");
            int size = input.nextInt();
            phoneNumbers = new int[size];

            for(int index = 0;index < phoneNumbers.length;index++)
            {
                System.out.print("Enter a phone number: ");
                phoneNumbers[index] = input.nextInt();
            }
        }catch(NegativeArraySizeException nase){
            System.out.println("Exception occurred - "
                    + "Array size should be a positive value.");
        }catch(InputMismatchException ime){
            System.out.println("Exception occurred - Data type mismatch. "
                    + "Enter non-zero numberic value and try again");
        }catch(Exception e){
            System.out.println("Exception occurred - " + e.getMessage());
        }
    }
    
    public void getPhoneNumbers()
    {
        System.out.println("The mobile phone database consists of following "
                + "phone numbers:");
        for(int index = 0;index < phoneNumbers.length;index++)
        {
            System.out.println("  " + (index + 1) + ". " + phoneNumbers[index]);
        }
    }
    
    public void sendMessage()
    {
        Scanner input = new Scanner(System.in);
        try{
            getPhoneNumbers();
            System.out.print("Enter the index of phone number to which you want"
                    + " to send the message: ");
            int index = input.nextInt();
            System.out.print("Enter the message text: ");

            input.useDelimiter("\n");
            this.message = input.next();
            System.out.printf("Sending message [%s] to [%d] ...... please wait\n"
                    , this.message, this.phoneNumbers[index - 1]);
            System.out.println("Message successfully sent.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception occurred - Invalid index.");
        }catch(InputMismatchException e){
            System.out.println("Exception occurred - Datatype mismatch. "
                    + "Check the data type and try again");
        }catch(NullPointerException e){
            System.out.println("Exception occurred - The database of mobile "
                    + "number is empty.");
        }catch(Exception e){
            System.out.println("Exception occurred - " + e.getMessage());
        }
    }
}
