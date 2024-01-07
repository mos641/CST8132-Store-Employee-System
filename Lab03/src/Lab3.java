// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 3
// Description: Class for the main method, ordering and executing code from other classes 

import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		//variables to store input
		int num;
		String storeName;
		Scanner input = new Scanner(System.in);
		
		//ask for store name and number of employees
		System.out.print("Enter name of the store: ");
		storeName = input.nextLine();
		System.out.print("How many employees do you have? ");
		num = input.nextInt();
		
		//create Store object with variable num
		Store store = new Store(num);
		
		//call read employee details method to ask for and save input
		store.readEmployeeDetails();
		
		//print title and header
		Store.printTitle(storeName);
		
		//calling method to print all employee details
		store.printEmployeeDetails();
		
		//close scanner
		input.close();
	}

}
