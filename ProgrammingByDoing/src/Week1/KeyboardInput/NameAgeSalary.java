package Week1.KeyboardInput;
import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        /**
         * Scanner in = new Scanner(System.in);
         * String line = in.nextLine(); // user input
         */

//-----------------------------------------------------------------------------------------------
        //name
        System.out.println("Hello. What is your name?");
        Scanner namein = new Scanner(System.in);
        String name = namein.nextLine(); // user input
        System.out.println(String.format("Hi, %s!  How old are you?", name));

        //age
        Scanner agein = new Scanner(System.in);
        int age = agein.nextInt(); // user input
        System.out.println(String.format("So you're %d, eh?  That's not old at all!\n" +
                                        "How much do you make, %s?", age, name));

        //make
        Scanner makein = new Scanner(System.in);
        double make = makein.nextDouble(); // user input
        System.out.println(String.format("%.1f!  I hope that's per hour and not per year! LOL!", make));
    }
}
