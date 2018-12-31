/*****************************************************************************
 * purpose : Program to call sorting and searching utility methods
 * 
 * @author Ansar
 * @version 1.2
 * @since 26/12/2018
 ******************************************************************************/  
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class SortingElapsedTime 
{	/*
	 * written main method to call utility methods
	 */
	public static void main(String[] args)
	{
		long start;//Start time
		long end;  //End time
		long elapsedTime;//Elapsed time

		System.out.println("\tList of Sorting Techniques :");
		System.out.println("\t============================");
		System.out.println("1.Binary Search Method for Integer.");
		System.out.println("2.Binary Search Method for String.");
		System.out.println("3.Insertion Sort Method for Integer.");
		System.out.println("4.Insertin Sort Method for String.");
		System.out.println("5.Bubble Sort Method for Integer.");
		System.out.println("6.Bubble Sort Method for String.");

		System.out.print("Enter You Choice : ");
		int choice = Utility.getInt();
		/**
		 * getting user choice and responding 
		 */
		switch(choice)
		{
		
		case 1:
			System.out.println("\tYou Chosed Binary Search Technique for Integer..!");
			System.out.println("Process Started..!");
			start=System.currentTimeMillis();

			System.out.print("Enter the size of an Array : ");
			int []arr=Utility.createIntArr();
			Utility.bubbleSortInt(arr);

			System.out.print("Enter the element you want to search : ");
			int searchInt=Utility.getInt();

			int searchedIndex=Utility.binarySearchInt(arr, 0, arr.length-1, searchInt);
			if(searchedIndex!=-1)
			{
				System.out.println("The searched Element "+searchInt+" Present in : "+searchedIndex);
			}
			else
			{
				System.out.println("Not Found..!");
			}
			end=System.currentTimeMillis();
			System.out.println("Process End..!");
			elapsedTime=(end-start)/1000;
			System.out.println("Elapsed Time is : "+elapsedTime+"seconds");
			break;
		
		case 2:
			System.out.println("\tYou Chosed Binary Search Technique for String..!");
			System.out.println("Process Started..!");
			start=System.currentTimeMillis();



			String []strArr=Utility.createStrArr();
			Utility.stringBubbleSort(strArr);
			System.out.print("Enter the element you want to search : ");
			String search=Utility.getWord();
			int strSearchedIndex=Utility.stringBinarySearch(strArr, 0, search.length()-1, search);

			if(strSearchedIndex!=-1)
			{
				System.out.println("The searched Element "+search+" Present in : "+strSearchedIndex);
			}
			else
			{
				System.out.println("Not Found..!");
			}
			end=System.currentTimeMillis();
			System.out.println("Process End..!");
			elapsedTime=(end-start)/1000;
			System.out.println("Elapsed Time is : "+elapsedTime+"seconds");
			break;
		
		case 3:
			System.out.println("\tYou Chosed Insertion Sort Technique for Integer..!");
			System.out.println("Process Started..!");
			start=System.currentTimeMillis();

			System.out.print("Enter the size of an array : ");
			int[] createIntArr = Utility.createIntArr();

			System.out.println("Unsorted Array Integers ");
			System.out.println("=======================");
			Utility.displayArr(createIntArr);

			System.out.println("Sorted Integer Array");
			Utility.insertionSortInt(createIntArr);
			Utility.displayArr(createIntArr);

			end=System.currentTimeMillis();
			System.out.println("Process End..!");

			elapsedTime=(end-start)/1000;
			System.out.println("Elapsed Time is : "+elapsedTime+"seconds");
			break;
		
		case 4:
			System.out.println("\tYou Chosed Insertion Sort Technique for String..!");
			System.out.println("Process Started..!");
			start=System.currentTimeMillis();
			String[] createStrArr = Utility.createStrArr();

			System.out.println("Unsorted Array Strings ");
			System.out.println("======================");
			Utility.displayStrArr(createStrArr);

			System.out.println("Sorted String Array");
			Utility.stringInsertionSort(createStrArr);
			Utility.displayStrArr(createStrArr);

			end=System.currentTimeMillis();
			System.out.println("Process End..!");

			elapsedTime=(end-start)/1000;
			System.out.println("Elapsed Time is : "+elapsedTime+"seconds");
			break;
		
		case 5:
			System.out.println("\tYou Chosed Bubble Sort technique for Integer..!");
			System.out.println("Process Started..!");
			start=System.currentTimeMillis();

			System.out.print("Enter the size of an array : ");
			int[] createIntArr2 = Utility.createIntArr();

			System.out.println("Unsorted Array Integers ");
			System.out.println("=======================");
			Utility.displayArr(createIntArr2);

			System.out.println("Sorted Integer Array");
			Utility.bubbleSortInt(createIntArr2);
			Utility.displayArr(createIntArr2);

			end=System.currentTimeMillis();
			System.out.println("Process End..!");

			elapsedTime=(end-start)/1000;
			System.out.println("Elapsed Time is : "+elapsedTime+"seconds");
			break;
		
		case 6:
			System.out.println("\tYou Chosed Bubble Sort Technique for String..!");
			System.out.println("Process Started..!");
			start=System.currentTimeMillis();
			String[] createStrArr2 = Utility.createStrArr();

			System.out.println("Unsorted Array Strings ");
			System.out.println("======================");
			Utility.displayStrArr(createStrArr2);

			System.out.println("Sorted String Array");
			Utility.stringInsertionSort(createStrArr2);
			Utility.displayStrArr(createStrArr2);

			end=System.currentTimeMillis();
			System.out.println("Process End..!");

			elapsedTime=(end-start)/1000;
			System.out.println("Elapsed Time is : "+elapsedTime+"seconds");
			break;
			
		default:
			System.out.println("You Chosed Wrong Option..!");
		
		}
	}

}
