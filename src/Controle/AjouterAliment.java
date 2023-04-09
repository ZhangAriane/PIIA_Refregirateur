package src.Controle;



import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import java.io.IOException;

public class AjouterAliment  {
    private static final String FXML_FILE_PATH = "/src/FXML/Réfrigérateur.fxml";
    public javafx.scene.control.TextField nomAlimentAjouter;
    public javafx.scene.control.TextField typeAlimentAjouter;
    public javafx.scene.control.TextField tailleAlimentAjojuter;
    public javafx.scene.control.TextField uniteAlimmentAjouter;
    public Button validerAjouterAliment;
    public Button annulerAjouterAliment;
    public TextField nomAjouterAliment;
    public TextField typeAjouterAliment;
    public TextField tailleAjouterAliment;
    public TextField uniteAjouterAliment;
    public Button revenirArriereAjouterAliment;


    public void validerAjouterAliment()  {
        // Charger le fichier FXML de la nouvelle interface
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = validerAjouterAliment.getScene();

            // Créer une nouvelle scène à partir de la racine de l'arborescence de nœuds
            Scene nouvelleScene = new Scene(racine);

            // Remplacer la scène courante par la nouvelle scène
            Stage fenetrePrincipale = (Stage) sceneCourante.getWindow();
            fenetrePrincipale.setScene(nouvelleScene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void annulerAjouterAliment() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = annulerAjouterAliment.getScene();

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
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = revenirArriereAjouterAliment.getScene();

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
