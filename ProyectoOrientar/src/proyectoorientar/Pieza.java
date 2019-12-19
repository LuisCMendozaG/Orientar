/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorientar;

import org.json.simple.JSONArray;


public class Pieza {
    public int idPieza;
    public String tipoPieza, destino, tipoEmbalaje;
    public int orientacionX, orientacionY, orientacionZ, orientacionRealX, orientacionRealY, orientacionRealZ,vueltas;

    
    public Pieza(){}

    public Pieza(int idPieza, String tipoPieza, int orientacionX, int orientacionY, int orientacionZ, int orientacionRealX, int orientacionRealY, int orientacionRealZ, String tipoEmbalaje, int vueltas, String destino) {
        this.idPieza = idPieza;
        this.tipoPieza = tipoPieza;
        this.orientacionX = orientacionX;
        this.orientacionY = orientacionY;
        this.orientacionZ = orientacionZ;
        this.orientacionRealX = orientacionRealX;
        this.orientacionRealY = orientacionRealY;
        this.orientacionRealZ = orientacionRealZ;
        this.tipoEmbalaje=tipoEmbalaje;
        this.vueltas = vueltas;
        this.destino = destino;
    }

    public int getIdPieza() {
        return idPieza;
    }

    public String getTipoPieza() {
        return tipoPieza;
    }

    public int getOrientacionX() {
        return orientacionX;
    }

    public int getOrientacionY() {
        return orientacionY;
    }

    public int getOrientacionZ() {
        return orientacionZ;
    }

    public int getOrientacionRealX() {
        return orientacionRealX;
    }

    public int getOrientacionRealY() {
        return orientacionRealY;
    }

    public int getOrientacionRealZ() {
        return orientacionRealZ;
    }
    
    public String getTipoEmbajale(){
        return tipoEmbalaje;      
    }
    
    public int getVueltas() {
        return vueltas;
    }

    public String getDestino() {
        return destino;
    }

    public void setIdPieza(int idPieza) {
        this.idPieza = idPieza;
    }

    public void setTipoPieza(String tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

    public void setOrientacionX(int orientacionX) {
        this.orientacionX = orientacionX;
    }

    public void setOrientacionY(int orientacionY) {
        this.orientacionY = orientacionY;
    }

    public void setOrientacionZ(int orientacionZ) {
        this.orientacionZ = orientacionZ;
    }

    public void setOrientacionRealX(int orientacionRealX) {
        this.orientacionRealX = orientacionRealX;
    }

    public void setOrientacionRealY(int orientacionRealY) {
        this.orientacionRealY = orientacionRealY;
    }

    public void setOrientacionRealZ(int orientacionRealZ) {
        this.orientacionRealZ = orientacionRealZ;
    }
    
    public void setTipoEmbalaje(String tipoEmbalaje){
        this.tipoEmbalaje=tipoEmbalaje;
    }
    
    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
    

    @Override
    public String toString() {
        return " idPieza=" + idPieza + "\t tipoPieza=" + tipoPieza +  "\n tipoEmbalaje=" + tipoEmbalaje +  "\t vueltas=" + vueltas +  "\t destino=" + destino + "\n orientacionX=" + orientacionX + "\t orientacionY=" + orientacionY + "\t orientacionZ=" + orientacionZ + "\n orientacionRealX=" + orientacionRealX + "\t orientacionRealY=" + orientacionRealY + "\t orientacionRealZ=" + orientacionRealZ;
    }


}