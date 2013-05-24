/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtokenizer;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author TQNINH
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String str = input.nextLine();
        StringTokenizer stk = new StringTokenizer(str, " !,;:.?", true);
        //StringTokenizer stk = new StringTokenizer(str, " !,;:.?");
        //Kiem so sanh 2 ham nay
        System.out.println("\"" + str + "\"");
        System.out.println("So tu trong chuoi nhap: " + stk.countTokens());
        System.out.println("In moi tu trong chuoi tren mot dong: ");
        while(stk.hasMoreTokens())
        {
            System.out.println(stk.nextToken());
        }
    }
}
