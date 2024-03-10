package quizProject;

import java.util.Scanner;

public class QuestionService {

	
	
	Question[] questions = new Question[5];
	String selection[] = new String[5];
	
	public QuestionService()
	{
		questions[0] = new Question(1, "What is the capital of France?", "Paris", "Berlin", "Rome", "Madrid", "Paris");
		questions[1] = new Question(2, "Which planet is known as the Red Planet?", "Earth", "Mars", "Jupiter", "Saturn", "Mars");
		questions[2] = new Question(3, "What is the largest mammal on Earth?", "Elephant", "Giraffe", "Blue Whale", "Lion", "Blue Whale");
		questions[3] = new Question(4, "In which year did World War II end?", "1943", "1945", "1950", "1939", "1945");
		questions[4] = new Question(5, "Who wrote the play 'Romeo and Juliet'?", "Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain", "William Shakespeare");

		
	}
	
	public void playQuiz() {
		int i = 0;
	    for (Question question : questions) {
	    	
	        System.out.println("Question Number " + question.getId() + " :");
	        System.out.println(question.getQuestion());
	        System.out.println("1) " + question.getOpt1());
	        System.out.println("2) " + question.getOpt2());
	        System.out.println("3) " + question.getOpt3());
	        System.out.println("4) " + question.getOpt4());

	        Scanner sc = new Scanner (System.in);
	        selection[i] = sc.nextLine();
	        System.out.println("_________________________________");

	        i++;
	    }
	    
	    
	    for (String s : selection) {
	    	System.out.println("You choosed: " + s);
	        System.out.println("_________________________________");
	        }
	    }
	    
	    public void printScore()
	    {
	    	int score = 0;
	    	
	    	for(int i=0 ; i<questions.length ; i++) 
	    	{
		    	Question que = questions[i]; 
		    	String Actualanswer = que.getAnswer();
		    	String userAnswer = selection[i];
		    	if (Actualanswer.equals(userAnswer)) {score++;}
		    }
		    System.out.println("  Your Score is : " + score + " !!!");
	    }
	    
	}


