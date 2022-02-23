package com.rodzmell.menu.controller;

import com.rodzmell.menu.main.MenuMain;
import com.rodzmell.menu.models.Usuario;
import com.rodzmell.menu.views.Registro;
import com.rodzmell.menu.views.SplashScreen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrRegistro implements ActionListener {

    private Registro registro;

    public CtrRegistro(Registro registro) {
        this.registro = registro;
    }

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "registro":
                Usuario usuario = new Usuario();
                usuario.setUser(registro.txtNewUsuario.getText());
                usuario.setContra(registro.txtNewContra.getText());
                usuario.guardarUsuario(usuario.getUser(), usuario.ecnode("Que Pro", usuario.getContra()));
                SplashScreen.showLogin();
                this.registro.dispose();
                break;
            case "cancel":
                SplashScreen.showLogin();
                this.registro.dispose();
                break;

            default:
                throw new AssertionError();
        }
    }

}
