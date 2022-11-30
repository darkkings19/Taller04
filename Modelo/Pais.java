package Modelo;

import java.awt.*;
import java.util.List;

public class Pais {
    private int ranking;
    private String namePais;
    private int id;
    private Image image;
    public Pais(int id,String namePais,int ranking,Image image){
    this.id = id;
    this.namePais = namePais;
    this.ranking = ranking;
    this.image = image;
    }

    public int getId() {
        return id;
    }

    public int getRanking() {
        return ranking;
    }

    public List<Pais> getNamePais() {
        return namePais;
    }

    public Image getImage() {
        return image;
    }

    @Override
    public String toString() {
        return ( this.id + "," + this.namePais + "," + this.ranking);
    }
}
