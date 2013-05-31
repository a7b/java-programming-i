/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

import computer.Computer;
import java.util.InputMismatchException;

import java.util.Scanner;

/**
 *
 * @author Rico
 */
public abstract class HPComputer extends Computer {

    public double weight;

    public void input() {
        Scanner sc;
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Enter manufacturer :");
                manufacturer = sc.nextLine();
            } catch (Exception e) {
                System.out.println("**************************");
                System.out.println("Illegal ! Try again !");
                System.out.println("**************************");

                continue;
            }
            break;

        }
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Enter price :");
                price = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("**************************");
                System.out.println("Illegal ! Try again !");
                System.out.println("**************************");

                continue;
            }
            break;
        }
        while (true) {
            try {
                sc = new Scanner(System.in);
                System.out.println("Enter weight :");
                weight = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("**************************");
                System.out.println("Illegal ! Try again !");
                System.out.println("**************************");
                continue;
            }

            try {
                if (weight < 0.5 | weight > 3.0) {
                }
            } catch (Exception e) {
            } finally {
                if (weight >= 0.5 & weight <= 3.0) {
                    System.out.println("OK ! Weight from 0.5kg to 3.0kg !!");
                    break;

                }
            }


        }
    }
}
