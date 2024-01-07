// Name: 		Mostapha A
// Class: 		CST8132
// Assessment:	Lab 3
// Description: Class for an array of employees, reading and printing the information of said employees 

import java.util.Scanner;

public class Store {
	private Employee[] employees;
	
	//create array for all employees
	Store (int num) {
		//create array with size
		employees = new Employee[num];
	}
	
	//method to fill array with input information using for loop
	public void readEmployeeDetails() {
		Scanner input = new Scanner(System.in);
				
		//for loop to fill array with employees
		for(int i = 0; i < employees.length ; i++) {
			//variable to store input
			int type;
			
			//ask for employee type
			System.out.print("Enter details of employee " +(i+1)+
					"\n1.  Regular\n"
					+ "2.  Contractor\n"
					+ "Enter type of employee: ");
			type = input.nextInt();
			
			//determine which array object needs to be created based on employee type
			if(type == 1) {
				//if they selected Regular type, create a regular and call its method to read info
				employees[i] = new Regular();
				//employees[i].readEmployee();
			} else {
				//if they selected Contractor type, create a contractor and call its method to read info
				employees[i] = new Contractor();
				//employees[i].readEmployee();
			}
			employees[i].readEmployee();
		};
	}
	
	//print all employee details from the array using for loop
	public void printEmployeeDetails() {
		//print each index of the array
		for(int i = 0; i < employees.length ; i++) {
			//use the printEmployee method to print out all the information
			employees[i].printEmployee();
		}
		
	}
	
	//print a single line
	private static void printLine() {
		System.out.println("=========================================================================================");
		
	}
	
	//print the title and header
	public static void printTitle(String storeName) {
		//print a line before store name
		printLine();
		//print store name
		System.out.printf("%60s%30s", storeName+" Store Management System", " \n");
		//print a line before header
		printLine();
		//print header
		System.out.printf("%15s%25s%20s%15s%15s", "Emp# |", "Name |", "Email |", "Phone |", "Salary |\n");
		//print line after header
		printLine();
		
	}

}
