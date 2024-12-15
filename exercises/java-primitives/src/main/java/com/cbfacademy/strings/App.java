package com.cbfacademy.strings;

//import org.xml.sax.SAXNotRecognizedException;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        // Concatenates the input parameters and returns the result
        String newWords =  "word1" + "word2" + "word3";
        //throw new RuntimeException("Not implemented");
                return newWords;
    }

    public static Boolean areEqual(String word1, String word2) {
        // Write code to determine whether the input parameters are equal strings
        String b1 = "word1";
        String b2 = "word2";
        return b1.equals(b2);
       // throw new RuntimeException("Not implemented");
    }

    public static String format(String item, int quantity, double price) {
        // Write code to return a string formatted as follows: "Item: [item]. Price: £[price]. Quantity: [quantity]". The price should be formatted to two decimal places, e.g. 99.99
        String item = "Book";
        int quantity = 5;
        double price = 20.99;
        String sentence = String.format("Item: %s. Price: £%.2f. Quantity: %d.", item, price, quantity);
        System.out.println(sentence);
        //throw new RuntimeException("Not implemented");
    }
}
