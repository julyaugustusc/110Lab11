/*-------------------------------------------------------------------------
// AUTHOR: Augustus Crosby
// FILENAME: Lab11.java
// SPECIFICATION: create 2D arrays
// FOR: CSE 110- Lab #11
// TIME SPENT: 20 minutes
//----------------------------------------------------------------------*/

import java.util.Scanner;
import java.util.Arrays;

public class Lab11 {
	public static void main(String[] args) {

		// Declaring Variables:

		// A scanner object for requesting input from the user
		Scanner in = new Scanner(System.in);
		// An integer for the number of rows.
		int rows = 0;
		// An integer for the number of columns.
		int columns = 0;
		//an integer for sum of each row's elements
		int elements = rows * columns;

		// Request Array Size from the User

		// Print this message "Enter the number of rows in the array"
		System.out.println("Enter the number of rows in the array:");
		
		rows = in.nextInt();
		// Print this message "Enter the number of columns in the array
		System.out.println("Enter the number of columns in the array:");
		// Use the scanner to store the values entered by the user
		// in the integers declared above.
		columns = in.nextInt();

		// Declare the Array

		// Declare a 2D integer array using the number of rows and columns previously entered by the user
		int[][] array1 = new int[rows][columns];
		// Remember, we declare a 2D integer array by using
		// the following statement
		// int[][] intArray = new int[NumberOfRows][NumberOfColumns];

		// Fill in the Array

		for (int i = 0; i < rows; i++){
			for (int j = 0; j < columns; j++){

				// Display the message: "Please enter a value."
				System.out.println("Please enter a value:");
				// Store the value entered by the user at the (ith, jth) position of the 2D array created in Step 4.
				array1[i][j] = in.nextInt();
			}
		}

		// Display the Array's Elements
		System.out.println("Array Elements:");

		for (int i= 0; i < rows; i++){
			for (int j= 0; j < columns; j++)
			{
				// --> printed with a space between each element and a new line for each ith row
				System.out.print (array1[i][j] + " ");
				// Remember the outer for loop walks through the rows
				//while the inner for loop walks through the elements of //the rows
			}//end the second for
			System.out.println();
		}

		// finding sum of each row and display
		
		// the first loop
		
		for (int i = 0; i < rows; i++){
			
			int sum = 0;
			
			//the second for loop
			
			for (int j = 0; j < columns; j++){
				
				sum = sum + array1[i][j];
				}//end of second for

			//print sum : ("sum of row"+i+ " "+ sum);
			System.out.println("Sum of the elements of row " + i + " is: " + sum);

		}//end of first for loop

	} // Close the main function.
} // Close the Lab11 class.