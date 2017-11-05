import java.util.*;
/**
 * Java class DLCompute 
 * This class computes for the average grade 
 * and outputs whether the user is qualified 
 * for the dean's list
 * 
 * @author ProgAppsLecGroup
 * @version 8.2, 05 Nov 2017
 */
public class DLCompute {
/**
 * This class allows the user to input values for 
 * each variable such as subjects, final grade, and
 * number of units required to complete the evaluation 
 * 
 * @param args 
 */
public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    	
    	double grade = 0;
        double units = 0; 
        double finGrade, ave;
    	double totalUnits = 0;
        double totalGrades = 0;
    	
    	System.out.print("Enter how many subjects you have: ");
    	int s = scan.nextInt();
    	
    	for (int x = 1; x <= s; x++){
            System.out.print("Enter final grade: ");
            grade = scan.nextDouble();
            System.out.print("Enter units: ");
            units = scan.nextDouble();
            System.out.println();
            
            finGrade = computeFinalGrade(grade, units);
            totalGrades = computeTotalGrades(totalGrades, finGrade);
            totalUnits = computeTotalUnits(totalUnits, units);
    	}              
        
    	ave = computeAverage(totalGrades, totalUnits);    	        
    	result(ave);
    }
    /**
     * This method outputs the results whether the user
     * qualifies or not
     * 
     * @param ave 
     */
    public static void result(double ave) {
    System.out.println("Your average is " + ave);
    if(ave >= 85)
    System.out.println("Congratulations! You're qualified for the Dean's List");
    else
    System.out.println("Sorry you're not qualified for the Dean's List");
    }
    /**
     * This method divides total grade and total 
     * units and returns the average grade
     * 
     * @param totalGrades
     * @param totalUnits
     * @return 
     */
    public static double computeAverage(double totalGrades, double totalUnits) {
        double ave;
        ave = totalGrades / totalUnits;
        return ave;
    }
    /**
     * This method adds units and total units
     * and returns the computed total units
     * 
     * @param totalUnits
     * @param units
     * @return 
     */
    public static double computeTotalUnits(double totalUnits, double units) {
        totalUnits = units + totalUnits;
        return totalUnits;
    }
    /**
     * This method returns the total grade
     * 
     * @param totalGrades
     * @param finGrade
     * @return 
     */
    public static double computeTotalGrades(double totalGrades, double finGrade) {
        totalGrades = computeTotalUnits(totalGrades, finGrade);
        return totalGrades;
    }
    /**
     * This method multiplies grade and units
     * and returns the final grade
     * 
     * @param grade
     * @param units
     * @return 
     */
    public static double computeFinalGrade(double grade, double units) {
        double finGrade;
        finGrade = grade * units;
        return finGrade;
    }
    
}