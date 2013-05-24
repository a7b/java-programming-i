/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookdetails;

import java.util.Scanner;

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
        int choice;
        Book objBook = new Book();
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Welcome to E-Repository\n" +
                    "Select the operation you want to perform:");
            System.out.println("**************************************");
            System.out.println("1. Add book to the repository.");
            System.out.println("2. Search book by ISBN number.");
            System.out.println("3. Display book details.");
            System.out.println("4. Exit");
            System.out.println("**************************************");
            System.out.print("Choice: ");
            choice = input.nextInt();
            
            switch(choice)
            {
                case 1:
                    objBook.addBook();
                    break;
                case 2:
                    objBook.searchByIsbn();
                    break;
                case 3:
                    objBook.displayBooks();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }while(choice != 4);
    }
}
