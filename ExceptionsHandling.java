/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDefinedException;
import java.util.Scanner;
/**
 *
 * @author Vasanth
 */
public class ExceptionsHandling {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Exception displays if the input is not given as per the rules and instructions");
        
    try{
        
     int[] myNumbers = {1, 2, 3};
     System.out.print("Enter a number from[0-2] : ");
     int i = input.nextInt();
     System.out.println(myNumbers[i]);
     
    }
    catch(ArrayIndexOutOfBoundsException  e){
    System.out.println(e);
}
    
    
    try{
    System.out.print("Enter a number : ");
    int b = input.nextInt();
    int c =0;
    int a = b/c;
    System.out.println(a);
    
    }
    catch(ArithmeticException e){
    System.out.println(e);
    }
    
    System.out.println("Exception occurs since the number is divided by zero ");
   
    
    try{
     System.out.print("Enter a number[Not a String] : ");
     String b = input.next();
     System.out.print("Enter a number[Not a String] : ");
     String c = input.next();
     int h= Integer.parseInt(b);
     int k = Integer.parseInt(c);
     System.out.println("The product is "+(h*k));
    }
    catch( NumberFormatException e){
    System.out.println(e);
    }
    
    
    try{
    System.out.print("Enter a string above 10 characters : ");
    String a = input.next();
   
    System.out.println(a.charAt(10));
            
    }
    catch( StringIndexOutOfBoundsException e){
    System.out.println(e);
    }
    }
    
}
