package com.crossover.trial;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
class StackImpl{
	//ArrayList<Integer> numbers;
	Stack<Integer> stack;
	public Integer top() {
		return stack.peek();
	}
	public Integer pop() {
		return stack.pop();
	}
	public void push(Integer i) {
		stack.push(i);
	}
	public void inc(Integer e, Integer k) {
		for ( int i = 0; i < e; i++ ) {
			stack.set(i, stack.get(i) + k );
		}
		/*for ( int i = 0; i < e; i++ ) {
			numbers.set(i, numbers.get(i) + k );
		}*/
	}
	public String executeCommandAndReturnTop(String operation) {
		String[] items = operation.split(" ");
		String command = items[0];
		if ( "pop".equals(command) ) {
			pop();
		} else if ( "push".equals(command) ) {
			push(Integer.valueOf(items[1]));
		} else if ( "inc".equals(command) ) {
			inc(Integer.valueOf(items[1]), Integer.valueOf(items[2]));
		}
		
		return stack.size() == 0 ? "EMPTY" : "" + top();
	}
	StackImpl(){
		stack = new Stack<Integer>();
	}
}
public class SuperStack {
	
    /**
     * Complete the function below.
     */
    static void superStack(String[] operations) {
    	StackImpl stack = new StackImpl();
    	ArrayList<String> outputs = new ArrayList<String>();
    	for ( String op: operations ) {
    		outputs.add( stack.executeCommandAndReturnTop(op) );
    		
    	}
    	System.out.println( String.join("\r\n", outputs ));
    	
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int _operations_size = Integer.parseInt(in.nextLine().trim());
        String[] _operations = new String[_operations_size];
        String _operations_item;
        for(int _operations_i = 0; _operations_i < _operations_size; _operations_i++) {
            try {
                _operations_item = in.nextLine();
            } catch (Exception e) {
                _operations_item = null;
            }
            _operations[_operations_i] = _operations_item;
        }

        superStack(_operations);
    }
}
