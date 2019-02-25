package Week1.WhileLoops;

import java.util.Random;

public class DiceDoubles {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("HERE COMES THE DICE!\n");

        while (true) {
            int number1 = rand.nextInt(6);
            number1++;
            int number2 = rand.nextInt(6);
            number2++;
            int number3 = number1 + number2;

            if (number1 == number2) {
                System.out.println(String.format("Roll #1: %d\n" +
                                                "Roll #2: %d\n" +
                                                "The total is %d!", number1, number2, number3));
                System.out.println("+_+ * Doubles * +_+");
                break;
            } else if (number1 != number2)
            {
                System.out.println(String.format("Roll #1: %d\n" +
                                                "Roll #2: %d\n" +
                                                "The total is %d!", number1, number2, number3));
            }
        }
    }
}
