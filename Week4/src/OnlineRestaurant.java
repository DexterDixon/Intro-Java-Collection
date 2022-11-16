import java.util.Scanner;
/*
Homework 4
Dexter Dixon
Due:02/11/2021
This program takes prints a menue restauraunt order information from the user and uses it 
to print a purchase summary.
 */
public class OnlineRestaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        ***************************************************
        This section declares variables
        ***************************************************
        */
        //Declare Tax Constants
        final double TAX_RATE = 6.50;                     //Tax rate used to calculate sales tax
        final double DIVISOR = 100;                       //Tax divisor used to calculate sales tax
        final int LOOP_TERMINATOR = 10;                   //Used to terminate the do while loop
        final double TAMALES_PRICE = 4.95;                //Price of item
        final double EMPANADAS_PRICE = 3.95;              //Price of item
        final double ALFRAJORES_PRICE = 3.49;             //Price of item
        final double PAPA_A_LA_HUANACAINA_PRICE = 3.95;   //Price of item
        final double CEVICHE_PRICE = 8.95;                //Price of item
        final double LOMO_SALTADO_PRICE = 9.95;           //Price of item
        final double BEVERAGE_PRICE = 1.50;               //Price of item
        final double FRIES_PRICE = 2.99;                  //Price of item

        //Declare Variables
        Scanner input = new Scanner(System.in);           //Used to read user input
        String sCustomerName = " ";                       //Customer name
        int nCount = 0;                                   //Used to count the number of items ordered
        int nChoice = 0;

        double dTotalPrice = 0.0;                         //Used to calculate price of the items
        double dSalesTax = 0.0;                           //Sales tax of the order
        double dFinalPrice = 0.0;                         //Final price of the order

        //Prompt user for name
        System.out.print("Please enter your name: ");

        //Scans the Customer Name
        sCustomerName = input.nextLine();

        /*
        **********************************************************************
        This section prints the menue and promps the customer to make a choice
        **********************************************************************
        */
        System.out.println("FUN TIPS FOR KIDS EAT MENU");
        System.out.println("1. Tamales               $4.95");
        System.out.println("2. Empanadas             $3.95");
        System.out.println("3. Alfrajores            $3.49");
        System.out.println("4. Papa a la Huanacaina  $3.95");
        System.out.println("5. Ceviche               $8.95");
        System.out.println("6. Lomo saltado          $9.95");
        System.out.println("7. Inca Kola - Soda      $1.50");
        System.out.println("8. Bottled Water         $1.50");
        System.out.println("9. Fries                 $2.99");
        System.out.println("10. Complete my order");

        //Prompt user to select a nothe item
        System.out.print("Please select an item from the menu above: ");

        //Saves the customer's choice in a variable
        nChoice = input.nextInt();

    
        /*
        **********************************************************
        A while loop used to gather the entire customer's order
        **********************************************************
        */
        while(nChoice != LOOP_TERMINATOR) {

            //A counter used to keep track of the items purchased
            nCount++;

            //Input validation
            if(nChoice > 10 || nChoice < 1){

                //Prompts the user to make valid choice
                System.out.println("Please choose a valid option.");

                //Subtract 1 from the count 
                nCount--;

            } //End of if statment

            else if(nChoice == 1){

                //Adds item price to total price variable
                dTotalPrice = dTotalPrice + TAMALES_PRICE;

            } //End of else if statment

            else if(nChoice == 2){

                //Adds item price to total price variable
                dTotalPrice = dTotalPrice + EMPANADAS_PRICE;

            } //End of else if statment

            else if(nChoice == 3){

                //Adds item price to total price variable
                dTotalPrice = dTotalPrice + ALFRAJORES_PRICE;

            } //End of else if statment

            else if(nChoice == 4){

                //Adds item price to total price variable
                dTotalPrice = dTotalPrice + PAPA_A_LA_HUANACAINA_PRICE;

            } //End of else if statment

            else if(nChoice == 5){

                //Adds item price to total price variable
                dTotalPrice = dTotalPrice + CEVICHE_PRICE;

            } //End of else if statment

            else if(nChoice == 6){

                //Adds item price to total price variable
                dTotalPrice = dTotalPrice + LOMO_SALTADO_PRICE;

            } //End of else if statment

            else if(nChoice == 7){

                //Adds item price to total price variable
                dTotalPrice = dTotalPrice + BEVERAGE_PRICE;

            } //End of else if statment

            else if(nChoice == 8){

                //Adds item price to total price variable
                dTotalPrice = dTotalPrice + BEVERAGE_PRICE;

            } //End of else if statment

            else if(nChoice == 9){

                //Adds item price to total price variable
                dTotalPrice = dTotalPrice + FRIES_PRICE;

            } //End of else if statment

            //Prompt user to select another item
            System.out.print("Please select another item from the menu above: ");

            //Capture users choice
            nChoice = input.nextInt();

        }  //End of while loop

        //Calculate sales tax
        dSalesTax = (TAX_RATE/DIVISOR)*dTotalPrice;

        //Calculate final price
        dFinalPrice = dSalesTax + dTotalPrice;

        /*
        *****************************************
        This section prints out the sales receipt
        *****************************************
        */

        //Print a thank you message
        System.out.println("Thank you for ordering with Fun tips for kids, " + sCustomerName);

        //Print number of items ordered
        System.out.println("Total items ordered: " + nCount);

        //Print total price of the food
        System.out.println("Price of food ordered: $" + dTotalPrice);

        //Print sales tax
        System.out.println("Sales tax: $" + dSalesTax);

        //Print final price
        System.out.println("Total amount due: $" + dFinalPrice);

    } //End of main method

} //End of OnlineRestaurant class
