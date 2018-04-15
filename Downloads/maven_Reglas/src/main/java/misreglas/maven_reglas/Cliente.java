/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author marcys-okomo
 */
public class Cliente {
    private String nombre;
    private int dni;
    private static int num=0;
    private boolean vip;
    private ArrayList<Pedido> pedidos;
    private int numPedidos_anio=0, ano_actual;

    public Cliente(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.num++;
        this.vip=false;
        pedidos = new ArrayList<>();
        this.ano_actual=Calendar.YEAR;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        
        return  "Datos del Ciente:\n" +"nombre  = " + nombre + ", dni =  " + dni + ", num =   " + num  + " Tipo " + isVip();
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido pedido) {
        this.pedidos.add(pedido);
        
        if(this.ano_actual==pedido.getFechaPedido().getAno())
            this.numPedidos_anio++;
        else {
            ano_actual=pedido.getFechaPedido().getAno();
            this.numPedidos_anio=1;  //pimer pedido del cliente dni del anio
        }
        if(numPedidos_anio>=10) this.setVip(true);
    }
    
    public void pedidosCliente(){
        System.out.println("El cliente " + dni + " tiene " + pedidos.size()+ " pedidos");
        System.out.println();
            for (int i = 0; i < pedidos.size(); i++) {
                System.out.println(pedidos.get(i).toString());
        }
    }
    
    
    
    
}
