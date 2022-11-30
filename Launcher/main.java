package Launcher;

import GUI.Ventana_Inicial;
import Modelo.DatosPais;
import Modelo.Pais;
import Modelo.TEAMS;

public class main {
    public static void main(String[] args) {
        TEAMS pais = new TEAMS();
        DatosPais.leerArchivoPaises(pais, "teams.txt");
        new Ventana_Inicial(pais);
    }
}
