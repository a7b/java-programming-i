/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package australiancricket;

/**
 *
 * @author TQNINH
 */
public abstract class Player {
    public String name;
    
    public Player()
    {
        this.name = "";
    }
    
    public Player(String n)
    {
        this.name = n;
    }
    
    public abstract void displayDetails();
}
