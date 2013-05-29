/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package haisonguyen;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class HaiSoNguyen {
    
    public static void main(String[] args)
    {
        int a = 0, b = 0;
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        
        do
        {
            try{
                System.out.print("Accept integer a: ");
                //a = input.nextInt();
                a = Integer.parseInt(input.nextLine());
                flag = true;
            }catch(NumberFormatException nfe){
                System.out.println("You must accept an integer. Pls again!");
            }
        }while(!flag);
        
        do
        {
            flag = false;
            try{
                System.out.print("Nhap so nguyen b: ");
                //b = input.nextInt();
                b = Integer.parseInt(input.nextLine());                
                System.out.println(a + "/" + b + " = " + (a / b));
                flag = true;
            }catch(NumberFormatException nfe){
                System.out.println("You must accept an integer. Pls again!");
            }catch(ArithmeticException ae){
                System.out.println("Can not divide by zero");
            }
        }while(!flag);        
    }    
}
