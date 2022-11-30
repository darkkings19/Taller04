package GUI;

import Modelo.Pais;
import javax.swing.*;
import java.awt.*;
import java.util.List;
public abstract class Ventana extends JFrame{
 public Ventana{
  this.setLayout(null);
  this.setSize(400,300);
  this.setVisible(true);
  this.setLocationRelativeTo(null);
  this.setResizable(false);
 }
 protected JComboBox generarCampoDeEleccion(int x,int y, int ancho, int largo){
  JComboBox<String> comboBox = new JComboBox<String>();
  this.add(comboBox);
comboBox.setBounds(x,y,ancho,largo);
  return comboBox;
 }
}
