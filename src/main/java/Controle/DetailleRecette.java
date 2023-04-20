package Controle;

import Model.Aliment;
import Model.Recette;
import Model.json.RecetteJsonReader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class DetailleRecette extends ChangePage implements Initializable {
    private static final String FXML_FILE_PATH1 = "/FXML/Accueil.fxml";
    private static final String FXML_FILE_PATH2 = "/FXML/Liste_de_Recettes.fxml";

    public Button cuisinier;
    public Button diminierPersonne;
    public Button ajouterPersonne;
    public Button boutonRevenierArriere;


    public Text nomRecette;
    public ListView listeIngredients;

    public void cuisinier() {
        changePage(FXML_FILE_PATH1,cuisinier);
    }

    public void diminierPersonne() {

    }

    public void ajouterPersonne() {

    }

    public void allerPageListeRecette() {
        changePage(FXML_FILE_PATH2,boutonRevenierArriere);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        afficheRecette();

    }

    private void afficheRecette(){
        String nomRecette = ListeRecettes.recetteSelected;

        Recette recette = RecetteJsonReader.getRecette(nomRecette);
        ArrayList<Aliment> ingredients = recette.getIngredients();

        this.nomRecette.setText(nomRecette);

        for (Aliment ingredient : ingredients) {
            String nom = ingredient.getNom();
            String unite = Integer.toString(ingredient.getUnite());

            listeIngredients.getItems().add(nom + " " + unite);
        }

    }
}
