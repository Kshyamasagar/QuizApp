package org.example;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new Question(1,"What1","C++","Java","Python","DotNet","Java");
        questions[1] = new Question(2,"What2","C++","Java","Python","DotNet","C++");
        questions[2] = new Question(3,"What3","C++","Java","Python","DotNet","DotNet");
        questions[3] = new Question(4,"What4","C++","Java","Python","DotNet","Python");
        questions[4] = new Question(5,"What5","C++","HTML","Python","DotNet","HTML");
    }

    public void playQuiz(){
//        System.out.println("Questions are.....");
        int i=0;
        for(Question q : questions){
            System.out.println("Question no :" + q.getId() + ". "+ q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
             selection[i] = sc.nextLine();
             i++;

        }
        for(String s : selection){

            System.out.println(s);
        }

    }

    public void printScore(){
        int score=0;
        for(int i=0;i<questions.length;i++){
            Question q = questions[i];
            String actualAnswer = q.getAnswer();
            String userAnswer = selection[i];


            if(userAnswer.equals(actualAnswer)){
                score++;
            }
        }

        System.out.println("Your Score is: " + score);
    }



}
