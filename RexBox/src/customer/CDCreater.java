/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;
import java.util.Scanner;
import movies.*;
import music.*;
/**
 *
 * @author TQNINH
 */
public class CDCreater {
    private int nextMovie;
    private int nextMovieCode;
    private int nextAlbum;
    private int nextAlbumCode;
    music.CompactDisc[] cd;
    movies.CompactDisc[] vcd;
    
    public CDCreater()
    {
        nextMovie = -1;
        nextMovieCode = -1;
        nextAlbum = -1;
        nextAlbumCode = -1;
    }
    
    public CDCreater(int a, int b)
    {
        nextMovie = 0;
        nextMovieCode = a;
        nextAlbum = 0;
        nextAlbumCode = b;
    }
    
    public void displayAllMusic()
    {
        if(nextAlbum > 0)
        {
            cd[0].menuMusic();
            for(int rindex = 0;rindex < nextAlbum;rindex++)
            {
                cd[rindex].mainMusic();
            }
            System.out.println("End");
        }
        else
        {
            System.out.println("No Music CD display!");
        }
    }
    
    public void displayAllMovies()
    {
        if(nextMovie > 0)
        {
            vcd[0].menuMovie();
            for(int rindex = 0;rindex < nextMovie;rindex++)
            {
                vcd[rindex].mainMovie();
            }
            System.out.println("End");
        }
        else
        {
            System.out.println("No Movie CD display!");
        }
    }
    
    public void addMusicCD()
    {
        System.out.println("----- ALBUM INFORMATION -----");
        if(nextAlbum < nextAlbumCode)
        {
            String theTitle;
            String theArtist;
            double thePrice;
            cd[nextAlbum] = new music.CompactDisc();
            Scanner input = new Scanner(System.in);
            input.useDelimiter("\n");
            System.out.println("-- ID Album:\t" + (nextAlbum + 1));
            System.out.print("-- Title:\t");
            theTitle = input.next();
            System.out.print("-- Artist:\t");
            theArtist = input.next();
            System.out.print("-- Price:\t");
            thePrice = input.nextDouble();
            cd[nextAlbum].CompactDisc(theTitle, theArtist, thePrice, nextAlbum);
            nextAlbum++;
            System.out.println("Success!\nRecords: " + (nextAlbumCode - nextAlbum));
        }
        else
        {
            System.out.println("Error!\nAlbum full!");
        }
    }
    
    public void addMovieCD()
    {
        System.out.println("----- MOVIE INFORMATION -----");
        if(nextMovie < nextMovieCode)
        {
            String theTitle;
            double thePrice;
            vcd[nextMovie] = new movies.CompactDisc();
            Scanner input = new Scanner(System.in);
            input.useDelimiter("\n");
            System.out.println("-- ID Movie: " + nextMovie);
            System.out.print("-- Title:\t");
            theTitle = input.next();
            System.out.print("-- Price:\t");
            thePrice = input.nextDouble();
            vcd[nextMovie].CompactDisc(theTitle, thePrice, nextMovie);
            nextMovie++;
            System.out.println("Success!\nRecords: " + (nextMovieCode - nextMovie));
        }
        else
        {
            System.out.println("Error!\nMovie full!");
        }
    }
    
    public void addSampleMovie()
    {
        int theLoop;
        int next = nextMovieCode - nextMovie;
        Scanner nLoop = new Scanner(System.in);
        if(next <= 1)
        {
            System.out.println("Music full!");
        }
        else
        {
            System.out.print("So luong: ");
            theLoop = nLoop.nextInt();
            if(theLoop <= next)
            {
                for(int i = 1;i <= theLoop;i++)
                {
                    vcd[nextMovie] = new movies.CompactDisc();
                    vcd[nextMovie].CompactDisc("Movie title " + i, i, nextMovie);
                    nextMovie++;
                }
                System.out.println("Success!");
            }
            else
            {
                System.out.println("Error!"
                        + "\nChi nhap duoc " + next + " movies");
            }
        }
        
    }
    
    public void addSampleMusic()
    {
        int theLoop;
        int next = nextAlbumCode - nextAlbum;
        Scanner nLoop = new Scanner(System.in);
        if(next <= 1)
        {
            System.out.println("Movie full");
        }
        else
        {
            System.out.print("So luong: ");
            theLoop = nLoop.nextInt();
            if(theLoop <= next)
            {
                for(int i = 1;i <= theLoop;i++)
                {
                    cd[nextAlbum] = new music.CompactDisc();
                    cd[nextAlbum].CompactDisc("Album title " + i, "Artist " + i, i, nextAlbum);
                    nextAlbum++;
                }
                System.out.println("Success!");
            }
            else
            {
                System.out.println("Error!"
                        + "\nChi nhap duoc " + next + " albums");
            }
        }
    }
}
