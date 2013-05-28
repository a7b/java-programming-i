/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsoft;

/**
 *
 * @author TQNINH
 */
public class TestEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee objJohn = new SalaryEmployee("John", 1200.50);
        objJohn.displayDetails_1();
        
        Employee objNinh = new SalaryEmployee("Quoc Ninh", 1000.50);
        objNinh.displayDetails_2();
    }
}
