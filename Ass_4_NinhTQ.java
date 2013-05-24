/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */

class Account
{
    double amount;
    double balance;
    int accountNo;
    int setAccount;
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
    public Account()
    {
        amount = 0;
        balance = 0;
        accountNo = 0;
        setAccount = 0;
        so = null;
    }
}

class AccountTest {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account myAccount = new Account();
        myAccount.accountNo = 12345;
        myAccount.balance = 100000;
        String kiemTra;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Nhap so tai khoan: ");
            myAccount.setAccount = Integer.parseInt(input.nextLine());
            while(myAccount.setAccount == myAccount.accountNo)
            {
                System.out.println("----- ACCOUNT NO: "
                        + myAccount.accountNo
                        + " ------");
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
            kiemTra = input.nextLine().toUpperCase();
        }while(kiemTra.equals("Y"));
    }
}
