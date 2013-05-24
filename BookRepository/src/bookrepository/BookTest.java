/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookrepository;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class BookTest {
    Book[] books;
    byte bookCount;
    public BookTest()
    {
        bookCount = 0;
    }
    void addBooks()
    {
        Scanner input = new Scanner(System.in);
        if(bookCount < books.length)
        {
            books[bookCount] = new Book();
            System.out.print("Enter book name: ");
            books[bookCount].name = input.nextLine();
            
            System.out.print("Enter author name: ");
            books[bookCount].authorName = input.nextLine();
            
            System.out.print("Enter book price: ");
            books[bookCount].price = input.nextFloat();
            
            System.out.print("Enter ISBN of the book: ");
            books[bookCount].isbn = input.nextInt();
            
            System.out.print("Enter year of publication: ");
            books[bookCount].yearPublish = input.nextShort();
            
            bookCount++;
        }
        else
        {
            System.out.println("Sorry, Unable to add book");
        }
    }
    void displayHeader()
    {
        System.out.format("%1$-10s %2$-25s %3$-25s %4$-10s %5$-10s",
                "ISBN", "Book Name", "Author Name", "Price($)", "Year of"
                + "Publication");
    }
    void searchByBookName()
    {
        Scanner input = new Scanner(System.in);
        String bookName = "";
        boolean bookFound = false;
        if(bookCount > 0)
        {
            System.out.println("Enter a book name to search for:");
            bookName = input.nextLine();
            displayHeader();
            System.out.print("\n---------------------------------------------"
                    + "-------------------------------------------");
            for(int rowIndex = 0;rowIndex < bookCount;rowIndex++)
            {
                if(books[rowIndex].name.indexOf(bookName) != -1)
                {
                    System.out.format("\n%1$-10d %2$-25s %3$-25s %4$-10.2f %5$-10d",
                            books[rowIndex].isbn, books[rowIndex].name,
                            books[rowIndex].authorName, books[rowIndex].price,
                            books[rowIndex].yearPublish);
                    bookFound = true;
                    break;
                }
            }
            if(!bookFound)
            {
                System.out.println("Book not found.");
            }
        }
        else
        {
            System.out.println("No book to search");
        }
    }
    void displayBooks()
    {
        if(bookCount > 0)
        {
            displayHeader();
            System.out.print("\n----------------------------------------------"
                    + "-----------------------------------");
            for(int rowIndex = 0;rowIndex < bookCount;rowIndex++)
            {
                System.out.format("\n%1$-10d %2$-25s %3$-25s %4$-10.2f %5$-10d",
                        books[rowIndex].isbn, books[rowIndex].name,
                        books[rowIndex].authorName, books[rowIndex].price,
                        books[rowIndex].yearPublish);
            }
        }
        else
        {
            System.out.println("No book to display");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte numberOfBooks = Byte.parseByte(args[0]);
        BookTest objRepository = new BookTest();
        objRepository.books = new Book[numberOfBooks];
        Scanner input = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\nWelcome to E-Repository.\n" +
                    "Select the operation you want to perform:");
            System.out.println("*******************************************");
            System.out.println("1. Add book to the repository");
            System.out.println("2. Search book by book name");
            System.out.println("3. Display books");
            System.out.println("4. Exit");
            System.out.println("*******************************************");
            System.out.print("Choice: ");
            choice = input.nextInt();
            
            switch(choice)
            {
                case 1:
                    objRepository.addBooks();
                    break;
                case 2:
                    objRepository.searchByBookName();
                    break;
                case 3:
                    objRepository.displayBooks();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Not a valid choice");
            }
        }while(choice != 4);
    }
}
