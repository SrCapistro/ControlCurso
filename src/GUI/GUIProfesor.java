package GUI;

import Control.ControlProfesor;
import Objetos.ExperienciaEducativa;
import Objetos.Profesor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class GUIProfesor extends javax.swing.JFrame {
    ControlProfesor controlProfesor = new ControlProfesor();

    public GUIProfesor() {
        initComponents();
        cargarTablaProfesores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProfesoresRegistrados = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        botonGuardarProfesor = new javax.swing.JButton();
        botonModificarProfesor = new javax.swing.JButton();
        botonEliminarProfesor = new javax.swing.JButton();
        botonRetroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PROFESORES REGISTRADOS");

        tablaProfesoresRegistrados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaProfesoresRegistrados);

        botonGuardarProfesor.setBackground(new java.awt.Color(0, 255, 0));
        botonGuardarProfesor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonGuardarProfesor.setText("Registrar profesor");
        botonGuardarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarProfesorActionPerformed(evt);
            }
        });

        botonModificarProfesor.setBackground(new java.awt.Color(255, 153, 0));
        botonModificarProfesor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonModificarProfesor.setText("Modificar profesor");
        botonModificarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarProfesorActionPerformed(evt);
            }
        });

        botonEliminarProfesor.setBackground(new java.awt.Color(255, 0, 0));
        botonEliminarProfesor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonEliminarProfesor.setText("Eliminar profesor");
        botonEliminarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarProfesorActionPerformed(evt);
            }
        });

        botonRetroceder.setText("Retroceder");
        botonRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetrocederActionPerformed(evt);
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
                                .addComponent(botonRetroceder)
                                .addGap(168, 168, 168)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonGuardarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonModificarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 117, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonGuardarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonModificarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonEliminarProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarProfesorActionPerformed
        GUIRegistrarProfesor registroProfesor = new GUIRegistrarProfesor();
        registroProfesor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonGuardarProfesorActionPerformed

    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
       GUIPrincipal ventanaPrincipal = new GUIPrincipal();
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRetrocederActionPerformed

    private void botonEliminarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarProfesorActionPerformed
        int index = this.tablaProfesoresRegistrados.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un profesor a eliminar");
        }else{
            //Metodo que comprueba que existan cursos registrados
            String claveEliminar= this.tablaProfesoresRegistrados.getValueAt(index, 0).toString(); //seleccionamos el indice de la tabla
            controlProfesor.eliminarProfesor(claveEliminar);
            JOptionPane.showMessageDialog(null, "Profesor eliminado correctamente");
            cargarTablaProfesores();
        }
    }//GEN-LAST:event_botonEliminarProfesorActionPerformed

    private void botonModificarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarProfesorActionPerformed
        int index = this.tablaProfesoresRegistrados.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un profesor a modificar");
        }else{
            //Metodo que comprueba que existan cursos registrados
            String claveModificar= this.tablaProfesoresRegistrados.getValueAt(index, 0).toString(); //seleccionamos el indice de la tabla
             GUIRegistrarProfesor modificarProfesor = new GUIRegistrarProfesor(claveModificar);
             modificarProfesor.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonModificarProfesorActionPerformed

   
    
    
     public void cargarTablaProfesores(){
        DefaultTableModel modelo = new  DefaultTableModel();
        ArrayList<Object>headProfe = new ArrayList<>();
        headProfe.add("Número de personal");
        headProfe.add("Nombre");
        headProfe.add("Telefono");
        headProfe.add("Correo");
        headProfe.add("Edad");
        headProfe.add("Tipo de contrato");
        headProfe.forEach((columna) -> {
            modelo.addColumn(columna);
        });
        this.tablaProfesoresRegistrados.setModel(modelo);
        
        ArrayList<Profesor> profesoresRegistrados = controlProfesor.obtenerProfesores();
        Object[] datosProfe = new Object[tablaProfesoresRegistrados.getColumnCount()];
        for(Profesor profe: profesoresRegistrados){
           datosProfe[0] = profe.getNumeroDePersonal();
           datosProfe[1] = profe.getNombreCompleto();
           datosProfe[2] = profe.getTelefono();
           datosProfe[3] = profe.getCorreo();
           datosProfe[4] = profe.getEdad();
           datosProfe[5] = profe.getTipoContratacion();
            modelo.addRow(datosProfe);
        }
        this.tablaProfesoresRegistrados.setModel(modelo);
        
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
            java.util.logging.Logger.getLogger(GUIProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarProfesor;
    private javax.swing.JButton botonGuardarProfesor;
    private javax.swing.JButton botonModificarProfesor;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaProfesoresRegistrados;
    // End of variables declaration//GEN-END:variables
}
