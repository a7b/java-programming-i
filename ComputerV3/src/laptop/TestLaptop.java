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

    /**
     * @param args the command line arguments
     */
    static int maxLaptop = 0;
    int nextLaptop = 0;
    static HPLaptop[] computer;

    public void addLaptop() {
        if (nextLaptop < computer.length) {
            computer[nextLaptop] = new HPLaptop();
            System.out.println("The "+(nextLaptop+1)+" Laptop ");
            computer[nextLaptop].input();
            nextLaptop++;
        } else {
            System.out.println("Unable to add more laptops !!");
        }
    }

    public void displayThinLaptop() {
        boolean check = false;
        if (nextLaptop > 0) {
            for (int i = 0; i < nextLaptop; i++) {
                if (computer[i].weight < 1.5) {
                    check = true;
                }
            }
            if (check == true) {
                System.out.format("%1$-15s %2$-15s %3$-15s %4$-15s \n",
                "Manufacturer",
                "Price",
                "Weight",
                "Color");
                for (int i = 0; i < nextLaptop; i++) {
                    if (computer[i].weight < 1.5) {
                        computer[i].displayDetails();
                    }
                }
            } else {
                System.out.println("Laptops not found ");
            }

        } else {
            System.out.println("No laptops to display ");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        TestLaptop obj = new TestLaptop();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the maximum of the laptop : ");
        TestLaptop.maxLaptop = sc.nextInt();
        computer = new HPLaptop[maxLaptop];

        int choice = 0;
        while (true) {
            try {
                System.out.println("---Menu---");
                System.out.println("1. Add Laptop");
                System.out.println("2. Display the thin-Laptops");
                System.out.println("3. Exit");
                System.out.println("----------");
                System.out.println("Enter your choice : ");
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid choice ! Try again !");
                continue;
            }

            switch (choice) {
                case 1:
                    obj.addLaptop();
                    break;
                case 2:
                    obj.displayThinLaptop();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice ! Try again !");
                    continue;
            }
        }
    }
}
