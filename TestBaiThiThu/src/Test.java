/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import computer.Computer;
import java.util.Scanner;
/**
 *
 * @author TQNINH
 */
public class Test {
    public Test()
    {
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Accept the of manufacturer: ");
        String m = input.nextLine();
        
        System.out.print("Accept the price: ");
        double p = Double.parseDouble(input.nextLine());
        
        Computer c1 = new Computer(m, p);
        System.out.println("Computer 1:");
        c1.display();
        
        Computer c2 = new Computer();
        c2.input();
        
        System.out.println("Computer 2:");
        c2.display();
        
        Computer c3 = new Computer();
        
        System.out.print("Accept the of manufacturer: ");
        c3.setManufacturer(input.nextLine());
        
        System.out.print("Accept the price: ");
        c3.setPrice(Double.parseDouble(input.nextLine()));
        
        System.out.println("Computer 3:");
        c3.display();
        
        //Computer c4 = new Computer();
        //c4.input();
        //   -- input la public va no nam trong goi computer
        //      nen co the goi phan tu private manufacturer, price
        //System.out.println("Manufacture: " + c4.manufacturer);
        //   -- Khong thue truy suat truc tiep thuoc tinh private manufacturer
        //System.out.println("Price: " + c4.price);
        //   -- Khong thue truy suat truc tiep thuoc tinh private price
    }
}
