package com.crossover.trial;

import java.util.Arrays;


import java.util.List;

import java.io.IOException;
import java.util.Scanner;
class Base {
	  static {
	    System.out.println("Base static block");
	  }
	  {
	    System.out.println("Base instance block");
	  }

	  public Base() {
	    System.out.println("Base constructor");
	  }
	}

 
public class LongestEvenLengthWord extends Base  {
	 static {
		    System.out.println("Derived static block");
		  }
		  {
		    System.out.println("Derived instance block");
		  }

		  public LongestEvenLengthWord() {
		    System.out.println("Derived constructor");
		  }

		 /* public static void main(String[] args) {
		    System.out.println("Main method");
		    LongestEvenLengthWord d = new LongestEvenLengthWord();
		  }*/
		  
		 /* public static synchronized void main(String[] args) {
			    Thread thread = new Thread(LongestEvenLengthWord::wars);
			    thread.run();
			    System.out.print("Star");
			  }

			  public static synchronized void wars() {
			    System.out.print("Wars");
			  }*/
		  /*public static void main(String[] args) {
		        List< String > myList =
		                Arrays.asList("a1", "a2", "b1", "c2", "c1");
		        myList.stream()
		                .filter(s -> s.startsWith("c"))
		                .map(m -> {
		                        System.out.print(m);
		        return m.toUpperCase();
		      });
		    }*/
		 /* public static void main(String[] args) {
		        List<Integer> list = Arrays.asList(7, 12, 1, 30);
		        list.sort(Integer::compareTo);
		        System.out.println(list);
		    }*/
		  public static void main(String[] args) {
		        List<Integer> myList = Arrays.asList(1, 2, 3);
		        int result = myList.stream().sum();
		        System.out.println(result);
		    }
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
     
    public static void main(String[] args) throws IOException {
    	 
    	    String[] stringArray = { "Barbara", "Michael", "John", "Linda" };
    	    Arrays.sort(stringArray, String::compareToIgnoreCase);
    	    System.out.println(stringArray);
    	 
    }*/
}
