/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laptop;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rico
 */
public class TestLaptop {

    static int maxLaptop = 4;
    static int nextLaptop = 0;
    static HPLaptop[] computer;

    void addLaptop() {
        if (nextLaptop < computer.length) {
            computer[nextLaptop] = new HPLaptop();
            computer[nextLaptop].input();
            nextLaptop++;
        } else {
            System.out.println("Unable to add laptop !");
        }

    }

    void displayThinDetails() {
        boolean test = false;
        if (nextLaptop > 0) {
            for (int i = 0; i < nextLaptop; i++) {
                if (computer[i].weight < 1.5) {
                    test = true;
                }
            }
            if (test == true) {
                System.out.println("================================Details===============================================");

                System.out.println("======================================================================================");

                System.out.format("%1$15s %2$15s %3$15s %4$15s \n",
                "manufacturer",
                "price",
                "weight",
                "color");
        System.out.println("======================================================================================");
        
                for (int i = 0; i < nextLaptop; i++) {
                    if (computer[i].weight < 1.5) {
                        computer[i].displayDetails();
                    }
                }
            } else {
                System.out.println("Result not found ! Don't existing any laptop have weight less than 1.5 !");
            }

        } else {
            System.out.println("No laptop existing in the storage !");
        }


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TestLaptop obj = new TestLaptop();
        computer = new HPLaptop[maxLaptop];
        int choice = 0;
        while (true) {
            System.out.println("======================================================================================");

            System.out.println("                           1. Add laptop");
            System.out.println("                           2. Display the thin-laptops");
            System.out.println("                           3. Exit");
            System.out.println("======================================================================================");
        
            System.out.println("Enter your choice (1-3) :");
            try {
                Scanner sc = new Scanner(System.in);
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Illegal");
                continue;
            }

            switch (choice) {
                case 1:
                    obj.addLaptop();
                    break;

                case 2:
                    obj.displayThinDetails();
                    break;

                case 3:
                    System.out.println("Exit");
                    System.exit(0);
                default:
                    System.out.println("Invalid !");
                    continue;
            }
        }

    }
}
