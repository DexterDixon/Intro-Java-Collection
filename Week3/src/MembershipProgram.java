import java.util.Scanner;
/*
Homework 3
Dexter Dixon
Due:02/04/2021
This program takes in music purchase information from the user and uses it to print a purchase summary
 */
public class MembershipProgram {

    public static void main(String[] args) {
        /*
        ***************************************************
        This section declares variables
        ***************************************************
        */
        //Declare Tax Constants
        final double TAX_RATE = 6.50;
        final double DIVISOR = 100;           //Tax divisor used to calculate sales tax

        //Declare Regular Customer Constants
        final double REGULAR_PRICE1 = 1.39;
        final double REGULAR_PRICE2 = 1.34;
        final double REGULAR_PRICE3 = 1.29;
        final int REGULAR_DEAL1 = 1;
        final int REGULAR_DEAL2 = 2;
        final int REGULAR_CUTOFF1 = 10;
        final int REGULAR_CUTOFF2 = 15;
        
        //Declare Premium Customer Constants
        final double PREMIUM_PRICE1 = 1.29;
        final double PREMIUM_PRICE2 = 1.24;
        final double PREMIUM_PRICE3 = 1.19;
        final int PREMIUM_DEAL1 = 2;
        final int PREMIUM_DEAL2 = 4;
        final int PREMIUM_CUTOFF1 = 12;
        final int PREMIUM_CUTOFF2 = 18;

        //Declare Variables
        Scanner input = new Scanner(System.in);   //Used to read user input
        String sCustomerName = " ";
        int nCustomerType = 0;
        int nTotalSongs = 0;
        double dPricePerSong = 0.0;
        double dSellingPrice = 0.0;
        double dFinalPrice = 0.0;
        double dSalesTax = 0.0;

        /*
        ***************************************************
        This section collects information for the sale
        ***************************************************
        */

        //Prompt user for name
        System.out.print("Please enter your name: ");

        //Read name from user
        sCustomerName = input.nextLine();

        //Prompt user for total songs purchased
        System.out.print("How many Songs did you purchase?: ");

        //Read total songs purchased from user
        nTotalSongs = input.nextInt();

        //Prompt user for customer type
        System.out.print("What type of customer are you? Enter 0 for Regular or 1 for Premium: ");

        //Read customer type from user
        nCustomerType = input.nextInt();

        /*
        *****************************************************
        This section prepares and prints the purchase summary
        *****************************************************
        */

        //Print summary label
        System.out.println("PURCHASE SUMMARY");

        //Print customer name
        System.out.println("Customer's Name: " + sCustomerName);
        
        //If statment to determine customer type
        if(nCustomerType == 0){

            //Print customer type
            System.out.println("Customer type: Regular");

            //If statment used to find customer membership tier
            if(nTotalSongs<REGULAR_CUTOFF1){

                //Asign price point for customer
                dPricePerSong = REGULAR_PRICE1;

                //Add bonus songs to song total
                dSellingPrice = dPricePerSong*nTotalSongs;

            } //End of else if statment
            
            //Else If statment used to find customer membership tier
            else if(nTotalSongs<=REGULAR_CUTOFF2){
                
                //Asign price point for customer
                dPricePerSong = REGULAR_PRICE2;

                //Calculate selling price
                dSellingPrice = dPricePerSong*nTotalSongs;

                //Add bonus songs to song total
                nTotalSongs = nTotalSongs +REGULAR_DEAL1;

            } //End of else if statment

            else{
                
                //Asign price point for customer
                dPricePerSong = REGULAR_PRICE3;

                //Calculate selling price
                dSellingPrice = dPricePerSong*nTotalSongs;

                //Add bonus songs to song total
                nTotalSongs = nTotalSongs +REGULAR_DEAL2;

            }//End of else statment

        } //End of if conditional

        //Else used to determine customer stype
        else{ 
            //Print out customer type
            System.out.println("Customer type: Premium");
            
            //If statment used to find customer membership tier
            if(nTotalSongs<PREMIUM_CUTOFF1){
                //Asign price point for customer
                dPricePerSong = PREMIUM_PRICE1;

                //Add bonus songs to song total
                dSellingPrice = dPricePerSong*nTotalSongs;

            } //end of if statment
            
            //Else If statment used to find customer membership tier
            else if(nTotalSongs<=PREMIUM_CUTOFF2){
                //Asign price point for customer
                dPricePerSong = PREMIUM_PRICE2;

                //Calculate selling price
                dSellingPrice = dPricePerSong*nTotalSongs;

                //Add bonus songs to song total
                nTotalSongs = nTotalSongs + PREMIUM_DEAL1;

            } //end of else if statment

            //Else statment used to find customer mebership tier
            else {
                //Asign price point for customer
                dPricePerSong = PREMIUM_PRICE3;
                //Calculate selling price
                dSellingPrice = dPricePerSong*nTotalSongs;

                //Add bonus songs to song total
                nTotalSongs = nTotalSongs + PREMIUM_DEAL2;

            }//end of else statment

        }//End of if..else statment

        //Calculate sales tax
        dSalesTax = (TAX_RATE/DIVISOR)*dSellingPrice;

        //Calculate final price
        dFinalPrice = dSellingPrice + dSalesTax;

        //Print total songs received
        System.out.println("Total songs received: " + nTotalSongs);

        //Print price paid per song
        System.out.println("Price paid per song: $" + dPricePerSong);

        //Print selling price
        System.out.println("Selling Price: $" + dSellingPrice);

        //Print Sales Tax
        System.out.println("Sales Tax: $" + dSalesTax);

        //Print final price
        System.out.println("Total amount due: $" + dFinalPrice);


    }//End of main method
    
} //End of MembershipProgram class
