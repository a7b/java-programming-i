package laptop;

import java.util.Scanner;

/**
 *
 * @author Rico
 */
public class HPLaptop extends hp.HPComputer {

    public String color;

    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter color : ");
        color = sc.nextLine();
    }

    public void displayDetails() {
        
        System.out.format("%1$-15s %2$-15s %3$-15s %4$-15s \n",
                manufacturer,
                price,
                weight,
                color);
           }
}
