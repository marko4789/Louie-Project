/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author marko
 */

public class frmInicioSesion extends javax.swing.JFrame {

    /**
     * Creates new form frmInicioSesion
     */
    
      Fondo fondo = new Fondo();
    
    public frmInicioSesion() {
        
        this.setContentPane(fondo);
        initComponents();
        componentes();
        
    }//fin constructor
    
    
    //clase Fondo, sirve para ponerle un fondo al jFrame
     class Fondo extends JPanel{    
            private Image img; 
            @Override
            public void paint(Graphics g){   
                img = new ImageIcon(getClass().getResource("/Recursos/puerta.jpg")).getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(),this);
                setOpaque(false);
                super.paint(g);
            }//fin paint     
    }//fin fondo
     
     /* class FondoPanel extends JPanel{    
            private Image img; 
            @Override
            public void paint(Graphics g){   
                img = new ImageIcon(getClass().getResource("/Recursos/panel_t.png")).getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(),this);
                setOpaque(false);
                super.paint(g);
            }//fin paint     
    }//fin fondo
     */
     
     public void componentes(){
         
         panelLogin.setOpaque(false);
         btnInfo.setOpaque(false);
         btnInfo.setContentAreaFilled(false);
         //btnInfo.setBorderPainted(false);
     }//fin componentes
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        panelLogin = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtContrasena = new javax.swing.JPasswordField();
        btnIniciarSesion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/louie.png"))); // NOI18N
        jLabel3.setToolTipText("Louie");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        panelLogin.setBackground(new java.awt.Color(0, 204, 153));
        panelLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        txtUsuario.setToolTipText("Nombre de usuario");
        panelLogin.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 159, 30));

        txtContrasena.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        txtContrasena.setToolTipText("Contraseña");
        panelLogin.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 159, 30));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        btnIniciarSesion.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        btnIniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/login.png"))); // NOI18N
        btnIniciarSesion.setText("Ingresar");
        btnIniciarSesion.setToolTipText("Iniciar sesión");
        btnIniciarSesion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIniciarSesionMouseExited(evt);
            }
        });
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        panelLogin.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 220, 60));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario.png"))); // NOI18N
        panelLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/contraseña.png"))); // NOI18N
        panelLogin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 104, 373, 251));

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info_50.png"))); // NOI18N
        btnInfo.setToolTipText("Ayuda");
        btnInfo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info_50.png"))); // NOI18N
        btnInfo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info_50_light.png"))); // NOI18N
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(581, 28, -1, -1));

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Salir de la interfaz");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 417, 140, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/inicioSesion.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public boolean sonDatosCorrectos(String usuario, String contrasena){
        
        Conexion conexion = new Conexion();
        ResultSet resultados = conexion.consultarTabla("tabla_usuarios", "nombre = '" + usuario + "' AND contraseña = '" + contrasena + "'");
        
        try {
            resultados.next();
            if(resultados.getRow() != 0){
                return true;
            }else{
                return false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(frmInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }//fin sonDatosCorrectos
    
  /*   public boolean verificarAdmin(String usuario){      
        Conexion conexion = new Conexion();
        ResultSet resultados = conexion.consultarTabla("tabla_usuarios", "tipo = 'Administrador' AND nombre = '"+ usuario +"' ");
        try {         
            if(resultados.getRow() != 0){
                return true;
            }else{
                return false;
            }           
        } catch (SQLException ex) {
            Logger.getLogger(frmInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }//fin verificarAdmin
   */  
     //se obtiene el id de un usuario que encontró
     public int obtenerUsuario(String nombre){
          int id = -1;
        Conexion conexion = new Conexion();
        ResultSet resultados = conexion.consultarTabla("tabla_usuarios", "nombre = '"+ nombre +"' ");
          try {
              while(resultados.next() == true){
               
                  id = resultados.getInt("id_usuario");
               
              }//fin while
 
          } catch (SQLException ex) {
              Logger.getLogger(frmInicioSesion.class.getName()).log(Level.SEVERE, null, ex);
          }
         return id;
     }//fin obtenerUsuario
    
    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
      
        
        String strUsuario = txtUsuario.getText().toString();
       String strContrasena = txtContrasena.getText();
       
        
        if(sonDatosCorrectos(strUsuario, strContrasena)){
            
           // System.out.println("El id del usuario es:"+ obtenerUsuario(strUsuario));
            this.dispose();
            new frmMenu(obtenerUsuario(strUsuario)).setVisible(true);
            
        }else{
            
            if(strUsuario.isBlank() && strContrasena.isBlank()){
                JOptionPane.showMessageDialog(this, "Por favor, llena los espacios en blanco", "Faltan datos", 0);
            }else{
                JOptionPane.showMessageDialog(this, "Usuario no encontrado", "Error", 0);
            }
            
        }
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
       
        btnInfo.setIcon(new ImageIcon(getClass().getResource("/Recursos/info_50_light.png")));
        
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
         btnInfo.setIcon(new ImageIcon(getClass().getResource("/Recursos/info_50.png")));
         btnInfo.setSelected(true);
    }//GEN-LAST:event_jLabel3MouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        JOptionPane.showMessageDialog(this, "Ingresa tu nombre de usuario y contraseña para acceder", "Ayuda", 1);
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseEntered
        btnIniciarSesion.setBackground(Color.getHSBColor(150, 39, 51));
    }//GEN-LAST:event_btnIniciarSesionMouseEntered

    private void btnIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseExited
        btnIniciarSesion.setBackground(Color.white);
    }//GEN-LAST:event_btnIniciarSesionMouseExited

    private void btnIniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarSesionMouseClicked
        btnIniciarSesion.setBackground(Color.white);
    }//GEN-LAST:event_btnIniciarSesionMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
