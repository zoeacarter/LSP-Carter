package org.howard.edu.lsp.assignment2;
import java.util.Scanner;
import java.io.*;
/*
 * This assignment was made possible with code from :
 * https://stackoverflow.com/questions/2622725/how-to-take-user-input-in-array-using-java
 * Idea: Ask user how many elements are in the array, get elements from user and add to array, print array (tokens)
 * Do the add/products and print, and give the user a way to quit (type in a non int)
 * Problems: Exiting the system (didn't use a loop) and user cannot input data on one line (has to press enter rn)
 */
public class StringsTokens {

	public static void main(String[] args) {
		Scanner usrString = new Scanner(System.in);
		System.out.print("How many numbers do you have? ");
		int numbers = usrString.nextInt();
		int array[]= new int[numbers];
		System.out.print("Enter your Numbers: ");
		// Can't get it to enter your #s on same line 
		int multi = 1;
		int sum = 0;
		
		for (int i = 0 ; i < array.length; i++ ) {
	           array[i] = usrString.nextInt();
	           multi = multi * array[i];
	           sum += array[i]; 
	        }
		//Prints Tokens, Products, Sum
		System.out.println("Tokens:");
		printArray(array);
		System.out.println("Product:" +"\n" + multi);
		System.out.println("Sum:" + "\n"+ sum);
		
		usrString.close();
		
//	If statement - If user Input == Bye, system shall quit	
	if (usrString.equals("Bye") ) {
		System.exit(0);
	}
		
	}
		// TODO Auto-generated method stub
	
// From Stackoverflow, this method prints every element in the array on a newline
	public static void printArray(int arr[]){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\n");
            
        }
    }


}
