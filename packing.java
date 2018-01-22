import java.util.*;

class Bin {
	
	private int id;					//The ID of the Bin/Box 1 to N
	public double howFull;			//How Full the Bin/Box is, 0 to 1
	private List<Double> contents;	//List of contents of the Bin/Box
	private static int L;			//True or False Identifier
	
	//Makes the Initial Boxes
	public void Box( int id, double firstitem) {
		//Make List of Contnents of Box
		List<Double> contents = new ArrayList<Double>();
		//Add "First Item" to Box (0.0 Value to signify emptiness)
		contents.add(firstitem);
	}
	
	void addItem( double x) {
		//Adds weight of Item to Box
		contents.add(x);
		
		//Adds new weight to Previous Weight
		/* Reads initial weight of Box, Reads weight of item that is Added,
		 * and Adds them to caculate the final weight
		 */
	}
	
	public String toString() {
		//Prints Boxes in Order of id and List of each's Contents
		/*Outputs Box in ID order from 1 to N boxes,
		 * then reads the list of items in the box from first to last,
		 * excluding the 0.0 "first item", also prints the Full Weight of Box
		 */
		return null;
	}
	
	/*public int compareTo( Object other) {
		return id;
	}*/
	
	public void checkWeight() {
		//Checks weight of box
		/*Reads initial weight of the box*/
		
		//Checks if weight of item will Exceed Maximum weight Limit
		/* Utilizing the checked weight, determines if the weight added to 
		 * the box's intial weight will exceed the "Top Weight" of the Box
		 */
		
		//Returns if should go to next box or add item to box
		/* If it exceeds, move on to the next Box to fill,
		 * If it doe not exceed, call Add function
		 */
	}
	
	//Runs the Packing "Steps"
	public static void runPacking(int b, float I) {
		//System.out.print("Here");
		
		//Looks through Boxes for one with most weight
		for (int i = 0; i <= b; i++) {
			/*Calls Check Weight Function*/
			//If can Add item wieght, Call Add Function
			//If cannot Add item weight, Moves to next Heaviest Box
		}
	}
	
	//Main method for Packing
		public void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			
			//Gets Input for Number of Boxes
			System.out.print("Enter the number of boxes to pack with :");
			int b = sc.nextInt();
			
			//Initialize the Boxes
			for (int i = 0; i <= b; i++) {
				Box(i, 0.0);
			}
			
			//Check to see if Adding more Items
			while (L == 0) {
			//Ask for Input to Continue Packing or Start Packing Phase
			System.out.print("Would you like to add more items? Input 1 for Yes or 0 for No :");
			int a = sc.nextInt();
			
				//If in Packing Phase
				if (a == 1) {
					//Get Input for Weight of Item
					System.out.print("Enter the weight of the item to be packed :");
					float I = sc.nextFloat();
					
					//Run Packing Procedure
					runPacking(b, I);
				}
				//Exit the Packing Phase
				else if (a == 0) {
					//Set Packing Phase to Done
					L = 1;
					return;
				}

			}
		}
}
