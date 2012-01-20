package com.develogical;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: eamire
 * Date: 1/19/12
 * Time: 2:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class Questions {
    
    static List<Question> questions = new ArrayList<Question>();

    static {
        questions.add(new NameQuestion());
        questions.add(new AdditionQuestion());
        questions.add(new LargestNumberQuestion());
        questions.add(new SquareAndCube());
        questions.add(new Multiply());
        questions.add(new Primes());
        questions.add(new Subtract());
        questions.add(new Fibonacci());
        questions.add(new Power());
        questions.add(new Anagram());
        questions.add(new Scrabble());
    }
    
    public List<Question> getQuestions() {
        return questions;
    }
}
