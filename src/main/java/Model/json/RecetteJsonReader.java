package Model.json;

import Model.Ingredient;
import Model.Recette;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;


public class RecetteJsonReader {


    /**
     * Lit le fichier json et renvoie tous les noms de recette
     * @return la liste des noms de recette
     */
    public static ArrayList<String> getNomRecette(){
        ArrayList<String> nomRecettes = new ArrayList<>();
        try {
            //Lecture du fichier JSON existant
            File file = new File("src/main/resources/json/recettes.json");
            ObjectMapper objectMapper = new ObjectMapper();

            //sérialisation
            ArrayList<Recette> recettes  = objectMapper.readValue(file, new TypeReference<ArrayList<Recette>>() {});


            for (Recette recette : recettes) {
                nomRecettes.add(recette.getNomRecette());
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return nomRecettes;
    }

    /**
     * Cherche la recette correspondante au nom de recette
     * @param nomRecette nom de la recette
     * @return recette
     */
    public static Recette getRecette(String nomRecette){
        try {
            //Lecture du fichier JSON existant
            File file = new File("src/main/resources/json/recettes.json");
            ObjectMapper objectMapper = new ObjectMapper();

            //sérialisation
            ArrayList<Recette> recettes  = objectMapper.readValue(file, new TypeReference<ArrayList<Recette>>() {});


            for (Recette recette : recettes) {
                if (recette.getNomRecette().equals(nomRecette))
                    return recette;
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Supprime une recette du fichier json
     * @param nomRecette le nom de la recette a supprimé
     */
    public static void removeRecette(String nomRecette){
        try {
            //Lecture du fichier JSON existant
            File file = new File("src/main/resources/json/recettes.json");
            ObjectMapper objectMapper = new ObjectMapper();

            //sérialisation
            ArrayList<Recette> recettes  = objectMapper.readValue(file, new TypeReference<ArrayList<Recette>>() {});

            //retire la recette
            for(int i=0; i<recettes.size();i++){
                if(recettes.get(i).getNomRecette().equals(nomRecette)){
                    recettes.remove(recettes.get(i));
                }
            }
            //mise à jour du fichier json
            JsonGenerator jsonGenerator = objectMapper.getFactory().createGenerator(
                    new File("src/main/resources/json/recettes.json"), JsonEncoding.UTF8);
            jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
            objectMapper.writeValue(jsonGenerator, recettes);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Ajoute une recette au fichier json
     * @param nom nom de la recette
     * @param ingredients les ingrédients de la recette
     */
    public static void addRecette(String nom, ArrayList<Ingredient> ingredients){
        try {
            //Lecture du fichier JSON existant
            File file = new File("src/main/resources/json/recettes.json");
            ObjectMapper objectMapper = new ObjectMapper();

            //sérialisation
            ArrayList<Recette> recettes  = objectMapper.readValue(file, new TypeReference<ArrayList<Recette>>() {});

            //ajoute une recette
            recettes.add(new Recette(nom,ingredients));

            //mise à jour du fichier json
            JsonGenerator jsonGenerator = objectMapper.getFactory().createGenerator(
                    new File("src/main/resources/json/recettes.json"), JsonEncoding.UTF8);
            jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
            objectMapper.writeValue(jsonGenerator, recettes);

        }catch (IOException e) {
            e.printStackTrace();
        }


    }

}
