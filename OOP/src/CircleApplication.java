/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dexte
 */
public class CircleApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int nOption = 0;            
        double dRadius = 0.0;                  //Used to store users input
        Scanner input = new Scanner(System.in);  
        Circle c1 = nill;
        // TODO code applicSystem.out.println("Math Tool");
        System.out.println("1. Create a cricle defailt constructor:");
        System.out.println("2. Create a circle overloaded consturctor:");
        System.out.println("3. Compute the area of the circle");
        System.out.println("4. Compute the perimeter of the circle");
        System.out.println("5. Set the radius of the circle");
        System.out.println("6. Show the radius of the circle");
        System.out.println("7. Number of objects created");
        System.out.println("10. Exit");
        
        System.out.print("Please select an option: ");
        nOption = input.nextInt();

        while(nOption != 10){
            
            if(nOption == 1) {

                //Invoke ComputePower method
                Circle c1 = new Circle();
    
            } //End if
    
            else if(nOption == 2) {
    
                System.out.print("Enter the initial value of the radius: ");
                dRadius = input.nextDouble();
                Circle c1 = new Circle(dRdius);
                computeProduct();
    
            } 
            
            else if(nOption == 3) {
    
                //Invoke ComputeProduct method
                computeProduct();
    
            } 
            
            else if(nOption == 4) {
    
                //Invoke ComputeProduct method
                computeProduct();
    
            } 
            
            else if(nOption == 5) {
    
                //Invoke ComputeProduct method
                computeProduct();
    
            } 
            
            else if(nOption == 6) {
    
                //Invoke ComputeProduct method
                computeProduct();
    
            } 
            
            else if(nOption == 7) {
    
                //Invoke ComputeProduct method
                computeProduct();
    
            } else if(nOption == 10) {
    
                //Invoke ComputeProduct method
                computeProduct();
    
            } 
            
            else  {
                
                System.out.println("Invalid option");
    
            }

}
    }
    
}
