/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Cuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author Shadia^^
 */
public class Principal extends javax.swing.JFrame {
      
    /**
     * Creates new form Principal
     */
    Cuenta cu;
    
    public Principal() {
        initComponents();
        cmdGuardar.setEnabled(true);
        cmdIngresar.setEnabled(false);
        cmdRetirar.setEnabled(false);
        cmdActualizar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdLimpiar.setEnabled(true);
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
        jPanel2 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdIngresar = new javax.swing.JButton();
        cmdRetirar = new javax.swing.JButton();
        cmdActualizar = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCuenta = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        txtSaldoActual = new javax.swing.JTextField();
        txtInteresAnual = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 176, 194));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ejercicio #5"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 255));
        jLabel1.setFont(new java.awt.Font("JasmineUPC", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CUENTA BANCARIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 240, 30));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setText("Guardar");
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, -1));

        cmdIngresar.setText("Ingresar");
        cmdIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIngresarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, -1));

        cmdRetirar.setText("Retirar");
        cmdRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRetirarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, -1));

        cmdActualizar.setText("Actualizar Saldo");
        cmdActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, -1));

        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 150, 210));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Inicial"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("No. Cuenta");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 23, -1, -1));

        jLabel3.setText("No. Identificación");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jLabel4.setText("Saldo actual");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 20));

        jLabel5.setText("Interes anual");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuentaKeyTyped(evt);
            }
        });
        jPanel3.add(txtCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, -1));

        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        jPanel3.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 110, -1));

        txtSaldoActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSaldoActualKeyTyped(evt);
            }
        });
        jPanel3.add(txtSaldoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 110, -1));

        txtInteresAnual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInteresAnualKeyTyped(evt);
            }
        });
        jPanel3.add(txtInteresAnual, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 230, 170));

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 22, 229, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 290, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 626, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(642, 463));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
         int numeroCuenta;   
         long identificacion; 
         double saldo_actual;
         double interes_anual;
         
        if (txtCuenta.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite No. Cuenta", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCuenta.requestFocusInWindow();

        } else if (txtIdentificacion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite No. Identificación", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtIdentificacion.requestFocusInWindow();
            
        } else if (txtSaldoActual.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el Saldo Actual", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtSaldoActual.requestFocusInWindow();
            
        } else if (txtInteresAnual.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite el Interes Anual", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtInteresAnual.requestFocusInWindow();
            
        } else {

            numeroCuenta = Integer.parseInt(txtCuenta.getText());
            identificacion = Long.parseLong(txtIdentificacion.getText());
            saldo_actual = Double.parseDouble(txtSaldoActual.getText());
            interes_anual = Double.parseDouble(txtInteresAnual.getText());

            cu = new Cuenta(numeroCuenta, identificacion, saldo_actual, interes_anual);
            
            JOptionPane.showMessageDialog(this, "Su cuenta ha sido guardado exitosamente");
            
            
            cmdGuardar.setEnabled(false);
            cmdIngresar.setEnabled(true);
            cmdRetirar.setEnabled(true);
            cmdActualizar.setEnabled(false);
            cmdMostrar.setEnabled(true);
            cmdLimpiar.setEnabled(true);
            
        }        
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIngresarActionPerformed
      
        double aux;
      aux =   cu.ingresar();
     txtResultado.append("Su saldo actual es: "+ aux +"\n");
     
        cmdGuardar.setEnabled(false);
        cmdIngresar.setEnabled(true);
        cmdRetirar.setEnabled(true);
        cmdActualizar.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdLimpiar.setEnabled(true);
      
         
      
        
    }//GEN-LAST:event_cmdIngresarActionPerformed

    private void cmdRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRetirarActionPerformed
       
       double aux;
       aux = cu.retirar();
       txtResultado.append("Su saldo actual es: "+aux+"\n");
       
       cmdGuardar.setEnabled(false);
        cmdIngresar.setEnabled(false);
        cmdRetirar.setEnabled(true);
        cmdActualizar.setEnabled(true);
        cmdMostrar.setEnabled(false);
        cmdLimpiar.setEnabled(true);
      
       
    }//GEN-LAST:event_cmdRetirarActionPerformed

    private void cmdActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdActualizarActionPerformed
        double aux2;
     aux2 = cu.actualizarSaldo();
     txtResultado.append("Su saldo ha sido actualizado "+aux2+"\n");
    
     
     cmdGuardar.setEnabled(false);
        cmdIngresar.setEnabled(false);
        cmdRetirar.setEnabled(false);
        cmdActualizar.setEnabled(true);
        cmdMostrar.setEnabled(true);
        cmdLimpiar.setEnabled(true);
        
   
    }//GEN-LAST:event_cmdActualizarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        txtResultado.append("El No. de su cuenta es: "+cu.getNumeroCuenta()+"\n");
        txtResultado.append("Su identificacion es: "+cu.getIdentificacion()+"\n");
        txtResultado.append("Su saldo actual es: "+cu.getSaldo_actual()+"\n");
        txtResultado.append("El interes anual es: "+cu.getInteres_anual());
        
        cmdGuardar.setEnabled(false);
        cmdIngresar.setEnabled(false);
        cmdRetirar.setEnabled(false);
        cmdActualizar.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdLimpiar.setEnabled(true);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
    
       txtCuenta.setText("");
       txtIdentificacion.setText("");
       txtSaldoActual.setText("");
       txtInteresAnual.setText("");
       txtResultado.setText("");
       
       cmdGuardar.setEnabled(true);
        cmdIngresar.setEnabled(false);
        cmdRetirar.setEnabled(false);
        cmdActualizar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdLimpiar.setEnabled(true);
       
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void txtCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuentaKeyTyped
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          }
    }//GEN-LAST:event_txtCuentaKeyTyped

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
      char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void txtSaldoActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSaldoActualKeyTyped
        char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          }
    }//GEN-LAST:event_txtSaldoActualKeyTyped

    private void txtInteresAnualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInteresAnualKeyTyped
      char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
          }
    }//GEN-LAST:event_txtInteresAnualKeyTyped

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdActualizar;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdIngresar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdRetirar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCuenta;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtInteresAnual;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtSaldoActual;
    // End of variables declaration//GEN-END:variables
}
