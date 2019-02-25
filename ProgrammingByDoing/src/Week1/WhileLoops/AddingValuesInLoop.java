package Week1.WhileLoops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner generalin = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        String name = generalin.nextLine();
        System.out.print(String.format("Hi, %s,\n" +
                "I will add up the numbers you give me until you type 0.\n" +
                "Number: ", name));
        int counter = 0;

        while (true) {
            int number = generalin.nextInt();
            if (number != 0)
            {
                counter += number;
                System.out.print(String.format("The total so far is %d.\n" +
                        "Number: ", counter));
            }
            else if (number == 0) {
                System.out.println(String.format("The total is %d.\n" +
                        "Good Bye!!!", counter));
                break;
            }
        }
    }
}