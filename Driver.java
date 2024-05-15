/*Honor Pledge:

 I pledge that i have neither given nor
 received any help on this assignment
 
 kevbravo */

//these are all of my import statements to use in my code
import java.util.Scanner;
import java.lang.Math;
import java.io.*;

//my driver class will be the basis of my program
public class Driver{
	public static void main(String[] args) throws IOException{

//I created a stack named student
		Stack<Student> stack = new Stack<Student>();

		String printed;
//I created a scanner to take user input
		Scanner scan = new Scanner(System.in);

//this while loop will keep our program running
	while(true){
//these print statements will allow the user to choose what to do
		System.out.println("1. Load Students (From File)");
		System.out.println("2. Print Stack\n3. Exit Program");
		System.out.println("Enter Your Selection:");

//this will store what the user entered
		int answer = scan.nextInt();

//if they choose to load the students we will read in the students from
//the text file
		if(answer == 1){

//I used the scanner method for reading in the contents of the student file
			File students = new File("students.txt");

			String line;

//this try catch block will read in our file
		try{
			Scanner studentScanner = new Scanner(students);
			while(studentScanner.hasNextLine()){

				line = studentScanner.nextLine();
//Using the .split command I can separate the lines by the commas
				String [] info = line.split(",");

//we push the info onto our stack
	
				stack.push(new Student(info));
			
			}

//We must close our scanner
			studentScanner.close();
		}

//this is for if the file is not found
		catch(FileNotFoundException ex){

			System.err.println(ex);

		}
		
		System.out.println("Students loaded from file");
		}

//if the user chooses print stack we will pop off the items one by one from the stack
		else if(answer == 2){

		try{

		for(int i = 0; i <= 9; i++){

			Student student = stack.pop();
			System.out.println(student.setLine());
			
		}
		}

		catch(Exception e){

		}
	}

//if they choose to exit we will simply break out of our while loop
		else if(answer == 3){

			System.out.println("Goodbye");
			break;
		}

//if the user doesnt enter a valid answer I simply print out for them to retry
		else{

			System.out.println("Please enter a 1, 2, or 3");
		}
	}

}
}

