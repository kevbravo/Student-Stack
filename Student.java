/* Honor Pledge:
 * I pledge that I have neither given nor received any help
 * on this assignment
 *
 * kevbravo */

//This is our student class
public class Student{

//we set our private members
	private String firstName;
	private String lastName;
	private Address address;
	private String ID;
	private String GPA;
	private String add;

//Our default constructor
	public Student(String[] info){

		this.firstName = info[1];
		this.lastName = info[0];
		this.ID = info[7];
		this.GPA = info[8];
//We tie our address class to our student class
		address = new Address(info);

		add = address.setAddress();

	}

//this method will return our line to be printed
	public String setLine(){

//	return "ID: " + ID + "     Name: " + firstName + " " + lastName + "     Address: " + add + "   GPA: " + GPA;

	return String.format("ID: %-13s Name: %-5s %-15s Address: %-50s GPA: %s" , ID, firstName, lastName, add, GPA);

	}

}

