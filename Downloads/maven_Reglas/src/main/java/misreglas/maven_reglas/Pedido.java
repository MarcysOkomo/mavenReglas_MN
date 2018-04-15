/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author marcys-okomo
 */
public class Pedido {
    private static int id=0;
    private ArrayList<lineaPdidos> lineaspedido;
    private int cliente;
    private double importePedido;
    private final Fecha fechaPedido;

    public Pedido(int cliente, Fecha fechaPedido) {
        this.id++;
        this.lineaspedido = new ArrayList<>();
        this.cliente = cliente;
        this.importePedido =0;
        this.fechaPedido = fechaPedido;
    }

    
    public String getLineaspedido() {
        String s = " ";
        for (int i = 0; i < lineaspedido.size(); i++) 
           s+= lineaspedido.get(i).toString();
        return s;
    }

    public void setLineaspedido(lineaPdidos lineaspedido) {
        this.lineaspedido.add(lineaspedido);
    }

    public int getCliente() {
        return cliente;
    }

    public void setCliente(int cliente) {
        this.cliente = cliente;
    }

    public double getImportePedido() {
        
        for (int i = 0; i < lineaspedido.size(); i++) {
            importePedido+=lineaspedido.get(i).getTotalLinea();
        }
        return importePedido;
    }

    public void setImportePedido(double importePedido) {
        this.importePedido = importePedido;
    }
    

    @Override
    public String toString() {
        String s = "" + getLineaspedido();
        return " id Pedido " +id +" Cliente del pedido: " + cliente + " Importe total " + getImportePedido()+ "\nLineas"
                + getLineaspedido();
    }

    public static int getId() {
        return id;
    }

    public Fecha getFechaPedido() {
        return fechaPedido;
    }
    
    
    
    
}
