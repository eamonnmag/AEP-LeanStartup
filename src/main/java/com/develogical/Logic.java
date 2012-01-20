package com.develogical;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: eamire
 * Date: 1/19/12
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Logic {

    public static String understandQuestion(String query) {    
        // calculations
        String myQuery = getQuestion(query);
        for(Question question : Questions.questions) {
            if(question.matchesQuestion(myQuery)) {
                return question.answerQuestion(myQuery);
            }
        }
        return "Unknown";
    }

    public static String getQuestion(String query) {
        String[] parts = query.split(":");
        
        if(parts.length > 2) {
            return parts[1].trim() + ":" + parts[2].trim();
        }
        
        return parts[1].trim();
    }
}
