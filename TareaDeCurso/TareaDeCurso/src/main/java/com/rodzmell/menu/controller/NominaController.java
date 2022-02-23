/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rodzmell.menu.controller;

import com.rodzmell.menu.models.ArregloNomina;
import com.rodzmell.menu.models.NominaData;
import com.rodzmell.menu.views.NominaFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class NominaController implements ActionListener {
 NominaFrame n;
 
 public NominaController(NominaFrame n){
     this.n = n;
 }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "add":
                n.agregarEmpleado();
                break;
            case "save":
                guardar();
                break;
            case "read":
                n.lectura();
                break;
           
        }
    }

  public void guardar() {
        ArregloNomina nomina = n.guardado();
        NominaData d = new NominaData();
        JFileChooser j = new JFileChooser();
        j.showSaveDialog(n);
        File file = j.getSelectedFile();
        if(file!=null){
           try {
                d.save(file, nomina);
                if(file.exists()){
                    JOptionPane.showMessageDialog(n, "El archivo fue guardado corectamente");
                    
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(n, "El archivo no pudo ser guardado correctamente");
                Logger.getLogger(NominaController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArregloNomina Leer() {
       JFileChooser x = new JFileChooser();
       ArregloNomina nomina = null;
       NominaData nd = new NominaData();
       x.showOpenDialog(n);
       File f = x.getSelectedFile();
       if(f!=null){
           try {
               nomina = nd.read(f);
           } catch (IOException ex) {
               JOptionPane.showMessageDialog(n, "El archivo no pudo ser leido correctamente");
               Logger.getLogger(NominaController.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
     return nomina;
        
    }
    
    
    
}
