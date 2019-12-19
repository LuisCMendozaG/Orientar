/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorientar;

/**
 *
 * @author luis_
 */
public class tipoPiezas {
    public String tipoPieza,tipoEmbalaje;
    public int orientacionX, orientacionY, orientacionZ,vueltas,cantidad=0;
    
    public tipoPiezas(){}
    
    public tipoPiezas(String tipoPieza, int orientacionX, int orientacionY, int orientacionZ, String tipoEmbalaje, int vueltas) {
        this.tipoPieza = tipoPieza;
        this.orientacionX = orientacionX;
        this.orientacionY = orientacionY;
        this.orientacionZ = orientacionZ;
        this.tipoEmbalaje = tipoEmbalaje;
        this.vueltas=vueltas;
    }
    public tipoPiezas(int cantidad){
        this.cantidad=cantidad;
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
    
    public String getTipoEmbalaje() {
        return tipoEmbalaje;
    }
    
    public int getVueltas() {
        return vueltas;
    }

    public int getCantidad() {
        return cantidad;
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
    
    public void setTipoEmbalaje(String tipoEmbalaje){
        this.tipoEmbalaje = tipoEmbalaje;
    }

    public void setVueltas(int vueltas) {
        this.vueltas = vueltas;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "tipoPiezas{" + "tipoPieza=" + tipoPieza + ", tipoEmbalaje=" + tipoEmbalaje + ", orientacionX=" + orientacionX + ", orientacionY=" + orientacionY + ", orientacionZ=" + orientacionZ + ", vueltas=" + vueltas + ", cantidad=" + cantidad + '}';
    }

 
    
    
}
