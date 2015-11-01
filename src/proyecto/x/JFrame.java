/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.x;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

/**
 *
 * @author Jose
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    public JFrame() {
        initComponents();
        
        //jProgressBar1.setVisible(false);
        llenarligaCB(ligaComboBox);
        
        
    }
    
    
    
      
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        simular_btn = new javax.swing.JButton();
        ligaComboBox = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        totalA_Label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nApuestas_Label = new javax.swing.JLabel();
        reset_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        pme_ComboBox = new javax.swing.JComboBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        javax.swing.JMenuItem importPL_bd = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto X");
        setResizable(false);

        simular_btn.setText("Simular");
        simular_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simular_btnMouseClicked(evt);
            }
        });
        simular_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simular_btnActionPerformed(evt);
            }
        });

        ligaComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Basico" }));

        jProgressBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Liga:");

        jLabel2.setText("Metodo:");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setText("Proyecto X");
        jLabel3.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Total acumulado:");

        totalA_Label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        totalA_Label.setText("0");

        jLabel6.setText("# de apuestas:");

        nApuestas_Label.setText("0");

        reset_btn.setText("Reset");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalA_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nApuestas_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reset_btn))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalA_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nApuestas_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(reset_btn))
        );

        jLabel5.setText("GAP PME:");

        pme_ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "5", "10", "15", "20", "25", "30" }));

        jMenu1.setText("File");

        importPL_bd.setText("Importar BD");
        importPL_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importPL_bdActionPerformed(evt);
            }
        });
        jMenu1.add(importPL_bd);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(simular_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ligaComboBox, 0, 140, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pme_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ligaComboBox))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(pme_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(simular_btn))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simular_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simular_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_simular_btnActionPerformed

    private void importPL_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importPL_bdActionPerformed
        // TODO add your handling code here:                      
        JFileChooser FileChooser = new JFileChooser();
         int returnValue =FileChooser.showOpenDialog(this);
         
         
         
         if (returnValue == JFileChooser.APPROVE_OPTION){
             File file = FileChooser.getSelectedFile();            
             
             try{
                 String path = file.getAbsolutePath();
                 String name = file.getName();
                 //pme_TextField.setText(name);
                 
             }catch(Exception e){
                 
             }         
                                   
         }        
    }//GEN-LAST:event_importPL_bdActionPerformed

    private void simular_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simular_btnMouseClicked
        // TODO add your handling code here:        
                 
        new Thread(new Runnable() {
        @Override
        public void run() {
            
            JFrame form = JFrame.this;
            String liga = ligaComboBox.getSelectedItem().toString();
            double criterioPME = Integer.parseInt(pme_ComboBox.getSelectedItem().toString());
            criterioPME = criterioPME / 100;                        
            
            ProyectoX px = new ProyectoX();
            jProgressBar1.setVisible(true);
            jProgressBar1.setIndeterminate(true);
            simular_btn.setEnabled(false);   
            reset_btn.setEnabled(false);
            form.setDefaultCloseOperation(0);
            
            px.simularTemporada(liga, criterioPME, totalA_Label, nApuestas_Label);
            
            jProgressBar1.setIndeterminate(false);            
            simular_btn.setEnabled(true);
            reset_btn.setEnabled(true);
            form.setDefaultCloseOperation(EXIT_ON_CLOSE);
            
            
            
            }
        }).start();
      
        
    }//GEN-LAST:event_simular_btnMouseClicked

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        // TODO add your handling code here:
        totalA_Label.setText("0");
        nApuestas_Label.setText("0");
    }//GEN-LAST:event_reset_btnActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
                
                
            }
        });
    }
    
    public static void llenarligaCB (JComboBox cb){
    
        Connection connection = null;
                   
                // Llenar JComboBox de las ligas                
                try{
    
                connection = DriverManager.getConnection("jdbc:sqlite:C:/Users/Jose/Documents/NetBeansProjects/Proyecto_X/BdPrueba.sqlite");
                Statement statement = connection.createStatement();  
                statement.setQueryTimeout(30);  // set timeout to 30 sec
                ResultSet rs = statement.executeQuery("SELECT name FROM sqlite_master WHERE type='table'");
                int n = 0;
                while(rs.next()){
                
                    n = n + 1;
                                
                }
                
                rs = statement.executeQuery("SELECT name FROM sqlite_master WHERE type='table'");
                String[] ligas = new String[n]; n = 0;    
                while(rs.next()){

                    ligas[n] = rs.getString("name"); 
                    n = n + 1;

                }    
                DefaultComboBoxModel model = new DefaultComboBoxModel(ligas);
                cb.setModel(model);
                
                }catch(SQLException e){

                    System.err.println(e);

                }finally{

                    try
                      {
                        if(connection != null)
                          connection.close();
                      }
                      catch(SQLException e)
                      {
                        // connection close failed.
                        System.err.println(e);
                      }

    }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JComboBox ligaComboBox;
    private javax.swing.JLabel nApuestas_Label;
    private javax.swing.JComboBox pme_ComboBox;
    private javax.swing.JButton reset_btn;
    private javax.swing.JButton simular_btn;
    private javax.swing.JLabel totalA_Label;
    // End of variables declaration//GEN-END:variables
}
