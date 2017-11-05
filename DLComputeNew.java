package project;
/**
 * @author Group4_10:00-11:00_WS
 */
import java.util.*;

public class DLCompute {

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

    public static void result(double ave) {
        System.out.println("Your average is " + ave);
        if(ave >= 85)
            System.out.println("Congratulations! You're qualified for the Dean's List");
        else
            System.out.println("Sorry you're not qualified for the Dean's List");
    }

    public static double computeAverage(double totalGrades, double totalUnits) {
        double ave;
        ave = totalGrades / totalUnits;
        return ave;
    }

    public static double computeTotalUnits(double totalUnits, double units) {
        totalUnits = units + totalUnits;
        return totalUnits;
    }

    public static double computeTotalGrades(double totalGrades, double finGrade) {
        totalGrades = computeTotalUnits(totalGrades, finGrade);
        return totalGrades;
    }

    public static double computeFinalGrade(double grade, double units) {
        double finGrade;
        finGrade = grade * units;
        return finGrade;
    }
    
}