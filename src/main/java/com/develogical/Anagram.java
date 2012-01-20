package com.develogical;


public class Anagram implements Question {


    public boolean matchesQuestion(String query) {
        return query.contains("anagram");
    }

    public String answerQuestion(String query) {
        //which of the following is an anagram of "listen": banana, google, enlists, inlets
        String[] parts = query.split(":");

        String[] lookingForSplit = parts[0].split("\"");

        String lookingForValue = lookingForSplit[1];

        String[] values = parts[1].split(",");

        for (String value : values) {
            if (anagram(lookingForValue, value.trim())) {
                return value.trim();
            }
        }

        return "";
    }

    public static boolean anagram(String stringA, String stringB) {
        // from a site, can't remember which one though
        if (stringA.length() != stringB.length()) return false;
        int[] alphanum = new int[256];
        int chars = 0; //no of unique characters
        int num_completed_b = 0;
        char[] a_array = stringA.toCharArray();
        for (char c : a_array) { // count number of each char in a.
            if (alphanum[c] == 0) ++chars;
            ++alphanum[c];
        }

        for (int i = 0; i < stringB.length(); ++i) {
            int c = (int) stringB.charAt(i);
            if (alphanum[c] == 0) { // if you find more of char c in b than in a return false.
                return false;
            }
            --alphanum[c];
            if (alphanum[c] == 0) {
                ++num_completed_b;
                if (num_completed_b == chars) {
                    // it’s a match if b has been processed completely
                    return i == stringB.length() - 1;
                }
            }
        }

        return false;

    }

}
