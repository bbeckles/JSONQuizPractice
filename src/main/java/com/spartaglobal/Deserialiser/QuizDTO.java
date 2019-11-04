package com.spartaglobal.Deserialiser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuizDTO {
    private JSONObject quiz;

    private JSONObject quizQ;
    private  JSONObject SportQ;
    private JSONObject MathQ;
    private JSONObject MathQ2;
    private JSONObject sportCat;
    private JSONObject mathsCat;



    public QuizDTO(String filename){
        QuizJSONReader quizFileReader = new QuizJSONReader(filename);
        quiz = quizFileReader.getQuizJSONDetails();
    }

    public Map<String,JSONObject> quizCategories(){
        Map<String,JSONObject> quizCategories = new HashMap<>();

        for(Object keyName:quiz.keySet()){
            quizCategories.put((String) keyName, (JSONObject) quiz.get(keyName));
        }
        return  quizCategories;
    }

    public String getSportQuizQuestion(){
         quizQ = (JSONObject) quiz.get("quiz");
         sportCat = (JSONObject) quizQ.get("sport");
         SportQ = (JSONObject) sportCat.get("q1");

        return (String) SportQ.get("question");
    }

    public String getMathQuizQuestion(){
         quizQ = (JSONObject) quiz.get("quiz");
         mathsCat = (JSONObject) quizQ.get("maths");
          MathQ = (JSONObject) mathsCat.get("q1");


        return (String) MathQ.get("question" );
    }

    public JSONObject getMathQuizQuestion2(String questionName){

        return (JSONObject) quizCategories().get("maths").get(questionName);
    }

//   public JSONArray getSportQuestions(){
//
//      return (JSONArray) SportQ.get("options");
//   }
}
