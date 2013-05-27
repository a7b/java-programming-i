/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package music;

/**
 *
 * @author TQNINH
 */
public class CompactDisc {
    public String title;
    public String artist;
    public double price;
    public int code;

    public void CompactDisc()
    {
        title = "";
        artist = "";
        price = 0;
        code = 0;
    }
    
    public void CompactDisc(String t, String a, double p, int c)
    {
        title = t;
        artist = a;
        price = p;
        code = c;
    }
    
    public void menuMusic()
    {
        System.out.format("%1$-5s %2$-25s %3$-25s %4$-10s",
                "ID", "TITLE", "ARTIST", "PRICE");
        System.out.println("\n-------------------------------------------------"
                + "--------------------");
    }
    
    public void mainMusic()
    {
        System.out.format("%1$-5s %2$-25s %3$-25s %4$-10.2f\n",
                code + 1, title, artist, price);
    }
    
}
