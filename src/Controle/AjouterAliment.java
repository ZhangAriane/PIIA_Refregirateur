package src.Controle;

import com.sun.deploy.net.MessageHeader;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import src.Model.Aliment;
import src.Model.Model;


import javax.xml.soap.Text;
import java.awt.*;
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
    public Aliment aliment;





    public void validerAjouterAliment() throws IOException {
        // Charger le fichier FXML de la nouvelle interface
        ajouterAliment();
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH));

        try {
            // Obtenir la racine de l'arborescence de nœuds
            Parent racine = loader.load();

            // Obtenir la scène courante
            Scene sceneCourante = validerAjouterAliment.getScene();

            // Créer une nouvelle scène à partir de la racine de l'arborescence de nœuds
            Scene nouvelleScene = new Scene(racine);

            // Remplacer la scène courante par la nouvelle scène
            if (sceneCourante != null) {
                Stage fenetrePrincipale = (Stage) sceneCourante.getWindow();
                fenetrePrincipale.setScene(nouvelleScene);
            } else {
                System.out.println("sceneCourante ： null");
            }

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

    private Stage getStage() {
        Scene sceneCourante = nomAjouterAliment.getScene();
        if (sceneCourante != null) {
            return (Stage) sceneCourante.getWindow();
        }
        return null;
    }

    public void ajouterAliment() throws IOException {
        String nom = nomAjouterAliment.getText();
        String type = typeAjouterAliment.getText();
        int taille = Integer.parseInt(tailleAjouterAliment.getText());
        int unite = Integer.parseInt(uniteAjouterAliment.getText());

        Aliment aliment1 = new Aliment(nom, type, taille, unite);
        Model.getInstance().addAliment(aliment1);

        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_FILE_PATH));
        Parent root = loader.load();

        for (int i = 0; i <Model.getInstance().alimentList.size(); i++) {
            TextField textField = new TextField();
            textField.setText(Model.getInstance().alimentList.get(i).nom);
            textField.setFont(Font.font(16));
            textField.setPrefSize(30, 30);
            textField.setAlignment(Pos.CENTER);

            switch (Model.getInstance().alimentList.get(i).type) {
                case "Fruits et légumes":
                    GridPane fruitsEtLegumes = (GridPane) loader.getNamespace().get("Fruits_et_légumes");
                    fruitsEtLegumes.add(textField, i % 4, i / 4);
                    Stage stage1 = getStage();
                    if (stage1 != null) {
                        stage1.show();
                    }
                    break;
                case "Viandes":
                    GridPane viandes = (GridPane) loader.getNamespace().get("Viandes");
                    viandes.add(textField, i % 3, i / 4);
                    Stage stage2 = getStage();
                    if (stage2 != null) {
                        stage2.show();
                    }
                    break;
                case "Bouteilles":
                    GridPane bouteilles = (GridPane) loader.getNamespace().get("Bouteilles");
                    bouteilles.add(textField, i % 2, i / 5);
                    Stage stage3 = getStage();
                    if (stage3 != null) {
                        stage3.show();
                    }
                    break;
                case "Pates":
                    GridPane pates = (GridPane) loader.getNamespace().get("Pates");
                    pates.add(textField, i % 3, i / 3);
                    Stage stage4 = getStage();
                    if (stage4 != null) {
                        stage4.show();
                    }
                    break;
            }
        }

        Scene scene = nomAjouterAliment.getScene();
        scene.setRoot(root);
        Stage stage = getStage();
        if (stage != null) {
            stage.close();
        }
    }


}
