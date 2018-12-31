/******************************************************************************
 * purpose : Program to print prime Number which are Anagram and palindrome 
 * 
 * @author Ansar
 * @version 1.2
 * @since 26/12/2018
 ******************************************************************************/  
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class AnaPaliPrime 
{	/*
 	 * The main function written to run the anagramPalindrome
 	 */	
	public static void main(String[] args)
	{	
		int range=1000;

		//index variables to store number index-wise
		int indexPrime=0,indexPali=0;

		//length variable size of arrays
		int primeLength=0,paliLength=0;

		//logic to find the size of pali and prime array
		for(int i=2;i<range;i++)
		{	
			boolean flag=Utility.isPrime(i);

			if(flag==true)
			{
				primeLength++;

				if(Utility.isNumberPalindrome(i))
				{
					paliLength++;
				}
			}
		}

		int primeNum[]=new int[primeLength]; //Initializing size of prime array
		int paliNum[]=new int[paliLength];   //Initializing size of Palindrome array

		//Loop to check numbers from 1 to range(1000)
		for(int i=2;i<range;i++)
		{
			boolean flag=Utility.isPrime(i);

			if(flag==true)
			{
				primeNum[indexPrime]=i;
				// calling method to check palindrome
				if(Utility.isNumberPalindrome(i))
				{
					paliNum[indexPali]=i;
					indexPali++;
				}
				indexPrime++;
			}
		}

		//Calling method to display prime numbers
		System.out.println("Prime Numbers from 1 to "+range+" :");
		System.out.println("==============================");
		Utility.displayArr(primeNum);
		System.out.print("Total Number of prime Numbers from range 1 to "+range+" : "+primeLength);

		System.out.println();//LineSpace
		//calling Method to display the Palindrome prime Numbers 
		System.out.println("\nPalindrome Prime Numbers : ");
		System.out.println("==========================");
		Utility.displayArr(paliNum);
		System.out.print("Total Number of Pali-prime Numbers from range 1 to "+range+" : "+paliLength);

		System.out.println();//LineSpace
		//Calling method to display the Anagram prime Numbers
		System.out.println("\nAnagram Prime Numbers : ");
		System.out.println("=======================");
		int anaLength=Utility.primeAnagram(primeNum);
		System.out.print("Total Number of Ana-prime Numbers from range 1 to "+range+" : "+anaLength);



	}
}
