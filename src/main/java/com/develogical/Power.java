package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: eamire
 * Date: 1/19/12
 * Time: 4:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Power implements Question{
    public boolean matchesQuestion(String query) {
        return query.contains("power");
    }

    public String answerQuestion(String query) {
        String regex = "what is (\\d+) to the power of (\\d+)";

        Matcher matcher = Pattern.compile(regex).matcher(query);

        if (matcher.matches()) {
            double int1 =  Double.valueOf(matcher.group(1));
            
            double int2 =  Double.valueOf(matcher.group(2));
            double value = Math.pow(int1, int2);
            return String.valueOf((int)value);
        } else {
            System.out.println("Matcher didn't match");
        }

        return "Unknown";
    }

}
