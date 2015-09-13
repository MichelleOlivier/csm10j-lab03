package lab03_b_dowhile;
import java.io.*;
import java.util.*;
import java.text.*;
/**
 *
 * @author Michelle
 */
public class Lab03_B_DoWhile {
static Scanner console = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer firstNum = 0;
        Integer secondNum = 0;
        
        
        do 
        {
            System.out.println("Input the first number");
            firstNum = console.nextInt();
        
            System.out.println("Input the second number");
            secondNum = console.nextInt();
        } while (firstNum >= secondNum);
        
        Integer tracker = firstNum;
        Integer evenSum = 0;
        System.out.println(String.format("All odd numbers between %1d and %2d inclusive", firstNum, secondNum));
    
        do 
        {
            if (tracker % 2 > 0) 
               System.out.println(tracker); 
            else 
                evenSum = evenSum + tracker; 
            
            tracker++;     
        } while (tracker <= secondNum);
        
        System.out.println(String.format("Sum of all even number between %1d and %2d inclusive", firstNum, secondNum));
        System.out.println(evenSum);
    }
    
}
