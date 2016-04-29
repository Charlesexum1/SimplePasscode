/*
 * SimplePasscode.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Scanner;
public class SimplePasscode {
	
	public void passCheck(){
		
		int match = 0;
		int sum = 0;
		int pass = 123;
		int length = pass;
		int guesses = 0;
		
		for (int q = 1; q <= 3; q++) {
			
			match = 0;
			Scanner keys = new Scanner(System.in);
			System.out.println("please input any 3 digit integer");
			int input = keys.nextInt();
			String sInput = String.valueOf(input);
			String sPass = String.valueOf(pass);
		
			while (!(sInput.length() == 3)) {
				System.out.println("Please input only 3 digits.");
				input = keys.nextInt();
				sInput = String.valueOf(input);
				}
						
		
			if (sPass.equals(sInput)){
				System.out.println("You guessed the password!");
				}
			else {
				for (int x = 0; x <= (sPass.length() - 1) ; x++){
					if (sPass.charAt(x) == sInput.charAt(x)){
						match ++;			
						} 
					}
				guesses++;
				System.out.println("You entered " + match + " correct numbers.");
				System.out.println("You have used " + guesses + " of 3 guesses.");
				}			
			}		
		}
		
	
	public static void main (String args[]) {
		
			SimplePasscode demo = new SimplePasscode();
			demo.passCheck();
			}
		
	
}

