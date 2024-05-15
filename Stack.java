//Honor Pledge:
//
//I pledge that i have neither given nor
//received any help on this assignment
// 
//kevbravo

import java.util.Scanner;
import java.lang.Math;
import java.io.*;

//This is our generic stack
public class Stack<E>{

//first we declare the private members
	private int top;
	private int size;
	private E [] stack;

//next our default constructor
	public Stack(){

//We want it to be of size 10 because there is 10 students
		size = 10;

//Here we are casting our array of type E
		stack = (E[]) new Object[size];

//This will allow us to start at -1 and add 1 to get 0
		top = -1;

	}

//our push function will take in a parameter and fill our stack with that item
	public void push(E data){

//first we want to check if the stack is full so we call our isfull function
		if(isFull()){

			System.out.println("Stack is full");

		}

//else we set our stack to take in the data
		else{

//this will ensure we start our array at 0
			top += 1;

			stack[top] = data;

		}

	}

//our pop function will return the items in our stack
	public E pop(){

//we have to make sure our stack is not empty
		if(!isEmpty()){

//next we set a value from our stack
			E value = stack[top];

//this will allow us to get the next value in our stack
			top = top - 1;

			return value;

		}

//our else will just print that the stack is empty
		else{

			System.out.println("Stack is empty can't pop");

		}

		return null;
	}

//this function will tell if the stack is empty
	public boolean isEmpty(){

		return top == -1;

	}

//this is our isfull functio which will return if our stack is full
	public boolean isFull(){

		return top == size - 1;

	}

//allows us to get the item currently on top
	public E getTop(){

		return stack[top];

	}
}

//Stack derived from the code Dr. Rybarczyk gave us
