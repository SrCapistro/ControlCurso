package GUI;

import Control.ControlAcademia;
import Control.ControlExperiencia;
import Objetos.Academia;
import Objetos.ExperienciaEducativa;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public final class GUIRegistrarExperiencia extends javax.swing.JFrame {
    ControlExperiencia controlEE = new ControlExperiencia();
    boolean esNuevo = true;
    public GUIRegistrarExperiencia() {
        initComponents();
        cargarAcademias();
    }
    
    public GUIRegistrarExperiencia(String clave){
        initComponents();
        esNuevo = false;
        cargarAcademias();
        ExperienciaEducativa eeModificar = controlEE.buscarEE(clave);
        this.campoClave.setText(clave);
        this.campoNombre.setText(eeModificar.getNombreExperiencia());
        this.comboAcademias.setSelectedItem(eeModificar.getNombreAcademia());
        this.comboCreditos.setSelectedItem(eeModificar.getCreditos());
        this.campoClave.setEnabled(false);
        labelRegistro.setText("MODIFICAR EXPERIENCIA EDUCATIVA");
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRegistro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        comboAcademias = new javax.swing.JComboBox<>();
        comboCreditos = new javax.swing.JComboBox<>();
        botonGuardarRegistro = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelRegistro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelRegistro.setText("REGISTRAR EXPERIENCIA EDUCATIVA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Inserte la clave de la EE (e.j 001):");

        campoClave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Inserte el nombre de la EE:");

        campoNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        comboAcademias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccionar academia -" }));

        comboCreditos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Cantidad de creditos -", "4", "6", "8", "9", "10", "12" }));

        botonGuardarRegistro.setBackground(new java.awt.Color(0, 255, 0));
        botonGuardarRegistro.setText("Guardar registro");
        botonGuardarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarRegistroActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(255, 0, 0));
        botonCancelar.setText("Cancelar registro");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelRegistro)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboAcademias, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonGuardarRegistro)
                .addGap(18, 18, 18)
                .addComponent(botonCancelar)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRegistro)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboAcademias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardarRegistro)
                    .addComponent(botonCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        GUIExperienciaEducativa ventanaExperiencias = new GUIExperienciaEducativa();
        ventanaExperiencias.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonGuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarRegistroActionPerformed
        if(validarCampos()){
           if(this.campoClave.getText().length()==3){
             if(esNuevo == false){
                 ExperienciaEducativa eeModificar = new ExperienciaEducativa(this.comboAcademias.getSelectedItem().toString(),this.campoClave.getText(),
            this.campoNombre.getText(),this.comboCreditos.getSelectedItem().toString());
                 controlEE.modificarCliente(eeModificar);
                 JOptionPane.showMessageDialog(null, "Experiencia educativa modificada correctamente");
                 GUIExperienciaEducativa ventanaExperiencias = new GUIExperienciaEducativa();
                    ventanaExperiencias.setVisible(true);
                    this.setVisible(false);
             }else{
                 ExperienciaEducativa eeGuardar = new ExperienciaEducativa(this.comboAcademias.getSelectedItem().toString(),this.campoClave.getText(),
            this.campoNombre.getText(),this.comboCreditos.getSelectedItem().toString());
            if(controlEE.comprobarExistencia(eeGuardar.getClave())){
                if(controlEE.guardarExperienciaEducativa(eeGuardar)){
                    JOptionPane.showMessageDialog(null, "Experiencia educativa guardada correctamente");
                    GUIExperienciaEducativa ventanaExperiencias = new GUIExperienciaEducativa();
                    ventanaExperiencias.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Error al guardar la EE");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "La EE con la clave ingresada ya existe");
            }
             }
           }else{
               JOptionPane.showMessageDialog(null, "La clave de la EE debe de ser de 3 digitos");
           }
        }else{
             JOptionPane.showMessageDialog(null, "Campos incompletos");
        }
    }//GEN-LAST:event_botonGuardarRegistroActionPerformed

    public boolean validarCampos(){
        boolean camposValidos =true;
        if(this.campoNombre.getText().equals("")||this.campoClave.equals("")||this.comboAcademias.getSelectedItem().toString().equals("")
                || this.comboCreditos.getSelectedItem().toString().equals("")){
            camposValidos = false;
        }   
            return camposValidos;
    }
    
    public void cargarAcademias(){
        ArrayList<Academia> listaAcademias = new ArrayList<>();
        ControlAcademia controlAcademia = new ControlAcademia();
        listaAcademias = controlAcademia.obtenerAcademias();
        for(Academia academia:listaAcademias){
            this.comboAcademias.addItem(academia.getNombreAcademia());
        }
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
            java.util.logging.Logger.getLogger(GUIRegistrarExperiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarExperiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarExperiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarExperiencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistrarExperiencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardarRegistro;
    private javax.swing.JTextField campoClave;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox<String> comboAcademias;
    private javax.swing.JComboBox<String> comboCreditos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelRegistro;
    // End of variables declaration//GEN-END:variables
}
