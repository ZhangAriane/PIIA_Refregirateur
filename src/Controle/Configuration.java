package src.Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Configuration {
    private static final String FXML_FILE_PATH = "/src/FXML/Accueil.fxml";

    public Button etudiant;
    public Button familial;
    public TextField nbPersonne;

    public Button terminerConfiguration;

    public void terminerConfiguration(ActionEvent actionEvent) {
        // Charger le fichier FXML de la nouvelle interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = terminerConfiguration.getScene();

            // Créer une nouvelle scène à partir de la racine de l'arborescence de nœuds
            Scene nouvelleScene = new Scene(racine);

            // Remplacer la scène courante par la nouvelle scène
            Stage fenetrePrincipale = (Stage) sceneCourante.getWindow();
            fenetrePrincipale.setScene(nouvelleScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
