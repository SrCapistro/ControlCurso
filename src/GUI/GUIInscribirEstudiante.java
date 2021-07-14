package GUI;

import Control.ControlAlumno;
import Control.ControlCurso;
import Objetos.Alumno;
import Objetos.Curso;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class GUIInscribirEstudiante extends javax.swing.JFrame {
    ControlCurso controlCurso = new ControlCurso();
    ControlAlumno controlAlumno = new ControlAlumno();
    Curso cursoModificar =null;
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    ArrayList<Alumno> listaAux = new ArrayList<>();
    Alumno alumnoBuscar = null;
    int espaciosDisponibles = 0;

    public GUIInscribirEstudiante() {
        initComponents();
    }
    
    public GUIInscribirEstudiante(String nrcCurso) {
           initComponents();
           cursoModificar = controlCurso.buscarCurso(nrcCurso);
           this.labelCurso.setText(cursoModificar.getNombreExperiencia());
           if(cursoModificar.getListaAlumnos() == null){
               cargarTablaAlumnos(listaAlumnos);
           }else{
               cargarTablaAlumnos(cursoModificar.getListaAlumnos());
           }
       }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEstudiantesInscribir = new javax.swing.JTable();
        botonRetroceder = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campoMatricula = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        labelCurso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("INSCRIPCIÓN DE ESTUDIANTES A CURSO");

        tablaEstudiantesInscribir.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaEstudiantesInscribir);

        botonRetroceder.setText("Retroceder");
        botonRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetrocederActionPerformed(evt);
            }
        });

        botonGuardar.setBackground(new java.awt.Color(102, 255, 0));
        botonGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonGuardar.setText("Guardar inscripciones");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(255, 0, 0));
        botonCancelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("INSERTE LA MATRICULA DEL ESTUDIANTE A INSCRIBIR: ");

        botonBuscar.setBackground(new java.awt.Color(0, 204, 255));
        botonBuscar.setText("Inscribir");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(255, 51, 0));
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Curso:");

        labelCurso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCurso.setText("nombreCurso");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonRetroceder)
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1)
                        .addGap(0, 180, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(botonBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(campoMatricula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(366, 366, 366)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelCurso)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(botonRetroceder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(labelCurso))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(botonEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
        GUICurso ventanaCursos = new GUICurso();
        ventanaCursos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRetrocederActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
       if(this.campoMatricula.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Debe de insertar una matricula a inscribir");
       }else{
           if(controlAlumno.buscarAlumno(campoMatricula.getText())!= null){
             if(comprobarLista(listaAlumnos,campoMatricula.getText())){
                 JOptionPane.showMessageDialog(null, "El alumno ingresado ya ha sido añadido");
             }else{
                   alumnoBuscar = controlAlumno.buscarAlumno(campoMatricula.getText());
                   int creditosDisponibles = Integer.parseInt(alumnoBuscar.getCreditos());
                   int creditosCurso = Integer.parseInt(cursoModificar.getCreditosExp());
                   espaciosDisponibles = Integer.parseInt(cursoModificar.getEspaciosDisponibles());
                  if(espaciosDisponibles == 0){
                      JOptionPane.showMessageDialog(null, "Ya no quedan más espacios disponibles dentro del curso");
                  }else{
                        if(creditosDisponibles > creditosCurso){
                            if(cursoModificar.getListaAlumnos() != null){
                               listaAlumnos.addAll(cursoModificar.getListaAlumnos());
                            }
                                listaAux.add(alumnoBuscar);
                                listaAlumnos.add(alumnoBuscar);
                                espaciosDisponibles = calcularEspacios(espaciosDisponibles);
                                cargarTablaAlumnos(listaAlumnos);
                    }else{
                        JOptionPane.showMessageDialog(null, "Los creditos del alumno ingresado son insuficientes");
                    }
                  }
             }
           }else{
               JOptionPane.showMessageDialog(null, "Alumno no encontrado");
           }
           
       }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int index = this.tablaEstudiantesInscribir.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un alumno a eliminar");
        }else{
            String alumnoEliminar= this.tablaEstudiantesInscribir.getValueAt(index, 0).toString(); //seleccionamos el indice de la tabla
            eliminarDeTabla(alumnoEliminar, listaAlumnos);
            cargarTablaAlumnos(listaAlumnos);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        System.out.println(cursoModificar.getCreditosExp());
        int creditosCurso = Integer.parseInt(cursoModificar.getCreditosExp());
        System.out.println(creditosCurso);
        calcularCreditos(listaAux,creditosCurso);
        guardarListaInscripcion(espaciosDisponibles, listaAlumnos);
        JOptionPane.showMessageDialog(null, "Alumnos incritos correctamente al curso");
    }//GEN-LAST:event_botonGuardarActionPerformed

    public void guardarListaInscripcion(int espacios, ArrayList<Alumno> listaAlumnos){
        String espaciosdisp = "";
        espaciosdisp = String.valueOf(espacios);
        cursoModificar.setEspaciosDisponibles(espaciosdisp);
        cursoModificar.setListaAlumnos(listaAlumnos);
        controlCurso.modificarCurso(cursoModificar);
    }
    
    public void calcularCreditos(ArrayList<Alumno> listaAlumnos, int creditosCurso){
        for(Alumno alumnos:listaAlumnos){
            int creditosAlumno = Integer.parseInt(alumnos.getCreditos());
            creditosAlumno = creditosAlumno - creditosCurso;
            alumnos.setCreditos(String.valueOf(creditosAlumno));
        }
        for(Alumno alumnos:listaAlumnos){
            controlAlumno.modificarAlumno(alumnos);
        }
    }
    
    public int calcularEspacios(int espacios){
        espacios = espacios -1;
        return espacios;
    }
    
    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        GUICurso ventanaCursos = new GUICurso();
        ventanaCursos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonCancelarActionPerformed

    
    
    
    public boolean comprobarLista(ArrayList<Alumno> listaAlumnos, String matricula){
        boolean yaEsta = false;
        for(Alumno alumno:listaAlumnos){
            if(matricula.equals(alumno.getMatricula())){
                yaEsta = true;
                break;
            }
        }
        return yaEsta;
    }
    
    public void eliminarDeTabla(String matricula, ArrayList<Alumno>listaAlumnos){
        for(Alumno alumnoBuscar:listaAlumnos){
            if(matricula.equals(alumnoBuscar.getMatricula())){
                listaAlumnos.remove(alumnoBuscar);
                break;
            }
        }
    }
    
     public void cargarTablaAlumnos(ArrayList<Alumno> listaAlumnos){
        DefaultTableModel modelo = new  DefaultTableModel();
        ArrayList<Object>headEstudiantes = new ArrayList<>();
        headEstudiantes.add("Matricula");
        headEstudiantes.add("Nombre");
        headEstudiantes.add("Creditos disponibles");
        headEstudiantes.forEach((columna) -> {
            modelo.addColumn(columna);
        });
        this.tablaEstudiantesInscribir.setModel(modelo);
        Object[] datosAlumno= new Object[tablaEstudiantesInscribir.getColumnCount()];
        for(Alumno alumnoMostrar: listaAlumnos){
            datosAlumno[0] = alumnoMostrar.getMatricula();
            datosAlumno[1] = alumnoMostrar.getNombre() + " " + alumnoMostrar.getApellidos();
            datosAlumno[2] = alumnoMostrar.getCreditos();
            modelo.addRow(datosAlumno);
        }
        this.tablaEstudiantesInscribir.setModel(modelo);
        
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
            java.util.logging.Logger.getLogger(GUIInscribirEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIInscribirEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIInscribirEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIInscribirEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIInscribirEstudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JTextField campoMatricula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCurso;
    private javax.swing.JTable tablaEstudiantesInscribir;
    // End of variables declaration//GEN-END:variables
}
