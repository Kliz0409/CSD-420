import java.util.LinkedList; //Importing LinkedList class since that's where were storing the integers
import java.util.Iterator; //Importing Iterator since it's one of the methods were using to loop through the list

public class LinkedListTraversalTime { //Main class
	public static void main(String[] args) { //Entry point
		System.out.println("Traversal time test with 50,000 integers:"); //Printing line to let reader know that we are testing traversal time for 50,000 integers
		runTraversalTest(50000); //Calls upon the method that's defined below to test the speed of traversing the LinkedList with 50,000 numbers
		System.out.println("\nTraversal time test with 500,000 integers:"); //Same thing as before but I put \n to make a line break for better readability
		runTraversalTest(500000); //Again, calls upon the method that's defined below that tests the speed for traversing the LinkedList but with 500,000 numbers
	}
	public static void runTravesalTest(int size) { //Defining the method from above that takes an int size since it makes it easier for me to reuse the method when testing different the different sizes
		LinkedList<Integer> list = new LinkedList<>(); //Creating a new linked list that stores integers 
		for (int i = 0; i < size; i++) { //Basic for loop
			list.add(i); //Appends the integers to the end of the list
		}//Below is the code for testing the traversal time while using the iterator method
		long startTime = System.nanoTime(); //Stores the current time before the loop begins. Was going to use System.currentTimeMillis but thought that nanoTime would be more precise
		Iterator<Integer> iterator = list.iterator(); //Creating an iterator object that will loop through the list 
		while (iterator.hasNext()) { //hasNext checks if theres another element in the list
			int value = iterator.next(); //next get the next element in the list and storing it into value
		} 
		long endTime = System.nanoTime(); //Stores the current time when the loop comes to an end. Again, using nanoTime for more precise readings
		long iteratorTime = endTime - startTime; //Taking the elapsed time by subtracting startTime from endTime
		System.out.println("Time to traverse list using iterator method: " + iteratorTime + " nano-seconds"); //Printing out the results of the Iterator test
		//Below is the code for getting the traversal time while using the get(index) method
		startTime = System.nanoTime(); //Stores the current time before the loop begins
		for (int i = 0; i < list.size(); i++) { //basic for loop
			int value = list.get(i);
		} 
		endTime = System.nanoTime(); //Stores current time when the loop comes to an end
		long getTime = endTime - startTime; //Taking the elapsed time by subtracting startTime from endTime
		System.out.println("Time to traverse list using get(index) method: " + getTime + " nano-seconds"); //Printing out the results of the get(index)
	}
}//FINISHED!!!
//Result Comment: After testing both methods, the results showed that the iterator method was much faster than the get(index) method for the LinkedList
//The difference in speed was most prevalent when testing the LinkedList that stored 500,000 integers. The Iterator returned the time taken almost instantly-
//-while the get(index) took much longer to return the time elapsed. It took so long to return a value that I thought my code was broken!!
//After reading into the two methods, this difference in time is due to the fact that the iterator method goes thorugh the list only once, while on the other hand- 
//-the get(index) method has to go through the list from the very beginning and check each node in the list until it finds the element its looking for.






