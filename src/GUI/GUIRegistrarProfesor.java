
package GUI;

import Control.ControlProfesor;
import Objetos.Profesor;
import javax.swing.JOptionPane;


public class GUIRegistrarProfesor extends javax.swing.JFrame {
    ControlProfesor controlProfesor = new ControlProfesor();
    boolean esNuevo = true;
    
    public GUIRegistrarProfesor() {
        initComponents();
    }
    
    public GUIRegistrarProfesor(String clavePersonal){
        initComponents();
        esNuevo = false;
        Profesor profeModificar = controlProfesor.buscarProfesor(clavePersonal);
        this.campoClavePersonal.setText(clavePersonal);
        this.campoNombreProfesor.setText(profeModificar.getNombreCompleto());
        this.campoEmail.setText(profeModificar.getCorreo());
        this.campoTelefono.setText(profeModificar.getTelefono());
        this.comboContratacion.setSelectedItem(profeModificar.getTipoContratacion());
        this.comboEdad.setSelectedItem(profeModificar.getEdad());
        this.campoClavePersonal.setEnabled(false);
        this.labelRegistro.setText("MODIFICAR PROFESOR");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        labelRegistro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNombreProfesor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoClavePersonal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboEdad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        comboContratacion = new javax.swing.JComboBox<>();
        botonGuardarRegistro = new javax.swing.JButton();
        botonCancelarRegistro = new javax.swing.JButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelRegistro.setText("REGISTRO PROFESOR");

        jLabel2.setText("Ingrese el nombre y apellido(s):");

        jLabel3.setText("Ingrese la clave de personal:");

        jLabel5.setText("Ingrese la edad:");

        comboEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar edad -", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65+" }));

        jLabel6.setText("Ingrese el telefono:");

        jLabel7.setText("Ingrese el e-mail:");

        comboContratacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Tipo de contratación -", "Horas", "Contrato" }));

        botonGuardarRegistro.setBackground(new java.awt.Color(51, 255, 0));
        botonGuardarRegistro.setText("Guardar registro");
        botonGuardarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarRegistroActionPerformed(evt);
            }
        });

        botonCancelarRegistro.setBackground(new java.awt.Color(255, 0, 0));
        botonCancelarRegistro.setText("Cancelar registro");
        botonCancelarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoNombreProfesor)
                                .addComponent(jLabel3)
                                .addComponent(campoClavePersonal)
                                .addComponent(comboEdad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addComponent(campoTelefono)
                                .addComponent(jLabel7)
                                .addComponent(campoEmail)
                                .addComponent(comboContratacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(labelRegistro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonGuardarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonCancelarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRegistro)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNombreProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoClavePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonGuardarRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonCancelarRegistro)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarRegistroActionPerformed
       GUIProfesor ventanaProfesor = new GUIProfesor();
        ventanaProfesor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCancelarRegistroActionPerformed

    private void botonGuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarRegistroActionPerformed
       if(comprobarCampos()){
           if(esNuevo==false){
               Profesor profesorModificar = new Profesor(this.campoNombreProfesor.getText(),this.campoTelefono.getText(),this.campoEmail.getText(),
                   this.comboEdad.getSelectedItem().toString(),this.campoClavePersonal.getText(),this.comboContratacion.getSelectedItem().toString());
               controlProfesor.modificarProfesor(profesorModificar);
                    JOptionPane.showMessageDialog(null, "Profesor modificado correctamente");
                    GUIProfesor ventanaProfesor = new GUIProfesor();
                        ventanaProfesor.setVisible(true);
                        this.setVisible(false);
           }else{
               if(this.campoClavePersonal.getText().length() == 5){
                    if(controlProfesor.comprobarExistencia(this.campoClavePersonal.getText())){
                   Profesor profesorGuardar = new Profesor(this.campoNombreProfesor.getText(),this.campoTelefono.getText(),this.campoEmail.getText(),
                   this.comboEdad.getSelectedItem().toString(),this.campoClavePersonal.getText(),this.comboContratacion.getSelectedItem().toString());
                   if(controlProfesor.guardarProfesor(profesorGuardar)){
                        JOptionPane.showMessageDialog(null, "Profesor guardado correctamente");
                        GUIProfesor ventanaProfesor = new GUIProfesor();
                        ventanaProfesor.setVisible(true);
                        this.setVisible(false);
                   }else{
                        JOptionPane.showMessageDialog(null, "Error al guardar el registro");
                   }
               }else{
                    JOptionPane.showMessageDialog(null, "El profesor con la clave de personal a ingresar ya existe dentro del sistema");
               }
           }else{
                JOptionPane.showMessageDialog(null, "La clave de personal debe de ser de 5 digitos");
           }
           }
       }else{
           JOptionPane.showMessageDialog(null, "Campos faltantes");
       }
    }//GEN-LAST:event_botonGuardarRegistroActionPerformed

   
    
    public boolean comprobarCampos(){
        boolean camposCorrectos = true;
        if(this.campoClavePersonal.getText().equals("") || this.campoNombreProfesor.getText().equals("") || this.campoEmail.getText().equals("")||this.campoTelefono.getText().equals("")
                ||this.comboEdad.getSelectedItem().toString().equals("- Seleccionar edad -") || this.comboContratacion.getSelectedItem().equals("- Tipo de contratación -")){
            camposCorrectos = false;
        }
        return camposCorrectos;
    }
    
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
            java.util.logging.Logger.getLogger(GUIRegistrarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistrarProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelarRegistro;
    private javax.swing.JButton botonGuardarRegistro;
    private javax.swing.JTextField campoClavePersonal;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombreProfesor;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JComboBox<String> comboContratacion;
    private javax.swing.JComboBox<String> comboEdad;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelRegistro;
    // End of variables declaration//GEN-END:variables
}
