package Controle;

import javafx.collections.transformation.TransformationList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import Model.Model;

import java.io.IOException;

public class Configuration extends ChangePage {
    private static final String FXML_FILE_PATH = "/FXML/Accueil.fxml";

    public Button etudiant;
    public Button familial;
    public TextField nbPersonne;

    public Button terminerConfiguration;


    public void terminerConfiguration(ActionEvent actionEvent) {
        changePage(FXML_FILE_PATH,terminerConfiguration);

    }
    @FXML
    public void entrerNbPersonne(ActionEvent event) {
            String input = nbPersonne.getText();
            try {
                int number = Integer.parseInt(input);
                Model.getInstance().setNbPersonne(number);
                System.out.println("nbPersonne est : " +  Model.getInstance().getnbPersonne());
            } catch (NumberFormatException ex) {
                System.out.println("Please enter a number");
            }
    }
}
