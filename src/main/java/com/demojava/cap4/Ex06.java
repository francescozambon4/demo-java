package com.demojava.cap4;
	/*
	 * Modify the two test( ) methods in the previous two programs so that they take 
	 * two extra arguments, begin and end, and so that testval is tested to see if it 
	 * is within the range between (and including) begin and end.
	 */
public class Ex06 {
	static int test(int testval, int begin, int end) {
		if (begin > end)
			return 0;
		if(testval > end || testval < begin)
			return -1;
		else if(testval <= end && testval >= begin)
			return +1;
			System.out.println("caso eccezionale");
			return 13; // Match
	}
	
	public static void main(String[] args) {
		System.out.println(test(10, 5, 20));
		System.out.println(test(5, 10, 4));
		System.out.println(test(5, 5, 5));
		System.out.println(test(5, 6, 10));
	}
}