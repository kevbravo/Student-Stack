/* Honor Pledge:
 *
 * I pledge that I have neither given nor received any help on
 * this assignment
 *
 * kevbravo */

//this is our address class
public class Address{

//defining the properties of address
	private String line1;
	private String line2;
	private String city;
	private String zipcode;

//our default constructor which takes in info as a parameter
	public Address(String[] info){

//next we set our private members to the corresponding items in
//the array info
		this.line1 = info[2];
		this.line2 = info[3];
		this.city = info[4];
		this.zipcode = info[5];
	}

//this is function will return our address
	public String setAddress(){

//returns the address but if line2 is empty doesnt return it
		if(line2.equals("")){

			return line1 + " " + city + ", " + zipcode;
		}

		else{
			return line1 + " " + line2 + " " + city + ", " + zipcode;

		}
	}
}

