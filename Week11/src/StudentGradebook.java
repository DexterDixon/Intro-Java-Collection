import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/*
Homework 6
Dexter Dixon
Due:03/25/2021
This program collects students information from a text file and prints out the student roster and each students avarage quiz grades.
 */
public class StudentGradebook {

    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Student> stuList = new ArrayList<>(); // Array list to store Student objects
        boolean flg = true; //used to print roster header
        
        // call method generate the student list
        generateList(stuList);
        
        // foor loop to print the information of each Object stored in the ArrayList 
        for (int nIndex = 0; nIndex < stuList.size(); nIndex++) {
            //if statment used to change the value of the boolean
            if (nIndex > 0) {
                flg = false;
            } // end if
            
            // call method printStudentInfo and pass an object reference variable stored in an ArrayList 
            printStudentInfo(stuList.get(nIndex), flg);
            
        }//end for loop
        
    } //end main method
    
    public static void generateList(ArrayList<Student> stuList) throws FileNotFoundException{
        
        //Sets the correct file location for the students.txt file
        File fileToOpen = new File("C:\\Users\\dexte\\Documents\\IntroToJava\\Week11\\Students.txt");
        
        //Scans the file Students.txt
        Scanner inputFile = new Scanner(fileToOpen);
        
        //Creates variables to store values of the text file
        String sInputLine = "";   //Variable to store each line n the Students.txt file
        String[] saTokens = null; //Array to hold string values of the text fle
        
        // loop to read the file Employee.txt
        while(inputFile.hasNext()){
            
            //Read line from the file
            sInputLine = inputFile.nextLine();
            //Split the line read from the file into individual attributes
            saTokens = sInputLine.split("-");
            
            // Create a new Student using the default constructor
            Student stu = new Student();
            
            // Set the first name
            stu.setFirstName(saTokens[0]);
            // Set the last name
            stu.setLastName(saTokens[1]);
            
            // Set quiz grade 1
            stu.setQuiz1(Integer.parseInt(saTokens[2]));
            // Set quiz grade 2
            stu.setQuiz2(Integer.parseInt(saTokens[3]));
            // Set quiz grade 3
            stu.setQuiz3(Integer.parseInt(saTokens[4]));
            
            // Adding an Student Object in the ArrayList 
            stuList.add(stu);
            
        } // end while loop read file
        
        // close the file
        inputFile.close();
        
    }// end generateListEmp
    
    // method to print the information of the Student objects
    public static void printStudentInfo(Student stuInfo, boolean flg){
            
            
            //Iff statment used to print roster header once
            if(flg) {
                
                //Print the student roster title
                System.out.println("STUDENT ROSTER AND QUIZ AVERAGES");
                System.out.println("");
                
                //call getNumberedStudents to print the number of students in the class
                System.out.println("Students in class: " + stuInfo.getNumberStudents());
                System.out.println("");
                
            } //end if statment
            
            //Gets the first and last name of students in the object and capitalizes the last name
            System.out.println("Student name: " + stuInfo.getFirstName() + " " + stuInfo.getLastName().toUpperCase());
            
            //Calls calculateQuizAverage to print the student quiz average
            System.out.println("Quiz average: " + stuInfo.calculateQuizAverage());
            System.out.println("");
            
    }// end method printStudentInfo
}
