package Model.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class RecetteJsonReader {

/*

    public static void readJsonFile() {
        try {
            //Lecture du fichier JSON
            File file = new File("src/main/resources/json/recettes.json");

            ObjectMapper objectMapper = new ObjectMapper();

            recettes = objectMapper.readValue(file, Recette[].class);
/*
            System.out.println(recettes);
            System.out.println(recettes.length);
            System.out.println(recettes[0].getIngredients()[0].getNomIngredient());

 */
            /*

            JsonNode jsonNode = objectMapper.readTree(file);

            for(int i=0; i< jsonNode.size();i++){
                recettes.add(jsonNode.get(i).get("nomRecette").asText());
                //System.out.println(jsonNode.get(i).get("nomRecette").asText());
                //Ingredient[] ingredients = objectMapper.readValue(jsonNode.get(i).get("ingredients"),Ingredient[].class)
                //System.out.println(jsonNode.get(i).get("ingredients"));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
*/


    public static ArrayList<String> getNomRecette(){
        ArrayList<String> nomRecettes = new ArrayList<String>();
        try {
            //Lecture du fichier JSON existant
            File file = new File("src/main/resources/json/recettes.json");
            ObjectMapper objectMapper = new ObjectMapper();

            //sérialisation
            ArrayList<Recette> recettes  = objectMapper.readValue(file, new TypeReference<ArrayList<Recette>>() {});


            for(int i=0; i<recettes.size();i++){
                nomRecettes.add(recettes.get(i).getNomRecette());
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return nomRecettes;
    }

    public static Recette getRecette(String nomRecette){
        try {
            //Lecture du fichier JSON existant
            File file = new File("src/main/resources/json/recettes.json");
            ObjectMapper objectMapper = new ObjectMapper();

            //sérialisation
            ArrayList<Recette> recettes  = objectMapper.readValue(file, new TypeReference<ArrayList<Recette>>() {});


            for(int i=0; i<recettes.size();i++){
                if(recettes.get(i).getNomRecette().equals(nomRecette))
                    return recettes.get(i);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

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
