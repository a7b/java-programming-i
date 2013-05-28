/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsoft;

/**
 *
 * @author TQNINH
 */
public class SalaryEmployee extends Employee {
    double salary;
    
    public SalaryEmployee()
    {
        super();
        salary = 0;
    }
    
    public SalaryEmployee(String n, double s)
    {
        super(n);
        salary = s;
    }
    
    void displayDetails_1()
    {
        super.displayDetails_1();
        System.out.printf("\n" + empName + "'s Salary:\t%.2f\n", salary);
    }
    
    void displayDetails_2()
    {
        System.out.printf("\n" + empName + "'s Salary:\t%.2f\n", salary);
    }
}
