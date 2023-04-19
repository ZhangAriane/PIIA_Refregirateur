package Model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Ingredient {
    private String nomIngredient;
    private int quantite;
    private String unite;


    public Ingredient(@JsonProperty("nomIngredient") String nomIngredient,
                   @JsonProperty("quantite") int quantite,
                      @JsonProperty("unite") String unite ){
        this.nomIngredient = nomIngredient;
        this.quantite = quantite;
        this.unite = unite;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "nomIngredient='" + nomIngredient + '\'' +
                ", quantite=" + quantite +
                ", unite='" + unite + '\'' +
                '}';
    }


    public String getNomIngredient() {
        return nomIngredient;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getUnite() {
        return unite;
    }

    public void setNomIngredient(String nomIngredient) {
        this.nomIngredient = nomIngredient;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }
}
