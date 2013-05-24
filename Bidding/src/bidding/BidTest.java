/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bidding;

/**
 *
 * @author TQNINH
 */
public class BidTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BidTicket objBid = new BidTicket();
        
        System.out.println("The bids received on 12th September 2006 for the " +
                "airline ticket are:");
        objBid.displayBids(100.90, 101.50, 102.00, 102.90);
        
        System.out.println("\nThe bids received on 12th September 2006 for the " +
                "airline ticket are:");
        objBid.displayBids(206.90, 191.50, 202.00);
    }
}
