package Week1.ForLoops;

import sun.security.util.Length;

import java.util.Scanner;

public class CountingMachine {
    public static void main(String[] args) {
        Scanner generalin = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        String name = generalin.nextLine();
        System.out.print(String.format("Hi, %s,\n" +
                "I will count numbers.\n" +
                "Give me one number: ", name));
        int number = generalin.nextInt();
        System.out.println(String.format("Count to: %d", number));
        for(int number1 = 0; number1 <= number; number1++)
        {
            System.out.print(String.format(" %d ", number1));
        }
    }
}
