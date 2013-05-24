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
public class Book {
    int[][] books;
    byte bookCount;
    public Book()
    {
        books = new int[3][3];
        bookCount = 0;
    }
    void addBook()
    {
        Scanner input = new Scanner(System.in);
        if(bookCount < books.length)
        {
            System.out.println("Enter the ISBN number of the book:");
            books[bookCount][0] = input.nextInt();
            
            System.out.println("Enter the number of pages in the book:");
            books[bookCount][1] = input.nextInt();
            
            System.out.println("Enter the year of publiccation:");
            books[bookCount][2] = input.nextInt();
            
            bookCount++;
        }
        else
        {
            System.out.println("Sorry! Unable to add more book.\n");
        }
    }
    void displayBooks()
    {
        if(bookCount > 0)
        {
            System.out.println("\nISBN \tPages \tPublication Year");
            System.out.println("-----------------------------------------");
            
            for(int rowIndex = 0;rowIndex < bookCount;rowIndex++)
            {
                System.out.printf("%d\t", books[rowIndex][0]);
                System.out.printf("%d\t\t", books[rowIndex][1]);
                System.out.printf("%d\n", books[rowIndex][2]);
            }
        }
        else
        {
            System.out.println("No books to display");
        }
    }
    void searchByIsbn()
    {
        boolean bookFound = false;
        if(bookCount > 0)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the ISBN number of the book you want to " +
                    "search for: ");
            int searchIsbn = input.nextInt();
            System.out.println("\nISBN \tPages \tPublication Year");
            System.out.println("-----------------------------------------");
            
            for(int rowIndex = 0;rowIndex < bookCount;rowIndex++)
            {
                if(books[rowIndex][0] == searchIsbn)
                {
                    System.out.printf("%d\t", books[rowIndex][0]);
                    System.out.printf("%d\t\t", books[rowIndex][1]);
                    System.out.printf("%d\n", books[rowIndex][2]);
                    bookFound = true;
                    break;
                }
            }
            if(!bookFound)
            {
                System.out.println("Book not found");
            }
        }
        else
        {
            System.out.println("No books to search");
        }
    }
}
