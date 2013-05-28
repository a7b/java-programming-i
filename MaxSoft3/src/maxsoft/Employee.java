/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsoft;

/**
 *
 * @author TQNINH
 */
public abstract class Employee {
    String name;
    
    public Employee()
    {
        
    }
    
    public Employee(String n)
    {
        this.name = n;
    }
    
    abstract void displayDetails();
}
