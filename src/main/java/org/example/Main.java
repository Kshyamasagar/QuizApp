package org.example;

public class Main {
    public static void main(String[] args) {
        QuestionService questionService = new QuestionService();
        questionService.playQuiz();
        questionService.printScore();

//        System.out.println("Hello world!");
    }
}