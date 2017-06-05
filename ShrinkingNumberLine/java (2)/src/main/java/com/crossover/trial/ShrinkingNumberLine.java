package com.crossover.trial;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ShrinkingNumberLine {
	static int calc(int[] p) {
		int min = p[0];
    	int max = p[0];
    	for ( int i: p ) {
    		if ( i < min )
    			min = i;
    		if ( i > max )
    			max = i;
    	}
    	
        return max - min;
	}
    /**
     * Complete the function below.
     */
    static int minimize(int[] point, int k) {
    	int min = point[0];
    	int max = point[0];
    	for ( int i: point ) {
    		if ( i < min )
    			min = i;
    		if ( i > max )
    			max = i;
    	}
    	int avg = ( min + max ) / 2;
    	ArrayList<Integer> notProcessed = new ArrayList<Integer>();
    	for ( int i = 0; i < point.length; i++ ) {
    		
    		if ( point[i] < avg )
    			point[i] += k;
    		else
    			if ( point[i] > avg )
        			point[i] -= k;
    			else
    				notProcessed.add( i );	
    		//notProcessed.add( point[i] );	
    		
    	}
    	min = point[0];
    	max = point[0];
    	for ( int i: point ) {
    		if ( i < min )
    			min = i;
    		if ( i > max )
    			max = i;
    	}
    	
    	for ( Integer i: notProcessed ) {
    		Integer p = point[i];
    		Integer x = p + k;
    		Integer add1 = 0;
    		if ( x > max )
    			add1 = x - max;
    		if ( x < min )
    			add1 += min - x;
    		x = p - k;
    		Integer add2 = 0;
    		if ( x > max )
    			add2 = x - max;
    		if ( x < min )
    			add2 += min - x;
    		
    		if ( add1 < add2 ) {
    			point[i] += k;
    		} else {
    			point[i] -= k;
    		}
    	}
    	min = point[0];
    	max = point[0];
    	for ( int i: point ) {
    		if ( i < min )
    			min = i;
    		if ( i > max )
    			max = i;
    	}
    	
        return max - min;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int _point_size = Integer.parseInt(in.nextLine().trim());
        int[] _point = new int[_point_size];
        int _point_item;
        for (int _point_i = 0; _point_i < _point_size; _point_i++) {
            _point_item = Integer.parseInt(in.nextLine().trim());
            _point[_point_i] = _point_item;
        }

        int _k = Integer.parseInt(in.nextLine().trim());

        System.out.println(minimize(_point, _k));
    }
}
