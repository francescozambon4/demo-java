package com.demojava.cap4;
	/*
	 * A vampire number has an even number of digits and is formed by multiplying a pair of 
	 * numbers containing half the number of digits of the result. The digits are taken from 
	 * the original number in any order. Pairs of trailing zeroes are not allowed. Examples include:
	 * 1260 = 21 * 60
	 * 1827 = 21 * 87
	 * 2187 = 27 * 81
	 * Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)
	 */
public class Ex10 {

	public static void main(String[] args) {
		/*
		 * for(int i = 1000; i < 10000; i++)
		 * 	if(i%100 == 0) continue;
		 * 	Coppie
		 *  ab, ba <-> cd, dc
		 *  ac, ca <-> bd, db
		 *  ad, da <-> bc, cb
		 *   
		 */
			int a, b, c, d;
			for(int i = 1001; i < 10000; i++){
				a = i/1000;
				b = i/100 - a*10;
				c = i/10 - a*100 - b*10;
				d = i%10;
				if(i%100 != 0){
					// ba
					if(b !=0 && i%(a + b*10) == 0 && (i/(a + b*10))<100){	print(i, a, b);	continue;}
					// ab
					if(i%(b + a*10) == 0 && (i/(b + a*10))<100){ print(i, b, a); continue;}
					// ca
					if(c !=0 && i%(a + c*10) == 0 && (i/(a + c*10))<100){ print(i, a, c); continue;}
					// ac
					if(i%(c + a*10) == 0 && (i/(c + a*10))<100){ print(i, c, a);	continue;}
					// da
					if(d !=0 && i%(a + d*10) == 0 && (i/(a + d*10))<100){ print(i, a, d); continue;}
					// ad
					if(i%(d + a*10) == 0 && (i/(d + a*10))<100){ print(i, d, a); continue;}
					// cb
					if(c !=0 && i%(b + c*10) == 0 && (i/(b + c*10))<100){ print(i, b, c); continue;}
					// bc
					if(b !=0 && i%(c + b*10) == 0 && (i/(c + b*10))<100){ print(i, c, b); continue;}
					// db
					if(d !=0 && i%(b + d*10) == 0 && (i/(b + d*10))<100){ print(i, b, d); continue;}
					// bd
					if(b !=0 && i%(d + b*10) == 0 && (i/(d + b*10))<100){ print(i, d, b); continue;}
					// cd 
					if(c !=0 && i%(d + c*10) == 0 && (i/(d + c*10))<100){ print(i, d, c); continue;}
					// dc
					if(d !=0 && i%(c + d*10) == 0 && (i/(c + d*10))<100){ print(i, c, d); continue;}
				}
			}

	}

	static void print(int n0, int n1, int n2){
		System.out.println(n0 + " = " + (n1 + n2*10) + " * " + (n0/(n1 + n2*10)) );
		
	}
	
}
