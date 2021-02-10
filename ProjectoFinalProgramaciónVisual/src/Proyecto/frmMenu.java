/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

<a href='https://www.freepik.es/vectores/fondo'>Vector de Fondo 
creado por pikisuperstar - www.freepik.es</a>
 */
package Proyecto;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author marko
 */
public class frmMenu extends javax.swing.JFrame {

    
    Fondo fondo = new Fondo();
    int id_usuario;
    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        
        this.setContentPane(fondo);
        initComponents();
        inicializarComponentes();
        
    }//fin constructor frmMenu
    
    public frmMenu(int id_usuario) {
       this.id_usuario = id_usuario;
        
        this.setContentPane(fondo);
        initComponents();
        inicializarComponentes();
        
    }//fin constructor frmMenu

    //clase Fondo, sirve para ponerle un fondo al jFrame
     class Fondo extends JPanel{    
            private Image img; 
            @Override
            public void paint(Graphics g){   
                img = new ImageIcon(getClass().getResource("/Recursos/aula.jpg")).getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(),this);
                setOpaque(false);
                super.paint(g);
            }//fin paint     
    }//fin fondo
     
     
       class FondoPanel extends JPanel{    
            private Image img; 
            @Override
            public void paint(Graphics g){   
                img = new ImageIcon(getClass().getResource("/Recursos/nota.png")).getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(),this);
                setOpaque(false);
                super.paint(g);
            }//fin paint     
    }//fin fondo
         
    public void transparencia(){
        btnPizarra.setOpaque(false);
        btnBiblioteca.setOpaque(false);
        btnPizarra.setBorderPainted(false);
        btnBiblioteca.setBorderPainted(false);
        btnPizarra.setContentAreaFilled(false);
        btnBiblioteca.setContentAreaFilled(false);
        
        txtAreaTexto.setOpaque(false);
        
        panelPizarra.setOpaque(false);
        panelBiblioteca.setOpaque(false);
        
        etiMinijuegos.setVisible(false);
        etiBiblioteca.setVisible(false);
        
         btnLogout.setBackground(Color.getHSBColor(43, 41, 100));
    }//fin btnTransparencia
    
    public void inicializarComponentes(){
         //le puse true hasta que funcione el deste otro
        //btnConfigAlumnos.setVisible(this.tipoUsuario);
         btnConfigAlumnos.setVisible(verificarAdmin());
   
        transparencia();
        
        String parrafo =  "Hola, este es el menú de"
                        + "\ninicio, cada flecha te"
                        + "\nindica hacia dónde puedes"
                        + "\nir para moverte por el aula"
                        + "\npuedes ir hacia el pizarrón"
                        + "\no puedes ir a la biblioteca"
                        + "\nmuévete libremente por esta"
                        + "\nventana y diviértete";
        txtAreaTexto.setText(parrafo);
        etiUsuario.setText(getUsuario());
        
        
    }//fin initComp
   
    public boolean verificarAdmin(){      
        
        boolean bandera = false;
        Conexion conexion = new Conexion();
        ResultSet resultados = conexion.consultarTabla("tabla_usuarios", "tipo = 'Administrador' AND id_usuario = "+id_usuario+" ");
        try {         
            if(resultados.next())
                bandera = true;
          
        } catch (SQLException ex) {
            Logger.getLogger(frmInicioSesion.class.getName()).log(Level.SEVERE, null, ex);  
        }
        return bandera;
    }//fin verificarAdmin
    
    public String getUsuario(){
        String nombre = "";
       
        //SELECT tabla_alumnos.nombre, apellido_paterno FROM tabla_alumnos INNER JOIN tabla_usuarios ON tabla_alumnos.`id_alumno` =  tabla_usuarios.id_alumno  AND id_usuario= 2
        Conexion conexion = new Conexion();
        ResultSet resultados = conexion.consultarBD("SELECT tabla_alumnos.nombre, apellido_paterno FROM tabla_alumnos"
                + " INNER JOIN tabla_usuarios ON tabla_alumnos.`id_alumno` =  tabla_usuarios.id_alumno"
                + "  AND id_usuario= "+ id_usuario+"");
        //ResultSet resul = conexion.consultarBD("Select * from tabla_alumnos inner join tabla_usuarios on tabla_alumnos.id_alumno = tabla_usuarios.id_alumno and id_usuario = "+id_usuario+"");
        try {
            while(resultados.next()){
               nombre = resultados.getString("nombre");
               nombre = nombre.concat(" "+ resultados.getString("apellido_paterno"));
                //System.out.println(resul.getString("tabla_alumnos.nombre")+ resul.getString("tabla_alumnos.apellido_paterno"));
            }//fin si
        } catch (SQLException ex) {
            Logger.getLogger(frmMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nombre;
    }//fin getUsuario
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBiblioteca = new javax.swing.JButton();
        btnPizarra = new javax.swing.JButton();
        panelBiblioteca = new javax.swing.JPanel();
        etiBiblioteca = new javax.swing.JLabel();
        panelPizarra = new javax.swing.JPanel();
        etiMinijuegos = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelNota = new FondoPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaTexto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        btnConfigAlumnos = new javax.swing.JButton();
        etiUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBiblioteca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/derecha(1).png"))); // NOI18N
        btnBiblioteca.setText("Biblioteca");
        btnBiblioteca.setToolTipText("Biblioteca");
        btnBiblioteca.setContentAreaFilled(false);
        btnBiblioteca.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBiblioteca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBiblioteca.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/derecha(1).png"))); // NOI18N
        btnBiblioteca.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/derecha.png"))); // NOI18N
        btnBiblioteca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBiblioteca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBibliotecaActionPerformed(evt);
            }
        });
        getContentPane().add(btnBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 249, 217, 201));

        btnPizarra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnPizarra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/arriba(1).png"))); // NOI18N
        btnPizarra.setText("Minijuegos");
        btnPizarra.setToolTipText("Pizarra");
        btnPizarra.setContentAreaFilled(false);
        btnPizarra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPizarra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/arriba(1).png"))); // NOI18N
        btnPizarra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/arriba.png"))); // NOI18N
        btnPizarra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnPizarra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPizarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPizarraMouseEntered(evt);
            }
        });
        btnPizarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPizarraActionPerformed(evt);
            }
        });
        getContentPane().add(btnPizarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 352, 207, 242));

        panelBiblioteca.setBackground(new java.awt.Color(255, 153, 153));
        panelBiblioteca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelBibliotecaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelBibliotecaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelBibliotecaMouseExited(evt);
            }
        });
        panelBiblioteca.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo_biblioteca.png"))); // NOI18N
        panelBiblioteca.add(etiBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        getContentPane().add(panelBiblioteca, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, 310));

        panelPizarra.setBackground(new java.awt.Color(204, 255, 204));
        panelPizarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelPizarraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelPizarraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelPizarraMouseExited(evt);
            }
        });
        panelPizarra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiMinijuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo_minijuego.png"))); // NOI18N
        panelPizarra.add(etiMinijuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 67, -1, -1));

        getContentPane().add(panelPizarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/louie.png"))); // NOI18N
        jLabel2.setToolTipText("Louie");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        panelNota.setBackground(new java.awt.Color(102, 255, 102));
        panelNota.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaTexto.setEditable(false);
        txtAreaTexto.setBackground(new java.awt.Color(240, 240, 240));
        txtAreaTexto.setColumns(20);
        txtAreaTexto.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        txtAreaTexto.setRows(5);
        jScrollPane1.setViewportView(txtAreaTexto);

        panelNota.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 237, 212));

        getContentPane().add(panelNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 181, 290, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        btnLogout.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/logout.png"))); // NOI18N
        btnLogout.setText("Cerrar Sesión");
        btnLogout.setToolTipText("Cerra la sesión actual");
        btnLogout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 270, 70));

        btnConfigAlumnos.setBackground(new java.awt.Color(255, 255, 204));
        btnConfigAlumnos.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        btnConfigAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/config.png"))); // NOI18N
        btnConfigAlumnos.setText("Alumnos");
        btnConfigAlumnos.setToolTipText("Gestionar Alumnos");
        btnConfigAlumnos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnConfigAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigAlumnosActionPerformed(evt);
            }
        });
        getContentPane().add(btnConfigAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 80));

        etiUsuario.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        etiUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiUsuario.setText("id_usuario");
        getContentPane().add(etiUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(667, 10, 330, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBibliotecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBibliotecaActionPerformed
          
          frmBiblioteca formulario = new frmBiblioteca(id_usuario); 
          formulario.setVisible(true); 
          this.dispose();
        //  this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            
          
    }//GEN-LAST:event_btnBibliotecaActionPerformed

    private void panelPizarraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPizarraMouseEntered
      
         String parrafo = "Al hacer clic en el pizarrón"
                        + "\npuedes jugar minijuegos muy"
                        + "\ndivertidos que pondrán a "
                        + "\nprueba tu conocimiento."
                        + "\n¿Crees estar listo para el"
                        + "\nreto?";
        txtAreaTexto.setText(parrafo);
        etiMinijuegos.setVisible(true);
      
        
    }//GEN-LAST:event_panelPizarraMouseEntered

    private void panelPizarraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPizarraMouseExited
        
        inicializarComponentes();
        
    }//GEN-LAST:event_panelPizarraMouseExited

    private void panelBibliotecaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBibliotecaMouseEntered
        String parrafo =  "Cuando vas a la biblioteca "
                        + "\ntienes la oportunidad de"
                        + "\nreforzar los conocimientos"
                        + "\nnecesarios para pasarte los"
                        + "\nminijuegos."
                        + "\nRepasa tus lecciones y obtén"
                        + "\nel mejor puntaje.";
                        
        txtAreaTexto.setText(parrafo);
          etiBiblioteca.setVisible(true);
    }//GEN-LAST:event_panelBibliotecaMouseEntered

    private void panelBibliotecaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBibliotecaMouseExited
        
        inicializarComponentes();
        
    }//GEN-LAST:event_panelBibliotecaMouseExited

    private void btnPizarraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPizarraMouseEntered
        
    }//GEN-LAST:event_btnPizarraMouseEntered

    private void btnPizarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPizarraActionPerformed
       
          frmMenuMinijuegos mini = new frmMenuMinijuegos(id_usuario);
          mini.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_btnPizarraActionPerformed

    private void panelPizarraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelPizarraMouseClicked
        
          frmMenuMinijuegos mini = new frmMenuMinijuegos(id_usuario);
          mini.setVisible(true);
          this.dispose();
    }//GEN-LAST:event_panelPizarraMouseClicked

    private void panelBibliotecaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelBibliotecaMouseClicked
          frmBiblioteca formulario = new frmBiblioteca(id_usuario); 
          formulario.setVisible(true); 
          this.dispose();
    }//GEN-LAST:event_panelBibliotecaMouseClicked

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        
         frmInicioSesion formulario = new frmInicioSesion(); 
          formulario.setVisible(true); 
          this.dispose();
        
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        btnLogout.setBackground(Color.orange);
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
          btnLogout.setBackground(Color.getHSBColor(43, 41, 100));
    }//GEN-LAST:event_btnLogoutMouseExited

    private void btnConfigAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigAlumnosActionPerformed
        
         frmAlumnos formulario = new frmAlumnos(id_usuario); 
         formulario.setVisible(true); 
         this.dispose();
        
    }//GEN-LAST:event_btnConfigAlumnosActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBiblioteca;
    private javax.swing.JButton btnConfigAlumnos;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPizarra;
    private javax.swing.JLabel etiBiblioteca;
    private javax.swing.JLabel etiMinijuegos;
    private javax.swing.JLabel etiUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelBiblioteca;
    private javax.swing.JPanel panelNota;
    private javax.swing.JPanel panelPizarra;
    private javax.swing.JTextArea txtAreaTexto;
    // End of variables declaration//GEN-END:variables
}
