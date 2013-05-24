/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookisbn;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class Book {
    int[] isbn;
    public Book()
    {
        isbn = new int[5];
    }
    void setIsbn()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five ISBN numbers:");
        for(int index = 0;index < isbn.length;index++)
        {
            isbn[index] = input.nextInt();
        }
    }
    void getIsbn()
    {
        for(int index = 0;index < isbn.length;index++)
        {
            System.out.println(isbn[index]);
        }
    }
    void sortIsbn()
    {
        int temp;
        for(int j = 0;j < isbn.length;j++)
        {
            for(int i = 0;i < (isbn.length - 1);i++)
            {
                if(isbn[i] > isbn[i + 1])
                {
                    temp = isbn[i+1];
                    isbn[i+1] = isbn[i];
                    isbn[i] = temp;
                }
            }
        }
    }
}