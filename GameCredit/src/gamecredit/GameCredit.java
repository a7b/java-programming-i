/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamecredit;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class GameCredit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int credit = 5000, choice = 0;
        int itemPrice = 0;
        Scanner input = new Scanner(System.in);
        for(;(credit > 0) && (choice != 5);)
        {
            do
            {
                System.out.println("1. Engine - $3000");
                System.out.println("2. Suspension - $1500");
                System.out.println("3. Tyre - $500");
                System.out.println("4. Music System - $3000");
                System.out.println("5. Exit");
                System.out.println("Your current credit is: $" + credit);
                System.out.print("Enter your choice: ");
                choice = input.nextInt();
                
                if(choice == 5)
                {
                    break;
                }
                switch (choice)
                {
                    case 1:
                        itemPrice = 3000;
                        break;
                    case 2:
                        itemPrice = 1500;
                        break;
                    case 3:
                        itemPrice = 500;
                        break;
                    case 4:
                        itemPrice = 3000;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
                if(credit >= itemPrice)
                {
                    credit -= itemPrice;
                }
                else if(itemPrice > credit)
                {
                    System.out.println("Sorry, the item price (" + itemPrice +
                            ") exceeds your current credit (" + credit + ")");
                    break;
                }
            }while((choice >= 1) && (choice <= 4));
        }
    }
}
