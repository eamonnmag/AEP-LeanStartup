package com.develogical;

/**
 * Created by IntelliJ IDEA.
 * User: eamire
 * Date: 1/19/12
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class NameQuestion implements Question{

    public boolean matchesQuestion(String query) {
        return query.equals("what is your name");
    }

    public String answerQuestion(String query) {
        return "Zinat & Eamonn";
    }
}
