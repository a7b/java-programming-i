abstract class Player {
    public String name;
    
    public Player()
    {
        this.name = "";
    }
    
    public Player(String n)
    {
        this.name = n;
    }
    
    public abstract void displayDetails();
}

interface Tax {
    public static final double TAX_PERCENT = 25;
    public abstract double calculateTax();
}

class PlayerIncome extends Player implements Tax {
    double salary;
    
    public PlayerIncome()
    {
        //super();
        //this.salary = 0;
        this("", 0);
    }
    
    public PlayerIncome(String n, double s)
    {
        //super(n);
        //this.salary = s;
        this.name = n;
        this.salary = s;
    }
    
    public double calculateTax()
    {
        return (this.salary * (TAX_PERCENT / 100));
    }
    
    public void displayDetails()
    {
        System.out.println("Player:\t" + this.name);
        this.salary -= calculateTax();
        System.out.println("Salary:\t$" + this.salary);
    }
}

interface GradeBonus {
    public static final double GRADE_BONUS_PERCENT = 30;
    
    public abstract double calculateGradeBonus();
}

class TournamentIncome extends Player implements GradeBonus {
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

class PlayerTest {

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