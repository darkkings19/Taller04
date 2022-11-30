package Launcher;

import GUI.Ventana_Inicial;
import Modelo.DatosPais;
import Modelo.Pais;

public class main {
    public static void main(String[] args) {
        Pais pais = new Pais();
        DatosPais.leerArchivoPaises(pais, "teams.txt");
        new Ventana_Inicial(pais);
    }
}
