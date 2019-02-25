package Week1.ForLoops;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 0;
        for (number = 1; number <= 100; number++)
        {
            String numberToPrint = "";
            if ((number%3) == 0 && (number%5 == 0))
            {
                numberToPrint = numberToPrint + "FizzBuzz";
            }
            else if ((number%3) == 0)
            {
                numberToPrint = numberToPrint + "Fizz";

            }
            else if ((number%5) == 0)
            {
                numberToPrint = numberToPrint + "Buzz";
            }
            else
                numberToPrint = Integer.toString(number);

            System.out.println(numberToPrint);
        }
    }
}