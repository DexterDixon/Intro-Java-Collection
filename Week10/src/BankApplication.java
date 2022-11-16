import java.util.Scanner;
/*
Homework 6
Dexter Dixon
Due:03/25/2021
This program allows a user to use a bank and select from several bank menue options
 */
public class BankApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        ********************
        Variable Declaration
        ********************
        */  
        
        final int LOOP_TERMINATOR = 10;                //Used to stop loop

        BankAccount account = new BankAccount();       //BankAccount constructor is used
        Scanner input = new Scanner(System.in);       //Used to gather users input

        int nWithdrawalAmount = 0;                    //Used to gather users withdrawal amount
        int nChoice = 0;                               //Used to save users menue choice
        int nNextAccountNum = 0;                      //Used to store the nest account number 
        int nStartingBalance = 0;                     //Used to store the users input for starting balance
        
        double dDepositAmount = 0.0;                   //Used to save deposit amount
        double dAccountBalance = 0.0;                 //Used to save the accout balance 
        double dMonthlyIntrestR = 0.0;                //Used to store monthly interest Rate
        double dMonthlyInterest = 0.0;                //Used to storre the monthly intrest

        /*
        ********************************************************************
        This section prints the options and promps the user to make a choice
        ********************************************************************
        */        
        System.out.println("ACCOUNT PROCESSING MENU");
        System.out.println("1. Create new account –empty account");
        System.out.println("2. Create new account –information available");
        System.out.println("3. Make deposit");
        System.out.println("4. Make withdrawal");
        System.out.println("5. Calculate monthly interest");
        System.out.println("6. View account balance");
        System.out.println("7. Next available account number");
        System.out.println("8. Update monthly interest rate");
        System.out.println("9. Print account information");
        System.out.println("10. Exit");
        
        //Prompt user to select an option
        System.out.print("Please enter your preferred option: ");

        //Saves the customer's choice in a variable
        nChoice = input.nextInt();

    
        /*
        **********************************************************
        A while loop used to get the entire customer's choice
        **********************************************************
        */
        while(nChoice != LOOP_TERMINATOR) {

            //A counter used to keep track of the items purchased

            //Input validation
            if(nChoice > 10 || nChoice < 1){

                //Prompts the user to make valid choice
                System.out.println("Please choose a valid option.");

                //Subtract 1 from the count 

            } //End of if statment

            else if(nChoice == 1){
                //BankAccount constructor is used
                account = new BankAccount();       
                
            } //End of else if statment

            else if(nChoice == 2){
                
                //Ptompt the user for new Bank Info and saves into variables
                System.out.print("Please enter the starting balance: ");
                nStartingBalance = input.nextInt();
                
                System.out.print("Please enter your monthly interest rate: ");
                dMonthlyIntrestR = input.nextDouble();
                
                //Calls the overload BankAccount constuctor to create a new account
                account = new BankAccount(nStartingBalance, dMonthlyIntrestR);       
 
            } //End of else if statment

            else if(nChoice == 3){

                //Ask user for deposit amount and saves into variable               
                System.out.print("Please enter the deposit amount: ");
                dDepositAmount = input.nextDouble();
                
                //Deposit the requested amount with makeDeposit method
                account.makeDeposit(dDepositAmount);
                
            } //End of else if statment

            else if(nChoice == 4){

                //Prompts user to enter withdrawal amount and saves it into a ariable
                System.out.print("Please enter the withdrawal amount: ");
                nWithdrawalAmount = input.nextInt();
                //Gets current account balance
                dAccountBalance = account.getBalance();
                
                //Runs a check to see if user has enough funds to withdraw requested amount
                if(nWithdrawalAmount > dAccountBalance) {
                    System.out.print("Insufficient funds. Withdrawal not made.");
                }//end of if statment
                
                else {
                    //withdraw requested amount witt makeWithdrawal method
                    System.out.print("Withdrawal succesful");
                    account.makeWithdrawal(nWithdrawalAmount);
                }//end of else statment
                
            } //End of else if statment

            else if(nChoice == 5){
                
                //Retreives the current intrest 
                dMonthlyInterest = account.monthlyInterest();
                
                //Prints current intrest to the screen
                System.out.print("Monthly interest:" + dMonthlyInterest);

            } //End of else if statment

            else if(nChoice == 6){
                
                //Get current Account Balance
                dAccountBalance = account.getBalance();
                //Prints the account balance
                System.out.print("Account Balance: " + dAccountBalance);

            } //End of else if statment

            else if(nChoice == 7){
                //Gets the next availale account number
                nNextAccountNum = account.getNextAccountNumber();
                
                //Prints the next available account number
                System.out.print("Next available account number: " + dAccountBalance);

            } //End of else if statment

            else if(nChoice == 8){
                //Ask user for new interest rate and saves it into a variable
                System.out.print("What is the new montly interest rate? ");
                dMonthlyIntrestR = input.nextDouble();
                
                //Sets the new monthly interest rate
                account.setMonthlyInterestRate(dMonthlyIntrestR);

            } //End of else if statment

            else if(nChoice == 9){
                //prints the account information with printBankInfo method
                account.printBankInfo();

            } //End of else if statment

            //Prompt user to select another option
            System.out.print("Please enter your preferred option: ");

            //Capture users choice
            nChoice = input.nextInt();

        }  //End of while loop
        
        //informs user that they have quit the program
        System.out.print("Exiting Program.");

    }
    
}
