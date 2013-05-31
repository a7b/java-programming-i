/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laptop;
import hp.*;
/**
 *
 * @author TQNINH
 */
public class HPLaptop extends HPComputer {
    public String color;
    
    public HPLaptop()
    {
        super();
        this.color = "";
    }
    
    public HPLaptop(String m, int p, double w, String c)
    {
        super(m, p, w);
        this.color = c;
    }
    
    public void input()
    {
        super.input();
        System.out.print("Color:\t\t");
        this.color = super.test.next();
    }
    
    public void displayDetails()
    {
        System.out.println("-- Manufacturer:\t" + this.manufacturer);
        System.out.println("-- Price:\t\t" + this.price);
        System.out.println("-- Weight:\t\t" + this.weight);
        System.out.println("-- Color:\t\t" + this.color);
    }
}
