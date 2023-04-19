package Model.json;

import Model.Aliment;
import Model.Recette;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class CourseJsonReader {

    /**
     * Lit le fichier json et renvoie une liste de course
     * @return la liste des courses
     */
    public static ArrayList<String> getListeCourse(){
        ArrayList<String> ingredients = new ArrayList<>();
        try {
            //Lecture du fichier JSON existant
            File file = new File("src/main/resources/json/courses.json");
            ObjectMapper objectMapper = new ObjectMapper();

            //sérialisation
            ArrayList<Aliment> aliments  = objectMapper.readValue(file, new TypeReference<ArrayList<Aliment>>() {});



            for (Aliment aliment : aliments) {
                ingredients.add(aliment.getNom() + " " + aliment.getUnite());

            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return ingredients;
    }

    /**
     * Ajoute un aliment au fichier json
     * @param nom nom de l'aliment
     * @param taille de l'aliment
     * @param type de l'aliment
     * @param unite de l'aliment
     */
    public static void addCourse(String nom, String type, int taille, int unite){
        try {
            //Lecture du fichier JSON existant
            File file = new File("src/main/resources/json/courses.json");
            ObjectMapper objectMapper = new ObjectMapper();

            //sérialisation
            ArrayList<Aliment> aliments  = objectMapper.readValue(file, new TypeReference<ArrayList<Aliment>>() {});

            //ajoute une recette
            aliments.add(new Aliment(nom,type,taille, unite));

            //mise à jour du fichier json
            JsonGenerator jsonGenerator = objectMapper.getFactory().createGenerator(
                    new File("src/main/resources/json/courses.json"), JsonEncoding.UTF8);
            jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
            objectMapper.writeValue(jsonGenerator, aliments);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

}
