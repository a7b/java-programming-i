/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cdhouse;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class CDCatalog {
    CD[] cds;
    short cdCount;
    public CDCatalog()
    {
        cdCount = 0;
    }
    void addCD()
    {
        Scanner input = new Scanner(System.in);
        if(cdCount < cds.length)
        {
            cds[cdCount] = new CD();
            byte collection, type;
            //Id
            cds[cdCount].id = cdCount;
            //Title
            System.out.print("Enter CD title: ");
            cds[cdCount].title = input.nextLine();
            //Collection
            do
            {
                System.out.print("Enter CD number of collection:"
                        + "\n\t1. Game\n\t2. Movie\n\t3. Music"
                        + "\n     Choice: ");
                collection = input.nextByte();
            }while(collection != 1 && collection != 2 && collection != 3);
            cds[cdCount].collection = collection;
            //Type
            do
            {
                System.out.print("Enter CD number of type:"
                        + "\n\t1. Audio\n\t2. Video"
                        + "\n     Choice: ");
                type = input.nextByte();
            }while(type != 1 && type != 2 && type != 3);
            cds[cdCount].type = type;
            //Price
            System.out.print("Enter price: ");
            cds[cdCount].price = input.nextFloat();
            //Year of release
            System.out.print("Enter year of release: ");
            cds[cdCount].yearOfRelease = input.nextShort();
            //Increment the number of cds
            cdCount++;
        }
        else
        {
            System.out.println("Unable to add CD");
        }
    }
    void displayHeader()
    {
        System.out.format("\n\t%1$-5s %2$-25s %3$-15s %4$-10s %5$-10s %6$-10s",
                "ID", "TITLE", "COLLECTION", "TYPE", "PRICE($)", "YEAR-OF-RELEASE");
        System.out.println("\n\t-------------------------------------------------"
                + "------------------------------------");
    }
    void displayCD(int i)
    {
        System.out.format("\t%1$-5d %2$-25s %3$-15s %4$-10s %5$-10s %6$-10s\n",
        cds[i].id + 1, cds[i].title,
        cds[i].checkCollection(), cds[i].checkType(),
        cds[i].price, cds[i].yearOfRelease);
    }
    void displayCDCatalog()
    {
        if(cdCount > 0)
        {
            displayHeader();
            for(int rowIndex = 0;rowIndex < cdCount;rowIndex++)
            {
                displayCD(rowIndex);
            }
        }
        else
        {
            System.out.println("No CD to display");
        }
    }
    void searchCDByTitle()
    {
        Scanner input = new Scanner(System.in);
        String title = "";
        boolean foundCD = false;
        if(cdCount > 0)
        {
            System.out.print("Enter a CD Title to search for: ");
            title = input.nextLine();
            displayHeader();
            for(int rowIndex = 0;rowIndex < cdCount;rowIndex++)
            {
                if(cds[rowIndex].title.indexOf(title) != -1)
                {
                    displayCD(rowIndex);
                    foundCD = true;
                }
            }
            if(!foundCD)
            {
                System.out.println("\"" + title + "\" not found");
            }
        }
        else
        {
            System.out.println("No CD to search");
        }
    }
    void sampleCD()
    {
        if((cds.length - cdCount) > 10)
        {
            cds[cdCount] = new CD();
            cds[cdCount].id = cdCount;
            cds[cdCount].title = "Giat mo tuyet voi";
            cds[cdCount].collection = 3;
            cds[cdCount].type = 1;
            cds[cdCount].price = 5;
            cds[cdCount].yearOfRelease = 2001;
            cdCount++;
            cds[cdCount] = new CD();
            cds[cdCount].id = cdCount;
            cds[cdCount].title = "Tinh ca 20";
            cds[cdCount].collection = 3;
            cds[cdCount].type = 2;
            cds[cdCount].price = 5;
            cds[cdCount].yearOfRelease = 2002;
            cdCount++;
            cds[cdCount] = new CD();
            cds[cdCount].id = cdCount;
            cds[cdCount].title = "Em toi";
            cds[cdCount].collection = 3;
            cds[cdCount].type = 1;
            cds[cdCount].price = 5;
            cds[cdCount].yearOfRelease = 2005;
            cdCount++;
            cds[cdCount] = new CD();
            cds[cdCount].id = cdCount;
            cds[cdCount].title = "Co be mat nai";
            cds[cdCount].collection = 3;
            cds[cdCount].type = 1;
            cds[cdCount].price = 5;
            cds[cdCount].yearOfRelease = 2000;
            cdCount++;
            cds[cdCount] = new CD();
            cds[cdCount].id = cdCount;
            cds[cdCount].title = "Boi vi anh yeu em";
            cds[cdCount].collection = 3;
            cds[cdCount].type = 1;
            cds[cdCount].price = 5;
            cds[cdCount].yearOfRelease = 2005;
            cdCount++;
            cds[cdCount] = new CD();
            cds[cdCount].id = cdCount;
            cds[cdCount].title = "Mat biec";
            cds[cdCount].collection = 3;
            cds[cdCount].type = 1;
            cds[cdCount].price = 5;
            cds[cdCount].yearOfRelease = 2005;
            cdCount++;
            cds[cdCount] = new CD();
            cds[cdCount].id = cdCount;
            cds[cdCount].title = "Chi toi";
            cds[cdCount].collection = 3;
            cds[cdCount].type = 1;
            cds[cdCount].price = 5;
            cds[cdCount].yearOfRelease = 2001;
            cdCount++;
            cds[cdCount] = new CD();
            cds[cdCount].id = cdCount;
            cds[cdCount].title = "Danh thuc tam xuan";
            cds[cdCount].collection = 3;
            cds[cdCount].type = 1;
            cds[cdCount].price = 5;
            cds[cdCount].yearOfRelease = 2006;
            cdCount++;
            cds[cdCount] = new CD();
            cds[cdCount].id = cdCount;
            cds[cdCount].title = "Anh se nho mai";
            cds[cdCount].collection = 3;
            cds[cdCount].type = 1;
            cds[cdCount].price = 5;
            cds[cdCount].yearOfRelease = 2008;
            cdCount++;
            cds[cdCount] = new CD();
            cds[cdCount].id = cdCount;
            cds[cdCount].title = "Chuyen la";
            cds[cdCount].collection = 3;
            cds[cdCount].type = 1;
            cds[cdCount].price = 5;
            cds[cdCount].yearOfRelease = 2009;
            cdCount++;
        }
        else
        {
            System.out.println("Unable to add CD sample value");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CDCatalog objCDCatalog = new CDCatalog();
        objCDCatalog.cds = new CD[700];
        Scanner input = new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("\nCD HOUSE CATALOG"
                    + "\nSelect the operation you want to perform:");
            System.out.println("**********************************************");
            System.out.println("1. Add CD to the catalog");
            System.out.println("2. Search CD by CD title");
            System.out.println("3. Display the catalog");
            System.out.println("4. Add (10) sample value");
            System.out.println("5. Exit");
            System.out.println("**********************************************");
            System.out.print("Choice: ");
            choice = input.nextInt();
            switch(choice)
            {
                case 1:
                    objCDCatalog.addCD();
                    break;
                case 2:
                    objCDCatalog.searchCDByTitle();
                    break;
                case 3:
                    objCDCatalog.displayCDCatalog();
                    break;
                case 4:
                    objCDCatalog.sampleCD();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Not a valid choice");
            }
        }while(choice != 5);
    }
}
