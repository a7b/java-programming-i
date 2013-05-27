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

class Circle
{
    public static double radious; //bien tinh
    public Circle()
    {
        this.radious = 0;
    }
    public Circle(double r)
    {
        this.radious = r;
    }
    public void displayRadious()
    {
        System.out.println("Radious: " + this.radious);
    }
}
public class Test {
    public Test()
    {
        
    }
    /**
     * @param args the command line arguments
     */
    
    //public void GoodBye()
    //{
    //    System.out.println("Good bye!");        
    //}
    public static void main(String[] args) {
        // TODO code application logic here
//                
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Accept the of manufacturer: ");
//        String m = input.nextLine();
//        
//        System.out.print("Accept the price: ");
//        double p = Double.parseDouble(input.nextLine());
//        
//        Computer c1 = new Computer(m, p);
//        System.out.println("Computer 1:");
//        c1.display();
//        
//        Computer c2 = new Computer();
//        c2.input();
//        
//        System.out.println("Computer 2:");
//        c2.display();
//        
//        Computer c3 = new Computer();
//        
//        System.out.print("Accept the of manufacturer: ");
//        c3.setManufacturer(input.nextLine());
//        
//        System.out.print("Accept the price: ");
//        c3.setPrice(Double.parseDouble(input.nextLine()));
//        
//        System.out.println("Computer 3:");
//        c3.display();
        
        //Computer c4 = new Computer();
        //c4.input();
        //   -- input la public va no nam trong goi computer
        //      nen co the goi phan tu private manufacturer, price
        //System.out.println("Manufacture: " + c4.manufacturer);
        //   -- Khong thue truy suat truc tiep thuoc tinh private manufacturer
        //System.out.println("Price: " + c4.price);
        //   -- Khong thue truy suat truc tiep thuoc tinh private price
        //GoogBye()
        //this.GoodBye();
        //cach 1: khoi tao doi tuong
        //TestComputer t = new TestComputer();
        //t.GoodBye;
        //cach 2: khai bao static cho phuong thuc
        //GoodBye(); //khai bao dang nay
        //TestComputer.GoodBye(); //Goi truc tiep
                
        Circle c1 = new Circle(9);
        c1.displayRadious();
        
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        c3.radious = 5;
        c2.displayRadious();
        c3.displayRadious();
    }
}
