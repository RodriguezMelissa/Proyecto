package com.rodzmell.menu.controller;

import com.rodzmell.menu.main.MenuMain;
import com.rodzmell.menu.models.Usuario;
import com.rodzmell.menu.views.SplashScreen;
import com.rodzmell.menu.views.UsuarioForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CtrUsuario implements ActionListener {

    private UsuarioForm usuario;
    private String user, contra;
    private static Scanner sc;
    private String[] usuarios = null;

    public CtrUsuario(UsuarioForm usuario) {
        this.usuario = usuario;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "ingresar":
                login();
                this.usuario.dispose();
                break;
            case "Registrar":
                SplashScreen.showRegistro();
                this.usuario.dispose();
                break;
            case "exit":
                System.exit(0);
                break;
            default:
                throw new AssertionError();
        }
    }

    public void encontrarUsuario() {
        FileReader fr = null;
        try {
            int numLineas = 0;
            int i = 0;

            String linea;
            sc = new Scanner(new File("USUARIOS.TXT"));
            File f = new File("USUARIOS.TXT");
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            try {
                while ((linea = br.readLine()) != null) {
                    numLineas++;//cuenta las lineas guardadas en el archivo USUARIOS
                }
            } catch (IOException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }

            usuarios = new String[numLineas];//size del arreglo
            while (sc.hasNextLine()) {
                usuarios[i++] = sc.nextLine();//almacenando cada linea en una posicion del arreglo 
            }

            validarUsuario(usuarios, user, contra);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void validarUsuario(String[] usuarios, String user, String contra) {
        boolean encontrar = false;
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i].equalsIgnoreCase(user) && usuarios[i + 1].equalsIgnoreCase(contra)) {
                encontrar = true;
                this.usuario.dispose();
                SplashScreen.showMenuOpciones();
                break;
            }
        }
        if (encontrar == false) {
            JOptionPane.showInternalMessageDialog(null, "Error \nUsuario y/o contraseña incorrectos \nIntente nuevamente", "Inicio de sesion", JOptionPane.ERROR_MESSAGE);
            usuario.txtUsuario.setText("");
            usuario.txtContra.setText("");
        }
    }

    public void login() {
        File f = new File("USUARIOS.TXT");
        if (f.exists()) {
            Usuario us = new Usuario();
            user = usuario.txtUsuario.getText();
            contra = us.ecnode("Que Pro", usuario.txtContra.getText());
            encontrarUsuario();
        } else {
            JOptionPane.showMessageDialog(null, "Aun no existe ningun usuario, registrese");
            this.usuario.dispose();
            SplashScreen.showRegistro();
            

        }
    }

}
