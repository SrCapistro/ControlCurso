
package GUI;

import Control.ControlCurso;
import Control.ControlExperiencia;
import Control.ControlProfesor;
import Objetos.Curso;
import Objetos.ExperienciaEducativa;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class GUIRegistrarCurso extends javax.swing.JFrame {
    ControlCurso controlCurso = new ControlCurso();
    ControlExperiencia  controlEE = new ControlExperiencia();
    ControlProfesor controlProfesor = new ControlProfesor();
    boolean esNuevo = true;
    public GUIRegistrarCurso() {
        initComponents();
        cargarEE();
    }
    
    public GUIRegistrarCurso(String nrcModificar){
        initComponents();
        esNuevo = false;
        Curso cursoModificar = controlCurso.buscarCurso(nrcModificar);
        this.labelRegistro.setText("MODIFICAR CURSO");
        this.campoNRC.setText(cursoModificar.getNrc());
        this.campoEspaciosDisp.setText(cursoModificar.getEspaciosDisponibles());
        this.campoNumeroPersonal.setText(cursoModificar.getNumeroPersonalDocente());
        this.comboBloque.setSelectedItem(cursoModificar.getBloqueCurso());
        this.comboExperiencia.setSelectedItem(cursoModificar.getNombreExperiencia());
        this.comboSección.setSelectedItem(cursoModificar.getSeccionCurso());
        this.campoNRC.setEnabled(false);
        cargarEE();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelRegistro = new javax.swing.JLabel();
        comboExperiencia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNRC = new javax.swing.JTextField();
        comboBloque = new javax.swing.JComboBox<>();
        comboSección = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        campoEspaciosDisp = new javax.swing.JTextField();
        botonGuardarRegistro = new javax.swing.JButton();
        botonCancelarRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoNumeroPersonal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelRegistro.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelRegistro.setText("REGISTRO DE CURSO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Selecciona la experiencia educativa:");

        jLabel3.setText("Ingrese el NRC del curso:");

        comboBloque.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione el bloque -", "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8" }));

        comboSección.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Seleccione la sección -", "S1", "S2" }));

        jLabel4.setText("Inserte los espacios disponibles:");

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

        jLabel1.setText("Ingrese el número de personal del docente adscrito:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(botonGuardarRegistro)
                .addGap(29, 29, 29)
                .addComponent(botonCancelarRegistro)
                .addGap(0, 87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45))
                            .addComponent(labelRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboExperiencia, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoNRC, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBloque, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboSección, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoEspaciosDisp))
                        .addGap(112, 112, 112))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(campoNumeroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelRegistro)
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboBloque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboSección, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoEspaciosDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(campoNumeroPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardarRegistro)
                    .addComponent(botonCancelarRegistro))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarRegistroActionPerformed
        GUICurso ventanaCursos = new GUICurso();
        ventanaCursos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCancelarRegistroActionPerformed

    private void botonGuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarRegistroActionPerformed
       if(validarCampos()){
           if(this.campoNRC.getText().length() == 5){
              if(this.campoNumeroPersonal.getText().equals("")){
                   if(esNuevo){
                       Curso cursoGuardar = new Curso(this.comboExperiencia.getSelectedItem().toString(),cargarCreditos(this.comboExperiencia.getSelectedItem().toString()),
                       this.campoNRC.getText(),this.comboBloque.getSelectedItem().toString(),this.comboSección.getSelectedItem().toString(),
                       this.campoEspaciosDisp.getText());
                       if(controlCurso.guardarCurso(cursoGuardar)){
                           JOptionPane.showMessageDialog(null, "Curso guardado correctamente");
                            GUICurso ventanaCursos = new GUICurso();
                            ventanaCursos.setVisible(true);
                            this.setVisible(false);
                       }
                   }else{
                       Curso cursoModificar = new Curso(this.comboExperiencia.getSelectedItem().toString(),cargarCreditos(this.comboExperiencia.getSelectedItem().toString()),
                       this.campoNRC.getText(),this.comboBloque.getSelectedItem().toString(),this.comboSección.getSelectedItem().toString(),
                       this.campoEspaciosDisp.getText());
                       controlCurso.modificarCurso(cursoModificar);
                       JOptionPane.showMessageDialog(null, "Curso modificado correctamente");
                       GUICurso ventanaCursos = new GUICurso();
                            ventanaCursos.setVisible(true);
                            this.setVisible(false);
                   }
                   
              }else{
                  if(esNuevo){
                      if(controlProfesor.buscarProfesor(this.campoNumeroPersonal.getText()) == null){
                       JOptionPane.showMessageDialog(null, "Profesor no encontrado");
                  }else{
                      Curso cursoGuardar = new Curso(this.comboExperiencia.getSelectedItem().toString(),cargarCreditos(this.comboExperiencia.getSelectedItem().toString()),
                       this.campoNRC.getText(),this.comboBloque.getSelectedItem().toString(),this.comboSección.getSelectedItem().toString(),
                       this.campoEspaciosDisp.getText(),controlProfesor.buscarProfesor(this.campoNumeroPersonal.getText()).getNombreCompleto(),this.campoNumeroPersonal.getText());
                       if(controlCurso.guardarCurso(cursoGuardar)){
                           JOptionPane.showMessageDialog(null, "Curso guardado correctamente");
                            GUICurso ventanaCursos = new GUICurso();
                            ventanaCursos.setVisible(true);
                            this.setVisible(false);
                       }
                  }
                  }else{
                      if(controlProfesor.buscarProfesor(this.campoNumeroPersonal.getText()) == null){
                       JOptionPane.showMessageDialog(null, "Profesor no encontrado");
                  }else{
                      Curso cursoModificar = new Curso(this.comboExperiencia.getSelectedItem().toString(),cargarCreditos(this.comboExperiencia.getSelectedItem().toString()),
                       this.campoNRC.getText(),this.comboBloque.getSelectedItem().toString(),this.comboSección.getSelectedItem().toString(),
                       this.campoEspaciosDisp.getText(),controlProfesor.buscarProfesor(this.campoNumeroPersonal.getText()).getNombreCompleto(),this.campoNumeroPersonal.getText());
                       controlCurso.modificarCurso(cursoModificar);
                       JOptionPane.showMessageDialog(null, "Curso modificado correctamente");
                            GUICurso ventanaCursos = new GUICurso();
                            ventanaCursos.setVisible(true);
                            this.setVisible(false);
                  }
                  }
                  
              }
           }else{
               JOptionPane.showMessageDialog(null, "El NRC debe de ser de 5 digitos");
           }
       }else{
             JOptionPane.showMessageDialog(null, "Campos faltantes");
       }
    }//GEN-LAST:event_botonGuardarRegistroActionPerformed

 
    
    public boolean validarCampos(){
        boolean camposValidos = true;
        if(this.campoEspaciosDisp.getText().equals("") || this.campoNRC.getText().equals("")||this.comboBloque.getSelectedItem().toString().equals("- Seleccione el bloque -")
                   ||this.comboExperiencia.getSelectedItem().toString().equals("- Seleccione la sección -")){
            camposValidos = false;
        }
        return camposValidos;
    }
    
    public String cargarCreditos(String nombreExperiencia){
        String creditos;
        creditos = controlEE.buscarPorNombre(nombreExperiencia).getCreditos();
        return creditos;
    }
    
    public void cargarEE(){
        ArrayList<ExperienciaEducativa> listaEE = new ArrayList<>();
        listaEE = controlEE.obtenerEE();
        for(ExperienciaEducativa ee:listaEE){
            this.comboExperiencia.addItem(ee.getNombreExperiencia());
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
            java.util.logging.Logger.getLogger(GUIRegistrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistrarCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelarRegistro;
    private javax.swing.JButton botonGuardarRegistro;
    private javax.swing.JTextField campoEspaciosDisp;
    private javax.swing.JTextField campoNRC;
    private javax.swing.JTextField campoNumeroPersonal;
    private javax.swing.JComboBox<String> comboBloque;
    private javax.swing.JComboBox<String> comboExperiencia;
    private javax.swing.JComboBox<String> comboSección;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelRegistro;
    // End of variables declaration//GEN-END:variables
}
