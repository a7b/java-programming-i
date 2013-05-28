/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsoft;

/**
 *
 * @author TQNINH
 */
public class SalaryEmployee extends Employee implements Tax {
    double salary;
    
    public SalaryEmployee(String n, double s)
    {
        super(n);
        this.salary = s;
    }
    
    public double calculateTax()
    {
        return (this.salary * (TAX_PERCENT / 100));
    }
    
    void displayDetails()
    {
        System.out.printf("\nEmployee Name: %s\n", this.name);
        this.salary -= calculateTax();
        System.out.printf("Employee Salary: %.2f\n", this.salary);
    }
}
