import java.util.ArrayList; //Importing ArrayList

public class StaticMethodReturn { //Main class
	public static ArrayList<String> createList() { //This is the static method which basically means that it can be called upon without having to creat an object out of the class
		ArrayList<String> list = new ArrayList<>(); //Creating a new array list that stores a string
		//Populating our list with some elements. I chose Toyota models since toyota is my favorite brand of vehicle!
		list.add("Tacoma"); 
		list.add("Tundra"); 
		list.add("4Runner"); 
		list.add("Corolla"); 
		list.add("Camry"); 
		list.add("Prius"); 
		return list; //Returns our new array list with all the new elements we just added back to the main method
	} 
	
	public static void main(String[] args) { //Main method where our program starts and will invoke the static method to return the arraylist
		ArrayList<String> myToyotas = createList(); //Calling on the create list and storing the returned list that I made above into the variable myToyotas
		System.out.println("List of my favorite toyota vehicles:"); //Printing out message to user to inform them what the list consists of
		for (String toyota : myToyotas) { //I used a for-each loop to print out each of the toyotas that are in my list
			System.out.println(toyota); //Prints out the list
		}
	}
}//FINISHED!!!