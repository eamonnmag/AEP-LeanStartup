package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: eamire
 * Date: 1/19/12
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class AdditionQuestion implements Question {
    public boolean matchesQuestion(String query) {


        return query.contains("plus");
    }

    public String answerQuestion(String query) {
        String regex = "what is (\\d+) plus (\\d+)";

        String regex2 = "what is (\\d+) plus (\\d+) plus (\\d+)";

        String regex3 = "what is (\\d+) plus (\\d+) multiplied by (\\d+)";

        String regex4 = "what is (\\d+) multiplied by (\\d+) plus (\\d+)";
        // what is 0 plus 4 plus 13

        Matcher matcher = Pattern.compile(regex).matcher(query);

        if (matcher.matches()) {
            int int1 = Integer.valueOf(matcher.group(1));
            System.out.println(int1);
            int int2 = Integer.valueOf(matcher.group(2));
            System.out.println(int2);
            return String.valueOf(int1 + int2);
        }
        Matcher matcher2 = Pattern.compile(regex2).matcher(query);
        if (matcher2.matches()) {
            int int1 = Integer.valueOf(matcher2.group(1));
            System.out.println(int1);
            int int2 = Integer.valueOf(matcher2.group(2));
            System.out.println(int2);
            int int3 = Integer.valueOf(matcher2.group(3));
            System.out.println(int3);
            return String.valueOf(int1 + int2 + int3);
        }

        Matcher matcher3 = Pattern.compile(regex3).matcher(query);
        if (matcher3.matches()) {
            int int1 = Integer.valueOf(matcher3.group(1));
            System.out.println(int1);
            int int2 = Integer.valueOf(matcher3.group(2));
            System.out.println(int2);
            int int3 = Integer.valueOf(matcher3.group(3));
            System.out.println(int3);
            return String.valueOf(int1 + int2 * int3);
        }

        Matcher matcher4 = Pattern.compile(regex4).matcher(query);
        if (matcher4.matches()) {
            int int1 = Integer.valueOf(matcher4.group(1));
            System.out.println(int1);
            int int2 = Integer.valueOf(matcher4.group(2));
            System.out.println(int2);
            int int3 = Integer.valueOf(matcher4.group(3));
            System.out.println(int3);
            return String.valueOf(int1 * int2 + int3);
        }

        return "Unknown";
    }
}
