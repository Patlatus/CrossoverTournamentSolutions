package com.crossover.trial;

import java.io.IOException;
import java.util.Scanner;

public class LongestEvenLengthWord {

    /**
     * Complete the function below.
     */
    static String longestEvenWord(String sentence) {
    	Boolean maxFound = false;
    	String maxItem = "";
    	Integer maxLen = 0;
    	
    	for ( String item: sentence.split(" ") ) {
    		if ( item.length() % 2 == 0 && item.length() > maxLen ) {
    			maxFound = true;
    			maxItem = item;
    			maxLen = item.length();
    		}
    	}
        return maxFound ? maxItem : "00";
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String _sentence;
        try {
            _sentence = in.nextLine();
        } catch (Exception e) {
            _sentence = null;
        }

        System.out.println(longestEvenWord(_sentence));
    }
}
