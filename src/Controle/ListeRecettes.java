package src.Controle;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ListeRecettes {
    private static final String FXML_FILE_PATH1 = "/src/FXML/Ajoutez_une_Recette.fxml";
    private static final String FXML_FILE_PATH2 = "/src/FXML/Accueil.fxml";
    private static final String FXML_FILE_PATH3 = "/src/FXML/Liste_de_Course.fxml";

    public ImageView panier;

    public Button ajouterRecette;
    public Button revenirArriereListeRectte;
    public Button suprimmerRecette1;
    public Button suprimmerRecette2;
    public Button suprimmerRecette3;

    public void allerPageAjouterRecette() {
        // Charger le fichier FXML de la nouvelle interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH1));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = ajouterRecette.getScene();

            // Créer une nouvelle scène à partir de la racine de l'arborescence de nœuds
            Scene nouvelleScene = new Scene(racine);

            // Remplacer la scène courante par la nouvelle scène
            Stage fenetrePrincipale = (Stage) sceneCourante.getWindow();
            fenetrePrincipale.setScene(nouvelleScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void allerPageAccueil() {
        // Charger le fichier FXML de la nouvelle interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH2));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = revenirArriereListeRectte.getScene();

            // Créer une nouvelle scène à partir de la racine de l'arborescence de nœuds
            Scene nouvelleScene = new Scene(racine);

            // Remplacer la scène courante par la nouvelle scène
            Stage fenetrePrincipale = (Stage) sceneCourante.getWindow();
            fenetrePrincipale.setScene(nouvelleScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void allerPageListeCourse() {
        // Charger le fichier FXML de la nouvelle interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH3));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = panier.getScene();

            // Créer une nouvelle scène à partir de la racine de l'arborescence de nœuds
            Scene nouvelleScene = new Scene(racine);

            // Remplacer la scène courante par la nouvelle scène
            Stage fenetrePrincipale = (Stage) sceneCourante.getWindow();
            fenetrePrincipale.setScene(nouvelleScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void suprimmerRecette() {

    }
}
