/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author marcys-okomo
 */
public class Producto {
    private int codigoP=0;
    private double precio;
    private String nombreP;

    public Producto(double precio, String nombreP) {
        this.codigoP++;
        this.precio = precio;
        this.nombreP = nombreP;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    @Override
    public String toString() {
        return "Producto \n" + " codigoP = " + codigoP + "  , precio = " + precio + ", nombreP = " + nombreP + '}';
    }
    
    
    
    
}
