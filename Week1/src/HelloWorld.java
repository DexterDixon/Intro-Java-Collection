/*
Homework 1
Dexter Dixon
Due:01/21/2021
 */
import javax.swing.JOptionPane;
import java.util.Scanner;

public class HelloWorld {


    public static void main(String[] args) {      
        /*
        *********************************************
        Exercise 1
        *********************************************
        */
    
        System.out.println("Hello my name is Dexter Dixon!");
        System.out.print("ISM3230 will keep you busy this Spring 2021!");
        System.out.print("\n\n\n");
        System.out.println("5 + 5 + 5 + 5 + 5 = " + (5*5));
        //Dixon 01.21.2021 7:41pm

        /*
        *********************************************
        Exercise 2
        *********************************************
        */
        System.out.println("   J     A    V     v    A   ");
        System.out.println("   J    A A    V   V    A A  ");
        System.out.println("J  J   AAAAA    V V    AAAAA ");
        System.out.println("  JJ  A     A    V    A     A");
      
        /*
        *********************************************
        Exercise 3
        *********************************************
        */
        
        /*
        I am using the escape character \t which is equivalent to pressing tab
        */
        System.out.print("\t This is an example of using the escape character backslash t");
        
        /*
        I am using the escape character \n to make a new line before my name
        */
        System.out.print("\nDexter Dixon");
        
        /*
        *********************************************
        Exercise 4
        *********************************************
        */
        JOptionPane.showMessageDialog(null, 
                                    "This is my first Jaava program!", "ISM 3230, Dexter Dixon", 
                                     JOptionPane.INFORMATION_MESSAGE);





        String Name;
        int Age;
        double Height;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name: ");
        Name = input.nextLine();

        System.out.println("What is your Age: ");
        Age = input.nextInt();

        System.out.println("What is your Height: ");
        Height = input.nextDouble();


    }
    
}
