//This class represents circles and their attributes
public class Circle {
    //Declare attributes
    private double dRadius = 0.0; //Radius of the circle
    private static int nNumberOfObjects = 0; //Number of circles created
    
    //Declare constants
    public final static double PI = 3.14;   //Value of pi 
    
    //Default constructor - sets radius to 1.
    //Increments number of circles created
    Circle(){
        //Set default values for class attributes
        dRadius = 1.0;
        
        //Increment the number of circles that have been created
        nNumberOfObjects++;
    }//end default Constructor
    
    //Overloaded constructor setting radius
    //Increments number of circles created
    Circle (double dRad){
	//Increment number of circles
        nNumberOfObjects++;
        //Check to ensure radius is a legal value
        if (dRad > 0) {
            dRadius = dRad;

        }
        else {
            System.out.println("you entered and invalid radius!");
        }

        
        
    }//end Overloaded Constructor
    
    //Accessor for number of circles created
    public int getNumberofObjects(){
        return nNumberOfObjects;
    }//end getNumberofObjects
            
    //Accessor for circle's radius
    public double getRadius(){
        return dRadius;
    }//end accessor to get the raius
    
    //method to compute the Area
    public double computeArea(){
        double dArea = 0.0;
        dArea = dRadius * dRadius * PI;
        return dArea;
    }// end method to compute the Area
    
    //method to compute the perimeter
    public double computePerimeter(){
        double dPerimeter = 0.0;
        dPerimeter = 2 * dRadius * PI;
        return dPerimeter;
        
    }// end method to compute the Perimeter
    
    
    //Mutator to set the radius
    public void setRadius(double dNewRadius){
        //Check to make sure radius is a legal value
        if (dNewRadius > 0)
            dRadius = dNewRadius;
        else
            System.out.println("you entered and invalid radius!");
    }//end Mutator to set the radius

    //Prints the values of the attributes of the object
    public void printCircleValues(){
        //Print statement to print the values stored in this object's attributes
        System.out.println("This circle has radius of " + dRadius);
    } //end method printCircleValues
    
}//end class Circle
