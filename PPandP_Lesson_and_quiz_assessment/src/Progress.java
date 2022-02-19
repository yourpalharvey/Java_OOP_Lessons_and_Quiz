import java.util.Scanner;

public class Progress {

    /* String to display check-box of if the user has done a program item*/
    private static String notSeen = "[ ]: ";
    private static String seen = "[X]: ";


    public static void checkStatus(String check, String title) {
        if (check.equals("")) {
            System.out.println(notSeen + title);
        } else {
            System.out.println(seen + title);
        }
    }

    public static void checkStatus(String check, String title, String finalScore) {
        if (check.equals("")) {
            System.out.println(notSeen + title);
        } else {
            System.out.println(seen + title + " - Quiz score: "+finalScore);
        }
    }

    /* Displays the users progress with the checkStatus method that checks if the checking Strings
    assigned at the start of Main are still "" or have been changed. If they have been changed
    it means that the item has be viewed by the user and there for can be given the seen check-box. */
    public static void viewProgress() {
        while (true) {
            System.out.println("Displaying "+ EnterName.fullName + "'s current progress:");
            checkStatus(Main.lessonOneCheck, Main.lessonOneTitle);
            checkStatus(Main.lessonTwoCheck, Main.lessonTwoTitle);
            checkStatus(Main.quizOneCheck, Main.quizOneTitle, Quiz.finalScore1);
            checkStatus(Main.quizTwoCheck, Main.quizTwoTitle, Quiz.finalScore2);
            System.out.println("Type [1] to go back to the menu.");
            Scanner confirmName = new Scanner(System.in);
            if (confirmName.nextLine().equals("1")) {
                break;
            }
        }
    }
}
