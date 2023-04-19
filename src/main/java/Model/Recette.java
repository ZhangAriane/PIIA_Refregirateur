package Model;

import Model.Ingredient;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Recette {
    private String nomRecette;
    //private Ingredient[] ingredients;
    private ArrayList<Ingredient> ingredients;


    public Recette(@JsonProperty("nomRecette") String nomRecette,
                @JsonProperty("ingredients") ArrayList<Ingredient> ingredients){
        this.nomRecette = nomRecette;
        this.ingredients = ingredients;
    }

/*
    public Recette(String nomRecette, ArrayList<Ingredient> ingredients) {
        this.nomRecette = nomRecette;
        this.ingredients = ingredients;
    }
*/
    @Override
    public String toString() {
        return "Recette{" +
                "nomDuRcette='" + nomRecette + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }


    public String getNomRecette() {
        return nomRecette;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setNomRecette(String nomRecette) {
        this.nomRecette = nomRecette;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
