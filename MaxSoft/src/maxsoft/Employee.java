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
    
    public Employee(String n)
    {
        empName = n;
    }
    
    void displayDetails_1()
    {
        System.out.printf("Employee Name:\t\t%s", empName);
    }
    
    void displayDetails_2()
    {
        System.out.printf("Employee Name:\t\t%s", empName);
    }
}
