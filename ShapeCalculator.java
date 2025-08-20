package shapecalculator;
import java.util.Scanner;

public class ShapeCalculator {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      //[[Create a Sqaure]]\\
      
      int SquareSideLength;
      int SquareArea;
      
      System.out.print("What is the side length of the sqaure ");
      SquareSideLength = input.nextInt();
      
      SquareArea = SquareSideLength * SquareSideLength;
      
      System.out.println("A sqaure with side length "+SquareSideLength+" is "+SquareArea);

      //[[Create a Triangle]]\\

      int TriangleBase;
      int TriangleArea;

      System.out.print("What is the base of your triangle ");
      TriangleBase = input.nextInt();

      TriangleArea = TriangleBase * 1/3

      System.out.println("You Triangle is: "+TriangleArea)
      
    }
    
}
