/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laptop;

import java.util.Scanner;

/**
 *
 * @author Rico
 */
public class HPLaptop extends hp.HPComputer {

    String color;

    @Override
    public void input() {
        super.input();
        while(true){
        Scanner sc;
        try {
            System.out.println("Enter color :");
        sc = new Scanner(System.in);
        color = sc.nextLine();
        } catch (Exception e) {
           System.out.println("**************************");
System.out.println("Illegal ! Try again !");
                System.out.println("**************************");
                continue;
        }
        break;
        }
    }

    public void displayDetails() {
         System.out.format("%1$15s %2$15s %3$15s %4$15s \n",
                manufacturer,
                price,
                weight,
                color);



    }
}
