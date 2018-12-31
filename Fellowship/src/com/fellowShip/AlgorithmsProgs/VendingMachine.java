package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class VendingMachine
{	// array of notes slot
	static int noteSlot[]= {20,20,20,20,20,20,20,20,20};
	/**
	 * 
	 * @return price of selected item
	 */
	public int purchase()
	{	
		int price=0;
		System.out.println("List Of Items : ");
		System.out.println("===============");
		System.out.println("1.Cake\n2.Chips\n3.Toffee Box");
		System.out.print("Enter the product key you want to purchase : ");
		int choice=Utility.getInt();

		switch(choice)
		{
		case 1:
			price=200;
			break;

		case 2:
			price=100;
			break;

		case 3:
			price=300;
			break;

		default:
			System.out.println("Invalid choice..!");
		}
		return price;
	}
	
	/**
	 * 
	 * @param total takes total amount of purchased items 
	 * @param cash takes cash 
	 */
	public void returnChange(int total, int cash) 
	{
		int count=0;// number of notes
		int i=1;	//total number of notes and amount

		//total balance amount  return customer
		int balanceAmount=cash-total;
		System.out.println("Amount to return : "+balanceAmount);
		//Condition to check purchased total and given cash is enough or not 
		if(cash<total) 
		{
			System.out.println("insufficient cash");
		}

		/*
		 * iterate till the balance is 1000 or more 
		 */
		while(balanceAmount >=1000 && noteSlot[0]!=0)
		{
			//1000 given to the customer
			balanceAmount=balanceAmount-1000;
			count++;//increment count of  Rs:note
			//i++;
			noteSlot[0]--;//decrementing 1000 note from note slot
		}
		//block to written number of note given 
		if(count!=0)
		{
			//total number of notes
			i=count*1000;
			System.out.println(count+"*"+1000+"="+i);

			//refreshing specific note count
			i=0;
			count=0;
		}

		/*
		 * iterate till the balance is 500 or more 
		 */
		while(balanceAmount >=500 && noteSlot[1]!=0)
		{
			balanceAmount=balanceAmount-500;
			count++;
			//i++;
			noteSlot[1]--;
		}
		if(count!=0) 
		{
			i=count*500;
			System.out.println(count+"*"+500+"="+i);
			i=0;
			count=0;
		}

		/*
		 * iterate till the balance is 100 or more 
		 */
		while(balanceAmount >=100 && noteSlot[2]!=0)
		{
			balanceAmount=balanceAmount-100;
			count++;
			//i++;
			noteSlot[2]--;
		}

		if(count!=0) 
		{
			i=count*100;
			System.out.println(count+"*"+100+"="+i);
			i=0;
			count=0;
		}

		/*
		 * iterate till the balance is 50 or more 
		 */
		while(balanceAmount >=50 && noteSlot[3]!=0) 
		{
			balanceAmount=balanceAmount-50;
			count++;
			noteSlot[3]--;
			//i++;
		}

		if(count!=0)
		{
			i=count*50;
			System.out.println(count+"*"+50+"="+i);
			i=0;
			count=0;
		}

		/*
		 * iterate till the balance is 20 or more 
		 */
		while(balanceAmount >=20 && noteSlot[4]!=0) 
		{
			balanceAmount=balanceAmount-20;
			count++;
			//i++;
			noteSlot[4]--;
		}

		if(count!=0)
		{
			i=count*20;
			System.out.println(count+"*"+20+"="+i);
			i=0;
			count=0;
		}
		/*
		 * iterate till the balance is 10or more 
		 */

		while(balanceAmount >=10 && noteSlot[5]!=0) 
		{
			balanceAmount=balanceAmount-10;
			count++;
			//i++;
			noteSlot[5]--;
		}

		if(count!=0)
		{
			i=count*10;
			System.out.println(count+"*"+10+"="+i);
			i=0;count=0;
		}

		/*
		 * iterate till the balance is 5 or more 
		 */
		while(balanceAmount >=5 && noteSlot[6]!=0) 
		{
			balanceAmount=balanceAmount-5;
			count++;
			//i++;
			noteSlot[6]--;
		}

		if(count!=0) 
		{
			i=count*5;
			System.out.println(count+"*"+5+"="+i);
			i=0;
			count=0;
		}

		/*
		 * iterate till the balance is 2 or more 
		 */
		while(balanceAmount >=2 && noteSlot[7]!=0) 
		{
			balanceAmount=balanceAmount-2;
			count++;
			//i++;
			noteSlot[7]--;
		}

		if(count!=0)
		{
			i=count*2;
			System.out.println(count+"*"+2+"="+i);
			i=0;
			count=0;
		}

		/*
		 * iterate till the balance is 1 or more 
		 */
		while(balanceAmount ==1 && noteSlot[8]!=0) 
		{
			balanceAmount=balanceAmount-1;
			count++;
			//i++;
			noteSlot[8]--;
		}

		if(count!=0) 
		{
			i=count*1;
			System.out.println(count+"*"+1+"="+i);
			i=0;
			count=0;
		}
		System.out.println("Enjoy the taste..");

	}





}
