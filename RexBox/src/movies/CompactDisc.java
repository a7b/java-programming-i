/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

/**
 *
 * @author TQNINH
 */
public class CompactDisc {
    public String title;
    public double price;
    public int code;
    
    public void CompactDisc()
    {
        title = "";
        price = 0;
        code = 0;
    }
    
    public void CompactDisc(String t, double p, int c)
    {
        title = t;
        price = p;
        code = c;
    }
    
    public void menuMovie()
    {
        System.out.format("%1$-5s %2$-25s %3$-10s", "ID", "TITLE", "PRICE");
        System.out.println("\n-----------------------------------------");
    }
    
    public void mainMovie()
    {
        System.out.format("%1$-5s %2$-25s %3$-10.2f\n", code + 1, title, price);
    }
}
