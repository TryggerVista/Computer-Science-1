/*
 * Starting code for Project 1: Guess the animal
 *
 *  Name: Trygger Roode
 *  Period: 4
 *  Date: 8/29/25
 *
 *  For this project you will write the code from a guess the animal game.
 *  The user will think of an animal and your program will ask questions to
 *  guess it. You must include the following animals:
 *  
 *  Shark, Goldfish, Whale, Lobster, Chicken, Hawk, Snake, Dog
 *
 *  In addition you must add 4 more animals. The animals you add must be
 *  from your neighbors.
 *
 * Added animals
 * 1. Turkey
 * 2. Wolf
 * 3. Crab
 * 4. Bald Eagle
 */
package guesstheanimal;

import java.util.Scanner;


public class GuessTheAnimal {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        printWelcomeMessage(input);
        
        System.out.print("Do you live in water?{y/n]: ");
        String livesInWater = input.nextLine().trim();
        
        if (livesInWater.equals("y")) {
            
            System.out.print("Are you a fish?{y/n]: ");
            String isFish = input.nextLine().trim();
            
            if (isFish.equals("y")) {
                
                System.out.print("Do you live ocean?{y/n]: ");
                String liveInOcean = input.nextLine().trim();
                
                if (liveInOcean.equals("y")) {      
                    
                    System.out.println("You are a shark!");
                    
                } else if (liveInOcean.equals("n")) {
                    
                    System.out.println("You are a goldfish!");
                    
                }
                
            } else if (isFish.equals("n")) {
                
                System.out.print("Are you a mammal?{y/n]: ");
                String isMammal = input.nextLine().trim();
                
                if (isMammal.equals("y")) {      
                    
                    System.out.println("You are a whale!");
                    
                } else if (isMammal.equals("n")) {
                    
                    System.out.print("Are you flat?{y/n]: ");
                    String isFlat = input.nextLine().trim();
                    
                    if (isFlat.equals("y")) {      
                    
                        System.out.println("You are a crab!");
                    
                    } else if (isFlat.equals("n")) {
                    
                        System.out.println("You are a lobster!");
                    
                    }
                    
                }
            }
           
        } else if (livesInWater.equals("n")) {
            
            System.out.print("Are you a bird?{y/n]: ");
            String isBird = input.nextLine().trim();
            
            if (isBird.equals("y")) {
               
                System.out.print("Do you live on a farm?{y/n]: ");
                String livesOnFarm = input.nextLine().trim();
                
                if (livesOnFarm.equals("y")) {
                    
                    System.out.print("Are you eaten on thanksgiving?{y/n]: ");
                    String eatenThankgiving = input.nextLine().trim();
                    
                    if (eatenThankgiving.equals("y")) {
                        
                        System.out.println("You are a turkey!");
                        
                    } else if (eatenThankgiving.equals("n")) {
                        
                        System.out.println("You are a chicken!");
                        
                    }
                    
                } else if (livesOnFarm.equals("n")) {
                    
                    System.out.print("Are you bald?{y/n]: ");
                    String isBald = input.nextLine().trim();
                    
                    if (isBald.equals("y")) {
                        
                        System.out.println("You are a bald eagle!");
                        
                    } else if (isBald.equals("n")) {
                        
                        System.out.println("You are a hawk!");
                        
                    }
                    
                }
                
            } else if (isBird.equals("n")) {
            
                System.out.print("Do you live in the desert?{y/n]: ");
                String livesDesert = input.nextLine().trim();
                    
                if (livesDesert.equals("y")) {
                    
                    System.out.println("You are a snake!");
                    
                } else if (livesDesert.equals("n")) {
                    
                    System.out.print("Are you a house pet?{y/n]: ");
                    String isHousePet = input.nextLine().trim();
                    
                    if (isHousePet.equals("y")) {
                        
                        System.out.println("You are a dog!");
                        
                    } else if (isHousePet.equals("n")) {
                        
                        System.out.println("You are a wolf!");
                        
                    }
                }
                
            }
            
        }
        
        
        //  Pseudocode for required animals
        //
        //  Do you live in the water? (yes)
        //      Are you a fish (yes)
        //          Do you live in the ocean? (yes)
        //              You are a shark.
        //          Do you live in the ocean (no)
        //              You are a goldfish
        //      Are you a fish (no)
        //          Are you a mammal? (yes)
        //              You are a whale.
        //          Are you a mammal? (no)
        //              Are you flat? (yes)
	//			You are a crab
	//		Are you flat? (no)
	//			You are a lobster
        //  Do you live in the water (no)
        //      Are you a bird? (yes)
        //          Do you live on a farm? (yes)
        //             Are you eaten on thankgiving? (yes)
        //                  You are a turkey
	//		Are you eaten on thankgiving? (no)
	//			You are a chicken
        //          Do you live on a farm? (no)
        //              Are you bald? (yes)
        //                  You are a bald eagle
        //              Are you bald? (no)
        //                  You are a hawk
        //      Are you a bird? (no)
        //          Do you live in the desert? (yes)
        //              You are a snake.
        //          Do you live on the desert? (no)
        //             Are you a house pet? (yes)
        //              	You are a dog.
        //		Are you a house pet? (no)
        //             		You are a wolf.
        //
    }
    
   public static void printWelcomeMessage(Scanner scanner) {
        System.out.println("===== Guess the animal =====");
        System.out.println("Pick one of the following animals and I will guess it:\n");
        
        // TODO: Add your other 4 animals to this print statement
        System.out.println("Shark, Goldfish, Whale, Lobster, Chicken, Hawk, Snake, Dog, Crab, Bald Eagle, Wolf, Turkey");
        
        System.out.print("\nPress enter when ready...");
        scanner.nextLine();
    }
}
