/**
 * purpose : To create a program for TicTacToe Game , Computer will be player 1 .
 * 
 * @author Ansar
 * @version 1.2
 * @since 21/12/2018
 * 
 */
package com.fellowship.funtional;

import com.fellowship.utilities.Utility;

public class TicTacToeRunner 
{	/*
	 *The main function written to run the gameTicTacTeo
	 */
	public static void main(String[] args) 
	{
		System.out.println("Start the game..!");	
		System.out.println("Welcome to the TicTacToe Game");
		System.out.println("-----------------------------");
		System.out.println("player 1 will be the computer and it's Symbol is : 0");
		System.out.println("Enter the Name of the player 2");
		
		// variable name holds the name of the player2
		String name=Utility.getLine();
		//Calling method to play TicTacTeo game
		Utility.gameTicTacTeo(name);
	}
}
