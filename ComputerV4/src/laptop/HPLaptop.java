/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laptop;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class HPLaptop extends hp.HPComputer {
    public String color;
    
    public void input(){
        Scanner scr = new Scanner(System.in);
        scr.useDelimiter("\n");
        
        super.input();
        System.out.print("  - Color: ");
        color = scr.next();
    }
    
    public void displayDetails(int n){
        if(n == 1){
             System.out.format("  %1$-5s %2$-15s %3$-10s %4$-10s %5$-10s\n",
                     "ID", "Manufacturer", "Price($)", "Weight(kg)", "Color");
        }
        System.out.format("  %1$-5s %2$-15s %3$-10s %4$-10s %5$-10s\n",
                n, manufacturer, "$" + price, weight, color);
        
    }
}
