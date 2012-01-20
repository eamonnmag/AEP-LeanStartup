package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: eamire
 * Date: 1/19/12
 * Time: 3:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Multiply implements Question{
    public boolean matchesQuestion(String query) {


        return query.contains("multiplied");
    }

    public String answerQuestion(String query) {
        String regex = "what is (\\d+) multiplied by (\\d+)";

        Matcher matcher = Pattern.compile(regex).matcher(query);

        if (matcher.matches()) {
            int int1 =  Integer.valueOf(matcher.group(1));
            System.out.println(int1);
            int int2 =  Integer.valueOf(matcher.group(2));
            System.out.println(int2);
            return String.valueOf(int1 * int2);
        } else {
            System.out.println("Matcher didn't match");
        }

        return "Unknown";
    }
}
