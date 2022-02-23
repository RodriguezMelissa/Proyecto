
package com.rodzmell.menu.models;

import com.rodzmell.menu.views.MenuOpciones;
import com.rodzmell.menu.views.NominaFrame;
import javax.swing.JOptionPane;


public class MenuModels {
    
    public void AgregarFila()
    {
        
   //  JOptionPane.showMessageDialog(null,"Boton de agregar fila");
     
    }
      public void EliminarFila()
    {
     JOptionPane.showMessageDialog(null,"Boton de eliminar fila");
     
    }
    public void ActualizarFila()
    {
     JOptionPane.showMessageDialog(null,"Boton de actualizar fila");
     
    }                
    public void Nuevo()
    {
         
        MenuOpciones m = new MenuOpciones();
        NominaFrame nf = new NominaFrame();
        m.isVisible(nf, true);
    
    // JOptionPane.showMessageDialog(null,"Boton de nuevo archivo");
     
    }
    public void Abrir()
    {
     JOptionPane.showMessageDialog(null,"Boton de abrir archivo");
    }
     public void Guardar()
    {
     JOptionPane.showMessageDialog(null,"Boton de guardar archivo");
     
    }
     public void Cerrar()
    {
     JOptionPane.showMessageDialog(null,"Boton de cerrar archivo");
    }
}
