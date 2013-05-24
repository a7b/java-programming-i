/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cdhouse;

/**
 *
 * @author TQNINH
 */

public class CD {
    short id;
    String title;
    byte type;
    byte collection;
    short yearOfRelease;
    float price;
    
    public CD()
    {
        id = 0;
        title = "";
        type = 0;
        collection = 0;
        yearOfRelease = 0;
        price = -1;
    }
    
    String checkCollection()
    {
        switch(this.collection)
        {
            case 1:
                return "GAME";
            case 2:
                return "MOVIE";
            case 3:
                return "MUSIC";
            default:
                return "";
        }
    }
    String checkType()
    {
        switch(this.type)
        {
            case 1:
                return "AUDIO";
            case 2:
                return "VIDEO";
            default:
                return "";
        }
    }
}
