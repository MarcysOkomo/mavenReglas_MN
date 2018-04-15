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
public class lineaPdidos {
    private int idLinea=0;
    private Producto producto;
    private int unidades;
    private double totalLinea;

    public lineaPdidos(Producto producto, int unidades) {
        this.idLinea++;
        this.producto = producto;
        this.unidades = unidades;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getTotalLinea() {
        return totalLinea;
    }

    public void setTotalLinea() {
        this.totalLinea = unidades*producto.getPrecio();
    }

    @Override
    public String toString() {
        return "lineaPdidos\n " + "idLinea = " + idLinea + ",  producto = "
                + " " + producto + ",  unidades = "  + unidades + ", totalLinea = " + totalLinea ;
    }
    
    
    
    
}
