package com.spartaglobal.JSONQuizPractice;

import com.spartaglobal.Deserialiser.QuizDTO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        QuizDTO quizDTO = new QuizDTO("Resources/quiz.json");
        System.out.println(quizDTO.getMathQuizQuestion());
        System.out.println(quizDTO.getMathQuizQuestion2("q1"));


    }
}
