/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rodzmell.menu.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ArregloNomina implements Serializable {
    private ArrayList<NominaData>nomina;
    
    public ArregloNomina(){
        nomina = new ArrayList<NominaData>();
    }
    
    public void adicionar(NominaData d){
        nomina.add(d);
        
    }
    
    public NominaData obtener(int posicion){
        return nomina.get(posicion);
    }
    
    public int tamaño(){
        return nomina.size();
    }
    
   

    
       
   
    
}
