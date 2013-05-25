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
    private int code;
    private String name;
    private String address;
    private String phone;
    public Doctor()
    {
        code = 0;
        name = "";
        address = "";
        phone = "";
    }
    public String getName()
    {
        return name;
    }
    public int getCode()
    {
        return 0;
    }
    public void getDoctorInfo()
    {
        System.out.println("The details about the doctor are:");
        System.out.println("Code: " + code);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
    }
    public void setDoctorInfo()
    {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        
        System.out.println("Enter details about the doctor:");
        System.out.print("Enter doctor's code: ");
        code = input.nextInt();
        System.out.print("Enter name: ");
        name = input.next();
        System.out.print("Address: ");
        address = input.next();
        System.out.print("Phone: ");
        phone = input.next();
    }
}
