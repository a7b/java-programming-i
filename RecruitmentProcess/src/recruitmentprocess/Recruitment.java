/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package recruitmentprocess;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class Recruitment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        int experience = 0;
        int count = 1;
        Scanner input = new Scanner(System.in);
        while(count < 4)
        {
            System.out.print("Enter the years of Experience: ");
            experience = input.nextInt();
            if(experience > 5)
            {
                System.out.print("Are you an MBA? (1 = Yes, 2 = No): ");
                choice = input.nextInt();
                if(choice == 1)
                {
                    count++;
                }
                else
                {
                    System.out.println("Sorry, you need to be an MBA as well.");
                }
            }
            else
            {
                System.out.println("Sorry, you need to have more than 5 years " +
                        "of experience.");
            }
            System.out.println("**********************************************");
        }
        System.out.println("The recruitment process is completed.");
        System.out.println("Three Project Manager has been selected.");
    }
}
