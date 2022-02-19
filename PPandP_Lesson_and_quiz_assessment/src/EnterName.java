import java.util.Scanner;

public class EnterName {

    public static String fullName;
    private static String firstName;
    private static String lastName;

    public EnterName(String firstName, String lastName, String fullName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
    }

    public static String setFirstName() {
        System.out.println("Enter your first name:");
        Scanner firstInput = new Scanner(System.in);
        return firstName = firstInput.nextLine();
    }

    public static String setLastName() {
        System.out.println("Enter your last name:");
        Scanner lastInput = new Scanner(System.in);
        return lastName = lastInput.nextLine();
    }

    public static String setFullName(String firstName, String lastName) {
        return fullName = firstName +" "+ lastName;
    }
}