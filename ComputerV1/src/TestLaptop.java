/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import laptop.*;
/**
 *
 * @author TQNINH
 */
public class TestLaptop {
    public int maxLaptop;
    public int nextLaptop;
    public HPLaptop[] computer;

    public TestLaptop() {
        this.maxLaptop = -1;
        this.nextLaptop = -1;
    }
    
    public TestLaptop(int m)
    {
        this.computer = new HPLaptop[m];
        this.maxLaptop = m;
        this.nextLaptop = 0;
    }
    
    void addLaptop()
    {
        if(nextLaptop < maxLaptop)
        {
            System.out.println("ID:\t\t" + (nextLaptop+1));
            computer[nextLaptop] = new HPLaptop();
            computer[nextLaptop].input();
            nextLaptop++;
        }
        else
        {
            System.out.println("FULL!");
        }
    }
    
    void displayThinLaptop()
    {
        int numberThinLaptop = 0;
        for(int rowIndex = 0;rowIndex < nextLaptop;rowIndex++)
        {
            if(computer[rowIndex].weight < 1.5)
            {
                computer[rowIndex].displayDetails();
                numberThinLaptop++;
            }
        }
        if(numberThinLaptop == 0)
        {
            System.out.println("No ThinLaptop");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int node;
        TestLaptop objTestLaptop = new TestLaptop(3);
        Scanner choice = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("LAPTOP MANAGER");
            System.out.println("1. Add Laptop");
            System.out.println("2. Display the thin-Laptops");
            System.out.println("3. Exit");
            System.out.print("Choice (1-2): ");
            node = choice.nextInt();

            switch(node)
            {
                case 1:
                    System.out.println("ADD LAPTOP");
                    objTestLaptop.addLaptop();
                    break;
                case 2:
                    System.out.println("DISPLAY THIN LAPTOP");
                    objTestLaptop.displayThinLaptop();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
