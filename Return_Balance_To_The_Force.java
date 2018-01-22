/*
 *
 * Name: Christian Chaneski
 * Task: 4
 * Difficulty: 4
 *
 */

import java.util.*;

public class Return_Balance_To_The_Force {
	
	public boolean areDelimitersMatching(String expression) {
		
		int sizeStack = expression.length();
		StackStuff theStack = new StackStuff(sizeStack);
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			switch (ch) {
			case '{':
			case '[':
			case '(':
				theStack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if (!theStack.isStackEmpty()) {
					char stackContent = theStack.pop();
					if ((ch == '}' && stackContent != '{') || (ch == ']' && stackContent != '[') || (ch == ')' && stackContent != '(')) {
						System.out.println("Mismatch in Delimiters found : " + ch + " at character " + i);
						return false;
					}
				}
				else {
					System.out.println("Mismatch found : " + ch + " at character " + i);
					return false;
				}
				break;
			default: break;
			}
		}
		if (!theStack.isStackEmpty()) {
			System.out.println("Error : Missing Right Delimiter");
			return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		System.out.println("Hello, Welcome to the Delimiter Balance Scanner!");
			Return_Balance_To_The_Force mdm = new Return_Balance_To_The_Force();
			System.out.println("Please input the String you wish to Scan : ");
			Scanner E = new Scanner(System.in);
			String expression = E.nextLine();
			boolean results = mdm.areDelimitersMatching(expression);
			System.out.println(expression + " == " + results);
	}
}

class StackStuff {
	 private int sizeStack;
	 private char[] stackArray;
	 private int top;
	 
	 public StackStuff(int size) {
		 this.sizeStack = size;
		 this.stackArray = new char[sizeStack];
		 this.top = -1;
	 }
	 
	 public void push(char enterednum) {
		 this.stackArray[++top] = enterednum;
	 }
	 
	 public char pop() {
		 char enterednum = this.stackArray[top--];
		 return enterednum;
	 }
	 
	 public char peek() {
		 return stackArray[top];
	 }
	 
	 public boolean isStackEmpty() {
		 return (top == -1);
	 }
	 
	 public boolean isStackFull() {
		 return (top == sizeStack - 1);
	 }
}



/*
 *
 * Difficulty: 5
 * Activities :
 * Time: 30 mins
 * 
 */