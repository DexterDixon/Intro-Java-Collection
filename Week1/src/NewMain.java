/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author dexte
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     String sName1 = "";
     String sName2= "";
     System.out.print("Enter your name: ");
     sName1 = input.next(); 

     System.out.print("Enter your name: ");
     sName2 = input.next(); 
     System.out.print(sName1);
     System.out.print(sName2);

    if(sName1 == sName2){
       System.out.println("Same names");
       }
     else {
       System.out.println("different names");
       }  
    }
    
}
