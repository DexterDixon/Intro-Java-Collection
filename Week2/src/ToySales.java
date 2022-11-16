import java.util.Scanner;
/*
Homework 2
Dexter Dixon
Due:01/28/2021
This program takes in product information from the user and uses it to print a receipt
 */
public class ToySales {

    public static void main(String[] args) {
        /*
        ***************************************************
        This section collects information about the product
        ***************************************************
        */

        //Declare constants
        final double TAX_RATE = 7.5;              //Tax rate constant
        final double DIVISOR = 100;           //Tax divisor used to calculate sales tax

        //Declare Variables
        Scanner input = new Scanner(System.in);   //Used to read user input
        String sToyName ="";                      //Toy name entered by user
        double dPrice = 0.0;                      //Toy price entered by user
        double dDiscount = 0.0;                   //Toy discount % entered by user

        //Print toy information label
        System.out.println("*****************************");
        System.out.println("*******TOY INFORMATION*******");
        System.out.println("*****************************");
        System.out.println(" ");
        
        //Prompt the user to enter the name of the toy
        System.out.print("Enter the toys name: ");  
        
        //Read toy name input from user
        sToyName = input.nextLine();     
        
        //Prompt the user for the toy price
        System.out.print("Enter the original price of the toy: $");
        
        //Reads the toy price input from the user
        dPrice = input.nextDouble();
        
        //Prompt the user for the discount
        System.out.print("Enter the percentage discount (such as 10.5 for 10.5%): ");
        
        //Read discount input from the user
        dDiscount = input.nextDouble();
        System.out.println(" ");
        
        /*
        ***************************************************
        This section uses the information collected to 
        print a receipt.
        ***************************************************
        */

        //Calculates the sellling price and saves it to a variable
        double dSellingPrice = dPrice-(dPrice*(dDiscount/DIVISOR));

        //Calculates the sales tax and saves it to a variable
        double dSalesTax = (TAX_RATE/DIVISOR)*dSellingPrice;
        
        //Calculates the final price and saves it to a variable
        double dFinalPrice = dSellingPrice+dSalesTax;
        
        //Calculates the savings and saves it to a variable
        double dSavings = dPrice-dSellingPrice;

        //Print a receipt label
        System.out.println("*****************************");
        System.out.println("***********RECEIPT***********");

        //Print name of toy
        System.out.println("Toy's name: " + sToyName);

        //Print price of toy
        System.out.println("Toy's original price: $" +dPrice);

        //Prints selling price of toy
        System.out.println("Selling Price for your toy: $" + dSellingPrice);

        //Print sales tax of toy
        System.out.println("Sales Tax: $" + dSalesTax);

        //Print final toy price
        System.out.println("Final toy price: $" + dFinalPrice);

        //Print total savings
        System.out.println("*****************************");
        System.out.println("********TOTAL SAVINGS********");
        System.out.println("***********$" + dSavings + "*************");



    } //End of main method
    
} //End of ToySales class
