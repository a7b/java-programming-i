/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsoft;

/**
 *
 * @author TQNINH
 */
public class EmployeeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee objNinh = new SalaryEmployee("Ninh", 3458, 1);
        Employee objDavid = new SalaryEmployee("David", 6541, 2, 200);
        objNinh.displayDetails();
        objDavid.displayDetails();
    }
}
