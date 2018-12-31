/*********************************************************************************
 * purpose : Program to purchse items from vending machine and get change(balance)
 * 
 * @author Ansar
 * @version 1.2
 * @since 28/12/2018
 *********************************************************************************/
package com.fellowShip.AlgorithmsProgs;

import com.fellowship.utilities.Utility;

public class VendingMachineRunner 
{	/*
	 *written main method to run vendingmachine
	 */
	public static void main(String[] args) 
	{
		char buyChoice = 'y';//user more item purchase choice 
		int price=0;//product price
		int total=0;//total amount of purchased items 
		
		VendingMachine vm = new VendingMachine();
		
		do {
			//calling method to purchase item and return amount
			price=vm.purchase();
			System.out.println("Selected item cost is "+price);
			System.out.println("Do you to purchase more?");
			System.out.println("y->Yes n->No");
			buyChoice=Utility.getChar();
			total+=price;//calculating total price
		}while(buyChoice=='y');
		
		System.out.println("Total amount of purchased items : "+total);
		System.out.print("Insert your cash : ");
		int cash=Utility.getInt();
		//Calling method to take cash and give change
		vm.returnChange(total,cash);
		
	}
}
