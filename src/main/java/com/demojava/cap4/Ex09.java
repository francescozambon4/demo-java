package com.demojava.cap4;
	/*
	 * A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, 
	 * and so on, where each number (from the third on) is the sum of the previous two. 
	 * Create a method that takes an integer as an argument and displays that many 
	 * Fibonacci numbers starting from the beginning, e.g., If you run java Fibonacci 5
	 * (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
	 */
public class Ex09 {

	public static void main(String[] args) {
		
		printFib(5);
		printFib(0);
		printFib(1);
		printFib(10);

	}
	
	static void printFib(int n){
		if(n < 0) 
			System.out.println("numero negativo");
		else {
			int[] fib = new int[n+1];
		//	fib[0] = 1;
		//	fib[1] = 1;
			for(int i = 0; i <= n; i++){
				if(i == 0 || i == 1)
					System.out.print(fib[i] = 1);
				else 
					System.out.print(fib[i] = fib[i-1] + fib[i-2]);
				System.out.print(i == n ? ".\n" : ", ");
				}
	}
	}
	static int fibonacci(int n){
		if(n == 1 || n == 0) 
			return 1;
		else return fibonacci(n-1) + fibonacci(n-2);
	}

}
