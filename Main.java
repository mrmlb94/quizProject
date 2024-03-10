package quizProject;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        System.out.println("Hello, Welcome to my Quiz!");
        System.out.println();

        QuestionService service = new QuestionService();

        System.out.println("Let's start the quiz!");
        service.playQuiz();

        System.out.println("Quiz completed. Here are your results:");
        service.printScore();
    }
}
