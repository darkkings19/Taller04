package Modelo;

public class Pais {
    private int ranking;
    private String namePais;
    private int id;
    public Pais(int id,String namePais,int ranking){
    this.id = id;
    this.namePais = namePais;
    this.ranking = ranking;
    }

    public int getId() {
        return id;
    }

    public int getRanking() {
        return ranking;
    }

    public String getNamePais() {
        return namePais;
    }

    @Override
    public String toString() {
        return ( this.id + "," + this.namePais + "," + this.ranking);
    }
}
