package Modelo;
import  Modelo.Pais;
import java.io.*;
public class DatosPais {
    public static void leerArchivoPaises(Pais pais,String direccionArchivo){
        String textoArchivo ="";
        try {
        File archivo = new File(direccionArchivo);
        FileReader XD = new FileReader(archivo);
        BufferedReader od = new BufferedReader(XD);
        while ((textoArchivo = od.readLine()) != null){
            String[] data = textoArchivo.split(";");

        }
        }catch (Exception e){
            System.out.println("Documento no encontrado");
        }
    }
}
