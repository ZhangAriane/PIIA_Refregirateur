package Model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Aliment {
    public String nom;
    public String type;
    int taille ;
    int unite;
    String Aliment;


    public Aliment (String nom,String type,int taille,int unite){
        this.nom = nom;
        this.type = type;
        this.taille = taille;
        this.unite =unite;
    }


}
