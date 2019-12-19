/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorientar.clasesDesechadas;

import java.io.Serializable;
import java.util.Random;
import org.json.simple.JSONArray;
import proyectoorientar.Pieza;

/**
 *
 * @author luis_
 */
public class CrearPiezas {
    
    long idPieza;
    Pieza pieza = new Pieza();
        Random rand = new Random();
        int maxX=0, minX=0,maxY=0, minY=0,maxZ=0, minZ=0;
        String[] tipoPiezaArray = {"rotulas","eje delantero","brazo de suspencion", "barra estabilizadora", "horquilla"};    
        
    public Pieza crearPieza(){
        pieza.setIdPieza(rand.nextInt((99999 - 1) + 1) + 1);
        idPieza++;
        pieza.setTipoPieza(tipoPiezaArray[rand.nextInt((4 - 0) + 1) + 0]);
        if (pieza.getTipoPieza().equalsIgnoreCase("rotulas")){
        pieza.orientacionX=50;
        pieza.orientacionY=70;
        pieza.orientacionZ=20;
        maxX=60;maxY=80;maxZ=30;
        }
        else if (pieza.getTipoPieza().equalsIgnoreCase("eje delantero")){
        pieza.orientacionX=45;
        pieza.orientacionY=65;
        pieza.orientacionZ=15;
        maxX=65;maxY=85;maxZ=35;
        }
        else if (pieza.getTipoPieza().equalsIgnoreCase("brazo de suspencion")){
        pieza.orientacionX=55;
        pieza.orientacionY=75;
        pieza.orientacionZ=25;
        maxX=65;maxY=85;maxZ=35;
        }
        else if (pieza.getTipoPieza().equalsIgnoreCase("barra estabilizadora")){
        pieza.orientacionX=10;
        pieza.orientacionY=15;
        pieza.orientacionZ=5;
        maxX=20;maxY=20;maxZ=10;
        }
        else if (pieza.getTipoPieza().equalsIgnoreCase("horquilla")){
        pieza.orientacionX=25;
        pieza.orientacionY=25;
        pieza.orientacionZ=30;
        maxX=50;maxY=50;maxZ=40;
        }
        
        pieza.orientacionRealX=rand.nextInt((maxX - minX) +1 ) + minX;
        pieza.orientacionRealY=rand.nextInt((maxY - minY) +1 ) + minY;
        pieza.orientacionRealZ=rand.nextInt((maxZ - minZ) +1 ) + minZ;
        
        return pieza;
    }
}
