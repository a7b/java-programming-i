/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
public class UserInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nAlbum, nMovie, choice;
        Scanner test = new Scanner(System.in);
        System.out.print("Enter number Album: ");
        nAlbum = test.nextInt();
        System.out.print("Enter number Movie: ");
        nMovie = test.nextInt();
        CDCreater objCD = new CDCreater(nAlbum, nMovie);
        objCD.cd = new music.CompactDisc[nAlbum];
        objCD.vcd = new movies.CompactDisc[nMovie];
        while(true)
        {
            System.out.println("----- REXBOX ENTERTAINMENT -----");
            System.out.println("1. Add a new Music CD to the collection");
            System.out.println("2. Add a new Movie CD to the collection");
            System.out.println("3. Display all Music CD's in the collection");
            System.out.println("4. Display all Movie CD's in the collection");
            System.out.println("5. Add Music sample data");
            System.out.println("6. Add Movie sample data");
            System.out.println("7. Exit");
            System.out.print("Choice (1-6): ");
            choice = test.nextInt();
            switch(choice)
            {
                case 1:
                    objCD.addMusicCD();
                    break;
                case 2:
                    objCD.addMovieCD();
                    break;
                case 3:
                    System.out.println("----------------------- REXBOX's MUSIC -----------------------");
                    objCD.displayAllMusic();
                    break;
                case 4:
                    System.out.println("------------ REXBOX's MOVIES ------------");
                    objCD.displayAllMovies();
                    break;
                case 5:
                    objCD.addSampleMusic();
                    break;
                case 6:
                    objCD.addSampleMovie();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");                
            }
        }
    }
}
