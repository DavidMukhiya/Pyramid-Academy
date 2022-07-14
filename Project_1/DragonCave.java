package Project_1;

import java.util.Scanner;

public class DragonCave {
    public void cave(int caveNum) {
        switch (caveNum) {
            case 1:
                System.out.println("you Approach the cave..\n" +
                        "It is dark and spooky..\n" +
                        "A large dragon jumps out in front of you!\n" +
                        "He opens his jaws and...\n" +
                        "Gobbles you down in one bite!");
                break;
            case 2:
                System.out.println("you Approach the cave..\n" +
                        "It is warm and happy..\n" +
                        "the dragon is friendly..\n" +
                        "will share his treasure with you");
                break;
        };
    };
    public static void main(String[] args) {
        System.out.println("\nYou are in a Land full of Dragon.\n" +
                "In front you, you see two cave.\n" +
                "In one cave, the dragon is greedy\n" +
                "and hungry and will eat you on sight.\n" +
                "and In another cave it is dark and spooky.\n");

        System.out.println("Which cave will you go into?\n" +
                "Enter No '1' for Cave One\n" +
                "Enter No '2' for Cave Two\n");
        System.out.print("Enter the No: ");

        Scanner sc = new Scanner(System.in);
        int caveNum = sc.nextInt();
        System.out.print("You Enter the No: " + caveNum + "\n");
        if (caveNum == 1 || caveNum == 2) {
            DragonCave dragonCave = new DragonCave();
            dragonCave.cave(caveNum);
        } else {
            System.out.print("\nPlease Enter No 1 or 2: ");
            caveNum = sc.nextInt();
            System.out.print("You Enter the No: " + caveNum);
            DragonCave dragonCave = new DragonCave();
            dragonCave.cave(caveNum);
        }
    }
}
