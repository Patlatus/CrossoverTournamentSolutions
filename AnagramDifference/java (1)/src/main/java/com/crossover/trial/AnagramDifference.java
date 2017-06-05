package com.crossover.trial;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramDifference {
	static HashMap<String, Integer> getMap(String s) {
		HashMap<String, Integer> m = new HashMap<String, Integer>();
		for ( int j = 0; j < s.length(); j++ ) {
    		String c = "" + s.charAt(j);
    		Integer value = m.get( c );
    		if ( value == null ) {
    			value = 0;
    		}
    		value++;
    		m.put( c,  value );
    		
    	}
		return m;
	}
	
	static Integer count(HashMap<String, Integer> m1, HashMap<String, Integer> m2) {
		Integer sum = 0;
		for ( String s: m1.keySet() ) {
			Integer value1 = m1.get( s );
			Integer value2 = m2.containsKey(s) ? m2.get( s ): 0;
			sum += Math.max( 0, value1 - value2);
		}
		return sum;
	}
    /**
     * Complete the function below.
     */
    static int[] getMinimumDifference(String[] a, String[] b) {
    	int[] arr = new int[a.length];
    	
    	for ( int i = 0; i < a.length; i++ ) {
    		if ( a[i].length() != b[i].length() ) {
    			arr[i] = -1;
    			continue;
    		}
    		if ( a[i].length() == 0 ) {
    			arr[i] = 0;
    			continue;
    		}

    		HashMap<String, Integer> m1 = getMap(a[i]),
    				m2 = getMap(b[i]);
    		arr[i] = Math.max(count(m1, m2), count(m2, m1));
        	
    		
    	}
        return arr;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] res;

        int _a_size = Integer.parseInt(in.nextLine().trim());
        String[] _a = new String[_a_size];
        String _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            try {
                _a_item = in.nextLine();
            } catch (Exception e) {
                _a_item = null;
            }
            _a[_a_i] = _a_item;
        }


        int _b_size = Integer.parseInt(in.nextLine().trim());
        String[] _b = new String[_b_size];
        String _b_item;
        for(int _b_i = 0; _b_i < _b_size; _b_i++) {
            try {
                _b_item = in.nextLine();
            } catch (Exception e) {
                _b_item = null;
            }
            _b[_b_i] = _b_item;
        }

        res = getMinimumDifference(_a, _b);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
