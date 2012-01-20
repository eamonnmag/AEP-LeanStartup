package com.develogical;

/**
 * Created by IntelliJ IDEA.
 * User: eamire
 * Date: 1/19/12
 * Time: 3:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class SquareAndCube implements Question{
    public boolean matchesQuestion(String query) {
        return query.contains("cube") && query.contains("square");
    }

    public String answerQuestion(String query) {
        // which of the following numbers is the largest: 15, 711, 82, 47
        String[] parts = query.split(":");

        String[] numbers = parts[1].split(",");

        for(String number :numbers) {
            int value = Integer.valueOf(number.trim());
            
            double val1 = Math.sqrt(value);
            double val2 = Math.cbrt(value);

            System.out.println("Square = " + Math.floor(val1) + " : " + val1);
            System.out.println("Cube root = " + Math.floor(val2) + " : " + val2);

            if(Math.floor(val1) == val1 && Math.floor(val2) == val2) {
                return String.valueOf(value);
            }

        }

        return "";
    }

    public static void main(String[] args) {
        SquareAndCube test = new SquareAndCube();

        String result = test.answerQuestion("which of the following numbers is both a square and a cube: 601, 16, 625, 788");

        System.out.println(result);
    }
}
