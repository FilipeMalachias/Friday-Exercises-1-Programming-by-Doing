package Week1.KeyboardInput;

import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
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


//----------------------------------------------------------------------------------------------------------------------
        //print Information
        System.out.println(String.format("Your information:\n" +
                                        "       Login:  %s\n" +
                                        "       ID:     %d\n" +
                                        "       Name:   %s, %s\n" +
                                        "       GPA:    %.1f\n" +
                                        "       Grade:  %d\n", login, id, secondName, firstName, gpa, grade));
    }
}
