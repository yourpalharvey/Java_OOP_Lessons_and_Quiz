import java.util.Scanner;

public class Quiz {

    /* questionPrompt is used to display the question and multiple choice answers to the user.
    answer is an assigned value that user's input is compared with to determine if they are correct */
    public String questionPrompt;
    public String answer;
    public static int quizScore;
    public static int quizLength;

    /* String variables to save the scores from the quizzes */
    public static String newScore;
    public static String finalScore1;
    public static String finalScore2;


    public Quiz(String questionPrompt, String answer, int quizScore, int quizLength) {
        this.questionPrompt = questionPrompt;
        this.answer = answer;
        this.quizScore = quizScore;
        this.quizLength = quizLength;
    }

    /* String variables are assigned for each question and the list of answers*/
    private static String quizOneQ1 = "Q1 - Whats the correct value returned?\n" +
            "int x = 3; int y = 4\n" +
            "return x + y;\n" +
            "[1] 3\n[2] 7\n[3] 4\n[4] 1";
    private static String quizOneQ2 = "Q2 - Whats the correct value returned?\n" +
            "int x = 2; int y = 7\n" +
            "return x - y\n" +
            "[1] 5\n[2] 9\n[3] -5\n[4] -2";
    private static String quizOneQ3 = "Q3 - Whats the correct value returned?\n" +
            "int x = 6; int y = 3\n" +
            "return x * y\n" +
            "[1] 18\n[2] 9\n[3] 24\n[4] 3";
    private static String quizOneQ4 = "Q4 - Whats the correct value returned?\n" +
            "int x = 14; int y = 7\n" +
            "return x / y\n" +
            "[1] 6\n[2] 7\n[3] 2\n[4] 21";
    private static String quizOneQ5 = "Q5 - Whats the correct value returned?\n" +
            "int x = 8; int y = 5\n" +
            "return x % y\n" +
            "[1] 6\n[2] 13\n[3] 1.6\n[4] 3";

    private static String quizTwoQ1 = "Q1 - Which variable type would you use for a city name (Cardiff)?\n"
            + "[1] String\n[2] int\n[3] float\n[4] boolean";
    private static String quizTwoQ2 = "Q2 - Which variable type would use for the price of an item (12.99)?\n" +
            "[1] String\n[2] int\n[3] float\n[4] boolean";
    private static String quizTwoQ3 = "Q3 - Which variable type would use for someone's age (42)?\n" +
            "[1] String\n[2] int\n[3] float\n[4] boolean";
    private static String quizTwoQ4 = "Q4 - Which variable type would use to flag something as true (gameOver = true)?\n" +
            "[1] String\n[2] int\n[3] float\n[4] boolean";
    private static String quizTwoQ5 = "Q5 - Which variable type would use for a Postcode (CF11 1AB)?\n" +
            "[1] String\n[2] int\n[3] float\n[4] boolean";

    /* An array is created for each quiz that lists the question prompt and the
    assigned answer of said question as wells as sets the score and length variables */
    public static Quiz[] quizOneQuestions = {
            new Quiz(quizOneQ1, "2",0,0),
            new Quiz(quizOneQ2, "3",0,0),
            new Quiz(quizOneQ3, "1",0,0),
            new Quiz(quizOneQ4, "3",0,0),
            new Quiz(quizOneQ5, "4",0,0)
    };

    public static Quiz[] quizTwoQuestions = {
            new Quiz(quizTwoQ1, "1",0,0),
            new Quiz(quizTwoQ2, "3",0,0),
            new Quiz(quizTwoQ3, "2",0,0),
            new Quiz(quizTwoQ4, "4",0,0),
            new Quiz(quizTwoQ5, "1",0,0)
    };

    /* takeQuiz cycles through the Quiz array and displays the question prompt and
    compares the user's answer to the answer allocated to the question ask.
    If the user is correct the score variable is increases, if not then the
    next question is displayed and the score remains at its current value.
    Once the for loop is finished the user's final score is displayed */
    public static void takeQuiz(Quiz[] questions) {
        quizScore = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println("-------------------------------");
            System.out.println(questions[i].questionPrompt);
            String userAnswer = input.nextLine();
            if (userAnswer.equals(questions[i].answer)){
                quizScore++;
            }
        }
        quizLength = questions.length;
        System.out.println("You got " + quizScore + "/" + quizLength);
        scoreString(quizScore, quizLength);
    }

    /* Saves the score to a string then determines which quiz the score is associated with */
    public static String scoreString(int quizScore, int quizLength) {
        String newScore = quizScore + "/" + quizLength;
        return newScore;
    }

    public static String saveScore(String scoreString, int quizNum) {
        if (quizNum == 1) {
            return finalScore1 = quizScore + "/" + quizLength;
        } else {
            return finalScore2 = quizScore + "/" + quizLength;
        }
    }

    /* The viewProgChoice is run after the user has finished a quiz.
    This method simply ask the user if they want to see their progress
    across the whole program */
    public static void viewProgChoice() {
        System.out.println("Do you wish to view your current progress?\n" +
                "Press [1] for yes, or [0] for no");
        Scanner confirmName = new Scanner(System.in);
        if (confirmName.nextLine().equals("1")) {
            Progress.viewProgress();
        }
        return;
    }
}
