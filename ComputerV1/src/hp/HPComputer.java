/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;
import computer.*;
import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class HPComputer extends Computer{
    public double weight;
    public Scanner test = new Scanner(System.in);

    public HPComputer() {
        super();
        this.weight = 0.0;
    }
    
    public HPComputer(String m, int p, double w)
    {
        super(m, p);
        this.weight = w;
    }
    
    public void input()
    {
        test.useDelimiter("\n");
        System.out.print("Manufacturer:\t");
        this.manufacturer = test.next();
        System.out.print("Price:\t\t");
        this.price = test.nextInt();
        System.out.print("Weight:\t\t");
        this.weight = test.nextDouble();
    }
}
