import java.util.Scanner;

public class FullNameParser {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter your full name.");
        String userInputName = read.nextLine().trim();

        String[] name = userInputName.split(" ");

        String firstName = name[0];
        String middleName;
        String lastName;

        if (name.length == 3) {
            middleName = name[1];
            lastName = name[2];
        }
        else {
            middleName = "(none)";
            lastName = name[1];
        }

        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        read.close();
    }

}
