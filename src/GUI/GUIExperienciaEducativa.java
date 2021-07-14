
package GUI;

import Control.ControlCurso;
import Control.ControlExperiencia;
import Objetos.Academia;
import Objetos.ExperienciaEducativa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUIExperienciaEducativa extends javax.swing.JFrame {
    ControlExperiencia controlEE = new ControlExperiencia();
    
    public GUIExperienciaEducativa() {
        initComponents();
        cargarTablaEE();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaExperienciasEducativas = new javax.swing.JTable();
        botonRegistrarExperiencia = new javax.swing.JButton();
        botonModificarExperiencia = new javax.swing.JButton();
        botonEliminarExperiencia = new javax.swing.JButton();
        botonRetroceder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("EXPERIENCIAS EDUCATIVAS DISPONIBLES");

        tablaExperienciasEducativas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaExperienciasEducativas);

        botonRegistrarExperiencia.setBackground(new java.awt.Color(51, 255, 0));
        botonRegistrarExperiencia.setText("Registrar experiencia");
        botonRegistrarExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarExperienciaActionPerformed(evt);
            }
        });

        botonModificarExperiencia.setBackground(new java.awt.Color(255, 153, 0));
        botonModificarExperiencia.setText("Modificar experiencia");
        botonModificarExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarExperienciaActionPerformed(evt);
            }
        });

        botonEliminarExperiencia.setBackground(new java.awt.Color(255, 0, 0));
        botonEliminarExperiencia.setText("Eliminar experiencia");
        botonEliminarExperiencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarExperienciaActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botonRetroceder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(263, 263, 263))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonRegistrarExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonModificarExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonEliminarExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(botonRetroceder))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRegistrarExperiencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(botonModificarExperiencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEliminarExperiencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
         GUIPrincipal ventanaPrincipal = new GUIPrincipal();
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRetrocederActionPerformed

    private void botonRegistrarExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarExperienciaActionPerformed
        GUIRegistrarExperiencia ventanaRegistro = new GUIRegistrarExperiencia();
        ventanaRegistro.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRegistrarExperienciaActionPerformed

    private void botonModificarExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarExperienciaActionPerformed
       int index = this.tablaExperienciasEducativas.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una EE a modificar");
        }else{
            String claveModificar= tablaExperienciasEducativas.getValueAt(index, 0).toString(); //seleccionamos el indice de la tabla
            GUIRegistrarExperiencia ventanaRegistro = new GUIRegistrarExperiencia(claveModificar);
            ventanaRegistro.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonModificarExperienciaActionPerformed

    private void botonEliminarExperienciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarExperienciaActionPerformed
         int index = this.tablaExperienciasEducativas.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una EE a eliminar");
        }else{
            //Metodo que comprueba que existan cursos registrados
            ControlCurso controlCurso = new ControlCurso();
            String nombreEE = tablaExperienciasEducativas.getValueAt(index, 1).toString();
            if(!controlCurso.comprobarRegistro(nombreEE)){
                String claveEliminar= tablaExperienciasEducativas.getValueAt(index, 0).toString(); //seleccionamos el indice de la tabla
                controlEE.eliminarEE(claveEliminar);
                JOptionPane.showMessageDialog(null, "Experiencia educativa eliminada correctamente");
                cargarTablaEE();
            }else{
                JOptionPane.showMessageDialog(null, "No ha sido posible eliminar la EE debido a que tiene cursos registrados dentro de ella");
            }
        }
    }//GEN-LAST:event_botonEliminarExperienciaActionPerformed

 
    
     public void cargarTablaEE(){
        DefaultTableModel modelo = new  DefaultTableModel();
        ArrayList<Object>headEE = new ArrayList<>();
        headEE.add("Clave");
        headEE.add("Nombre EE");
        headEE.add("Academia");
        headEE.add("Creditos");
        headEE.forEach((columna) -> {
            modelo.addColumn(columna);
        });
        this.tablaExperienciasEducativas.setModel(modelo);
        
        ArrayList<ExperienciaEducativa> eeRegistradas = controlEE.obtenerEE();
        Object[] datosEE = new Object[tablaExperienciasEducativas.getColumnCount()];
        for(ExperienciaEducativa ee: eeRegistradas){
           datosEE[0] = ee.getClave();
           datosEE[1] = ee.getNombreExperiencia();
           datosEE[2] = ee.getNombreAcademia();
           datosEE[3] = ee.getCreditos();
            modelo.addRow(datosEE);
        }
        this.tablaExperienciasEducativas.setModel(modelo);
        
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
            java.util.logging.Logger.getLogger(GUIExperienciaEducativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIExperienciaEducativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIExperienciaEducativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIExperienciaEducativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIExperienciaEducativa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarExperiencia;
    private javax.swing.JButton botonModificarExperiencia;
    private javax.swing.JButton botonRegistrarExperiencia;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaExperienciasEducativas;
    // End of variables declaration//GEN-END:variables
}
