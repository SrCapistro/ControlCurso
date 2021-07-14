
package GUI;

import Control.ControlAcademia;
import Control.ControlAlumno;
import Control.ControlCurso;
import Control.ControlExperiencia;
import Objetos.Academia;
import Objetos.Alumno;
import Objetos.Curso;
import Objetos.ExperienciaEducativa;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class GUICurso extends javax.swing.JFrame {
    ControlCurso controlCurso = new ControlCurso();
    ControlExperiencia controlEE = new ControlExperiencia();
    ControlAcademia controlAcademia = new ControlAcademia();
    ControlAlumno controlAlumno = new ControlAlumno();
    
    public GUICurso() {
        initComponents();
        cargarTablaCursos();
        cargarEE();
        cargarAcademias();
        cargarEstudiantes();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCursosDisponibles = new javax.swing.JTable();
        botonRetroceder = new javax.swing.JButton();
        botonRegistrarCurso = new javax.swing.JButton();
        botonModificarCurso = new javax.swing.JButton();
        botonEliminarCurso = new javax.swing.JButton();
        botonInscribirEstudiantes = new javax.swing.JButton();
        comboExperiencias = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboAcademias = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        comboMatricula = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CURSOS REGISTRADOS");

        tablaCursosDisponibles.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaCursosDisponibles);

        botonRetroceder.setText("Retroceder");
        botonRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetrocederActionPerformed(evt);
            }
        });

        botonRegistrarCurso.setBackground(new java.awt.Color(51, 255, 0));
        botonRegistrarCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonRegistrarCurso.setText("Registrar curso");
        botonRegistrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarCursoActionPerformed(evt);
            }
        });

        botonModificarCurso.setBackground(new java.awt.Color(255, 102, 0));
        botonModificarCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonModificarCurso.setText("Modificar curso");
        botonModificarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarCursoActionPerformed(evt);
            }
        });

        botonEliminarCurso.setBackground(new java.awt.Color(255, 0, 0));
        botonEliminarCurso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonEliminarCurso.setText("Eliminar curso");
        botonEliminarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCursoActionPerformed(evt);
            }
        });

        botonInscribirEstudiantes.setBackground(new java.awt.Color(0, 153, 255));
        botonInscribirEstudiantes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonInscribirEstudiantes.setText("Inscribir estudiantes");
        botonInscribirEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInscribirEstudiantesActionPerformed(evt);
            }
        });

        comboExperiencias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos los cursos" }));
        comboExperiencias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboExperienciasItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Filtrar por experiencia:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Filtrar por Academia: ");

        comboAcademias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas las academias" }));
        comboAcademias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAcademiasItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Filtrar por estudiante (Matricula):");

        comboMatricula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos los estudiantes" }));
        comboMatricula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboMatriculaItemStateChanged(evt);
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
                        .addComponent(botonRegistrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonModificarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(botonInscribirEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonRetroceder)
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(comboExperiencias, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(comboAcademias, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboMatricula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(botonRetroceder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboExperiencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(comboAcademias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(comboMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonRegistrarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(botonModificarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonEliminarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonInscribirEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
        GUIPrincipal ventanaPrincipal = new GUIPrincipal();
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRetrocederActionPerformed

    private void botonRegistrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarCursoActionPerformed
       GUIRegistrarCurso nuevoRegistro = new GUIRegistrarCurso();
       nuevoRegistro.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_botonRegistrarCursoActionPerformed

    private void botonModificarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarCursoActionPerformed
      int index = this.tablaCursosDisponibles.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un curso a modificar");
        }else{
            String nrcModificar= this.tablaCursosDisponibles.getValueAt(index, 0).toString();
            GUIRegistrarCurso cursoModificar = new GUIRegistrarCurso(nrcModificar);
            cursoModificar.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonModificarCursoActionPerformed

    public void cargarAcademias(){
        ArrayList<Academia> listaAcademias = new ArrayList<>();
        listaAcademias = controlAcademia.obtenerAcademias();
        for(Academia academia: listaAcademias){
            this.comboAcademias.addItem(academia.getNombreAcademia());
        }
    }
    
    public void cargarEE(){
        ArrayList<ExperienciaEducativa> listaEE = new ArrayList<>();
        listaEE = controlEE.obtenerEE();
        for(ExperienciaEducativa ee:listaEE){
            this.comboExperiencias.addItem(ee.getNombreExperiencia());
        }
    }
    
     public void cargarEstudiantes(){
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos = controlAlumno.obtenerAlumnos();
        for(Alumno alumno: listaAlumnos){
            this.comboMatricula.addItem(alumno.getMatricula());
        }
    }
    
    private void botonEliminarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCursoActionPerformed
       int index = this.tablaCursosDisponibles.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un curso a eliminar");
        }else{
            String nrcEliminar= this.tablaCursosDisponibles.getValueAt(index, 0).toString(); //seleccionamos el indice de la tabla
            Curso cursoEliminar = controlCurso.buscarCurso(nrcEliminar);
            if(cursoEliminar.getListaAlumnos() == null){
                 controlCurso.eliminarCurso(nrcEliminar);
                JOptionPane.showMessageDialog(null, "Curso eliminado correctamente");
                cargarTablaCursos();
            }else{
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar el curso debido a que tiene estudiantes registrados en el");
            }
           
        }
    }//GEN-LAST:event_botonEliminarCursoActionPerformed

    private void botonInscribirEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInscribirEstudiantesActionPerformed
       int index = this.tablaCursosDisponibles.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un curso a inscribir estudiantes");
        }else{
            String nrcInscribir= this.tablaCursosDisponibles.getValueAt(index, 0).toString();
            GUIInscribirEstudiante inscribirEstudiantes = new GUIInscribirEstudiante(nrcInscribir);
            inscribirEstudiantes.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_botonInscribirEstudiantesActionPerformed

    private void comboExperienciasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboExperienciasItemStateChanged
        String categoriaEESeleccionada = this.comboExperiencias.getSelectedItem().toString();
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(categoriaEESeleccionada.equals("Todos los cursos")){
                cargarTablaCursos();
            }else{
                cargarTablaFiltro(categoriaEESeleccionada);
            }
        }
    }//GEN-LAST:event_comboExperienciasItemStateChanged

    private void comboAcademiasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAcademiasItemStateChanged
       String categoriaAcademiaSeleccionada = this.comboAcademias.getSelectedItem().toString();
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(categoriaAcademiaSeleccionada.equals("Todas las academias")){
                cargarTablaCursos();
            }else{
                cargarTablaPorAcademias(categoriaAcademiaSeleccionada);
            }
        }
    }//GEN-LAST:event_comboAcademiasItemStateChanged

    private void comboMatriculaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboMatriculaItemStateChanged
       String categoriaMatricula = this.comboMatricula.getSelectedItem().toString();
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(categoriaMatricula.equals("Todos los estudiantes")){
                cargarTablaCursos();
            }else{
                cargarTablaPorEstudiante(categoriaMatricula);
            }
        }
    }//GEN-LAST:event_comboMatriculaItemStateChanged

     public void cargarTablaPorEstudiante(String matricula){
        DefaultTableModel modelo = new  DefaultTableModel();
        ArrayList<Object>headCurso = new ArrayList<>();
        headCurso.add("NRC");
        headCurso.add("Nombre");
        headCurso.add("Creditos");
        headCurso.add("Sección");
        headCurso.add("Bloque");
        headCurso.add("Espacios disponibles");
        headCurso.add("Nombre del docente");
        headCurso.forEach((columna) -> {
            modelo.addColumn(columna);
        });
        this.tablaCursosDisponibles.setModel(modelo);
        ArrayList<Curso> cursosRegistrados = controlCurso.obtenerCursosPorEstudiante(matricula);
        Object[] datosCurso = new Object[tablaCursosDisponibles.getColumnCount()];
        for(Curso curso: cursosRegistrados){
           datosCurso[0] = curso.getNrc();
           datosCurso[1] = curso.getNombreExperiencia();
           datosCurso[2] = curso.getCreditosExp();
           datosCurso[3] = curso.getSeccionCurso();
           datosCurso[4] = curso.getBloqueCurso();
           datosCurso[5] = curso.getEspaciosDisponibles();
           if(curso.getNombreDocente() == null){
               datosCurso[6] = "Docente sin asignar";
           }else{
               datosCurso[6] = curso.getNombreDocente();
           }
            modelo.addRow(datosCurso);
        }
        this.tablaCursosDisponibles.setModel(modelo);
    }
    
    
  public void cargarTablaPorAcademias(String nombreAcademia){
        DefaultTableModel modelo = new  DefaultTableModel();
        ArrayList<Object>headCurso = new ArrayList<>();
        headCurso.add("NRC");
        headCurso.add("Nombre");
        headCurso.add("Creditos");
        headCurso.add("Sección");
        headCurso.add("Bloque");
        headCurso.add("Espacios disponibles");
        headCurso.add("Nombre del docente");
        headCurso.forEach((columna) -> {
            modelo.addColumn(columna);
        });
        this.tablaCursosDisponibles.setModel(modelo);
        ArrayList<ExperienciaEducativa> listaExperiencias = controlEE.obtenerEEPorAcademia(nombreAcademia);
        ArrayList<Curso> cursosRegistrados = controlCurso.obtenerCursosPorAcademia(listaExperiencias);
        Object[] datosCurso = new Object[tablaCursosDisponibles.getColumnCount()];
        for(Curso curso: cursosRegistrados){
           datosCurso[0] = curso.getNrc();
           datosCurso[1] = curso.getNombreExperiencia();
           datosCurso[2] = curso.getCreditosExp();
           datosCurso[3] = curso.getSeccionCurso();
           datosCurso[4] = curso.getBloqueCurso();
           datosCurso[5] = curso.getEspaciosDisponibles();
           if(curso.getNombreDocente() == null){
               datosCurso[6] = "Docente sin asignar";
           }else{
               datosCurso[6] = curso.getNombreDocente();
           }
            modelo.addRow(datosCurso);
        }
        this.tablaCursosDisponibles.setModel(modelo);
    }
    
    public void cargarTablaFiltro(String nombreEE){
        DefaultTableModel modelo = new  DefaultTableModel();
        ArrayList<Object>headCurso = new ArrayList<>();
        headCurso.add("NRC");
        headCurso.add("Nombre");
        headCurso.add("Creditos");
        headCurso.add("Sección");
        headCurso.add("Bloque");
        headCurso.add("Espacios disponibles");
        headCurso.add("Nombre del docente");
        headCurso.forEach((columna) -> {
            modelo.addColumn(columna);
        });
        this.tablaCursosDisponibles.setModel(modelo);
        
        ArrayList<Curso> cursosRegistrados = controlCurso.obtenerCursosPorEE(nombreEE);
        Object[] datosCurso = new Object[tablaCursosDisponibles.getColumnCount()];
        for(Curso curso: cursosRegistrados){
           datosCurso[0] = curso.getNrc();
           datosCurso[1] = curso.getNombreExperiencia();
           datosCurso[2] = curso.getCreditosExp();
           datosCurso[3] = curso.getSeccionCurso();
           datosCurso[4] = curso.getBloqueCurso();
           datosCurso[5] = curso.getEspaciosDisponibles();
           if(curso.getNombreDocente() == null){
               datosCurso[6] = "Docente sin asignar";
           }else{
               datosCurso[6] = curso.getNombreDocente();
           }
            modelo.addRow(datosCurso);
        }
        this.tablaCursosDisponibles.setModel(modelo);
    }
    
     public void cargarTablaCursos(){
        DefaultTableModel modelo = new  DefaultTableModel();
        ArrayList<Object>headCurso = new ArrayList<>();
        headCurso.add("NRC");
        headCurso.add("Nombre");
        headCurso.add("Creditos");
        headCurso.add("Sección");
        headCurso.add("Bloque");
        headCurso.add("Espacios disponibles");
        headCurso.add("Nombre del docente");
        headCurso.forEach((columna) -> {
            modelo.addColumn(columna);
        });
        this.tablaCursosDisponibles.setModel(modelo);
        
        ArrayList<Curso> cursosRegistrados = controlCurso.obtenerCursos();
        Object[] datosCurso = new Object[tablaCursosDisponibles.getColumnCount()];
        for(Curso curso: cursosRegistrados){
           datosCurso[0] = curso.getNrc();
           datosCurso[1] = curso.getNombreExperiencia();
           datosCurso[2] = curso.getCreditosExp();
           datosCurso[3] = curso.getSeccionCurso();
           datosCurso[4] = curso.getBloqueCurso();
           datosCurso[5] = curso.getEspaciosDisponibles();
           if(curso.getNombreDocente() == null){
               datosCurso[6] = "Docente sin asignar";
           }else{
               datosCurso[6] = curso.getNombreDocente();
           }
            modelo.addRow(datosCurso);
        }
        this.tablaCursosDisponibles.setModel(modelo);
        
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
            java.util.logging.Logger.getLogger(GUICurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEliminarCurso;
    private javax.swing.JButton botonInscribirEstudiantes;
    private javax.swing.JButton botonModificarCurso;
    private javax.swing.JButton botonRegistrarCurso;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JComboBox<String> comboAcademias;
    private javax.swing.JComboBox<String> comboExperiencias;
    private javax.swing.JComboBox<String> comboMatricula;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCursosDisponibles;
    // End of variables declaration//GEN-END:variables
}
