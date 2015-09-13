
package lab03_a;
import java.io.*;
import java.util.*;
import java.text.*;
/**
 *
 * @author Michelle
 */
public class Lab03_A {
    static Scanner console = new Scanner (System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer numberOfPages;
        Double costOfSendingFax;
             
        System.out.println("How many pages to fax?");
        numberOfPages = console.nextInt();
        
        if (numberOfPages <= 10)
            costOfSendingFax = 3.00 + (numberOfPages * 0.20);
        else
            costOfSendingFax = 3.00 + 10 * 0.20 + (numberOfPages - 10) * 0.10;
        
        DecimalFormat df = new DecimalFormat("#.00");
        String costOfSendingFaxFormated = df.format(costOfSendingFax);        
       
        System.out.println("That will cost $" + costOfSendingFaxFormated);
        
    }
    
    
}
