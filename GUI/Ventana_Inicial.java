package GUI;

import Modelo.Pais;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ventana_Inicial extends Ventana implements ActionListener {
    private Pais pais;
    private JButton EXIT;
    private JButton Jugadores;
    private JComboBox Pais;

    private JLabel Nombre;
    private JLabel Ranking;

    public Ventana_Inicial(Pais pais){
        this.pais = pais;

        this.setTitle("TEAMS");
        this.generarEtiqueta("Nombre:",20,100,80,20);
        this.generarEtiqueta("Ranking:",20,100,80,20);

    Jugadores = this.generarBoton("Jugadores",200,200,150,30);
    Jugadores.addActionListener(this);

    EXIT = this.generarBoton("EXIT",200,200,150,30);
    EXIT.addActionListener(null);

    Pais = this.generarCampoDeEleccion(pais.getNamePais(),20,50,200,20);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Jugadores) {
            Ventana_Jugadores ventanaJugadores = new Ventana_Jugadores();
            this.dispose();

    }
}
}
