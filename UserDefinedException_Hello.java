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
public class UserDefinedException_Hello {
    public static void main(String args[]){
     UserDefinedException_Hello A = new  UserDefinedException_Hello();
      try{
      A.checker();
      }
      catch(HelloException e){
      System.out.println(e);
      }
      
     
    }
    void checker () throws HelloException{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string : ");
    String s = input.next();
    if( "hello".equals(s)){
    throw new HelloException("Invalid message");
    }
    else{
    System.out.println("VALID EXPRESSION");
    }
    }
   
}
class HelloException extends Exception{

    HelloException(String msg){
    super(msg);
    }
}