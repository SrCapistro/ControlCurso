package GUI;


public class GUIPrincipal extends javax.swing.JFrame {


    public GUIPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonExperienciasEducativas = new javax.swing.JButton();
        botonAcademias = new javax.swing.JButton();
        botonEstudiantes = new javax.swing.JButton();
        botonCursos = new javax.swing.JButton();
        botonProfesores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CONTROL DE CURSOS");

        botonExperienciasEducativas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonExperienciasEducativas.setText("Experiencias educativas");
        botonExperienciasEducativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExperienciasEducativasActionPerformed(evt);
            }
        });

        botonAcademias.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonAcademias.setText("Academias");
        botonAcademias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAcademiasActionPerformed(evt);
            }
        });

        botonEstudiantes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonEstudiantes.setText("Estudiantes");
        botonEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEstudiantesActionPerformed(evt);
            }
        });

        botonCursos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonCursos.setText("Cursos");
        botonCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCursosActionPerformed(evt);
            }
        });

        botonProfesores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonProfesores.setText("Profesores");
        botonProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProfesoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(botonEstudiantes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonExperienciasEducativas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAcademias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(botonProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonExperienciasEducativas, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(botonAcademias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(botonCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAcademiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAcademiasActionPerformed
        GUIAcademias ventanaAcademias = new GUIAcademias();
        ventanaAcademias.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAcademiasActionPerformed

    private void botonProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProfesoresActionPerformed
        GUIProfesor ventanaProfesor = new GUIProfesor();
        ventanaProfesor.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonProfesoresActionPerformed

    private void botonExperienciasEducativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExperienciasEducativasActionPerformed
        GUIExperienciaEducativa ventanaExperiencias = new GUIExperienciaEducativa();
        ventanaExperiencias.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonExperienciasEducativasActionPerformed

    private void botonEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEstudiantesActionPerformed
        GUIEstudiante ventanaEstudiantes = new GUIEstudiante();
        ventanaEstudiantes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonEstudiantesActionPerformed

    private void botonCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCursosActionPerformed
        GUICurso ventanaCursos = new GUICurso();
        ventanaCursos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCursosActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAcademias;
    private javax.swing.JButton botonCursos;
    private javax.swing.JButton botonEstudiantes;
    private javax.swing.JButton botonExperienciasEducativas;
    private javax.swing.JButton botonProfesores;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
