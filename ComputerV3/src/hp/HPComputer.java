package hp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Rico
 */
public class HPComputer extends computer.Computer {

    public double weight;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter manufacturer : ");
        manufacturer = sc.nextLine();
        while (true) {
            try {
                System.out.println("Enter price : ");
                price = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Exception occurred - Data input mismatch !!");
                continue;
            }
            break;
        }
        while (true) {
            try {
                System.out.println("Enter weight : ");
                weight = sc.nextDouble();
                if (weight <= 0.5 || weight >= 3.0) {
                    throw new Rico();//create an user-defined exception
                } else {
                    System.out.println("Valid weight !");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Exception occurred - Data input mismatch !!");
                continue;
            } catch (Rico i) {
                System.out.println("Weight required is between 0.5 kg and 3.0 kg!");
                continue;
            }
        }
    }
}
