/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KiemTra;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap du lieu: ");
        Scanner input = new Scanner(System.in);
        //System.out.println(Integer.parseInt(input.nextLine()));
        if(input.hasNext("-"))
        {
            System.out.println("Sai");
        }
    }
}
