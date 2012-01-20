package com.develogical;

import static junit.framework.Assert.assertEquals;

public class WebServerTest {
    private WebServer server = new WebServer();

    /**
     * Ensure that a 'bad' request gets "Unknown" as a response.
     */
    @org.junit.Test
    public void testProcessUnknown() throws Exception {
        assertEquals("Unknown", server.process("b7b01ad0: What is my favourite colour?"));
    }

    @org.junit.Test
    public void testProcessName() throws Exception {
        assertEquals("Zinat & Eamonn", server.process("b7b01ad0: what is your name"));
    }

    @org.junit.Test
    public void testAddition() throws Exception {
        assertEquals("5", server.process("b7b01ad0: what is 3 plus 2"));
    }

    @org.junit.Test
    public void testLargest() throws Exception {
        assertEquals("711", server.process("b7b01ad0: which of the following numbers is the largest: 15, 711, 82, 47"));
    }


    @org.junit.Test
    public void testSquareAndCube() throws Exception {
        assertEquals("531441", server.process("b7b01ad0: which of the following numbers is both a square and a cube: 1024, 1369, 118, 616"));
    }

    @org.junit.Test
    public void testMultiply() throws Exception {
        assertEquals("56", server.process("b7b01ad0: what is 14 multiplied by 4"));
    }

    @org.junit.Test
    public void testPrime() throws Exception {
        assertEquals("251", server.process("b7b01ad0: which of the following numbers are primes: 251, 632"));
        assertEquals("191, 541, 2", server.process("b7b01ad0: which of the following numbers are primes: 117, 191, 541, 2"));

    }

    @org.junit.Test
    public void testSubtract() throws Exception {
        assertEquals("10", server.process("b7b01ad0: what is 14 minus 4"));
    }

    @org.junit.Test
    public void testFibonacci() throws Exception {
        assertEquals("17711", server.process("b7b01ad0: what is the 22th number in the Fibonacci sequence"));
    }

    //what is 4 to the power of 15
    @org.junit.Test
    public void testPower() throws Exception {
        assertEquals("25", server.process("b7b01ad0: what is 13 to the power of 17"));
    }

    // what is 0 plus 4 plus 13
    @org.junit.Test
    public void testMultiPlus() throws Exception {
        assertEquals("17", server.process("b7b01ad0: what is 0 plus 4 plus 13"));
        assertEquals("2", server.process("b7b01ad0: what is 2 plus 15 multiplied by 0"));
        assertEquals("194", server.process("b7b01ad0: what is 15 multiplied by 12 plus 14"));
    }



    @org.junit.Test
    public void testAnagram() throws Exception {
        assertEquals("inlets", server.process("b7b01ad0: which of the following is an anagram of \"listen\": banana, google, enlists, inlets"));
    }

    @org.junit.Test
    public void testScrabble() throws Exception {
        assertEquals("8", server.process("b7b01ad0: what is the english scrabble score of cloud"));
    }
}
