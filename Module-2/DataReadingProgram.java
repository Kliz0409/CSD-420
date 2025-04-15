//Kaden Lizama; 04/09/2025; CSD-420: Module 2 Programming Assignment
import java.io.BufferedReader;//Reads text from a file
import java.io.FileReader;//Connects our file to be read to the bufferedreader
import java.io.IOException;//Catches any errors at compiler

public class DataReadingProgram {
	public static void main(String[] args) { 
		String filename = "KadenDataFile.dat";//Data file from before to be read
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) { //Invokes the bufferedreader and opens our file 
			String line;
			System.out.println("Data read from file:"); //Print message to user before displaying results
			while ((line=reader.readLine()) != null) { //reads lines of text one at a time 
				System.out.println(line); //Displays each line
			}
		} catch (IOException e) {
			System.out.println("Error!!! Something went wrong while trying to read data file!"); //Will only happen if IOException catches an error
			e.printStackTrace(); 
		}
	}
}//FINISHED!!