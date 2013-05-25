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
public class Patient {
    int code;
    String name;
    int age;
    String address;
    String symptoms;
    int doctorCode;
    String doctorName;
    public Patient()
    {
        code = 0;
        name = "";
        age = 0;
        address = "";
        symptoms = "";
        doctorCode = 0;
        doctorName = "";
    }
    void getPatientDetails()
    {
        System.out.println("The details about the patient are:");
        System.out.println("Code: " + code);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Symptoms: \n" + symptoms);
    }
    void setPatientDetails()
    {
        Scanner input = new Scanner(System.in);
        input.useDelimiter("\n");
        System.out.println("Enter details about the patient:");
        System.out.print("Enter patient code: ");
        code = input.nextInt();
        System.out.print("Enter name: ");
        name = input.next();
        System.out.print("Enter age: ");
        age = input.nextInt();
        System.out.print("Enter address: ");
        address = input.next();
        System.out.println("Enter Symptoms: You can type as many lines as "
                + "you wish. Enter 0 to stop.");
        symptoms = new Scanner(System.in).useDelimiter("0").next();
    }
}
