//Kaden Lizama, 03/20/25, CSD-420: Module 1 JavaFX Programming Assignment 
//In the code below, we utilize lambda expressions 
import javafx.application.Application; 
import javafx.event.ActionEvent; 
import javafx.scene.Scene;
import javafx.scene.control.Button; 
import javafx.scene.image.Image; 
import javafx.scene.imiage.ImageView; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.VBox; 
import javafx.stage.Stage;
import java.io.File; 
import java.util.Collections; 
import java.util.List; 
import java.util.ArrayList;

public class DeckOfCards extends Application {
	private static final String Path_To_Card = "C:/csd/CSD-420/Module-1/AssignmentCards";
	private static final int Count_Of_Cards = 52; 
	private static final int Number_Of_Cards_To_Display = 4; 
	
	private HBox cardBox = new HBox(10); 
	@Override 
	public void start(Stage primaryStage) { 
		updateCards(); 
		Button refreshButton = new Button("Refresh"); 
		refreshButton.setOnAction(Event -> updateCards());
		VBox root = new Vbox(15, cardBox, refreshButton()); 
		Scene scene = new Scene(root, 600, 300); 
		primaryStage.setTitle("4 Random Card Display"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
	private void updateCards() { 
		List<Integer> cardNumbers = new ArrayList<>(); 
		for (int i = 1; i <= Count_Of_Cards; i++) {
			cardNumbers.add(i); 
		}
		Collections.shuffle(cardNumbers); 
		cardBox.getChildren().clear(); 
		for (int i = 0; i < Number_Of_Cards_To_Display; i++) {
			String imagePath = Path_To_Card + cardNumbers.get(i) + ".png"; 
			File imageFile = new File(imagePath); 
			
			if (imageFile.exists()) { 
				ImageView cardImage = new ImageView(newImage(imageFile.toURI().toString())); 
				cardImage.setFitHeight(100); 
				cardImage.setPreserveRatio(true); 
				cardBox.getChildren().add(cardImage); 
			}
		}
	}
	public static void Kliza_1.3_Program(String[] args) {
		launch(args); 
	}
}
		