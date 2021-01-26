/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;

/**
 *
 * @author matri
 */
public class frmLecciones extends javax.swing.JFrame {

    /**
     * Creates new form frmLecciones
     */
    
    Fondo fondo = new Fondo();
    
    int materia;
    String titulo;
    public frmLecciones(int subject, String title) {
        materia = subject;
        titulo = title;
        this.setContentPane(fondo);
        initComponents();
        componentes();
    
    }
    
     public frmLecciones() {
       
        this.setContentPane(fondo);
        initComponents();
        //componentes();
    
    }
    
    
     //clase Fondo, sirve para ponerle un fondo al jFrame
     class Fondo extends JPanel{    
            private Image img; 
            @Override
            public void paint(Graphics g){   
                img = new ImageIcon(getClass().getResource("/Recursos/Lecciones/estante.jpg")).getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(),this);
                setOpaque(false);
                super.paint(g);
            }//fin paint     
    }//fin fondo
     
     
     public void componentes(){
         
         ButtonGroup grupoBotones = new ButtonGroup();
         grupoBotones.add(btnPag1);
         grupoBotones.add(btnPag2);
         grupoBotones.add(btnPag3);
         etiImagen.setText("");
         
         etiTitulo.setText(titulo);
         btnAnterior.setEnabled(false);
         
        switch(materia){
         
             case 0:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/espanol_1.png")));
                   ponerImagenes("refranes_1.png");
                  break;
             case 1:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/geografia_1.png")));
                  ponerImagenes("mexico_1.jpg");
                  break;
             case 2:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/historia_1.png")));
                  ponerImagenes("olmecas_1.jpg");
                  break;
             case 3:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/ciencias_1.png")));
                  ponerImagenes("digestivo_1.jpg");
                  break;
             default:
                  JOptionPane.showMessageDialog(this, "Este mensaje no debería de aparecer", "Error", 0);
                 
             
         }//fin switch
       
         
     }//fin

     
     public void cerrar(){
        try{
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frmBiblioteca biblioteca = new frmBiblioteca();
            biblioteca.setVisible(true);
            this.dispose();
        }
        catch(Exception e){
            e.getMessage();
        }
        
    }//fin cerrar
     
     
     public void ponerImagenes( String variable){
       
      //  String ruta = this.getClass().getClassLoader().getResource("Recursos/Lecciones/"+ variable).toString().substring(6);
        ImageIcon icon = new ImageIcon(getClass().getResource("/Recursos/Lecciones/"+ variable));
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(etiImagen.getWidth(),etiImagen.getHeight(), java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);
        etiImagen.setIcon(icon);
        
       
    }//fin
     
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        si = new javax.swing.JLabel();
        etiTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        etiTexto = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        etiImagen = new javax.swing.JLabel();
        btnSiguiente = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnPag2 = new javax.swing.JToggleButton();
        btnPag3 = new javax.swing.JToggleButton();
        btnPag1 = new javax.swing.JToggleButton();
        btnCerrar = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(0, 255, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        si.setText("dcnjsdcdfbvn c");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(1009, 605));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiTitulo.setFont(new java.awt.Font("Century Schoolbook", 1, 48)); // NOI18N
        etiTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiTitulo.setText("jLabel1");
        getContentPane().add(etiTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 1070, -1));

        jPanel1.setBackground(new java.awt.Color(102, 51, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(etiTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 400));

        jPanel4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiImagen.setText("etiqueta");
        etiImagen.setToolTipText("Imagen ilustrativa");
        jPanel4.add(etiImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 340));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 790, 460));

        btnSiguiente.setBackground(new java.awt.Color(102, 204, 0));
        btnSiguiente.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Lecciones/derecha_1.png"))); // NOI18N
        btnSiguiente.setToolTipText("Página Siguiente");
        btnSiguiente.setBorderPainted(false);
        btnSiguiente.setContentAreaFilled(false);
        btnSiguiente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Lecciones/derecha_1.png"))); // NOI18N
        btnSiguiente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Lecciones/derecha.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 280, 120, 100));

        btnAnterior.setBackground(new java.awt.Color(102, 204, 0));
        btnAnterior.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        btnAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Lecciones/izquierda_1.png"))); // NOI18N
        btnAnterior.setToolTipText("Página anterior");
        btnAnterior.setBorderPainted(false);
        btnAnterior.setContentAreaFilled(false);
        btnAnterior.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Lecciones/izquierda_1.png"))); // NOI18N
        btnAnterior.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Lecciones/izquierda.png"))); // NOI18N
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 100));

        jPanel5.setBackground(new java.awt.Color(102, 51, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setOpaque(false);

        btnPag2.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        btnPag2.setText("2");
        btnPag2.setBorder(null);
        btnPag2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPag2ActionPerformed(evt);
            }
        });

        btnPag3.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        btnPag3.setText("3");
        btnPag3.setBorder(null);
        btnPag3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPag3ActionPerformed(evt);
            }
        });

        btnPag1.setFont(new java.awt.Font("Century Schoolbook", 0, 18)); // NOI18N
        btnPag1.setSelected(true);
        btnPag1.setText("1");
        btnPag1.setBorder(null);
        btnPag1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPag1ActionPerformed(evt);
            }
        });

        btnCerrar.setBackground(new java.awt.Color(255, 255, 204));
        btnCerrar.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Lecciones/volver.png"))); // NOI18N
        btnCerrar.setText("Regresar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218)
                .addComponent(btnPag1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(btnPag2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btnPag3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPag2)
                    .addComponent(btnPag3)
                    .addComponent(btnPag1))
                .addGap(21, 21, 21))
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 1080, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        
     if(btnPag1.isSelected()){
        btnPag2ActionPerformed(evt);
        btnPag2.setSelected(true);
     }//fin página1 seleccionada
        else
         if(btnPag2.isSelected()){
              btnPag3ActionPerformed(evt);
              btnPag3.setSelected(true);
         }//fin página 2 seleccionada
        
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        
        //determina a qué página ir de acuerdo a qué página esté seleccionada
         if(btnPag2.isSelected()){
              btnPag1ActionPerformed(evt);
              btnPag1.setSelected(true);
         }//fin página 2 seleccionada
         else
             if(btnPag3.isSelected()){
                 btnPag2ActionPerformed(evt);
                 btnPag2.setSelected(true);
             }//fin página 4 seleccionada
        
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       
        cerrar();
        
    }//GEN-LAST:event_formWindowClosing

    private void btnPag1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPag1ActionPerformed
        
        btnAnterior.setEnabled(false);
        btnSiguiente.setEnabled(true);
        
          switch(materia){
         
             case 0:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/espanol_1.png")));
                   ponerImagenes("refranes_1.png");
                  break;
             case 1:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/geografia_1.png")));
                  ponerImagenes("mexico_1.jpg");
                  break;
             case 2:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/historia_1.png")));
                  ponerImagenes("olmecas_1.jpg");
                  break;
             case 3:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/ciencias_1.png")));
                  ponerImagenes("digestivo_1.jpg");
                  break;
             default:
                  JOptionPane.showMessageDialog(this, "Este mensaje no debería de aparecer", "Error", 0);
                 
             
         }//fin switch
        
    }//GEN-LAST:event_btnPag1ActionPerformed

    private void btnPag2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPag2ActionPerformed
        
        btnSiguiente.setEnabled(true);
        btnAnterior.setEnabled(true);
        
          switch(materia){
         
             case 0:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/espanol_2.png")));
                  ponerImagenes("refranes_2.jpg");
                  break;
             case 1:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/geografia_2.png")));
                  ponerImagenes("mexico_2.gif");
                  break;
             case 2:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/historia_2.png")));
                  ponerImagenes("olmecas_2.jpg");
                  break;
             case 3:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/ciencias_2.png")));
                  ponerImagenes("digestivo_1.jpg");
                  break;
             default:
                  JOptionPane.showMessageDialog(this, "Este mensaje no debería de aparecer", "Error", 0);
                 
             
         }//fin switch
        
    }//GEN-LAST:event_btnPag2ActionPerformed

    private void btnPag3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPag3ActionPerformed
        
        btnSiguiente.setEnabled(false);
        btnAnterior.setEnabled(true);
        
          switch(materia){
         
             case 0:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/espanol_3.png")));
                   ponerImagenes("refranes_3.jpg");
                  break;
             case 1:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/geografia_3.png")));
                   ponerImagenes("mexico_3.jpg");
                  break;
             case 2:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/historia_3.png")));
                  ponerImagenes("olmecas_3.jpg");
                  break;
             case 3:
                  etiTexto.setIcon(new ImageIcon(getClass().getResource("/Recursos/Lecciones/ciencias_3.png")));
                   ponerImagenes("digestivo_2.jpg");
                  break;
             default:
                  JOptionPane.showMessageDialog(this, "Este mensaje no debería de aparecer", "Error", 0);
                 
             
         }//fin switch
        
    }//GEN-LAST:event_btnPag3ActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        cerrar();
    }//GEN-LAST:event_btnCerrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmLecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLecciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLecciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JToggleButton btnPag1;
    private javax.swing.JToggleButton btnPag2;
    private javax.swing.JToggleButton btnPag3;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel etiImagen;
    private javax.swing.JLabel etiTexto;
    private javax.swing.JLabel etiTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel si;
    // End of variables declaration//GEN-END:variables
}
