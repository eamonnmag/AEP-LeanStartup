package com.develogical;

/**
 * Created by IntelliJ IDEA.
 * User: eamire
 * Date: 1/19/12
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class LargestNumberQuestion implements Question{
    public boolean matchesQuestion(String query) {
        return query.contains("largest");  //To change body of implemented methods use File | Settings | File Templates.
    }

    public String answerQuestion(String query) {
        // which of the following numbers is the largest: 15, 711, 82, 47
        String regex = "which of the following numbers is the largest: (\\d+)";
        String[] parts = query.split(":");
        
        String[] numbers = parts[1].split(",");
        
        int largestNumber = Integer.MIN_VALUE;
        for(String number :numbers) {
            int value = Integer.valueOf(number.trim());
            if(value > largestNumber) {
                largestNumber = value;
            }
        }
        
        return String.valueOf(largestNumber);
    }
}
