package Controle;

import Model.json.RecetteJsonReader;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ListeRecettes extends ChangePage implements Initializable  {
    private static final String FXML_FILE_PATH1 = "/FXML/Ajoutez_une_Recette.fxml";
    private static final String FXML_FILE_PATH2 = "/FXML/Accueil.fxml";
    private static final String FXML_FILE_PATH3 = "/FXML/Liste_de_Course.fxml";
    private static final String FXML_FILE_PATH4 = "/FXML/Detaille_de_Recette.fxml";

    public ImageView panier;

    public Button ajouterRecette;
    public Button revenirArriereListeRecette;

    public ListView<String> listeRecette;
    public Button boutonAfficher;
    public Button boutonSupprimer;


    public void allerPageAjouterRecette() {
        changePage(FXML_FILE_PATH1,ajouterRecette);

    }

    public void allerPageAccueil() {
        changePage(FXML_FILE_PATH2,revenirArriereListeRecette);

    }

    public void allerPageListeCourse() {
        changePage(FXML_FILE_PATH3,panier);

    }




    public void supprimerRecette() {
        int selectedID = listeRecette.getSelectionModel().getSelectedIndex();

        //retire de la liste
        String nomRecette = listeRecette.getItems().get(selectedID);

        //Retire du fichier json
        RecetteJsonReader.removeRecette(nomRecette);

        //Retire de liste de l'interface
        listeRecette.getItems().remove(selectedID);
    }


    /**
     * Ajoute les noms de recette du fichier recettes.json à la liste
     */
    public void afficherListeRecette() {
        ArrayList<String> recettes = RecetteJsonReader.getNomRecette();
        for(int i=0; i<recettes.size();i++){
            listeRecette.getItems().add(recettes.get(i));
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        afficherListeRecette();
    }

    public void afficherDetailleRecette() {
        changePage(FXML_FILE_PATH4,boutonAfficher);
    }
}
