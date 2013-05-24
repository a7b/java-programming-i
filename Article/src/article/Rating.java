/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package article;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class Rating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        int poorCount = 0, fairCount = 0, goodCount = 0, excellentCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Tell us what do you think about the content of"
                + " article \"Basic of Java\"");
        System.out.println("1. Poor");
        System.out.println("2. Fair");
        System.out.println("3. Good");
        System.out.println("4. Excellent");
        System.out.println("5. Exit");
        System.out.print("\tChoice: ");
        choice = input.nextInt();
        for(;choice != 5;)
        {
           switch(choice)
           {
               case 1:
                   poorCount++;
                   break;
               case 2:
                   fairCount++;
                   break;
               case 3:
                   goodCount++;
                   break;
               case 4:
                   excellentCount++;
                   break;
               default:
                   System.out.println("Invalid input!");
                   break;
           }
           System.out.print("Enter your choice: ");
           choice = input.nextInt();
           System.out.println("The article \"Basics of Java\" has received"
                   + " the following ratings:");
           System.out.println("Poor: " + poorCount);
           System.out.println("Fair: " + fairCount);
           System.out.println("Good: " + goodCount);
           System.out.println("Excellent: " + excellentCount);
           
        }
    }
}
