package org.example;
import java.util.Scanner;

public class Question {

    private String question;
    private String userAnswer;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    //Methods
    public void runQuestion(){
       Scanner in = new Scanner(System.in);
        System.out.println(question);
        userAnswer = in.nextLine();
        giveFeedback();
    }

    public void giveFeedback(){
        if (userAnswer.equals(answer)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! You answered: " + userAnswer + ". The correct answer is " + answer );
        }
    }

}
