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
import javax.swing.JPanel;
import javax.swing.ButtonGroup;

/**
 *
 * @author matri
 */
public class frmMenuMinijuegos extends javax.swing.JFrame {

    /**
     * Creates new form frmMenuMinijuegos
     */
    Fondo fondo = new Fondo();
    
    
    public frmMenuMinijuegos() {
       
        this.setContentPane(fondo);
        initComponents();
        transparencia();
        componentes();
        
    }
    
    
    //fondo fel JFrame
    class Fondo extends JPanel{    
            private Image img; 
            @Override
            public void paint(Graphics g){   
                img = new ImageIcon(getClass().getResource("/Recursos/pizarra_2.jpg")).getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(),this);
                setOpaque(false);
                super.paint(g);
            }//fin paint     
    }//fin fondo
    
    class FondoE extends JPanel{    
            private Image img; 
            @Override
            public void paint(Graphics g){   
                img = new ImageIcon(getClass().getResource("/Recursos/marco_colgante.png")).getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(),this);
                setOpaque(false);
                super.paint(g);
            }//fin paint     
    }//fin fondo
    
    public void transparencia(){
        
        panelEspanol.setOpaque(false);
        panelGeografia.setOpaque(false);
        panelHistoria.setOpaque(false);
        panelCiencias.setOpaque(false);
        
        btnStartEs.setOpaque(false);
        btnStartEs.setBorderPainted(false);
        btnStartEs.setContentAreaFilled(false);
        
        btnStartGeo.setOpaque(false);
        btnStartGeo.setBorderPainted(false);
        btnStartGeo.setContentAreaFilled(false);
        
        btnStartHistoria.setOpaque(false);
        btnStartHistoria.setBorderPainted(false);
        btnStartHistoria.setContentAreaFilled(false);
        
        btnStartCiencias.setOpaque(false);
        btnStartCiencias.setBorderPainted(false);
        btnStartCiencias.setContentAreaFilled(false);
        
       
      /*  
        btnTriviaEsp.setOpaque(false);
        btnTriviaEsp.setBorderPainted(false);
        btnTriviaEsp.setContentAreaFilled(false);
        
        btnMemoramaEsp.setOpaque(false);
        btnMemoramaEsp.setBorderPainted(false);
        btnMemoramaEsp.setContentAreaFilled(false);*/
    }//fin transparencia
    
    public void componentes(){
        
        ButtonGroup grupoEsp = new ButtonGroup();       
        grupoEsp.add(btnMemoramaEsp);
        grupoEsp.add(btnTriviaEsp);
        
        btnMemoramaEsp.setBackground(java.awt.Color.getHSBColor(30, 39, 100));
        btnTriviaEsp.setBackground(java.awt.Color.orange);
    }//fin Componentes
    
    public void cerrar(){
        try{
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frmMenu menu = new frmMenu();
            menu.setVisible(true);
            this.dispose();
        }
        catch(Exception e){
            e.getMessage();
        }
        
    }//fin cerrar
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelEspanol = new javax.swing.JPanel();
        btnMemoramaEsp = new javax.swing.JToggleButton();
        btnTriviaEsp = new javax.swing.JToggleButton();
        panelEspInfo = new FondoE();
        btnStartEs = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        etiTextoEsp = new javax.swing.JLabel();
        panelGeografia = new javax.swing.JPanel();
        panelGeoInfo = new FondoE();
        btnStartGeo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        etiTextoEsp1 = new javax.swing.JLabel();
        panelHistoria = new javax.swing.JPanel();
        panelHistoriaInfo = new FondoE();
        btnStartHistoria = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        etiTextoEsp2 = new javax.swing.JLabel();
        panelCiencias = new javax.swing.JPanel();
        panelCienciasInfo = new FondoE();
        btnStartCiencias = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        etiTextoEsp3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 255));
        jTabbedPane1.setToolTipText("");

        panelEspanol.setBackground(new java.awt.Color(204, 0, 204));
        panelEspanol.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMemoramaEsp.setBackground(new java.awt.Color(255, 204, 153));
        btnMemoramaEsp.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        btnMemoramaEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cartas_100.png"))); // NOI18N
        btnMemoramaEsp.setText("Memorama");
        btnMemoramaEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemoramaEspActionPerformed(evt);
            }
        });
        panelEspanol.add(btnMemoramaEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 260, 120));

        btnTriviaEsp.setBackground(new java.awt.Color(255, 255, 255));
        btnTriviaEsp.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        btnTriviaEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/question_mark_1.png"))); // NOI18N
        btnTriviaEsp.setSelected(true);
        btnTriviaEsp.setText("Trivia");
        btnTriviaEsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriviaEspActionPerformed(evt);
            }
        });
        panelEspanol.add(btnTriviaEsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 260, 120));

        btnStartEs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comenzar.png"))); // NOI18N
        btnStartEs.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comenzar_light.png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.setOpaque(false);

        etiTextoEsp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/triviaE.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(etiTextoEsp, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(etiTextoEsp)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelEspInfoLayout = new javax.swing.GroupLayout(panelEspInfo);
        panelEspInfo.setLayout(panelEspInfoLayout);
        panelEspInfoLayout.setHorizontalGroup(
            panelEspInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEspInfoLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnStartEs, javax.swing.GroupLayout.PREFERRED_SIZE, 263, Short.MAX_VALUE)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEspInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelEspInfoLayout.setVerticalGroup(
            panelEspInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEspInfoLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStartEs)
                .addGap(44, 44, 44))
        );

        panelEspanol.add(panelEspInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 440, 410));

        jTabbedPane1.addTab("Español", panelEspanol);

        panelGeografia.setBackground(new java.awt.Color(0, 0, 204));
        panelGeografia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStartGeo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comenzar.png"))); // NOI18N
        btnStartGeo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comenzar_light.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setForeground(new java.awt.Color(0, 204, 204));
        jPanel2.setOpaque(false);

        etiTextoEsp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/triviaE.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(etiTextoEsp1, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(etiTextoEsp1)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelGeoInfoLayout = new javax.swing.GroupLayout(panelGeoInfo);
        panelGeoInfo.setLayout(panelGeoInfoLayout);
        panelGeoInfoLayout.setHorizontalGroup(
            panelGeoInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeoInfoLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnStartGeo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, Short.MAX_VALUE)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeoInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelGeoInfoLayout.setVerticalGroup(
            panelGeoInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeoInfoLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStartGeo)
                .addGap(44, 44, 44))
        );

        panelGeografia.add(panelGeoInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 440, 410));

        jTabbedPane1.addTab("Geografía", panelGeografia);

        panelHistoria.setBackground(new java.awt.Color(102, 204, 0));
        panelHistoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStartHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comenzar.png"))); // NOI18N
        btnStartHistoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comenzar_light.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setForeground(new java.awt.Color(0, 204, 204));
        jPanel3.setOpaque(false);

        etiTextoEsp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/triviaE.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(etiTextoEsp2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(etiTextoEsp2)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelHistoriaInfoLayout = new javax.swing.GroupLayout(panelHistoriaInfo);
        panelHistoriaInfo.setLayout(panelHistoriaInfoLayout);
        panelHistoriaInfoLayout.setHorizontalGroup(
            panelHistoriaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHistoriaInfoLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnStartHistoria, javax.swing.GroupLayout.PREFERRED_SIZE, 263, Short.MAX_VALUE)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHistoriaInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHistoriaInfoLayout.setVerticalGroup(
            panelHistoriaInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHistoriaInfoLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStartHistoria)
                .addGap(44, 44, 44))
        );

        panelHistoria.add(panelHistoriaInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 440, 410));

        jTabbedPane1.addTab("Historia", panelHistoria);

        panelCiencias.setBackground(new java.awt.Color(204, 255, 0));
        panelCiencias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnStartCiencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comenzar.png"))); // NOI18N
        btnStartCiencias.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/comenzar_light.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setForeground(new java.awt.Color(0, 204, 204));
        jPanel4.setOpaque(false);

        etiTextoEsp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/triviaE.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(etiTextoEsp3, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(etiTextoEsp3)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelCienciasInfoLayout = new javax.swing.GroupLayout(panelCienciasInfo);
        panelCienciasInfo.setLayout(panelCienciasInfoLayout);
        panelCienciasInfoLayout.setHorizontalGroup(
            panelCienciasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCienciasInfoLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btnStartCiencias, javax.swing.GroupLayout.PREFERRED_SIZE, 263, Short.MAX_VALUE)
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCienciasInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelCienciasInfoLayout.setVerticalGroup(
            panelCienciasInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCienciasInfoLayout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStartCiencias)
                .addGap(44, 44, 44))
        );

        panelCiencias.add(panelCienciasInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 440, 410));

        jTabbedPane1.addTab("Ciencias Naturales", panelCiencias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void btnTriviaEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriviaEspActionPerformed
        btnMemoramaEsp.setBackground(java.awt.Color.getHSBColor(30, 39, 100));
        btnTriviaEsp.setBackground(java.awt.Color.orange);
        ImageIcon img = new ImageIcon(getClass().getResource("/Recursos/triviaE.png")); 
        etiTextoEsp.setIcon(img);
        
    }//GEN-LAST:event_btnTriviaEspActionPerformed

    private void btnMemoramaEspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemoramaEspActionPerformed
        btnTriviaEsp.setBackground(java.awt.Color.getHSBColor(30, 39, 100));
        btnMemoramaEsp.setBackground(java.awt.Color.orange);
        ImageIcon img = new ImageIcon(getClass().getResource("/Recursos/memoramaE.png")); 
        etiTextoEsp.setIcon(img);
        //img = new ImageIcon(getClass().getResource("/Recursos/pizarra_2.jpg")).getImage();
        
    }//GEN-LAST:event_btnMemoramaEspActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenuMinijuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenuMinijuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenuMinijuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenuMinijuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenuMinijuegos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnMemoramaEsp;
    private javax.swing.JButton btnStartCiencias;
    private javax.swing.JButton btnStartEs;
    private javax.swing.JButton btnStartGeo;
    private javax.swing.JButton btnStartHistoria;
    private javax.swing.JToggleButton btnTriviaEsp;
    private javax.swing.JLabel etiTextoEsp;
    private javax.swing.JLabel etiTextoEsp1;
    private javax.swing.JLabel etiTextoEsp2;
    private javax.swing.JLabel etiTextoEsp3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelCiencias;
    private javax.swing.JPanel panelCienciasInfo;
    private javax.swing.JPanel panelEspInfo;
    private javax.swing.JPanel panelEspanol;
    private javax.swing.JPanel panelGeoInfo;
    private javax.swing.JPanel panelGeografia;
    private javax.swing.JPanel panelHistoria;
    private javax.swing.JPanel panelHistoriaInfo;
    // End of variables declaration//GEN-END:variables
}
