/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import laptop.HPLaptop;
/**
 *
 * @author TQNINH
 */
public class TestLaptop {
    final int maxLaptop = 1;
    int nextLaptop = 0;
    HPLaptop[] computer = new HPLaptop[maxLaptop];
    
    public void addLaptop()
    {
        Scanner scr = new Scanner(System.in);
        scr.useDelimiter("\n");
        
        if(nextLaptop < maxLaptop){
            do{
                computer[nextLaptop] = new HPLaptop();
                computer[nextLaptop].input();
                nextLaptop++;
                System.out.println("System Message -> Add laptop successful!");
                if(nextLaptop == maxLaptop){
                    System.out.println("System Message -> Laptop has been full!");
                    break;
                }else{
                    System.out.print("System Message -> Do you continue Add Laptop? (Y/N): ");
                }
            }while(scr.next().toUpperCase().equals("Y"));
        }else{
            System.out.println("System Message -> Unable add laptop!");
        }
    }
    
    public void displayThinLaptop(){
        if(nextLaptop > 0){
            boolean hasThin = false;
            for(int i = 0;i < nextLaptop;i++){
                if(computer[i].weight < 1.5){
                    computer[i].displayDetails(i+1);
                    hasThin = true;
                }
            }
            if(!hasThin){
                System.out.println("System Message -> No thin-laptop to display");
            }
        }else{
            System.out.println("System Message -> No latop to display!");
        }
    }
    
    public void menu()
    {
        int node;
        Scanner scr = new Scanner(System.in);
        
        while(true){
            System.out.println("   -- MENU --");
            System.out.println("   1. Add Laptop");
            System.out.println("   2. Display the thin-Laptops");
            System.out.println("   3. Exit");
            System.out.print("   Enter choice (1-2): ");
            
            node = scr.nextInt();
            switch(node){
                case 1:
                    System.out.println("  ADD LAPTOP");
                    addLaptop();
                    break;
                case 2:
                    System.out.println("  THE THIN-LAPTOP");
                    displayThinLaptop();
                    break;
                case 3:
                    System.exit(0);
                default:
                     System.out.println("System Message -> Invalid choice!");
            }
        }
    }
    
    public static void main(String[] args)
    {
        TestLaptop objTestLaptop = new TestLaptop();
        objTestLaptop.menu();
    }
}
