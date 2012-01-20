package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: eamire
 * Date: 1/19/12
 * Time: 4:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Scrabble implements Question {
    public boolean matchesQuestion(String query) {
        return query.contains("scrabble");
    }

    public String answerQuestion(String query) {

        String[] parts = query.split(" ");

        String word = parts[parts.length - 1].trim();

        return String.valueOf(calculateScore(word));

    }

    private int calculateScore(String word) {
        int total = 0;
        for (char c : word.toCharArray()) {
            total += ScrabbleLetter.getScrabbleLetter(c);
        }

        return total;
    }

    enum ScrabbleLetter {
        A('a', 1), B('b', 3), C('c', 3), D('d', 2),
        E('e', 1), F('f', 5), G('g', 2), H('h', 4),
        I('i', 1), J('j', 8), K('k', 5), L('l', 1),
        M('m', 3), N('n', 1), O('o', 1), P('p', 3),
        Q('q', 10), R('r', 1), S('s', 1), T('t', 1),
        U('u', 1), V('v', 4), W('w', 4), X('x', 8),
        Y('y', 4), Z('z', 10);


        private char letter;
        private int score;

        ScrabbleLetter(char letter, int score) {
            this.letter = letter;
            this.score = score;
        }

        public static int getScrabbleLetter(char character) {
            for (ScrabbleLetter letter : values()) {
                if (letter.letter == character) {
                    return letter.score;
                }
            }
            return 0;
        }
    }
}
