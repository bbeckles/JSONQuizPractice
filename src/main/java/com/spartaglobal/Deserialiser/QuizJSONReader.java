package com.spartaglobal.Deserialiser;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class QuizJSONReader {
    private JSONObject  quizJSONDetails;
    public QuizJSONReader(String fileName) {
        try {

            // simple file reader object
            FileReader quizJson = new FileReader(fileName);
            // Deserialising string to object
            JSONParser jsonParser = new JSONParser();
            Object quizObject = jsonParser.parse(quizJson);

            // JSON simple needs a cast from object to the JSON simple object of JSONObject
            quizJSONDetails = (JSONObject) quizObject;

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

    }
    public JSONObject getQuizJSONDetails(){
        return quizJSONDetails;
    }
}