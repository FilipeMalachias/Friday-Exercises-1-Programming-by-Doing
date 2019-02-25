package Week1.KeyboardInput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {
        System.out.print("Hello. What is your name? ");
        Scanner namein = new Scanner(System.in);
        String name = namein.nextLine(); // user input

        System.out.print(String.format("Hi, %s! How old are you? ", name));
        Scanner agein = new Scanner(System.in);
        int age = agein.nextInt(); // user input
        /*int ageplus = age + 5;
        int ageminus = age - 5;*/

        System.out.println(String.format("Did you know that in five years you will be %d years old?\n" +
                                        "And five years ago you were %d! Imagine that!", (age + 5), (age - 5)));
    }
}
