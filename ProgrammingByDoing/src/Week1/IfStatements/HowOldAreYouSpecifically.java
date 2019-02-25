package Week1.IfStatements;

import java.util.Scanner;

public class HowOldAreYouSpecifically {
    public static void main(String[] args) {
        System.out.print("Hey, what's your name? ");
        Scanner namein = new Scanner(System.in);
        String name = namein.nextLine(); // user input
        System.out.print(String.format("Ok, %s, how old are you? ", name));
        Scanner agein = new Scanner(System.in);
        int age = agein.nextInt(); // user input
            String result = "";
            if (age < 16) {
                result = "You can't drive, ";
            } else if (age >= 16 && age <= 17) {
                result = "You can drive but not vote, ";
            } else if (age >= 18 && age <= 24) {
                result = "You can vote but not rent a car, ";
            } else if (age > 25) {
                result = "You can do pretty much anything, ";
            }

        System.out.println(result + name + ".");

    }
}

