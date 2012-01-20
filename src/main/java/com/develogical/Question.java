package com.develogical;

/**
 * Created by IntelliJ IDEA.
 * User: eamire
 * Date: 1/19/12
 * Time: 2:54 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Question {
    
    public boolean matchesQuestion(String query);
    public String answerQuestion(String query);
}
