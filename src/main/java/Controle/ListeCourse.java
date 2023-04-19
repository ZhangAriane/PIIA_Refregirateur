package Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class ListeCourse extends ChangePage{
    private static final String FXML_FILE_PATH1 = "/FXML/Accueil.fxml";
    private static final String FXML_FILE_PATH2 = "/FXML/Ajoutez_un_Aliment.fxml";

    public TextField ingredientCourse1;
    public TextField ingredientCourse2;
    public TextField ingredientCourse3;
    public TextField ingredientCourse4;
    public TextField ingredientCourse5;
    public Button acheter;
    public Button ajouterCourse;
    public Button revenirArriereListeCourse;

    public void acheter(ActionEvent actionEvent) {
        changePage(FXML_FILE_PATH1,acheter);

    }

    public void ajouterCourse() {
        changePage(FXML_FILE_PATH2,ajouterCourse);

    }

    public void allerPageAccueil(ActionEvent actionEvent) {
        changePage(FXML_FILE_PATH1,revenirArriereListeCourse);

    }
}
