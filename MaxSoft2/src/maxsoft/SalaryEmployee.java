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
    int grade;
    double deductions;
    
    public SalaryEmployee()
    {
        this("", 0.0, 0, 0);
    }
    
    public SalaryEmployee(String n, double s, int g)
    {
        this(n, s, g, 0);
    }
    
    public SalaryEmployee(String n, double s, int g, int d)
    {
        this.empName = n;
        this.salary = s;
        this.grade = g;
        this.deductions = d;
    }
    
    double caculateNetSalary(int perk)
    {
        return (this.salary + perk) - this.deductions;
    }
    
    double caculateNetSalary(int perk1, int perk2)
    {
        return (this.salary + perk1 + perk2) - this.deductions;
    }
    
    void displayDetails()
    {
        super.displayDetails();
        if(grade == 1)
        {
            System.out.printf("\nNet Salary: %.2f", caculateNetSalary(100));
        }
        else if(grade == 2)
        {
            System.out.printf("\nNet Salary: %.2f", caculateNetSalary(100, 200));
        }
    }
}
