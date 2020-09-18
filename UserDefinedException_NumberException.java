/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserDefinedException;
import java.util.*;
/**
 *
 * @author Vasanth
 */
public class UserDefinedException_NumberException  {
    public static void main(String[] args ){
       try{
        checker();
       }
        
     catch(InvalidNumberException e){
     System.out.println(e);
     }
    }
  static void checker() throws InvalidNumberException{ 
      
  Scanner input = new Scanner(System.in);
  System.out.print("enter input 1 : ");
  String a = input.next();
  char []x=a.toCharArray();

  for(int i =0; i<a.length()-1;i++){
    if(x[i]<=57 && x[i]>=48){
      
       continue;
    }
    else{
     throw new InvalidNumberException("INVALID INPUT");
    }   
  }
  
  
     System.out.print("enter input 2 : ");
     String b = input.next();
     char []y=b.toCharArray();
     
      for(int i =0; i<b.length()-1;i++){
      if(y[i]<=57 && y[i]>=48){
          
          continue;
        }
      else{
     throw new InvalidNumberException("INVALID INPUT");
     }
    
  }
    int m  = Integer.parseInt(a);
    int n  = Integer.parseInt(b);
    System.out.println("The sum is "+(m+n));  
  }  
 
  
  
  } 

class InvalidNumberException extends Exception{
public InvalidNumberException(String msg)
   {
   super(msg);
   }
}