package com.rodzmell.menu.controller;

import com.rodzmell.menu.models.MenuModels;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.rodzmell.menu.views.MenuOpciones;
import com.rodzmell.menu.views.NominaFrame;
import com.rodzmell.menu.views.Settings;

public class MenuController implements ActionListener {

    MenuOpciones mo;
    NominaFrame n;

    public MenuController(MenuOpciones mo) {
        this.mo = mo;
    }

    public MenuController(NominaFrame n) {
        this.n = n;
    }

    @Override

    public void actionPerformed(ActionEvent e) {

        MenuModels mmodels = new MenuModels();
        switch (e.getActionCommand()) {
            case "NuevoA":
                isVisibleNomina();
                break;
            case "CerrarA":
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void showSetting() {
        Settings cd = new Settings(mo, true);
        cd.setLocationRelativeTo(null);
        cd.setVisible(true);
    }

    public void isVisibleNomina() {
        NominaFrame n = new NominaFrame();
        mo.isVisible(n, true);
    }

}
