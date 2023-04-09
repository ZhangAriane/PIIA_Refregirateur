package src.Controle;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Accueil {
    private static final String FXML_FILE_PATH1 = "/src/FXML/Liste_de_Recettes.fxml";
    private static final String FXML_FILE_PATH2 = "/src/FXML/Liste_de_Course.fxml";
    private static final String FXML_FILE_PATH3 = "/src/FXML/Réfrigérateur.fxml";


    public Button refrigerateur;
    public Button recettes;
    public Button course;

    public void allerPageRecettes() {
        // Charger le fichier FXML de la nouvelle interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH1));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = recettes.getScene();

            // Créer une nouvelle scène à partir de la racine de l'arborescence de nœuds
            Scene nouvelleScene = new Scene(racine);

            // Remplacer la scène courante par la nouvelle scène
            Stage fenetrePrincipale = (Stage) sceneCourante.getWindow();
            fenetrePrincipale.setScene(nouvelleScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void allerPageCourse() {
        // Charger le fichier FXML de la nouvelle interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH2));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = course.getScene();

            // Créer une nouvelle scène à partir de la racine de l'arborescence de nœuds
            Scene nouvelleScene = new Scene(racine);

            // Remplacer la scène courante par la nouvelle scène
            Stage fenetrePrincipale = (Stage) sceneCourante.getWindow();
            fenetrePrincipale.setScene(nouvelleScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void allerPageRefrigerateur() {
        // Charger le fichier FXML de la nouvelle interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH3));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = refrigerateur.getScene();

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
