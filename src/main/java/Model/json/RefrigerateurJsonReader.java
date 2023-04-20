package Model.json;

import Model.Aliment;
import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class RefrigerateurJsonReader {


    public static ArrayList<Aliment> getAliment(){
        ArrayList<Aliment> aliments = new ArrayList<>();
        try{
            //Lecture du fichier JSON existant
            File file = new File("src/main/resources/json/refrigerateur.json");
            ObjectMapper objectMapper = new ObjectMapper();

            //sérialisation
            aliments  = objectMapper.readValue(file, new TypeReference<ArrayList<Aliment>>() {});

        }catch (IOException e) {
            e.printStackTrace();
        }
        return aliments;
    }

    /**
     * Ajoute un aliment au fichier json
     * @param aliment
     */
    public static void addAliment(Aliment aliment){
        try {
            //Lecture du fichier JSON existant
            File file = new File("src/main/resources/json/refrigerateur.json");
            ObjectMapper objectMapper = new ObjectMapper();

            //sérialisation
            ArrayList<Aliment> aliments  = objectMapper.readValue(file, new TypeReference<ArrayList<Aliment>>() {});

            //ajoute un aliment
            aliments.add(aliment);
            System.out.println(aliment.getNom() + "reader");
            System.out.println();

            //mise à jour du fichier json
            JsonGenerator jsonGenerator = objectMapper.getFactory().createGenerator(
                    new File("src/main/resources/json/refrigerateur.json"), JsonEncoding.UTF8);
            jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
            objectMapper.writeValue(jsonGenerator, aliments);

        }catch (IOException e) {
            e.printStackTrace();
        }
    }


}
