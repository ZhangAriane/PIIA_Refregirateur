package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BoxLayoutExemple1 extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("un test");
		
		Label label1 = new Label("Bonjour!!");
		Label label2 = new Label("Comment allez-vous?");
		VBox vbox = new VBox(label1,label2);
		
		Scene scene = new Scene(vbox);
		primaryStage.setScene(scene);

		
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
	
}
