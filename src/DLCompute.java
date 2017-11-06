import java.util.*;

public class DLCompute {
    
    /**
     * This class allows the user to input values for 
     * each variable such as subjects, final grade, and
     * number of units required to complete the evaluation 
     * 
     * @param args receives inputs 
     */
    public static void main(String[] args) {
    	Scanner scan = new Scanner (System.in);
    	
    	/*initialize a variable grade using double*/
    	double units;
    	double totalUnits = 0;
    	double finalGrade;
    	double totalGrades = 0;
    	
    	/* Print out a prompt message "Enter how namy subject you have"*/ 
    	/* Input number of subject from keyboard*/

    	/*enter final grades and units according to the number of subjects subject*/
            System.out.print("Enter final grade: ");
            grade = scan.nextDouble();
            System.out.print("Enter units: ");
            units = scan.nextDouble();
    		
            finalGrade = grade * units;
            totalGrades = finalGrade + totalGrades;
            totalUnits = units + totalUnits;
    	
        double ave = totalGrades / totalUnits;
    	
    	System.out.println("Your average is " + ave);
    	
	/*If the average is greater than or equal to 85, print "Congratulations! You're qualified for 
	the Dean's List otherwise print "Sorry you're not qualified for the Dean's List"*/
    }
}