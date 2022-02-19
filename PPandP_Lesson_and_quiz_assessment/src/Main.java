import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    /* String variables assigned before any program item
     has been chosen. Used for progress check */
    public static String lessonOneCheck = "";
    public static String lessonTwoCheck = "";
    public static String quizOneCheck = "";
    public static String quizTwoCheck = "";

    /* String for program item titles*/
    public static String lessonOneTitle = "Lesson 1 - Mathematical Operators";
    public static String lessonTwoTitle = "Lesson 2 - Variable Types";
    public static String quizOneTitle = "Quiz 1 - Mathematical Operators Quiz";
    public static String quizTwoTitle = "Quiz 2 - Variable Type Quiz";

    private static final String invalidInput = "Invalid Selection: Please enter the menu item you want to run.";

    public static void main(String[] args) {

        System.out.println("***************************************\n" +
                "Welcome to the java lessons and quiz!\n" +
                "***************************************\n" +
                "\n" + "Before we begin, please enter your name");


        /* Obtain full name from two user entered strings */
        while (true) {
            EnterName.setFullName(EnterName.setFirstName(), EnterName.setLastName());
            System.out.println("Confirm that your name is " + EnterName.fullName + "?\n" +
                    "Press [1] to confirm, or [0] to re-enter your name.");
            Scanner confirmName = new Scanner(System.in);
            if (confirmName.nextLine().equals("1")) {
                break;
            }
        }
        System.out.println("You name has be confirmed as " + EnterName.fullName + ".\n");

        runMenu();
        System.out.println("Thank you for using the java lessons and quiz program!");
    }

    private static void runMenu(){
        try {
            switchMenu();
        } catch (InputMismatchException e) {
            System.out.println(invalidInput);
            runMenu();
        }
    }

    /* Switch Statement for menu functionality.
        Each option run the corresponding method */
    private static void switchMenu() {
        Scanner input = new Scanner(System.in);
        int choice;
        printMenu();
        choice = input.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    lessonOneCheck = "Done"; // Change the string variables for progress check
                    Lesson.displayLesson("lessonOne", "lesson 1");
                    break;
                case 2:
                    lessonTwoCheck = "Done";
                    Lesson.displayLesson("lessonTwo", "lesson 2");
                    break;
                case 3:
                    quizOneCheck = "Done";
                    Quiz.takeQuiz(Quiz.quizOneQuestions); // Runs quiz
                    Quiz.saveScore(Quiz.newScore, 1); // Saves score
                    Quiz.viewProgChoice(); // Asks to check progress
                    break;
                case 4:
                    quizTwoCheck = "Done";
                    Quiz.takeQuiz(Quiz.quizTwoQuestions);
                    Quiz.saveScore(Quiz.newScore, 2);
                    Quiz.viewProgChoice();
                    break;
                case 5:
                    Progress.viewProgress();
                    break;
                default:
                    System.out.println(invalidInput);
                    break;
            }
            printMenu();
            choice = input.nextInt();
        }
    }

    private static void printMenu() {
        System.out.println("***************************************\n"
                + "Please select from one of the following options:\n"
                + "\t[1] " + lessonOneTitle + "\n"
                + "\t[2] " + lessonTwoTitle + "\n"
                + "\t[3] " + quizOneTitle + "\n"
                + "\t[4] " + quizTwoTitle + "\n"
                + "\t[5] Check Progress\n"
                + "\t[0] Quit Program\n"
                + "***************************************");
    }
}
