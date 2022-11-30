package Modelo;

public class Jugador {
    private int numCamiseta;
    private String name;
    private String posicion;

    public Jugador(int numCamiseta,String name,String posicion){
        this.numCamiseta = numCamiseta;
        this.name = name;
        this.posicion = posicion;
    }

    public String getName() {
        return name;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    @Override
    public String toString() {
        return ( this.numCamiseta + "," + this.name + "," + this.posicion);
    }
}
