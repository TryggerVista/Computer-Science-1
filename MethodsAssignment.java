package methodsassignment;

public class MethodsAssignment {

    public static void main(String[] args) {
        
        MethodAssignmentAnswerBank answers = new MethodAssignmentAnswerBank();
        
        // ---------- problem 1B ----------
        int p1_a = 1;
        int p1_b = 2;
        int p1_c = 3;
        int p1_result = 0;
        
        // TODO: Call addThreeNumbers Here using p1_a, p1_b, and p1_c. 
        // Store the result in p1_result.
        // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
        p1_result = addThreeNumber(p1_a, p1_b, p1_c);
        // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
        answers.displayIntResult(1, p1_result);
        // -------------------------------
        
        
        
        // ---------- problem 2B ----------
        double p2_num1 = 3.5;
        double p2_num2 = 1.4;
        double p2_result = 0.0;
        
        // TODO: Call averageOfTwo using parameters p2_num1, and p2_num2.
        // Store the result in p2_result
        // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
        p2_result = averageOfTwo(p2_num1, p2_num2);
        // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
        answers.displayDoubleResult(2, p2_result);
        // -------------------------------
       
        
        // ---------- problem 3B ----------
        int p3_width = 6;
        int p3_length = 2;
        int p3_result = 0;
        
        // TODO: Call perimeterOfRectangle using parameters p3_width and p3_length.
        // Store the result in p3_result
        // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
        p3_result = perimeterOfRectangle(p3_length, p3_width);
        // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
        answers.displayIntResult(3, p3_result);
        // -------------------------------
        
        
        
        // ---------- problem 4B ----------
        int p4_length = 9;
        int p4_width = 2;
        int p4_height = 1;
        int p4_result = 0;
        
        // TODO: Call volumeOfBox using parameters p4_length, p4_width, and p4_height
        // Store the result in p4_result
        // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
        p4_result = volumeOfBox(p4_length, p4_width, p4_height);
        // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
        answers.displayIntResult(4, p4_result);
        // -------------------------------
        
        
        
        // ---------- problem 5B ----------
        double p5_mealCost = 18.95;
        double p5_tipAmount = 15.0;
        double p5_result = 0.0;
        
        // TODO: Call tipAmount using parameters p5_mealCost, p5_tipAmount
        // Store the result in p5_result
        // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
        p5_result = tipAmount(p5_mealCost, p5_tipAmount);
        // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
        answers.displayDoubleResult(5, p5_result);
        // -------------------------------
        
        
        
        // ---------- problem 6B ----------
        int p6_val = 42;
        int p6_num = 51;
        int p6_result = 0;
        
        // TODO: Call doubleSumPlusOne using parameters p6_val, p6_num
        // Store the result in p5_result
        // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
        p6_result = doubleSumPlusOne(p6_val, p6_num);
        // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
        answers.displayIntResult(6, p6_result);
        // -------------------------------
        
        
        
        // ---------- problem 7B ----------
        int p7_val = 23;
        int p7_num = -54;
        int p7_result = 0;
        
        // TODO: Call differenceOfSquares using parameters p7_val, and p7_num
        // Store the result in p7_result
        // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
        p7_result = differenceOfSquares(p7_val, p7_num);
        // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
        answers.displayIntResult(7, p7_result);
        // -------------------------------
        
    }
    

    // ---------- problem 1A -----------------
    // Create a method called addThreeNumbers.
    // This method should take three int parameters and return their sum as an int
    public static int addThreeNumber(int a, int b, int c){
        return a+b+c;
    }
    
    // ---------- problem 2A -----------------
    // Create a method called averageOfTwo.
    // This method should take two double parameters and return their average as a double
    // https://www.tutorialspoint.com/multiply_and_divide_decimals/average_of_two_numbers.htm
    public static double averageOfTwo(double a, double b) {
        return (a+b)/2;
    }
    
    // ---------- problem 3A -----------------
    // Create a method called perimeterOfRectangle.
    // This method should take two int parameters (length and width)
    // It should return the perimeter, as an int, of a rectangle with these dimensions
    // https://www.chilimath.com/lessons/geometry-lessons/perimeter-of-rectangle/
    public static int perimeterOfRectangle(int length, int width) {
        return (length + width) * 2;
    }
    
    // ---------- problem 4A -----------------
    // Create a method called volumeOfBox.
    // This method should take three int parameters (length, width , height)
    // It should return the volume of a box woth these dimensions as an int
    // https://www.ducksters.com/kidsmath/finding_the_volume_of_a_cube_or_box.php
    public static int volumeOfBox(int length, int width, int height) {
        return length * width * height;
    }
    
    // ---------- problem 5A -----------------
    // Create a method called tipAmount
    // It should take two double parameters (mealCost and tipPercent)
    // It should then return the tip amount as a double
    // Formula: mealCost * (tipPercent / 100)
    public static double tipAmount(double mealCost, double tipPercent) {
        return mealCost * (tipPercent / 100);
    }

    // ---------- problem 6A -----------------
    // Create a method called doubleSumPlusOne
    // This method should take two int parameters, add them together, multiply the
    // result by 2 and then add 1. Then return the final value as an int
    // NOTE: Remember PEMDAS
    
    public static int doubleSumPlusOne(int a, int b) {
        return (a + b) * 2 + 1;
    }
    
    // ---------- problem 7A -----------------
    // Create a method called differenceOfSquares
    // It should take two int parameters (a and b) and return (a * a) - (b * b)
    // the return value should be an int
    public static int differenceOfSquares(int a, int b) {
        return (a * a) - (b * b);
    }
 
}
