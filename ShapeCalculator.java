package shapecalculator;
import java.util.Scanner;

public class ShapeCalculator {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      //[[Cirle]]\\
      
      int circleRadius;
      double circleArea;
      
      System.out.print("What is the radius of your circle ");
      circleRadius = input.nextInt();
      
      circleArea = (Math.PI * circleRadius * circleRadius);
      System.out.printf("Circle Area: %.2f%n", circleArea);
      
      //[[Triangle]]\\
      int triangleBase;
      int triangleHeight;
      double triangleArea;

      System.out.print("What is the base of your triangle ");
      triangleBase = input.nextInt();
      
      System.out.print("What is the Height of your triangle ");
      triangleHeight = input.nextInt();

      triangleArea = (double)(triangleBase * triangleHeight) / 2;

      System.out.println("You Triangle is: "+triangleArea);
      //[[Rectangle]]\\
      int rectangleBase;
      int rectangleHeight;
      double rectangleArea;

      System.out.print("What is the base of your rectangle ");
      rectangleBase = input.nextInt();
      
      System.out.print("What is the Height of your rectangle ");
      rectangleHeight = input.nextInt();

      rectangleArea = (rectangleBase * rectangleHeight);

      System.out.println("You Rectangle is: "+rectangleArea);
    }
    
}
