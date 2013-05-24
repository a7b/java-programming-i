/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insurance;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class InsurancePlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double installment = 0;
        int amount, choice = 0, years;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount you want to insure for: $");
        amount = input.nextInt();
        System.out.print("Enter the number of years you want to insure for: ");
        years = input.nextInt();
        System.out.println("The following plans are available, Enter you choice:" +
                "\n\t1. Monthly\n\t2. Half-Yearly\n\t3. Yearly");
        System.out.print("Choice: ");
        choice = input.nextInt();
        if(choice == 1)
        {
            installment = (amount / (years - 2)) / 12;
        }
        else if(choice == 2)
        {
            installment = (amount / (years - 2)) / 2;
        }
        else if(choice == 3)
        {
            installment = (amount / (years - 2));
        }
        else
        {
            System.out.println("Invalid Choice. The valid choices are 1, 2 or 3.");
            System.exit(0);
        }
        System.out.println("Policy Details:");
        System.out.printf("Insurance Amount: \t\t $%d \n", amount);
        System.out.printf("Insurance duration (years): \t %d \n", years);
        if(choice == 1)
        {
            System.out.println("Insurance Plan: \t\t Monthly");
        }
        else if(choice == 2)
        {
            System.out.println("Insurance Plan: \t\t Half-Yearly");
        }
        else if(choice == 3)
        {
            System.out.println("Insurance Plan: \t\t Yearly");
        }
        System.out.printf("Installment: \t\t\t $%.2f \n", installment);
    }
}
