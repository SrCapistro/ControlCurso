
package GUI;

import Control.ControlAlumno;
import Objetos.Alumno;
import Objetos.Profesor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class GUIEstudiante extends javax.swing.JFrame {
    ControlAlumno controlAlumno = new ControlAlumno();
  
    public GUIEstudiante() {
        initComponents();
        cargarTablaAlumnos();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantesRegistrados = new javax.swing.JTable();
        botonRetroceder = new javax.swing.JButton();
        botonRegistrarEstudiante = new javax.swing.JButton();
        botonModificarEstudiante = new javax.swing.JButton();
        botonEliminarEstudiante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ESTUDIANTES REGISTRADOS");

        tablaEstudiantesRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaEstudiantesRegistrados);

        botonRetroceder.setText("Retroceder");
        botonRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetrocederActionPerformed(evt);
            }
        });

        botonRegistrarEstudiante.setBackground(new java.awt.Color(51, 255, 0));
        botonRegistrarEstudiante.setText("Registrar estudiante");
        botonRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarEstudianteActionPerformed(evt);
            }
        });

        botonModificarEstudiante.setBackground(new java.awt.Color(255, 153, 0));
        botonModificarEstudiante.setText("Modificar estudiante");
        botonModificarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarEstudianteActionPerformed(evt);
            }
        });

        botonEliminarEstudiante.setBackground(new java.awt.Color(255, 0, 0));
        botonEliminarEstudiante.setText("Eliminar estudiante");
        botonEliminarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonRegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonModificarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonRetroceder)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel1)))
                        .addGap(0, 166, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(botonRetroceder))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRegistrarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(botonModificarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEliminarEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
        GUIPrincipal ventanaPrincipal = new GUIPrincipal();
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRetrocederActionPerformed

    private void botonRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarEstudianteActionPerformed
       GUIRegistrarEstudiante registroNuevo = new GUIRegistrarEstudiante();
       registroNuevo.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botonRegistrarEstudianteActionPerformed

    private void botonModificarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarEstudianteActionPerformed
         int index = this.tablaEstudiantesRegistrados.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un estudiante a modificar");
        }else{
            String matriculaModificar= this.tablaEstudiantesRegistrados.getValueAt(index, 0).toString(); //seleccionamos el indice de la tabla
             GUIRegistrarEstudiante registroModificar = new GUIRegistrarEstudiante(matriculaModificar);
            registroModificar.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonModificarEstudianteActionPerformed

    private void botonEliminarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarEstudianteActionPerformed
        int index = this.tablaEstudiantesRegistrados.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un estudiante a eliminar");
        }else{
            String matriculaEliminar = this.tablaEstudiantesRegistrados.getValueAt(index, 0).toString(); //seleccionamos el indice de la tabla
             controlAlumno.eliminarAlumno(matriculaEliminar);
             cargarTablaAlumnos();
        }
    }//GEN-LAST:event_botonEliminarEstudianteActionPerformed


     public void cargarTablaAlumnos(){
        DefaultTableModel modelo = new  DefaultTableModel();
        ArrayList<Object>headAlumno = new ArrayList<>();
        headAlumno.add("Matricula");
        headAlumno.add("Nombre");
        headAlumno.add("Correo electrónico");
        headAlumno.add("Creditos disponibles");
        headAlumno.forEach((columna) -> {
            modelo.addColumn(columna);
        });
        this.tablaEstudiantesRegistrados.setModel(modelo);
        
        ArrayList<Alumno> alumnosRegistrados = controlAlumno.obtenerAlumnos();
        Object[] datosAlumno = new Object[tablaEstudiantesRegistrados.getColumnCount()];
        for(Alumno alumno: alumnosRegistrados){
           datosAlumno[0] = alumno.getMatricula();
           datosAlumno[1] = alumno.getNombre() +" "+alumno.getApellidos();
           datosAlumno[2] = alumno.getCorreoElectronico();
           datosAlumno[3] = alumno.getCreditos();

            modelo.addRow(datosAlumno);
        }
        this.tablaEstudiantesRegistrados.setModel(modelo);
        
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
            java.util.logging.Logger.getLogger(GUIEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarEstudiante;
    private javax.swing.JButton botonModificarEstudiante;
    private javax.swing.JButton botonRegistrarEstudiante;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEstudiantesRegistrados;
    // End of variables declaration//GEN-END:variables
}
