package Controle;

import Model.Ingredient;
import Model.json.RecetteJsonReader;
import javafx.scene.control.*;

import java.util.ArrayList;

public class AjouterRecette extends ChangePage{
    private static final String FXML_FILE_PATH = "/FXML/Liste_de_Recettes.fxml";

    public TextField nomAjouterRecette;
    public TextField ingredientAjouterRecette;
    public TextField quantiteAjouterRecette;
    public TextField uniteAjouterRecette;

    public Button validerAjouterRecette;
    public Button revenirArriereAjouterRecette;
    public Button ajouterIngredient;

    public ListView<String> listeIngredients;

    private final ArrayList<Ingredient> ingredients = new ArrayList<>();

    public void validerAjouterRecette() {
        String nom = nomAjouterRecette.getText();

        //ajoute au fichier json
        RecetteJsonReader.addRecette(nom, ingredients);

        //nettoie la liste d'ingrédient
        ingredients.clear();

        changePage(FXML_FILE_PATH,validerAjouterRecette);

    }


    public void ajouterIngredient() {
        String ingredient = ingredientAjouterRecette.getText();
        String quantite = quantiteAjouterRecette.getText();
        String unite = uniteAjouterRecette.getText();

        //ajoute à la liste
        listeIngredients.getItems().add(ingredient + " " + quantite + unite);

        ingredients.add(new Ingredient(ingredient,Integer.parseInt(quantite),unite));

    }

    public void allerPageListeRecette() {
        changePage(FXML_FILE_PATH,revenirArriereAjouterRecette);

    }
}
