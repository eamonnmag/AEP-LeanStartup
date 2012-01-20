package com.develogical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fibonacci implements Question {

    public boolean matchesQuestion(String query) {
        return query.contains("Fibonacci");
    }

    public String answerQuestion(String query) {

        String regex =  "what is the (\\d+)th number in the Fibonacci sequence";

        Matcher matcher = Pattern.compile(regex).matcher(query);

        if (matcher.matches()) {
            int int1 =  Integer.valueOf(matcher.group(1));
            int value = fib(int1);
            return String.valueOf(value);
        } else {
            System.out.println("Matcher didn't match");
        }

        return "Unknown";
    }

    public static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

}
