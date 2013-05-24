/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

/**
 *
 * @author TQNINH
 */
public class Computer {
    //public String manufacturer;
    private String manufacturer;
    //public double price;
    private double price;
    public Computer()
    {
        this.manufacturer = "";
        this.price = 0;
    }
    public Computer(String m, double p)
    {
        this.manufacturer = m;
        this.price = p;
    }
    public void setManufacturer(String m)
    {
        this.manufacturer = m;
    }
    public void setPrice(double p)
    {
        this.price = p;
    }
    public String getManufacturer()
    {
        return this.manufacturer;
    }
    public double getPrice()
    {
        return this.price;
    }
    public void input()
    {
        this.manufacturer = "HP";
        this.price = 50;
    }
    public void display()
    {
        System.out.println("The name of manufacturer: " + this.manufacturer);
        System.out.println("The price: $" + this.price);
    }
}
