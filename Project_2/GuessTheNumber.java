package Project_2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    //creating new game
    public static void newGame() {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        guessTheNumber.guess();
    }

    //check for play again
    public static void checkPlayAgain(Scanner sc) {
        System.out.println("\nWould you like to play again?(y or n)");
        System.out.println("");
        String userInput = sc.next();

        //taking specific input 'y' or 'n' only
        while (((userInput.equalsIgnoreCase("y")) || (userInput.equalsIgnoreCase("n"))) != true) {
            System.out.println("\nPlease Enter 'y' or 'n'.");
            userInput = sc.next();
        }
        // for condition userInput = y
        if (userInput.equalsIgnoreCase("y")) {
            System.out.println("\n!!!Wow!!! - Thank you.. for Playing Again!!!");
            GuessTheNumber.newGame();

        //for condition userInput = n
        } else {
            System.out.println("\nThank you for Playing. See you soon!!!");
        }
    }

    //guess method
    public int guess() {
        //generating Random number (1-20) from random class.
        Random random = new Random();
        int comSecretNum = random.nextInt(20) + 1;
        //System.out.println(comSecretNum); //for checking

        //taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! What is your Name?");
        System.out.println("");
        String name = sc.next();
        System.out.println("\nWell " + name + ", I am thinking of a number between 1 and 20.\n" +
                "Take a guess.");

        int i = 1;
        //checking for 6 tires and also guessing the number.
        while (i < 7) {
            System.out.print("\nEnter Your Number: ");
            int guessNum = sc.nextInt();
            System.out.println("");
            if (guessNum == comSecretNum) {
                System.out.println("\nGood Job, " + name + "! You guessed my number in " + i + " guesses!.");
                //if user wants to play again
                GuessTheNumber.checkPlayAgain(sc);
                break;
                //GuessTheNumber.newGame();
            } else if (guessNum > comSecretNum) {
                System.out.println("Your guess is too high.");
                i++;
            } else {
                System.out.println("Your guess is too low");
                i++;
            }
        }
        //return no of tries.
        return i;
    }

    public static void main(String[] args) {
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        int tries = guessTheNumber.guess();
        //Checking if no of tires is greater than 6.
        if (tries > 6) {
            System.out.println("You couldn't guess in six tries you loss.");
            guessTheNumber.checkPlayAgain(new Scanner(System.in));
        }
    };
}
