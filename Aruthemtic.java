package arithemtic;

public class Arithemtic {

    public static void main(String[] args) {
        
        
        //[[ADDITION]]\\
        int Number1 = 34065734;
        int Number2 = 194566;
        
        int FinalNumber = Number1+Number2;
        
        System.out.println("Addition: \n"+Integer.toString(Number1)+" + "+Integer.toString(Number2));
        System.out.println(FinalNumber+"\n");
        
        //[[SUBTRACTION]]\\
        int Number3 = 456;
        int Number4 = 345;
        
        int FinalNumber2 = Number3-Number4;
        
        System.out.println("Subtraction: \n"+Integer.toString(Number3)+" - "+Integer.toString(Number4));
        System.out.println(FinalNumber2+"\n");
        
        //[[MULTIPLICATION]]\\
        int Number5 = 54906;
        int Number6 = 34;
        
        int FinalNumber3 = Number5*Number6;
        
        System.out.println("Multiplication: \n"+Integer.toString(Number5)+" * "+Integer.toString(Number6));
        System.out.println(FinalNumber3+"\n");
        
        //[[DIVISION]]\\
        int A = 7;
        int B = 4;
        int C = A/B;
        
        System.out.println("C: "+C+"\n");
        
        double D = 7;
        double E = 3;
        double F = D/E;
        
        System.out.println("F: "+F);
        System.out.printf("F: %.5f%n", F);
        
        //[[MODULUS]]\\
        
        int Remainder = A % B;
        System.out.println("Remainder: "+Remainder);
        
        //[[ORDER OF OPPERATIONS]]\\
        int OOP = 2 + 3 * 4 + 1;
        
        System.out.println("OOP: "+OPP);
    }
    
}
