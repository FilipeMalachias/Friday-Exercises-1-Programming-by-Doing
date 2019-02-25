package Week1.IfStatements;

import java.util.Scanner;

public class ALittleQuiz {
    public static void main(String[] args) {

        Scanner generalin = new Scanner(System.in);

        System.out.println("What is your name? ");
        //Scanner namein = new Scanner(System.in);
        String name = generalin.nextLine(); // user input

        System.out.println(String.format("Ok, %s.\nAre you ready for a quiz? ", name));
        //Scanner quizin = new Scanner(System.in);
        String quiz = generalin.nextLine(); // user input

        System.out.println("Okay, here it comes!");
        System.out.println("Q1) What is the capital of Alaska?\n" +
                "\t1) Melbourne\n" +
                "\t2) Anchorage\n" +
                "\t3) Juneau");

        int result1 = generalin.nextInt();
        int counter = 0;

        if (result1 == 3)
        {
            System.out.println("That's right!");
            counter++;
        }
        else if (result1 != 3)
        {
            System.out.println("Your answer is wrong, the correct is Junueau '3'.");
        }


        System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?\n" +
                "\t1) yes\n" +
                "\t2) no");

        int result2 = generalin.nextInt();

        if (result2 == 2)
        {
            System.out.println("That's right!");
            counter++;
        }
        else if (result2 != 2)
        {
            System.out.println("Sorry, \"cat\" is a string. ints can only store numbers.");
        }

        System.out.println("Q3) What is the result of 9+6/3?\n" +
                "\t1) 5\n" +
                "\t2) 11\n" +
                "\t3) 15/3");

        int result3 = generalin.nextInt();

        if (result3 == 2)
        {
            System.out.println("That's right!");
            counter++;
        }
        else if (result3 != 2)
        {
            System.out.println("Your answer is wrong, the correct is eleven 11, option '2'.");
        }

        System.out.println(String.format("Overall, %s, you got %d out of 3 correct.\n" +
                "Thanks for playing!", name, counter));
    }
}