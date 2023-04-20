package Controle;

import Model.Aliment;
import Model.json.RefrigerateurJsonReader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class Refrigerateur extends ChangePage implements Initializable {
    private static final String FXML_FILE_PATH1 = "/FXML/Accueil.fxml";
    private static final String FXML_FILE_PATH2 = "/FXML/Ajoutez_un_Aliment.fxml";

    public Button revenirArriereRefrigerateur;
    public Button ajouterAlimentRefrigerateur;


    public GridPane Bouteilles;
    public GridPane Fruits_et_legumes;
    public GridPane Viandes;
    public GridPane Pates;

    public void allerPageAccueil() {
        changePage(FXML_FILE_PATH1,revenirArriereRefrigerateur);

    }

    public void allerPageAjouterAliment() {
        changePage(FXML_FILE_PATH2,ajouterAlimentRefrigerateur);

    }

    /**
     * Affiche tous les aliments du fichier json dans les GridPane du réfrigérateur
     */
    private void afficheAliment(){
        ArrayList<Aliment> aliments =  RefrigerateurJsonReader.getAliment();

        for(int i=0;i<aliments.size();i++){
            TextField textField = new TextField();
            textField.setText(aliments.get(i).getNom());
            textField.setFont(Font.font(16));
            textField.setPrefSize(30, 30);
            textField.setAlignment(Pos.CENTER);

            switch (aliments.get(i).getType()) {
                case "Fruits et légumes":
                    Fruits_et_legumes.add(textField, i % 4, i / 4);
                    break;
                case "Viandes":
                    Viandes.add(textField, i % 3, i / 4);
                    break;
                case "Bouteilles":
                    Bouteilles.add(textField, i % 2, i / 5);
                    break;
                case "Pates":
                    Pates.add(textField, i % 3, i / 3);
                    break;
            }
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        afficheAliment();

    }
}
