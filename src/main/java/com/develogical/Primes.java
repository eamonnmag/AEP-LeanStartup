package com.develogical;

/**
 * Created by IntelliJ IDEA.
 * User: eamire
 * Date: 1/19/12
 * Time: 3:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Primes implements Question{
    public boolean matchesQuestion(String query) {
        return query.contains("primes");
    }

    public String answerQuestion(String query) {
        String[] parts = query.split(":");

        String[] numbers = parts[1].split(",");

        StringBuilder values = new StringBuilder("");
        for(String number :numbers) {
            int value = Integer.valueOf(number.trim());
            if(isPrime(value)) {
                System.out.println("We have a prime: " + value);
                if(!values.toString().isEmpty()) {
                    values.append(", ");
                }
                values.append(value);

            }
        }

        return values.toString();
    }

    public boolean isPrime(int n) {
        for(int i=2;2*i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
