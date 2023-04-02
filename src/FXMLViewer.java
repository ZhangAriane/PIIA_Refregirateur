package src;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLViewer extends Application {

	private static final String FXML_FILE_PATH1 = "/src/FXML/Ajoutez_un_Aliment.fxml";
	private static final String FXML_FILE_PATH2 = "/src/FXML/Ajoutez_une_Recette.fxml";
	private static final String FXML_FILE_PATH3 = "/src/FXML/Liste_de_Course.fxml";
	private static final String FXML_FILE_PATH4 = "/src/FXML/Liste_de_Recettes.fxml";

	private Scene scene1;
	private Scene scene2;
	private Scene scene3;
	private Scene scene4;
	@FXML
	private Button validerButton;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Load FXML files and create scenes
		Parent root1 = FXMLLoader.load(getClass().getResource(FXML_FILE_PATH1));
		scene1 = new Scene(root1);

		Parent root2 = FXMLLoader.load(getClass().getResource(FXML_FILE_PATH2));
		scene2 = new Scene(root2);

		Parent root3 = FXMLLoader.load(getClass().getResource(FXML_FILE_PATH3));
		scene3 = new Scene(root3);

		Parent root4 = FXMLLoader.load(getClass().getResource(FXML_FILE_PATH4));
		scene4 = new Scene(root4);

		// Set scene1 as the initial scene
		primaryStage.setScene(scene2);
		primaryStage.show();
	}

	@FXML
	private void handleValidation(ActionEvent event) throws IOException {
		// Load Liste_de_Recettes.fxml and set it as the new scene
		Parent root = FXMLLoader.load(getClass().getResource("/src/FXML/Liste_de_Recettes.fxml"));
		Scene scene = new Scene(root);

		Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}


		public static void main(String[] args) {
		launch(args);
	}
}
