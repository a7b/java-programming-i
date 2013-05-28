/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package australiancricket;

/**
 *
 * @author TQNINH
 */
public class PlayerIncome extends Player implements Tax {
    double salary;
    
    public PlayerIncome()
    {
        //super();
        //this.salary = 0;
        this("", 0);
    }
    
    public PlayerIncome(String n, double s)
    {
        //super(n);
        //this.salary = s;
        this.name = n;
        this.salary = s;
    }
    
    public double calculateTax()
    {
        return (this.salary * (TAX_PERCENT / 100));
    }
    
    public void displayDetails()
    {
        System.out.println("Player:\t" + this.name);
        this.salary -= calculateTax();
        System.out.println("Salary:\t$" + this.salary);
    }
}
