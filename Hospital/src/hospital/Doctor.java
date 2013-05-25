/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class Doctor {
    int code;
    String name;
    String address;
    String phone;
    public Doctor ()
    {
        code = 0;
        name = "";
        address = "";
        phone = "";        
    }
    void getDoctorInfo()
    {
        System.out.println("The details about the doctor are:");
        System.out.println("Code: " + code);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
    void setDoctorInfo()
    {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.println("Enter details about the doctor:");
        System.out.print("Enter doctor's code: ");
        code = input.nextInt();
        System.out.print("Enter name: ");
        name = input.next();
        System.out.print("Enter address: ");
        address = input.next();
        System.out.print("Enter phone number: ");
        phone = input.next();
    }
    
    
    
}
