package Week1.IfStatements;

import java.util.Scanner;

import java.util.GregorianCalendar;

public class WeekdayName
{
    public static String weekday_name( int weekday )
    {
        String result = "";

        if ( weekday == 1 )
        {
            result = "Sunday";
        }
        else if ( weekday == 2 )
        {
            result = "Monday";
        }
        else if ( weekday == 3)
        {
            result = "Tuesday";
        }
        else if ( weekday == 4)
        {
            result = "Wednesday";
        }
        else if ( weekday == 5)
        {
            result = "Thursday";
        }
        else if ( weekday == 6)
        {
            result = "Friday";
        }
        else if ( weekday == 7)
        {
            result = "Saturday";
        }
        else if ( weekday == 0)
        {
            result = "Saturday";
        }
        else if ( weekday != 0 && weekday != 1 && weekday != 2 && weekday != 3 && weekday != 4 && weekday != 5 && weekday != 6 && weekday != 7)
        {
            result = "error";
        }




        return result;
    }


    public static void main( String[] args )
    {
        System.out.println( "Weekday 1: " + weekday_name(1) );
        System.out.println( "Weekday 2: " + weekday_name(2) );
        System.out.println( "Weekday 3: " + weekday_name(3) );
        System.out.println( "Weekday 4: " + weekday_name(4) );
        System.out.println( "Weekday 5: " + weekday_name(5) );
        System.out.println( "Weekday 6: " + weekday_name(6) );
        System.out.println( "Weekday 7: " + weekday_name(7) );
        System.out.println( "Weekday 0: " + weekday_name(0) );
        System.out.println();
        System.out.println( "Weekday 43: " + weekday_name(43) );
        System.out.println( "Weekday 17: " + weekday_name(17) );
        System.out.println( "Weekday -1: " + weekday_name(-1) );

        GregorianCalendar cal = new GregorianCalendar();
        int dow = cal.get(GregorianCalendar.DAY_OF_WEEK);

        System.out.println( "\nToday is a " + weekday_name(dow) + "!" );
    }

}
















    /*public static void main(String[] args) {
        System.out.println("First Name: ");
        Scanner firstNamein = new Scanner(System.in);
        String firstName = firstNamein.nextLine(); // user input

        System.out.println("Second Name: ");
        Scanner secondNamein = new Scanner(System.in);
        String secondName = secondNamein.nextLine(); // user input

        System.out.println("Grade (9-12): ");
        Scanner gradein = new Scanner(System.in);
        int grade = 0;
        while (true) {
            grade = gradein.nextInt();
            if (grade >= 9 && grade <= 12) {
                break;
            }
            System.out.println("Try again, Grade need to be between (9-12): ");
        }

        System.out.println("Student ID: ");
        Scanner idin = new Scanner(System.in);
        int id = idin.nextInt(); // user input

        System.out.println("Login: ");
        Scanner loginin = new Scanner(System.in);
        String login = loginin.nextLine(); // user input

        System.out.println("GPA (0.0-4.0): ");
        Scanner gpain = new Scanner(System.in);
        double gpa = 0;
        while (true) {
            gpa = gpain.nextDouble();
            if (gpa > 0.0 && gpa <= 4.0) {
                break;
            }
            System.out.println("Try again, GPA need to be between (0.0-4.0): ");
        }
    }
}*/