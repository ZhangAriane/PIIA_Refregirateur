package Controle;

import javafx.scene.control.Button;


public class DetailleRecette extends ChangePage{
    private static final String FXML_FILE_PATH1 = "/FXML/Accueil.fxml";
    private static final String FXML_FILE_PATH2 = "/FXML/Liste_de_Recettes.fxml";

    public Button cuisinier;
    public Button diminierPersonne;
    public Button ajouterPersonne;
    public Button boutonRevenierArriere;

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

}
