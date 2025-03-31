//Kaden Lizama, 03/20/25, CSD-420: Module 1 JavaFX Programming Assignment 
//importing javaFX methos and java utilities
import javafx.application.Application; 
import javafx.event.ActionEvent; 
import javafx.scene.Scene;
import javafx.scene.control.Button; 
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.VBox; 
import javafx.stage.Stage;
import java.io.File; 
import java.util.Collections; 
import java.util.List; 
import java.util.ArrayList;

public class DeckOfCards extends Application {
	private static final String Path_To_Card = "C:/csd/CSD-420/Module-1/AssignmentCards"; //Here we create the directory where the image of our deck of cards are stowed and create a path to the folder
	private static final int Count_Of_Cards = 52; //Listing the total number of cards
	private static final int Number_Of_Cards_To_Display = 4; //Stating how many cards are going to be displayed in each round
	
	private HBox cardBox = new HBox(10); //Container for holding the cards that are currently being displayed. We create a spacing of 10 between each picture
	@Override 
	public void start(Stage primaryStage) { //Entry point for every JavaFX application
		updateCards(); //Loads our initial random 4 cards whenever a user starts the app
		Button btRefresh = new Button("Refresh"); //Creating a new button for refreshing the random cards displayed
		btRefresh.setOnAction(event -> updateCards()); //Assigning an event handler to the button and using a lambda expression to shorten the code since it's simpler. 
		VBox root = new VBox(15, cardBox, btRefresh); //VBox arranges the items vertically
		Scene scene = new Scene(root, 600, 300); //Lines 29-32 is basically setting up our scene with my desired width and height as well as a title. In addition, we put the scene in our stage and display it. 
		primaryStage.setTitle("4 Random Card Display"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
	private void updateCards() { 
		List<Integer> cardNumbers = new ArrayList<>(); //Creating an array list for our card numbers
		for (int i = 1; i <= Count_Of_Cards; i++) { //Generating a list of numbers for the count of cards
			cardNumbers.add(i); 
		}
		Collections.shuffle(cardNumbers); //This randomizes and shuffles the cards again to guarantee that every refresh is actually random
		cardBox.getChildren().clear(); //So cards aren't repeated, we clear previous cards to prevent them from the images stacking
		for (int i = 0; i < Number_Of_Cards_To_Display; i++) { //Lines 41-49 is creating the actual meathod for displaying our 4 cards
			String imagePath = Path_To_Card + "/" + cardNumbers.get(i) + ".png";
			File imageFile = new File(imagePath);
			
			if (imageFile.exists()) { 
				ImageView cardImage = new ImageView(new Image(imageFile.toURI().toString())); //Here we use ImagView to display the images
				cardImage.setFitHeight(100); //Setting the height of the images to make it look cleaner
				cardImage.setPreserveRatio(true); //Setting aspect ration to also make the images look a bit cleaner
				cardBox.getChildren().add(cardImage); //Adds our card image to HBOx
			}
		}
	}
	public static void DeckOfCards (String[] args) {
		launch(args); //Triggers the program and calls upon the start() from the beginning 
	}
} //FINISHED!!!
		