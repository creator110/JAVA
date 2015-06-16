/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	//berechnet die Priemzahlen bis 1000
	printPrimes(1000);
	}
	
	static void printPrimes(int max){
		boolean[] sieve = new boolean[max+1];
		int i,j;
		for(i=2; i<=max; i++) sieve[i] = true;
		i=2;
		while(i<=max){
			System.out.println(i +" "); //i ist die Priemzahl
			for(j = i; j<= max; j=j+i)sieve[j] = false;
			while (i <= max && !sieve[i]) i++;
			
		}
	}
}
