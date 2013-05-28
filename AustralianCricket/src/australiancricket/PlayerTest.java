/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package australiancricket;

/**
 *
 * @author TQNINH
 */
public class PlayerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player objNinhPlayerIncome = new PlayerIncome("Quoc Ninh", 20000);
        Player objNinhTournamentIncome = new TournamentIncome("Quoc Ninh", 1, 50);
        System.out.println("SALARY");
        objNinhPlayerIncome.displayDetails();
        System.out.println("BONUS");
        objNinhTournamentIncome.displayDetails();
    }
}
