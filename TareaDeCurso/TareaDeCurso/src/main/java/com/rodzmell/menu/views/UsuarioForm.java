/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.rodzmell.menu.views;


import com.rodzmell.menu.controller.CtrUsuario;


/**
 *
 * @author lenovo
 */
public class UsuarioForm extends javax.swing.JFrame {

    /**
     * Creates new form Usuario
     */
    public UsuarioForm() {
        initComponents();
        setLocationRelativeTo(null);
        iniciar();
    }
    
    public void iniciar(){
        CtrUsuario ct = new CtrUsuario(this);
        btnLogin.addActionListener(ct);
        btnRegistrar.addActionListener(ct);
        btnExit.addActionListener(ct);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtContra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(42, 59, 113));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/desconocido.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 140, 130));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 80, 20));

        txtUsuario.setBackground(new java.awt.Color(42, 59, 113));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 240, 30));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 60, 20));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 240, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 240, 10));

        btnLogin.setBackground(new java.awt.Color(42, 59, 113));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/entrar.png"))); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.setActionCommand("ingresar");
        btnLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 110, 40));

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/boton-agregar.png"))); // NOI18N
        btnRegistrar.setActionCommand("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setContentAreaFilled(false);
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 70, 70));

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion.png"))); // NOI18N
        btnExit.setActionCommand("exit");
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 70, 70));

        txtContra.setBackground(new java.awt.Color(42, 59, 113));
        txtContra.setBorder(null);
        jPanel1.add(txtContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 240, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnExit;
    public javax.swing.JButton btnLogin;
    public javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JPasswordField txtContra;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
