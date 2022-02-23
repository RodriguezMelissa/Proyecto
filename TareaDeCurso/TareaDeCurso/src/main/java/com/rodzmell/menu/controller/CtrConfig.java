
package com.rodzmell.menu.controller;

import com.rodzmell.menu.misc.ConfigPropiedades;
import com.rodzmell.menu.views.Settings;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class CtrConfig implements ActionListener{
    Settings settings;

    public CtrConfig(Settings settings) {
        this.settings = settings;
        
    } 
    
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Guardar":
                saveSettings();
                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void saveSettings(){
        ConfigPropiedades cp = new ConfigPropiedades();
        cp.setProperty("Empresa", settings.getCompanyName());
        cp.setProperty("Direccion", settings.getDirection());
        cp.setProperty("Numero", settings.getNumber());
        if(cp.guardarPropiedades()){
            settings.dispose();
        }
        else{
            JOptionPane.showMessageDialog(settings, "Ocurrió un error al guardar la configuración.", "Configuración", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
