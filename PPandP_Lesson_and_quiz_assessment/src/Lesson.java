import java.util.Scanner;

public class Lesson {

    public String lessonText;
    public String currentFunc;

    /* lessonText is used to display the correct lesson and currentFunc
    * is used to ensure the user is asked if they want to do the correct quiz*/
    public Lesson(String lessonText, String currentFunc) {
        this.lessonText = lessonText;
        this.currentFunc = currentFunc;
    }

    /* The lesson text is provided in a String, so it can be printed to the console*/
    public static String lessonOne = "Lesson 1 - Mathematical Operators\n" +
            "***************************************\n" +
            "Java provides 5 operators to use in manipulating variables.\n" +
            "These Java arithmetic operators are:\n" +
            "\tAddition [+]\n" +
            "\tSubtraction [-]\n" +
            "\tMultiplication [*]\n" +
            "\tDivision [/]\n" +
            "\tModulo [%]\n" +
            "***************************************\n" +
            "The addition operator [+] adds together two values.\n" +
            "int sum1 = 5 + 6 //11\n" +
            "***************************************\n" +
            "The subtraction operator [-] subtracts one value from another.\n" +
            "int sum2 = 100 - 10 //90\n" +
            "***************************************\n" +
            "The multiplication operator [*] multiplies two values.\n" +
            "int sum3 = 100 * 2 //200\n" +
            "***************************************\n" +
            "The division operator [/] divides one value by another.\n" +
            "int sum4 = 100 / 5 //20\n" +
            "***************************************\n" +
            "The modulo operator [%] performs an integer division of one value\n" +
            "by another, and returns the remainder of thar division.\n" +
            "int sum5 = 23 % 6 //5\n";

    public static String lessonTwo = "Lesson 2 - Variable Types\n" +
            "***************************************\n" +
            "Variables are containers that store data for processing.\n" +
            "In Java, there are different types of variables used depending\n" +
            "on the data type stored, some examples:\n" +
            "***************************************\n" +
            "String - stores text such as \"Hello\" or \"Good Morning!\".\n" +
            "Text strings are enclosed within double quotes.\n" +
            "***************************************\n" +
            "int - stores integers (whole numbers) without decimals,\n" +
            "such as 123 or -456\n" +
            "***************************************\n" +
            "float - stores floating point numbers (with decimals),\n" +
            "such as 12.34 or -45.67\n" +
            "***************************************\n" +
            "char - stands for character and holds a single character,\n" +
            "such as 'a' or 'B'. Char values are enclosed within single quotes.\n" +
            "***************************************\n" +
            "boolean - stores values which can only be one of two\n" +
            "possible values: true or false. This data type is used\n" +
            "for simple flags that track true/false conditions.\n";

    /* The correct lesson is displayed depending on the lessonText assigned
    within the method call*/
    public static void displayLesson(String lessonText, String currentFunc){
        if (lessonText.equals("lessonOne")) {
            System.out.println(lessonOne);
        } else {
            System.out.println(lessonTwo);
        }
        nextStep(currentFunc);
    }

    /* nextStep asks whether the user wishes to take the quiz of the lesson
    they just view straight away. If the user enter yes, then the value of
    currentFunc determines which quiz method is run. User entering no send them
     back to the main menu. */

    public static void nextStep(String currentFunc) {
        System.out.println("Do you wish to take the quiz for " + currentFunc + "?\n"
                + "Press [1] for yes, or [0] for no");
        Scanner confirmName = new Scanner(System.in);
        if (confirmName.nextLine().equals("1")) {
            System.out.println("Running quiz for "+ currentFunc + "...");
            if (currentFunc == "lesson 1") {
                Main.quizOneCheck = "Done"; // progress variable changed when the quiz is run
                Quiz.takeQuiz(Quiz.quizOneQuestions);
                Quiz.saveScore(Quiz.newScore, 1);
            } else {
                Main.quizTwoCheck = "Done";
                Quiz.takeQuiz(Quiz.quizTwoQuestions);
                Quiz.saveScore(Quiz.newScore, 2);
            }
            Quiz.viewProgChoice();
        }
        return;
    }
}
