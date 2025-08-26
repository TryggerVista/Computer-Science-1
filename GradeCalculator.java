package grade.calculator;

import java.util.Scanner;


public class GradeCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your current grade: ");
        double grade = input.nextDouble();
        
        String lGrade = LetterGrade(grade);
        
        System.out.println("Your letter grade is: "+lGrade);
        
    }    
    
    public static String LetterGrade(double percentGrade) {
        if (percentGrade >= 90) {
            return "A";
        }else if (percentGrade >= 80) {
             return "B";  
        }else if (percentGrade >= 70) {
             return "C";  
        }else if (percentGrade >= 60) {
             return "D";  
        } else {
             return "F";  
        }
    }
}
