import java.util.*;

public class MachineProb5 
	{
	public static void main(String args []) 
	{
		Scanner in = new Scanner(System.in);
		
		//Determining the element size
		int size;	
		System.out.print("Enter desired element size: ");
		size = in.nextInt();
		int [] array = new int[size];
		
		//Generating random numbers for the linked list
		Random random = new Random();
		for(int i = 0; i < size; i++) {
			array[i] = random.nextInt(size)+1;
		}
		
		//Displaying the generated random elements.
		System.out.println("The random Generated numbers are: " + Arrays.toString(array));
		
		//Creating the First Linked List
		LinkedList<Integer> List1 = new LinkedList<Integer>();
		
		//Creating the Second Linked List
		LinkedList<Integer> List2 = new LinkedList<Integer>();
		
		//Adding the generated random elements to the First Linked list
		for(int j = 0; j < size; j++) {
			List1.add(array[j]);
		}
		
		//Displaying the First Linked list
		System.out.println("First linked list: " + List1 + "\n");
		
		for(int j = 0; j < size; j++) {
			//Getting the first element in the first linked link and copying it to the second linked list.
			List2.add(List1.getFirst());
			//removing the first element to the first linked list.
			List1.remove();
			System.out.println("\nThe Second linked list: " + List2);
			System.out.println("The First linked list after copying: " + List1);
			
		}
	}
}
