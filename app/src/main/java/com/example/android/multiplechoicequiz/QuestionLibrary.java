package com.example.android.multiplechoicequiz;

/**
 * Created by rosaperez on 3/23/18.
 */

public class QuestionLibrary {

    private String mQuestions[] = {
            "Which part of the plant holds it in the soil?",
            "This part of the plant observes energy from the sun.",
            "What part of the plant attracts bees, birds, butterflies?"
    };

    private String mChoices [][] = {
            {"Roots", "Stem", "Flower"},
            {"Fruit", "Leaves", "Seeds"},
            {"Bark", "Flower", "Roots"},
//            {"Flower", "Leaves", "Stem"}
    };

    private String mCorrectAnswers[] = {"Roots", "Leaves", "Flower", "Stem"};

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}



