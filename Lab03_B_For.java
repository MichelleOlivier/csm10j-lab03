//package lab03_b_for;
import java.io.*;
import java.util.*;
import java.text.*;
/**
 *
 * @author Michelle
 */
public class Lab03_B_For {
    static Scanner console = new Scanner (System.in);
    
    public static void main(String[] args) {
        Integer firstNum = 0;
        Integer secondNum = 0;
        
        for ( ;firstNum >= secondNum; )
        {
            System.out.println("Input the first number");
            firstNum = console.nextInt();
        
            System.out.println("Input the second number");
            secondNum = console.nextInt();
        }
        
        
        Integer evenSum = 0;
        System.out.println(String.format("All odd numbers between %1d and %2d inclusive", firstNum, secondNum));
        for (Integer tracker = firstNum; tracker <= secondNum; tracker++)
        {
            if (tracker % 2 > 0) 
               System.out.println(tracker); 
            else 
                evenSum = evenSum + tracker; 
        }
        
        System.out.println(String.format("Sum of all even number between %1d and %2d inclusive", firstNum, secondNum));
        System.out.println(evenSum);
    }   
}
