/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UnitedBankAccoount;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */

class Account
{
    double amount;
    double balance;
    Scanner so;
    void deposit()
    {
        System.out.println("----- DEPOSIT -----");
        so = new Scanner(System.in);
        System.out.print("Nhap tien: ");
        amount = so.nextDouble();
        if(amount < 0)
        {
            System.out.println("So tien am!!!!");
        }
        else
        {
            balance = balance + amount;
            System.out.println("Thanh cong!"
                    + "\nAccount Balance: " + this.getBalance());                        
        }
    }
    void withdraw()
    {
        System.out.println("----- WITHDRAW -----");
        so = new Scanner(System.in);
        System.out.print("Nhap tien: ");
        amount = so.nextDouble();
        if(balance < amount)
        {
            System.out.println("So du khong du!!!!");
        }
        else
        {
            balance = balance - amount;
            System.out.println("Thanh cong!"
                    + "\nAccount Balance: " + this.getBalance()); 
        }
    }    
    double getBalance()
    {
        return balance;
    }
}

public class AccountTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int setAccount = 12345;
        int accountNo;
        Account myAccount = new Account();        
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Nhap so tai khoan: ");
            accountNo = Integer.parseInt(input.nextLine());
            while(accountNo == setAccount)
            {
                System.out.println("----- ACCOUNT NO: "
                        + setAccount + " ------");
                System.out.print("----- LUA CHON CHUC NANG -----"
                        + "\n\t1. Deposit"
                        + "\n\t2. Withdraw"
                        + "\n\t3. Balance"
                        + "\n\t4. Exit"
                        + "\nChuc nang: ");
                switch(Integer.parseInt(input.nextLine()))
                {
                    case 1:
                        myAccount.deposit();
                        break;
                    case 2:
                        myAccount.withdraw();
                        break;
                    case 3:
                        System.out.println("Account Balance: "
                                + myAccount.getBalance());
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Chuc nang khong ton tai!");
                }
            }
            System.out.print("So tai khoan khong dung!"
                        + "\nBan muon nhap lai khong? (Y/N): ");
        }while(input.nextLine().toUpperCase().equals("Y"));
    }
}
