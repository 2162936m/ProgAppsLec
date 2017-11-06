/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @(#)Text1.java
 *
 *
 * @author 
 * @version 1.00 2017/8/13
 */
import java.util.*;

public class DLComputeOld {

    public static void main(String[] args) {
    	Scanner scan = new Scanner (System.in);
    	
    	double grade;
    	double units;
    	double totalUnits = 0;
    	double finGrade;
    	double totalGrades = 0;
    	
    	System.out.print("Enter how many subjects you have: ");
    	int s = scan.nextInt();
    	
    	for (int x = 1; x <= s; x++){
    		System.out.print("Enter final grade: ");
    		grade = scan.nextInt();
    		System.out.print("Enter units: ");
    		units = scan.nextInt();
    		
    		finGrade = grade * units;
    		 System.out.println(finGrade);
    		totalGrades = finGrade + totalGrades;
    		 System.out.println(totalGrades);
    		totalUnits = units + totalUnits;
    		 System.out.println(totalUnits);
    	}
    	double ave = totalGrades / totalUnits;
    	
    	System.out.println("Your average is " + ave);
    	
    	if(ave >= 85)
            System.out.println("Congrats, you qualified for the Dean's List");
    	else
            System.out.println("Sorry you did not qualify.");
    }
}
