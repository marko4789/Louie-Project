/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author matri
 */
public class frmTrivia extends javax.swing.JFrame {

    /**
     * Creates new form frmTrivia
     */
    
   ArrayList<String> array = new ArrayList<String>();
   Fondo fondo = new Fondo();
   
    ButtonGroup grupo2 = new ButtonGroup();
    ButtonGroup grupo = new ButtonGroup();
    int puntaje = 0;
   
   int materia;
   String titulo;
   int id_usuario;
   
    public frmTrivia() {
        materia = 0;
        titulo = "";
        id_usuario = -1;
        this.setContentPane(fondo);
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public frmTrivia(int id_materia, String nombre, int id_usuario) {
        materia = id_materia;
        titulo = nombre;
        this.id_usuario = id_usuario;
        this.setContentPane(fondo);
        initComponents();
        componentes();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    
    
    public void preguntas(int materia){
        
        Conexion conexion = new Conexion();
        ResultSet resultados = conexion.consultarTabla("tabla_preguntas", "id_materia = "+materia+";");
         try {
            while(resultados.next() == true){
                array.add(resultados.getString("pregunta"));
                array.add(resultados.getString("opcion_a"));
                array.add(resultados.getString("opcion_b"));
                array.add(resultados.getString("opcion_c"));
                array.add(resultados.getString("opcion_d"));
            }    //fin while
        } catch (SQLException ex) {
            Logger.getLogger(frmTrivia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//fin
    
  public void acomodarDatos(int menor){
    
      etiPregunta.setText(array.get(menor));
       rdbOpA.setText(array.get(menor+1));
       rdbOpB.setText(array.get(menor+2));
       rdbOpC.setText(array.get(menor+3));
      rdbOpD.setText(array.get(menor+4));
  }//fin
  
  public void componentes(){
      
  
      grupo.add(rdbOpA);
      grupo.add(rdbOpB);
      grupo.add(rdbOpC);
      grupo.add(rdbOpD);
      
     
      grupo2.add(tb1);
      grupo2.add(tb2);
      grupo2.add(tb3);
      grupo2.add(tb4);
      grupo2.add(tb5);
     
      preguntas(materia);
      acomodarDatos(0);
      tb1.setSelected(true);
      etiTitulo.setText("Trivia de "+titulo);
      
  }
    
    public void cerrar(){
        try{
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            frmMenuMinijuegos menu = new frmMenuMinijuegos(id_usuario);
            menu.setVisible(true);
            this.dispose();
        }
        catch(Exception e){
            e.getMessage();
        }
        
    }//fin cerrar
     
     //clase Fondo, sirve para ponerle un fondo al jFrame
     class Fondo extends JPanel{    
            private Image img; 
            @Override
            public void paint(Graphics g){   
                img = new ImageIcon(getClass().getResource("/Recursos/escenario.jpg")).getImage();
                g.drawImage(img, 0, 0, getWidth(), getHeight(),this);
                setOpaque(false);
                super.paint(g);
            }//fin paint     
    }//fin fondo
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        etiPregunta = new javax.swing.JLabel();
        rdbOpA = new javax.swing.JRadioButton();
        rdbOpB = new javax.swing.JRadioButton();
        rdbOpC = new javax.swing.JRadioButton();
        rdbOpD = new javax.swing.JRadioButton();
        btnCalificar = new javax.swing.JButton();
        etiTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        btnRespondida = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        tb3 = new javax.swing.JToggleButton();
        tb1 = new javax.swing.JToggleButton();
        tb2 = new javax.swing.JToggleButton();
        tb4 = new javax.swing.JToggleButton();
        tb5 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trivia");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setOpaque(false);

        etiPregunta.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        etiPregunta.setForeground(new java.awt.Color(255, 255, 255));
        etiPregunta.setText("¿Pregunta uno?");

        rdbOpA.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        rdbOpA.setForeground(new java.awt.Color(255, 255, 255));
        rdbOpA.setText("Opción A");

        rdbOpB.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        rdbOpB.setForeground(new java.awt.Color(255, 255, 255));
        rdbOpB.setText("Opción B");

        rdbOpC.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        rdbOpC.setForeground(new java.awt.Color(255, 255, 255));
        rdbOpC.setText("Opción C");

        rdbOpD.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        rdbOpD.setForeground(new java.awt.Color(255, 255, 255));
        rdbOpD.setText("Opción D");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdbOpD)
                    .addComponent(rdbOpA)
                    .addComponent(etiPregunta)
                    .addComponent(rdbOpB)
                    .addComponent(rdbOpC))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(etiPregunta)
                .addGap(43, 43, 43)
                .addComponent(rdbOpA)
                .addGap(32, 32, 32)
                .addComponent(rdbOpB)
                .addGap(34, 34, 34)
                .addComponent(rdbOpC)
                .addGap(39, 39, 39)
                .addComponent(rdbOpD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCalificar.setBackground(new java.awt.Color(119, 229, 174));
        btnCalificar.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btnCalificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_115_1.png"))); // NOI18N
        btnCalificar.setText("Calificar");
        btnCalificar.setBorderPainted(false);
        btnCalificar.setContentAreaFilled(false);
        btnCalificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalificar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_115_1.png"))); // NOI18N
        btnCalificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_115_light.png"))); // NOI18N
        btnCalificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificarActionPerformed(evt);
            }
        });

        etiTitulo.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        etiTitulo.setForeground(new java.awt.Color(255, 204, 0));
        etiTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiTitulo.setText("Título quiz");

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setOpaque(false);

        btnAnterior.setBackground(new java.awt.Color(255, 204, 102));
        btnAnterior.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setBackground(new java.awt.Color(255, 204, 102));
        btnSiguiente.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnRespondida.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        btnRespondida.setText("Marcar como respondida");
        btnRespondida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespondidaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAnterior)
                .addGap(18, 18, 18)
                .addComponent(btnSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                .addComponent(btnRespondida)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAnterior)
                    .addComponent(btnRespondida))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info_50.png"))); // NOI18N
        btnInfo.setToolTipText("Ayuda");
        btnInfo.setBorderPainted(false);
        btnInfo.setContentAreaFilled(false);
        btnInfo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info_50.png"))); // NOI18N
        btnInfo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/info_50_light.png"))); // NOI18N
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setOpaque(false);
        jScrollPane2.setViewportView(jPanel1);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tb3.setBackground(new java.awt.Color(51, 204, 255));
        tb3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        tb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_1.png"))); // NOI18N
        tb3.setText("3");
        tb3.setBorderPainted(false);
        tb3.setContentAreaFilled(false);
        tb3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tb3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_1.png"))); // NOI18N
        tb3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_light.png"))); // NOI18N
        tb3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_light.png"))); // NOI18N
        tb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb3ActionPerformed(evt);
            }
        });
        jPanel1.add(tb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 53, 40));

        tb1.setBackground(new java.awt.Color(51, 204, 255));
        tb1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        tb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_1.png"))); // NOI18N
        tb1.setSelected(true);
        tb1.setText("1");
        tb1.setBorderPainted(false);
        tb1.setContentAreaFilled(false);
        tb1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tb1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_1.png"))); // NOI18N
        tb1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_light.png"))); // NOI18N
        tb1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_light.png"))); // NOI18N
        tb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb1ActionPerformed(evt);
            }
        });
        jPanel1.add(tb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 53, 40));

        tb2.setBackground(new java.awt.Color(51, 204, 255));
        tb2.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        tb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_1.png"))); // NOI18N
        tb2.setText("2");
        tb2.setBorderPainted(false);
        tb2.setContentAreaFilled(false);
        tb2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tb2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_1.png"))); // NOI18N
        tb2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_light.png"))); // NOI18N
        tb2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_light.png"))); // NOI18N
        tb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb2ActionPerformed(evt);
            }
        });
        jPanel1.add(tb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 53, 40));

        tb4.setBackground(new java.awt.Color(51, 204, 255));
        tb4.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        tb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_1.png"))); // NOI18N
        tb4.setText("4");
        tb4.setBorder(null);
        tb4.setBorderPainted(false);
        tb4.setContentAreaFilled(false);
        tb4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tb4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_1.png"))); // NOI18N
        tb4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_light.png"))); // NOI18N
        tb4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_light.png"))); // NOI18N
        tb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb4ActionPerformed(evt);
            }
        });
        jPanel1.add(tb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 53, 40));

        tb5.setBackground(new java.awt.Color(51, 204, 255));
        tb5.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        tb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_1.png"))); // NOI18N
        tb5.setText("5");
        tb5.setBorderPainted(false);
        tb5.setContentAreaFilled(false);
        tb5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tb5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_1.png"))); // NOI18N
        tb5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_light.png"))); // NOI18N
        tb5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_light.png"))); // NOI18N
        tb5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/button_50_light.png"))); // NOI18N
        tb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tb5ActionPerformed(evt);
            }
        });
        jPanel1.add(tb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 53, 40));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etiTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCalificar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(etiTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(13, 13, 13)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(btnCalificar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb2ActionPerformed
        grupo.clearSelection();
        tb2.setSelected(true);
        acomodarDatos(5);
    }//GEN-LAST:event_tb2ActionPerformed

    private void tb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb1ActionPerformed
        grupo.clearSelection();
        tb1.setSelected(true);
        acomodarDatos(0);
    }//GEN-LAST:event_tb1ActionPerformed

    private void tb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb3ActionPerformed
        grupo.clearSelection();
        tb3.setSelected(true);
        acomodarDatos(10);
    }//GEN-LAST:event_tb3ActionPerformed

    private void tb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb4ActionPerformed
        grupo.clearSelection();
        tb4.setSelected(true);
        acomodarDatos(15);
    }//GEN-LAST:event_tb4ActionPerformed

    private void btnRespondidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespondidaActionPerformed
     
      clave();
      
      grupo2.getSelection().setEnabled(false);
      btnSiguienteActionPerformed(evt);
       
    }//GEN-LAST:event_btnRespondidaActionPerformed

    private void btnCalificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificarActionPerformed

        btnRespondida.setEnabled(false);
        btnSiguiente.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnCalificar.setEnabled(false);
                
        if(puntaje >= 6){
            JOptionPane.showMessageDialog(this, "El puntaje obtenido fue de:"+ puntaje, "¡Felicidades has pasado la prueba!", JOptionPane.INFORMATION_MESSAGE);
        
        }
        else
            JOptionPane.showMessageDialog(this, "El puntaje obtenido fue de:"+ puntaje, "Sigue estudiando, todavía hay cosas por aprender.", JOptionPane.INFORMATION_MESSAGE);
        
               
        
    }//GEN-LAST:event_btnCalificarActionPerformed

    
    
    
    
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
       
    btnAnterior.setEnabled(true);    
        if(tb1.isSelected() && tb2.isEnabled())
            tb2ActionPerformed(evt);
        else
            if(tb2.isSelected() && tb3.isEnabled())
               tb3ActionPerformed(evt);
            else
                if(tb4.isSelected() && tb5.isEnabled())
                     tb5ActionPerformed(evt);
                else
                    if(tb3.isSelected() && tb4.isEnabled())
                         tb4ActionPerformed(evt);
                    else
                        if(tb1.isEnabled())
                            tb1ActionPerformed(evt);
                        else
                            if(tb2.isEnabled())
                                tb2ActionPerformed(evt);
                            else
                                if(tb3.isEnabled())
                                    tb3ActionPerformed(evt);
                                else
                                    if(tb4.isEnabled())
                                        tb4ActionPerformed(evt);
                                    else
                                        if(tb5.isEnabled())
                                            tb5ActionPerformed(evt);
                                        else
                                            btnRespondida.setEnabled(false);
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
         //btnSiguiente.setEnabled(true);    
        //if(tb1.isSelected())
            //btnAnterior.setEnabled(false);
        //else
            if(tb2.isSelected() && tb1.isEnabled())
               tb1ActionPerformed(evt);
            else
                if(tb3.isSelected() && tb2.isEnabled())
                     tb2ActionPerformed(evt);
                else
                    if(tb4.isSelected() && tb3.isEnabled())
                         tb3ActionPerformed(evt);
                    else
                        if(tb5.isSelected() && tb4.isEnabled())
                         tb4ActionPerformed(evt);
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        
    JOptionPane.showMessageDialog(this, "Selecciona la respuesta correcta y haz clic en 'Marcar como respondida' para que se registre,\n obtén tu calificación con el botón 'Calificar'.", "Información", JOptionPane.INFORMATION_MESSAGE);
        
        
    }//GEN-LAST:event_btnInfoActionPerformed

    private void tb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tb5ActionPerformed
        grupo.clearSelection();
        tb5.setSelected(true);
        acomodarDatos(20);
    }//GEN-LAST:event_tb5ActionPerformed
    //este método suma los puntajes de las respuestas correctas según sea la materia
    public void clave(){
        
        switch(materia){
            case 1:
                if( tb5.isSelected() ){
                    if(rdbOpD.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb4.isSelected()){
                    if(rdbOpB.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb3.isSelected()){
                    if(rdbOpA.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb2.isSelected()){
                    if(rdbOpC.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb1.isSelected()){
                    if(rdbOpC.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }
                break; //Fin case materia = 1 "Español"
            case 2:
                 if( tb5.isSelected() ){
                    if(rdbOpD.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb4.isSelected()){
                    if(rdbOpD.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb3.isSelected()){
                    if(rdbOpC.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb2.isSelected()){
                    if(rdbOpC.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb1.isSelected()){
                    if(rdbOpA.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }
                 break;//fin del caso 2 donde si la materia es Historia califica con estas respuestas.
            case 3:
                 if( tb5.isSelected() ){
                    if(rdbOpA.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb4.isSelected()){
                    if(rdbOpD.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb3.isSelected()){
                    if(rdbOpC.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb2.isSelected()){
                    if(rdbOpD.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb1.isSelected()){
                    if(rdbOpC.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }
                 break;
            case 4:
                 if( tb5.isSelected() ){
                    if(rdbOpC.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb4.isSelected()){
                    if(rdbOpB.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb3.isSelected()){
                    if(rdbOpA.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb2.isSelected()){
                    if(rdbOpD.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }else
                if(tb1.isSelected()){
                    if(rdbOpC.isSelected()){
                        puntaje = puntaje + 2;
                    }
                }
            break;
            default:
                System.out.println("este mensaje no debería de aparecer");
        }//fin switch(materia)
        
    }//fin método clave
    
    
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
            java.util.logging.Logger.getLogger(frmTrivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTrivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTrivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTrivia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTrivia().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCalificar;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnRespondida;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel etiPregunta;
    private javax.swing.JLabel etiTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdbOpA;
    private javax.swing.JRadioButton rdbOpB;
    private javax.swing.JRadioButton rdbOpC;
    private javax.swing.JRadioButton rdbOpD;
    private javax.swing.JToggleButton tb1;
    private javax.swing.JToggleButton tb2;
    private javax.swing.JToggleButton tb3;
    private javax.swing.JToggleButton tb4;
    private javax.swing.JToggleButton tb5;
    // End of variables declaration//GEN-END:variables
}
