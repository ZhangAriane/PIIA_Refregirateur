package src.Controle;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Refrigerateur {
    private static final String FXML_FILE_PATH1 = "/src/FXML/Accueil.fxml";
    private static final String FXML_FILE_PATH2 = "/src/FXML/Ajoutez_un_Aliment.fxml";

    public Button revenirArriereRefrigerateur;
    public Button ajouterAlimentRefrigerateur;

    public void allerPageAccueil() {
        // Charger le fichier FXML de la nouvelle interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH1));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = revenirArriereRefrigerateur.getScene();

            // Créer une nouvelle scène à partir de la racine de l'arborescence de nœuds
            Scene nouvelleScene = new Scene(racine);

            // Remplacer la scène courante par la nouvelle scène
            Stage fenetrePrincipale = (Stage) sceneCourante.getWindow();
            fenetrePrincipale.setScene(nouvelleScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void allerPageAjouterAliment() {
        // Charger le fichier FXML de la nouvelle interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH2));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = ajouterAlimentRefrigerateur.getScene();

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
