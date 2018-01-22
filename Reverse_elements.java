/*
 *
 * Name: Christian Chaneski
 * Task: 9
 * Difficulty: 6
 *
 */

import java.util.*;

public class Reverse_elements {
	static Queue<Integer> numqueue;
	
	static void reverseFirstKNums(int k) {
		Stack<Integer> knumstack = new Stack<Integer>();
		if (numqueue.isEmpty() == true || k > numqueue.size()) {
			return;
		}
		if (k <= 0) {
			return;
		}
		
		for (int i = 0; i < k; i++) {
			knumstack.push(numqueue.peek());
			numqueue.remove();
		}
		
		while (!knumstack.empty()) {
			numqueue.add(knumstack.peek());
			knumstack.pop();
		}
		
		for (int j = 0; j < numqueue.size() - k; j++) {
			numqueue.add(numqueue.peek());
			numqueue.remove();
		}
	}
	
	static void printLine() {
		while (!numqueue.isEmpty()) {
			System.out.print(numqueue.peek() + " ");
			numqueue.remove();
		}
	}
	
	public static void main(String args[]) {
		System.out.print("Hello there Human! Welcome to the Program. Please enter the Number of Test Cases :");
		Scanner A = new Scanner(System.in);
		int testcase = A.nextInt();
		
		if (testcase > 0 && testcase <= 100) {
			for (int n = 0; n < testcase; n++) {
				System.out.println("Ok, Please input the number of elements viewed :");
				Scanner N = new Scanner(System.in);
				int numelements = N.nextInt();
				if (numelements > 0 && numelements <= 1000) {
					System.out.println("Please input number of elements to be reversed :");
					Scanner V = new Scanner(System.in);
					int numreverse = V.nextInt();
					if (numreverse > 0 && numreverse < numelements) {
						System.out.println("Next, Please input the Numbers be used :");
						numqueue =  new LinkedList<Integer>();
						for (int t = 0; t < numelements; t++) {
							Scanner F = new Scanner(System.in);
							int numtoadd = F.nextInt();
							numqueue.add(numtoadd);
						}
						reverseFirstKNums(numreverse);
						printLine();
					}
					else {
						return;
					}
				}
				else {
					return;
				}
			}
		}
		else {
			return;
		}
	}
}


/*
 *
 * Difficulty: 6
 * Activities: Utilization of Inputs from User, Procedure planning, Utilization of stack and Queues
 * Time: 1.5 hours
 *
 */