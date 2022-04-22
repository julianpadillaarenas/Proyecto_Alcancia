/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home.prueba;

import java.util.ArrayList;

/**
 *
 * @author julian_padilla
 */
public class AlcanciaController {
    private static ArrayList<Alcancia> AlcanciaArray = new ArrayList<Alcancia>();

    public AlcanciaController() {
        AlcanciaArray.add(new Alcancia(100));
        AlcanciaArray.add(new Alcancia(200));
        AlcanciaArray.add(new Alcancia(500));
        AlcanciaArray.add(new Alcancia(1000));
        AlcanciaArray.add(new Alcancia(50));
    }
    
    public  void Añadir(Alcancia al){
        AlcanciaArray.add(al);
    }
    
    public boolean Eliminar(Alcancia a ){
        boolean entra = false;
        for (int i = 0; i < AlcanciaArray.size(); i++) {
            if(AlcanciaArray.get(i).getDenominacion()==a.getDenominacion()){
                entra=true;
                AlcanciaArray.remove(i);
                break;
            }
        }
        return entra;
    }
    
    public  ArrayList<Alcancia> ListarAll(){
        return AlcanciaArray;
    }
    
    public  int ListarMonedaCantidad(int moneda){
        int size=0;
        for(int i =0;i<AlcanciaArray.size();i++){
            if(AlcanciaArray.get(i).getDenominacion()==moneda){
                size += 1;
            }
        }
        return size;
    }
    
    public  int ListarDineroEnMonedas(int moneda){
        int size=0;
        for(int i =0;i<AlcanciaArray.size();i++){
            if(AlcanciaArray.get(i).getDenominacion()==moneda){
                size += moneda;
            }
        }
        return size;
    }
    
    public  int ListarDineroTotal(){
        int size=0;
        for(int i =0;i<AlcanciaArray.size();i++){
            size += AlcanciaArray.get(i).getDenominacion();
        }
        return size;
    }
    
    public int ListarCantidadMonedas(){
        return AlcanciaArray.size();
    }
}
