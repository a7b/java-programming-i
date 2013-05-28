/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package australiancricket;
/**
 *
 * @author TQNINH
 */
public class TournamentIncome extends Player implements GradeBonus {
    int grade;
    double rate;
    
    public TournamentIncome()
    {
        super();
        this.grade = 0;
        this.rate = 0.0;
    }
    
    public TournamentIncome(String n, int g, double r)
    {
        super(n);
        this.grade = g;
        this.rate = r;
    }
    
    public double calculateGradeBonus()
    {
        double gradeBonus = 0;
        if(grade == 1)
        {
            gradeBonus = 10000 * (this.rate / 100) * (GRADE_BONUS_PERCENT / 100);
        }
        else if(grade == 2)
        {
            gradeBonus = 5000 * (this.rate / 100) * (GRADE_BONUS_PERCENT / 100);
        }
        return gradeBonus;
    }
    
    public void displayDetails()
    {
        System.out.println("Player:\t" + this.name);
        System.out.println("Grade:\t" + this.grade);
        System.out.println("Rate:\t" + this.rate);
        System.out.println("Bonus:\t$" + calculateGradeBonus());
    }
}
