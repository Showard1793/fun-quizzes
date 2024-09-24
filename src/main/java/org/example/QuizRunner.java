package org.example;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class QuizRunner {
    public static void main(String[] args) {
        Question testQuestion = new Question("What color is the sky?","blue");
        testQuestion.runQuestion();

        ArrayList<String> multipleChoiceAnswers = new ArrayList<>(){ {Collections.addAll(this, "blue","green","purple","red");}

        };

        MultipleChoice testMultipleChoice = new MultipleChoice("What color is the sky?","blue",multipleChoiceAnswers);

    }
}

