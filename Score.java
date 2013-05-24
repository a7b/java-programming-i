/**
 * @(#)Score.java
 *
 *
 * @author 
 * @version 1.00 2013/5/16
 */
import java.util.Scanner;

public class Score {

    public Score() {
    }
    public static void main (String[] args) {
    	int kMaths, kScience, kEnglish;
    	int dMaths, dScience, dEnglish;
    	int kSum = 0;
    	int dSum = 0;
    	int kPercent = 0;
    	int dPercent = 0;
    	Scanner input = new Scanner(System.in);
    	System.out.println ("-------- NHAP DIEM SINH VIEN 1 --------");
    	System.out.print ("- Maths: ");
    	kMaths = input.nextInt();
    	System.out.print ("- Science: ");
    	kScience = input.nextInt();
    	System.out.print ("- English: ");
    	kEnglish = input.nextInt();
    	
    	System.out.println ("-------- NHAP DIEM SINH VIEN 2 --------");
    	System.out.print ("- Maths: ");
    	dMaths = input.nextInt();
    	System.out.print ("- Science: ");
    	dScience = input.nextInt();
    	System.out.print ("- English: ");
    	dEnglish = input.nextInt();
    	
    	kSum = kMaths + kScience + kEnglish;
    	dSum = dMaths + dScience + dEnglish;
    	
    	kPercent = kSum * 100 / 300;
    	dPercent = dSum * 100 / 300;
    	
    	System.out.println ("--------- SINH VIEN 1 ---------");
    	System.out.println ("- Maths: " + kMaths);
    	System.out.println ("- Science: " + kScience);
    	System.out.println ("- English: " + kEnglish);
    	System.out.println ("Total: " + kSum);
    	System.out.println ("Percent: " + kPercent + "%");
    	
    	System.out.println ("--------- SINH VIEN 2 ---------");
    	System.out.println ("- Maths: " + dMaths);
    	System.out.println ("- Science: " + dScience);
    	System.out.println ("- English: " + dEnglish);
    	System.out.println ("Total: " + dSum);
    	System.out.println ("Percent: " + dPercent + "%");
    	
    	System.out.println ("--------- SO SANH ---------");
    	if(kPercent != dPercent)
    	{
    		System.out.println ("Diem trung binh sinh vien 1 (" + kPercent + ") \"" 
    			+ (kPercent > dPercent ? "lon hon" : "nho hon")
    			+ "\" sinh vien 2 (" + dPercent + ")");
    	}
    	else
    	{
    		System.out.println ("Diem trung binh hai sinh vien bang nhau");
    	}
    	
    	System.out.println ("--------- HOC BONG --------");
    	System.out.print ("Sinh vien 1: ");
    	System.out.println (kPercent > 75 ? 20000 : (kPercent >= 60 && kPercent <=75) ? 10000 : 0);
    	System.out.print ("Sinh vien 2: ");
    	System.out.println (dPercent > 75 ? 20000 : (dPercent >= 60 && dPercent <=75) ? 10000 : 0);
    }    
}