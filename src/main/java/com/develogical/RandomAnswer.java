package com.develogical;

/**
 * Created by IntelliJ IDEA.
 * User: eamire
 * Date: 1/19/12
 * Time: 3:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class RandomAnswer {
    
    public static String answerQuestion(String query) {
        if(query.equals("what currency did Spain use before the Euro")) {
            return "peseta";
        }

        if(query.equals("who played James Bond in the film Dr No")) {
            return "sean connery";
        }

        if(query.equals("what colour is a banana")) {
            return "yellow";
        }



        return "Unknown";
    }
}
