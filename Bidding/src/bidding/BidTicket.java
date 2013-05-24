/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bidding;

/**
 *
 * @author TQNINH
 */
public class BidTicket {
    public void displayBids(double ... bids)
    {
        int noOfBids = 1;
        double highestBid = 0;
        for (double value : bids)
        {
            System.out.println("Bid " + noOfBids + " = " + value);
            if(value > highestBid)
            {
                highestBid = value;
            }
            noOfBids++;
        }
        System.out.println("The highest bid received is: $" + highestBid);
    }
}
