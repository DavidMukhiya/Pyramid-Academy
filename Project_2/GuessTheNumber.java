package Project_2;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public int guess() {
        Random random = new Random();
        int comSecretNum = random.nextInt(20) + 1;
        //System.out.println(comSecretNum);

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your Name: ");
        String name = sc.next();
        System.out.println("Hi " + name);
        System.out.println("Well " + name + ", I am thinking of a number between 1 and 20.\n" +
                "Take a guess.");

        int i = 1;
        while (i < 7) {
            System.out.print("Enter Your Number: ");
            int guessNum = sc.nextInt();
            if (guessNum == comSecretNum) {
                System.out.println("Good Job, " + name + "! You guessed my number in " + i + " guesses!.");
                System.out.println("Would you like to play again?(y or n)");
                String s = sc.next();
                System.out.println("!!!Thank you.. for Playing Again!!!");
                if (s.equalsIgnoreCase("y")) {
                    GuessTheNumber guessTheNumber = new GuessTheNumber();
                    guessTheNumber.guess();
                } else {
                    break;
                }
            } else if (guessNum > comSecretNum) {
                System.out.println("Your guess is too high.");
                i++;
            } else {
                System.out.println("Your guess is too low");
                i++;
            }
        }
        return i;
    }

    public void newGame(){
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        guessTheNumber.guess();
    }

    ;

    public static void main(String[] args) {
        //int comSecretNum = (int)(Math.random()*20)+1;
        GuessTheNumber guessTheNumber = new GuessTheNumber();
        int i = guessTheNumber.guess();
        if (i>6) {
            System.out.println("You couldn't guess in six tries you loss.");
            guessTheNumber.newGame();
        } else {
            System.out.println("Thanks for Playing the game.");
        }
    }
}
