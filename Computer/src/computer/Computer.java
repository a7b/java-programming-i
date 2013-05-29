/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author TQNINH
 */
public abstract class Computer {
    public String manufacturer;
    public int price;
    
    public abstract void input();
    
    public Computer()
    {
        this.manufacturer = "";
        this.price = 0;
    }
    
    public Computer(String m, int p)
    {
        this.manufacturer = m;
        this.price = p;
    }
    
}
