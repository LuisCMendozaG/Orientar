/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorientar;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Path;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.*;
import java.io.FileWriter;
import static java.lang.Math.log;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.*;
import org.json.simple.JSONArray;

/**
 *
 * @author luis_
 */
public class manejarPiezas {
    
    public static final String ANSI_RED = "\u001B[31m";
    
    public Pieza leerJSON(String nombreArchivo) {   
        JSONParser parser = new JSONParser();
        Pieza pieza = new Pieza();
        try {
            Object obj = parser.parse(new FileReader("c:\\Users\\luis_\\Desktop\\ProyectoOrientar\\"+nombreArchivo+".json"));

            JSONObject jsonObject = (JSONObject) obj;

            long id = (long) jsonObject.get("idPieza");
            long x = (long) jsonObject.get("orientacionX");
            long y = (long) jsonObject.get("orientacionY");
            long z = (long) jsonObject.get("orientacionZ");
            long rx = (long) jsonObject.get("orientacionRealX");
            long ry = (long) jsonObject.get("orientacionRealY");
            long rz = (long) jsonObject.get("orientacionRealZ");
            long nv = (long) jsonObject.get("vueltas");

            pieza.setIdPieza((int) id);
            pieza.setTipoPieza((String) jsonObject.get("tipoPieza"));
            pieza.setOrientacionX((int) x);
            pieza.setOrientacionY((int) y);
            pieza.setOrientacionZ((int) z);
            pieza.setOrientacionRealX((int) rx);
            pieza.setOrientacionRealY((int) ry);
            pieza.setOrientacionRealZ((int) rz);
            pieza.setDestino((String) jsonObject.get("destino"));
            pieza.setTipoEmbalaje((String) jsonObject.get("tipoEmbalaje"));
            pieza.setVueltas((int) nv);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, e + " No se encontro el archivo");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, e + " Parse Error");
        }
        return pieza;
    }

    public void mover(String nombreArchivo) throws FileNotFoundException, IOException, ParseException {
        JSONParser parser = new JSONParser();
        String urlOrigen = "Pieza.json";
        File origen = new File(urlOrigen);
        Object obj = parser.parse(new FileReader(urlOrigen));
        JSONObject jsonObject = (JSONObject) obj;
        File destino = new File("terminadas\\Pieza" + (long) jsonObject.get("idPieza") + ".json");
        try {
            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino);

            byte[] buf = new byte[1024];
            int len;

            while ((len = in.read(buf)) > 0) {
                out.write(buf, 0, len);
            }
            in.close();
            out.close();
            
            
            boolean status = true;
            try {
                status = origen.delete();
            } catch (Exception e) {
                System.out.println("error al borrar el archivo "+e);
            }
            System.out.println(status);
            
            
            
            
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void crearJSON(Pieza pieza) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonEjemplo = gson.toJson(pieza);  
        JSONObject obj = new JSONObject();
        try {

            FileWriter file = new FileWriter("c:\\Users\\luis_\\Desktop\\ProyectoOrientar\\Pieza.json");
            file.write(jsonEjemplo);
            file.flush();
            file.close();

        } catch (IOException e) {
            System.out.println(e + "Error crear el JSON");
        }
    }
    

}
