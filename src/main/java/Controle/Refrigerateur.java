package Controle;

import javafx.scene.control.Button;



public class Refrigerateur extends ChangePage {
    private static final String FXML_FILE_PATH1 = "/FXML/Accueil.fxml";
    private static final String FXML_FILE_PATH2 = "/FXML/Ajoutez_un_Aliment.fxml";

    public Button revenirArriereRefrigerateur;
    public Button ajouterAlimentRefrigerateur;

    public void allerPageAccueil() {
        changePage(FXML_FILE_PATH1,revenirArriereRefrigerateur);

    }

    public void allerPageAjouterAliment() {
        changePage(FXML_FILE_PATH2,ajouterAlimentRefrigerateur);

    }
}
