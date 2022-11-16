import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;
/*
Homework 5
Dexter Dixon
Due:02/11/2021
This program prompts the user to select one of two math tools and then calculates the results
based on the input entered by the user
 */
public class MathTool {

    public static void main(String[] args) {
        /*
        ***************************************************
        This section declares variables
        ***************************************************
        */

        int nOption = 0;                              //Used to store users input
        Scanner input = new Scanner(System.in);       //Used to gather users input

        /*
        ********************************************************************
        This section prints the options and promps the user to make a choice
        ********************************************************************
        */

        System.out.println("Math Tool");
        System.out.println("1. Compute the power of a number");
        System.out.println("2. Compute the product of two numbers");

        //Prompts the user to select an option
        System.out.print("Please select an option: ");

        //Saves the option in a variable
        nOption = input.nextInt();

        /*
        ***************************************************************************
        This section runs an a series of conditionals to decide which methos to run
        ***************************************************************************
        */
        if(nOption == 1) {

            //Invoke ComputePower method
            computePower();

        } //End if

        else if(nOption == 2) {

            //Invoke ComputeProduct method
            computeProduct();

        }//End of else if

        else {

            //Prompts the user to rerun the program
            System.out.println("Invalid selection. Please run the program again.");

        }//End of else


    }//End of main method

    /*
    *******************************************************
    This method is used to calculate the Power of 2 numbers
    *******************************************************
    */
    public static void computePower(){
        //Declare Variables

        int nBase = 0;                                //The base of the exponent
        int nPower = 0;                               //The power of the exponent
        int nResult = 0;                              //Used to store the result
        Scanner input = new Scanner(System.in);       //Used to gather users input
        //Stores the number entered by the user
        System.out.print("Please enter a number: ");

        //Prompts the user to enter a number
        nBase = input.nextInt();

        //Prompts the user to enter a number
        System.out.print("Please enter the power of the number: ");

        //Stores the number enter by the user
        nPower = input.nextInt();
        
        //Assign the initial value for nResult
        nResult = nBase;

        //For loop to calculate exponents
        for (int i=1; i<nPower; i++)
        {
            //Multiplies 
            nResult=nResult*nBase;

        }//End of for loop

        //Invoke DisplayResults
        displayResults(1, nBase, nPower, nResult);
    }

    /*
    ***********************************************
    This method calculates the product of 2 numbers
    ***********************************************
    */
    public static void computeProduct(){
        
        int nNum1 = 0;                                //Used tp calculate the product
        int nNum2 = 0;                                // Used to calculate the product
        int nResult = 0;                              //Used to store the product 
        Scanner input = new Scanner(System.in);       //Used to gather users input

        //Prompts the user to enter a number
        System.out.print("Please enter a number: ");
        
        //Stores number into a variable
        nNum1 = input.nextInt();

        //Prompts user to enter another number
        System.out.print("Please enter another number: ");
        
        //Stores number into a variable
        nNum2 = input.nextInt();

        //Calculates the product
        nResult = nNum1*nNum2;

        //Invoke Display Results
        displayResults(2, nNum1, nNum2, nResult);

    }//End of ComputeProduct

     /*
    ********************************************
    This method receive 4 integers and uses them 
    to display the correct results to the screen
    ********************************************
    */   
    public static void displayResults(int nOption, int nNum1, int nNum2, int nResult){
        
        //Conditional used to decide which print statment to use       
        if(nOption == 1) {

            //Prints the results of ComputePower to the screen
            System.out.println(nNum1 + " to the power of " + nNum2 + " is: " + nResult);

        }//End of If conditional

        else {

            //Prints the results of ComputeProduct to the screen
            System.out.println("The product of " + nNum1 + " times " + nNum2 + " is: " + nResult);

        }//End of Else

    }//End of DisplaResults method
}
