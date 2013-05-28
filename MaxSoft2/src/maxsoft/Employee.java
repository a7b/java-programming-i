/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsoft;

/**
 *
 * @author TQNINH
 */
public class Employee {
    String empName;
    
    public Employee()
    {
        empName = "";
    }
    
    void displayDetails()
    {
        System.out.printf("\nEmployee Name: %s", empName);
    }
}
