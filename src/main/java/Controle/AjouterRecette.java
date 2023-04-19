package Controle;

import Model.json.Ingredient;
import Model.json.Recette;
import Model.json.RecetteJsonReader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.xml.bind.ValidationEvent;
import java.io.IOException;
import java.util.ArrayList;

public class AjouterRecette extends ChangePage{
    private static final String FXML_FILE_PATH = "/FXML/Liste_de_Recettes.fxml";

    public TextField nomAjouterRecette;
    public TextField ingredientAjouterRecette;
    public TextField quantiteAjouterRecette;
    public TextField uniteAjouterRecette;

    public Button validerAjouterRecette;
    public Button revenirArriereAjouterRecette;
    public Button bouttonAjouterIngredient;

    public ListView<String> listeIngredients;

    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public void validerAjouterRecette() {
        String nom = nomAjouterRecette.getText();

        //ajoute au fichhier json
        RecetteJsonReader.addRecette(nom, ingredients);

        //nettoie la liste d'ingrédient
        ingredients.clear();

        changePage(FXML_FILE_PATH,validerAjouterRecette);

    }


    public void ajouterIngredient() {
        String ingredient = ingredientAjouterRecette.getText();
        String quantite = quantiteAjouterRecette.getText();
        String unite = uniteAjouterRecette.getText();

        System.out.println(ingredient);
        System.out.println(quantite);
        System.out.println(unite);
        //tableauRecette.getItems().add()

        listeIngredients.getItems().add(ingredient + " " + quantite + unite);

        ingredients.add(new Ingredient(ingredient,Integer.parseInt(quantite),unite));

    }

    public void allerPageListeRecette() {
        changePage(FXML_FILE_PATH,revenirArriereAjouterRecette);

    }
}
