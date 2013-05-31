/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author TQNINH
 */
class CheckWeight extends Exception {
//    public CheckWeight(){        
//    }    
}

public class HPComputer extends computer.Computer {
    public double weight;
    
    public void input(){
        Scanner scr = new Scanner(System.in);
        scr.useDelimiter("\n");
        
        System.out.print("  - Manufacturer: ");
        manufacturer = scr.next();
        
        while(true){
            try{
                System.out.print("  - Price: ");
                price = Integer.parseInt(scr.next());
                break;
            }catch(NumberFormatException e){
                System.out.println("System Message -> Datatype mismatch");
            }
        }
        
        while(true){
            try{
                double thisWeight;
                System.out.print("  - Weight: ");
                thisWeight = Double.parseDouble(scr.next());
                if(thisWeight < 0.5 || thisWeight > 3.0){
                    throw new CheckWeight();
                }else{
                    weight = thisWeight;
                    break;
                }
            }catch(NumberFormatException e){
                System.out.println("System Message -> Datatype mismatch");
            }catch(CheckWeight e){
                System.out.println("System Message -> "
                        + "Weight required is between 0.5 kg and 3.0 kg");
            }
        }
    }
}
