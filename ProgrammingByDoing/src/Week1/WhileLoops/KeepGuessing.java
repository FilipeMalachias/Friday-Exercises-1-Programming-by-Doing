package Week1.WhileLoops;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner generalin = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(10);
        number++;

        System.out.println("Hello, what is your name?");
        String name = generalin.nextLine();
        System.out.println(String.format("Hi, %s,\n" +
                        "I'm thinking of a number from 1 to 10.\n" +
                        "Try to guess: ", name));

        while (true) {
            int guess = generalin.nextInt();
            System.out.println(String.format("Your guess: %d.", guess));
            if (guess == number) {
                System.out.println(String.format("That's right!\n" +
                                                "Good Job.\n" +
                                                "My secret number was %d!", number));
                break;
            } else if (guess != number && guess <= 10) {
                System.out.println("Sorry, but I was really thinking of other number.");
            } else if (guess != number && guess > 10)
            {
                System.out.println("The number is between 1 to 10. Try again.");
            }
        }
    }
}
