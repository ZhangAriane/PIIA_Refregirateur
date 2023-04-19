package Controle;


import Model.json.CourseJsonReader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ListeCourse extends ChangePage implements Initializable {
    private static final String FXML_FILE_PATH1 = "/FXML/Accueil.fxml";
    private static final String FXML_FILE_PATH2 = "/FXML/Ajoutez_une_Course.fxml";


    public Button acheter;
    public Button ajouterCourse;
    public Button revenirArriereListeCourse;
    public ListView listeCourse;

    public void acheter() {
        changePage(FXML_FILE_PATH1,acheter);
    }

    public void ajouterCourse() {
        changePage(FXML_FILE_PATH2,ajouterCourse);
    }

    public void allerPageAccueil() {
        changePage(FXML_FILE_PATH1,revenirArriereListeCourse);

    }

    private void afficherListeCourse(){
        ArrayList<String> ingredients = CourseJsonReader.getListeCourse();
        for(int i=0;i<ingredients.size();i++){
            listeCourse.getItems().add(ingredients.get(i));
            System.out.println(ingredients.get(i));
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        afficherListeCourse();
    }
}
