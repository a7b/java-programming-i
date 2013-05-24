/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookisbn;

/**
 *
 * @author TQNINH
 */
public class BookTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book objBookISBNs = new Book();
        objBookISBNs.setIsbn();
        System.out.println("\nThe ISBN numbers of the book are: ");                
        objBookISBNs.getIsbn();
        objBookISBNs.sortIsbn();
        System.out.println("\nThe ISBN numbers of the book in ascending order are: ");
        objBookISBNs.getIsbn();
    }
}
