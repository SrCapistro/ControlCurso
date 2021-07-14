package GUI;

import Control.ControlAlumno;
import Objetos.Alumno;
import javax.swing.JOptionPane;


public class GUIRegistrarEstudiante extends javax.swing.JFrame {
    ControlAlumno controlAlumno = new ControlAlumno();
    boolean esNuevo = true;
    
    public GUIRegistrarEstudiante() {
        initComponents();
    }
    
    public GUIRegistrarEstudiante(String matricula){
         initComponents();
        esNuevo = false;
        Alumno alumnoModificar = controlAlumno.buscarAlumno(matricula);
        this.campoNombre.setText(alumnoModificar.getNombre());
        this.campoApellidos.setText(alumnoModificar.getApellidos());
        this.campoCorreo.setText(alumnoModificar.getCorreoElectronico());
        this.campoMatricula.setText(matricula);
        this.labelTitulo.setText("Modificar estudiante");
        this.campoMatricula.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoMatricula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        botonGuardarRegistro = new javax.swing.JButton();
        botonCancelarRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelTitulo.setText("Registro de estudiante");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Inserte su matricula (e.j S12345678):");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Inserte su nombre(s):");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Inserte sus apellidos:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Inserte su correo electrónico:");

        botonGuardarRegistro.setBackground(new java.awt.Color(0, 255, 0));
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
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel3)))
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoMatricula, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoApellidos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(campoCorreo))
                        .addGap(121, 121, 121))))
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(botonGuardarRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCancelarRegistro)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardarRegistro)
                    .addComponent(botonCancelarRegistro))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarRegistroActionPerformed
        GUIEstudiante ventanaEstudiantes = new GUIEstudiante();
        ventanaEstudiantes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCancelarRegistroActionPerformed

    private void botonGuardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarRegistroActionPerformed
        if(comprobarCampos()){
            if(this.campoMatricula.getText().startsWith("s") && this.campoMatricula.getText().length() == 9){
                if(esNuevo){
                        Alumno alumnoGuardar = new Alumno(this.campoMatricula.getText(),this.campoNombre.getText(),
                   this.campoApellidos.getText(),this.campoCorreo.getText(),"50");
                   if(controlAlumno.comprobarExistencia(alumnoGuardar.getMatricula())){
                       if(controlAlumno.guardarAlumnos(alumnoGuardar)){
                           JOptionPane.showMessageDialog(null, "Alumno guardado correctamente");
                           GUIEstudiante ventanaEstudiantes = new GUIEstudiante();
                           ventanaEstudiantes.setVisible(true);
                           this.setVisible(false);
                       }else{
                           JOptionPane.showMessageDialog(null, "Error al guardar el alumno");
                       }
                   }else{
                       JOptionPane.showMessageDialog(null, "El alumno con la matricula "+alumnoGuardar.getMatricula()+" ya esta registrado");
                   }
                }else{
                    Alumno alumnoModificar = new Alumno(this.campoMatricula.getText(),this.campoNombre.getText(),
                   this.campoApellidos.getText(),this.campoCorreo.getText(),"50");
                    controlAlumno.modificarAlumno(alumnoModificar);
                    JOptionPane.showMessageDialog(null, "Alumno modificado correctamente");
                }
            }else{
                JOptionPane.showMessageDialog(null, "La matricula debe de estar compuesta por 9 digitos e iniciar con 's'");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campos incompletos");
        }
    }//GEN-LAST:event_botonGuardarRegistroActionPerformed

    
    public boolean comprobarCampos(){
        boolean camposCorrectos = true;
        if(this.campoMatricula.getText().equals("") || this.campoNombre.getText().equals("") || this.campoApellidos.getText().equals("")
                || this.campoCorreo.getText().equals("")){
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
            java.util.logging.Logger.getLogger(GUIRegistrarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRegistrarEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRegistrarEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelarRegistro;
    private javax.swing.JButton botonGuardarRegistro;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables
}
