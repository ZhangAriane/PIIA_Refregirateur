package src.Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class DetailleRecette {
    private static final String FXML_FILE_PATH = "/src/FXML/Accueil.fxml";

    public Button cuisinier;
    public Button diminierPersonne;
    public Button ajouterPersonne;

    public void cuisinier() {
        // Charger le fichier FXML de la nouvelle interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = cuisinier.getScene();

            // Créer une nouvelle scène à partir de la racine de l'arborescence de nœuds
            Scene nouvelleScene = new Scene(racine);

            // Remplacer la scène courante par la nouvelle scène
            Stage fenetrePrincipale = (Stage) sceneCourante.getWindow();
            fenetrePrincipale.setScene(nouvelleScene);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void diminierPersonne() {

    }

    public void ajouterPersonne(ActionEvent actionEvent) {

    }
}
