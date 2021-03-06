/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import objetos.Directorio;

/**
 *
 * @author daniel
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        miBuscar = new javax.swing.JMenu();
        miAgregar = new javax.swing.JMenu();
        miEliminar = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador de Directorio");
        setLocation(new java.awt.Point(890, 250));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(203, 45));

        miBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        miBuscar.setText("Buscar");
        miBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miBuscar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        miBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        miBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miBuscarMouseClicked(evt);
            }
        });
        jMenuBar1.add(miBuscar);

        miAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        miAgregar.setText("Agregar");
        miAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miAgregar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        miAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miAgregarMouseClicked(evt);
            }
        });
        jMenuBar1.add(miAgregar);

        miEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        miEliminar.setText("Eliminar");
        miEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        miEliminar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        miEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miEliminarMouseClicked(evt);
            }
        });
        jMenuBar1.add(miEliminar);

        jmSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jmSalir.setText("Salir");
        jmSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmSalir.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jmSalirMouseClicked

    private void miBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miBuscarMouseClicked
        // TODO add your handling code here:
        PorNumero ventanaBuscar = new PorNumero();
        escritorio.removeAll();
        escritorio.repaint();
        ventanaBuscar.setVisible(true);
        escritorio.add(ventanaBuscar);
    }//GEN-LAST:event_miBuscarMouseClicked

    private void miAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miAgregarMouseClicked
        // TODO add your handling code here:
        Agregar ventanaAgregar = new Agregar();
        escritorio.removeAll();
        escritorio.repaint();
        ventanaAgregar.setVisible(true);
        escritorio.add(ventanaAgregar);
        
    }//GEN-LAST:event_miAgregarMouseClicked

    private void miEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miEliminarMouseClicked
        // TODO add your handling code here:
        Eliminar ventanaEliminar = new Eliminar();
        escritorio.removeAll();
        escritorio.repaint();
        ventanaEliminar.setVisible(true);
        escritorio.add(ventanaEliminar);
    }//GEN-LAST:event_miEliminarMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    
    public static Directorio getDirectorio(){
        return directorio;
    }
    
    static Directorio directorio = new Directorio();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmSalir;
    private javax.swing.JMenu miAgregar;
    private javax.swing.JMenu miBuscar;
    private javax.swing.JMenu miEliminar;
    // End of variables declaration//GEN-END:variables
}
