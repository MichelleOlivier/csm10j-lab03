//package lab03_b_while;
import java.io.*;
import java.util.*;
import java.text.*;
/**
 *
 * @author Michelle
 */
public class Lab03_B_While {
static Scanner console = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer firstNum = 0;
        Integer secondNum = 0;
        
        
        while (firstNum >= secondNum)
        {
            System.out.println("Input the first number");
            firstNum = console.nextInt();
        
            System.out.println("Input the second number");
            secondNum = console.nextInt();
        }
    Integer tracker = firstNum;
    Integer evenSum = 0;
    System.out.println(String.format("All odd numbers between %1d and %2d inclusive", firstNum, secondNum));
    
        while (tracker <= secondNum)
        {
            if (tracker % 2 > 0) 
               System.out.println(tracker); 
            else 
                evenSum = evenSum + tracker; 
            
            tracker++;     
        }
    System.out.println(String.format("Sum of all even number between %1d and %2d inclusive", firstNum, secondNum));
    System.out.println(evenSum);
    }
    
}
