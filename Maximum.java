/**
 * @(#)Maximum.java
 *
 *
 * @author 
 * @version 1.00 2013/5/15
 */
import java.util.Scanner;

public class Maximum {

    public Maximum() {
    }
    
    public static void main(String [] args){
    	int a;
    	int b;
    	Scanner input = new Scanner(System.in);    	
    	System.out.print("Nhap so thu nhat a: ");
    	a = input.nextInt();
    	System.out.print("Nhap so thu hai b: ");
    	b = input.nextInt();
    	//if(a > b){
    	//	printf("%d > %d", a, b);
    	//} else {
    	//	printf("%d > %d", b, a);
    	//}
    	if(a > b){
    		System.out.printf("Trong hai so %d va %d thi %d la so lon hon\n", a, b, a);
    	} else if(a == b){
    		System.out.printf("Hai so %d va %d bang nhau\n", a, b);
    	} else {
    		System.out.printf("Trong hai so %d va %d thi %d la so lon hon\n", a, b, b);
    	}    	
    	if(a > b){
    		System.out.println("Trong hai so " + a + " va " + b + " thi " + a + " la so lon hon");
    	} else if(a == b){
    		System.out.println("Hai so " + a + " va " + b + " bang nhau");
    	} else {
    		System.out.println("Trong hai so " + a + " va " + b + " thi " + b + " la so lon hon");
    	}
    }
}