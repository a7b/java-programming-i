/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author TQNINH
 */
public class RoomsNotAvailableException extends Exception {
    
    public RoomsNotAvailableException()
    {
        super();
    }
    
    public RoomsNotAvailableException(int roomsAvailable)
    {
        super("Currently there are " + roomsAvailable + " rooms available");
        
    }
}
