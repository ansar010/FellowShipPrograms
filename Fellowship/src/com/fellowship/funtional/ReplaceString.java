/**
 * Purpose : Get String from user and replace
 * 
 * @author Ansar
 * @version 1.2
 * @since 13/12/2018
 */
package com.fellowship.funtional;
import java.util.Scanner;

import com.fellowship.utilities.Utility;
public class ReplaceString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the user-name : ");
		Utility.replaceString(sc.nextLine());
		sc.close();
	}
	
}
