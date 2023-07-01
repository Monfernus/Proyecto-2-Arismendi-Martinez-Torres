/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import EDD.helpers;
import static Interface.Menu.lista_reservacion;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis Gustavo
 */
public class BusquedaReservacion extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public BusquedaReservacion() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        Cedula = new javax.swing.JTextField();
        Ej = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Ingrese porfavor la C.I: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        buscar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        buscar.setText("Buscar reservacion");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 260, 60));

        Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActionPerformed(evt);
            }
        });
        getContentPane().add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 350, 50));

        Ej.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Ej.setText("Ej:   29.901.290");
        getContentPane().add(Ej, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 200, -1));

        jLabel1.setFont(new java.awt.Font("Dutch801 Rm BT", 1, 36)); // NOI18N
        jLabel1.setText("Busqueda de reservaciones");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        Volver.setText("VOLVER");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pngtree-light-blue-background-gradient-abstract-background-halo-image_758338.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Functions f = new Functions();
        this.dispose();
        f.Volver();
    }//GEN-LAST:event_VolverActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        helpers help = new helpers();
        String cedula = Cedula.getText();
        if(help.ValidarCedula(cedula) != -1){
            Functions func = new Functions();
            int ci = help.ValidarCedula(cedula);
            if(func.BuscarPorCedula(lista_reservacion, ci) != null){
                JOptionPane.showMessageDialog(null,func.BuscarPorCedula(lista_reservacion, ci));
            }else{
                JOptionPane.showMessageDialog(null,"No hay ningun cliente que haya reservado con esa cedula.");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Ingreso mal la cedula, vea el ejemplo y vuelva a intentarlo.");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusquedaReservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cedula;
    private javax.swing.JLabel Ej;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Volver;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}