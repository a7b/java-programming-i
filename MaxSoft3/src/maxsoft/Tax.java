/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maxsoft;

/**
 *
 * @author TQNINH
 */
public interface Tax {
    /**
     *
     */
    public static final double TAX_PERCENT = 8.33;
    public abstract double calculateTax();
}
