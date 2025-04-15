//Kaden Lizama; 04/09/2025; CSD-420: Module 2 Programming Assignment
import java.io.FileWriter; //So we can write data to a file 
import java.io.IOException; //Catches errors and handles them 
import java.util.Random; //Let's us generate random numbers for our random doubles
public class WritingDataToFile {  
	public static void main(String[] args) {  
		Random rand = new Random(); //Generates random numbers/objs
		int[] intArray = new int[5]; //creating a new int array that will hold the 5 random objs
		double[] doubleArray = new double[5]; //creating a new double array that will hold the 5 random numbers
		for ( int i = 0; i < 5; i++) { //Populating our arrays with data
			intArray[i] = rand.nextInt(100); //This will generate random integers from 0-99
			doubleArray[i] = rand.nextDouble() * 100; //Will generate random doubles from 0-100
		} 
		String fileName = "KadenDataFile.dat"; //filename stores the name of the file that were gonna write data into
		try { 
			FileWriter writer = new FileWriter(fileName, true) ;//Here we utilize filewriter to begin writing to the file. Filewriter(filename, true) opens our file for writing and the true value adds to the file instead of overwriting data
			writer.write("Integers: "); //Writes strings to the files
			for (int num : intArray) { //for loop that will iterate through the array
				writer.write(num + " "); //Formating display
			} 
			writer.write("\n");
			writer.write("Doubles: "); //Writes strings to the files 
			for (double num : doubleArray) { //Another for loop that will iterate through the array
				writer.write(num + " ");  
			} 
			writer.write("\n");
			
			System.out.println("Data written successfully to " + fileName); //Displaying the results
		} catch (IOException e) { //Catches and detects errors at compiler
			System.out.println("Error!!! Something went wrong when trying to read file!"); //Will only happen if an error occurs
			e.printStackTrace();  
		} 
	} 
}//FINISHED!!