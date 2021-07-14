package GUI;

import Control.ControlAcademia;
import Control.ControlCurso;
import Control.ControlExperiencia;
import Control.ControlProfesor;
import Objetos.Academia;
import Objetos.Curso;
import Objetos.ExperienciaEducativa;
import Objetos.Profesor;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class GUIAcademias extends javax.swing.JFrame {
    ControlAcademia controlAcademia = new ControlAcademia();
    ControlProfesor controlProfesor = new ControlProfesor();
    ControlCurso controlCurso = new ControlCurso();
    ControlExperiencia controlEE = new ControlExperiencia();
    
    public GUIAcademias() {
        initComponents();
        cargarTablaAcademias();
        cargarProfesores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAcademias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoNombreAcademia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoClaveCoordinador = new javax.swing.JTextField();
        botonRetroceder = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        campoIDAcademia = new javax.swing.JTextField();
        botonGuardarAcademia = new javax.swing.JButton();
        botonModificarAcademia = new javax.swing.JButton();
        botonEliminarAcademia = new javax.swing.JButton();
        botonBuscarInfo = new javax.swing.JButton();
        comboProfesoresRegistrados = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Academias registradas");

        tablaAcademias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaAcademias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaAcademias);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("REGISTRO DE NUEVA ACADEMIA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese el nombre de la academia:");

        campoNombreAcademia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese la clave de personal del coordinador:");

        campoClaveCoordinador.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        botonRetroceder.setText("Retroceder");
        botonRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetrocederActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ingrese el ID (e.j. 001):");

        campoIDAcademia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        botonGuardarAcademia.setBackground(new java.awt.Color(51, 255, 0));
        botonGuardarAcademia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonGuardarAcademia.setText("Guardar academia");
        botonGuardarAcademia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarAcademiaActionPerformed(evt);
            }
        });

        botonModificarAcademia.setBackground(new java.awt.Color(255, 204, 0));
        botonModificarAcademia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonModificarAcademia.setText("Modificar academia");
        botonModificarAcademia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarAcademiaActionPerformed(evt);
            }
        });

        botonEliminarAcademia.setBackground(new java.awt.Color(255, 0, 0));
        botonEliminarAcademia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonEliminarAcademia.setText("Eliminar academia");
        botonEliminarAcademia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarAcademiaActionPerformed(evt);
            }
        });

        botonBuscarInfo.setText("Buscar info");
        botonBuscarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarInfoActionPerformed(evt);
            }
        });

        comboProfesoresRegistrados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos los profesores" }));
        comboProfesoresRegistrados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProfesoresRegistradosItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Filtrar por profesor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(637, 637, 637))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonGuardarAcademia, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonModificarAcademia, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonEliminarAcademia, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(botonBuscarInfo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonRetroceder)
                                        .addGap(264, 264, 264)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(campoNombreAcademia, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(campoIDAcademia, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(58, 58, 58)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(campoClaveCoordinador, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(comboProfesoresRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 40, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(botonRetroceder))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProfesoresRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombreAcademia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoClaveCoordinador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoIDAcademia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(botonEliminarAcademia, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                        .addComponent(botonGuardarAcademia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonModificarAcademia, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                    .addComponent(botonBuscarInfo))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //BOTON RETROCEDER
    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
        GUIPrincipal ventanaPrincipal = new GUIPrincipal();
        ventanaPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRetrocederActionPerformed

    //BOTON PARA GUARDAR ACADEMIAS
    private void botonGuardarAcademiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarAcademiaActionPerformed
        if(this.campoIDAcademia.getText().equals("") || this.campoNombreAcademia.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campos faltantes");
        }else{
            if(this.campoIDAcademia.getText().length() > 3  || campoIDAcademia.getText().length() < 3){
                 JOptionPane.showMessageDialog(null, "El ID de la academia debe de ser de 3 digitos");
            }else{
                if(controlAcademia.comprobarExistencia(campoIDAcademia.getText())){
                    if(this.campoClaveCoordinador.getText().equals("")){
                    Academia academiaGuardar = new Academia(this.campoNombreAcademia.getText(),this.campoIDAcademia.getText());
                    controlAcademia.guardarAcademia(academiaGuardar);
                     JOptionPane.showMessageDialog(null, "Academia guardada");
                    cargarTablaAcademias();
                    }else{
                        Profesor profe = controlProfesor.buscarProfesor(this.campoClaveCoordinador.getText());
                        if(profe == null){
                            JOptionPane.showMessageDialog(null, "Profesor no encontrado");
                        }else{
                            Academia academiaGuardar = new Academia(this.campoNombreAcademia.getText(),profe.getNombreCompleto(),this.campoIDAcademia.getText(),this.campoClaveCoordinador.getText());
                        controlAcademia.guardarAcademia(academiaGuardar);
                         JOptionPane.showMessageDialog(null, "Academia guardada");
                        cargarTablaAcademias();
                        }
                         
                    }
                }else{
                     JOptionPane.showMessageDialog(null, "Ya existe una academia registrada con el ID ingresado");
                }
            }
            
        }
    }//GEN-LAST:event_botonGuardarAcademiaActionPerformed

    //BOTON PARA MODIFICAR UNA ACADEMIA
    private void botonModificarAcademiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarAcademiaActionPerformed
        int index = tablaAcademias.getSelectedRow();
        if(index == -1 || this.campoIDAcademia.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una academia a modificar y dar click en 'Buscar info");
        }else{
            if(this.campoClaveCoordinador.getText().equals("")){
                Academia academiaModificar = new Academia(this.campoNombreAcademia.getText(),this.campoIDAcademia.getText());
            controlAcademia.modificarAcademia(academiaModificar);
            JOptionPane.showMessageDialog(null, "Academia modificada correctamente");
            this.campoIDAcademia.setEnabled(true);
            cargarTablaAcademias();
            }else{
                Profesor profe = controlProfesor.buscarProfesor(this.campoClaveCoordinador.getText());
                Academia academiaModificar = new Academia(this.campoNombreAcademia.getText(),profe.getNombreCompleto(),this.campoIDAcademia.getText(),this.campoClaveCoordinador.getText());
            controlAcademia.modificarAcademia(academiaModificar);
            JOptionPane.showMessageDialog(null, "Academia modificada correctamente");
            this.campoIDAcademia.setEnabled(true);
            cargarTablaAcademias();
            }
            
        }
    }//GEN-LAST:event_botonModificarAcademiaActionPerformed

    //BOTON PARA ELIMINAR UNA ACADEMIA
    private void botonEliminarAcademiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarAcademiaActionPerformed
        ControlExperiencia controlEE = new ControlExperiencia();
        int index = tablaAcademias.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una academia a eliminar");
        }else{
            String nombreAcademia= tablaAcademias.getValueAt(index, 0).toString();
            if(!controlEE.comprobarRegistro(nombreAcademia)){
                String idAcademiaEliminar= tablaAcademias.getValueAt(index, 1).toString(); //seleccionamos el indice de la tabla
                controlAcademia.eliminarAcademia(idAcademiaEliminar);
                JOptionPane.showMessageDialog(null, "Academia eliminada correctamente");
                cargarTablaAcademias();
            }else{
                JOptionPane.showMessageDialog(null, "No ha sido posible eliminar la academia seleccionada debido a que tiene cursos dentro de ella");
            }
            
        }
    }//GEN-LAST:event_botonEliminarAcademiaActionPerformed

    private void botonBuscarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarInfoActionPerformed
         int index = tablaAcademias.getSelectedRow();
        if(index == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una academia a modificar");
        }else{
            String nombreCoordinador= tablaAcademias.getValueAt(index, 2).toString();
            String idAcademiaModificar= tablaAcademias.getValueAt(index, 1).toString(); //seleccionamos el indice de la tabla
            if(nombreCoordinador.equals("Sin asignar")){
                Academia academiaBuscar = controlAcademia.buscarAcademia(idAcademiaModificar);
                this.campoNombreAcademia.setText(academiaBuscar.getNombreAcademia());
                this.campoIDAcademia.setText(academiaBuscar.getIdAcademia());
                this.campoClaveCoordinador.setText("");
                this.campoIDAcademia.setEnabled(false);
            }else{
                Academia academiaBuscar = controlAcademia.buscarAcademia(idAcademiaModificar);
                this.campoNombreAcademia.setText(academiaBuscar.getNombreAcademia());
                this.campoIDAcademia.setText(academiaBuscar.getIdAcademia());
                this.campoClaveCoordinador.setText(academiaBuscar.getIdCoordinador());
                this.campoIDAcademia.setEnabled(false);
            }
        }
    }//GEN-LAST:event_botonBuscarInfoActionPerformed

     public void cargarProfesores(){
        ArrayList<Profesor> listaProfes = new ArrayList<>();
        listaProfes = controlProfesor.obtenerProfesores();
        for(Profesor profe: listaProfes){
            this.comboProfesoresRegistrados.addItem(profe.getNombreCompleto());
        }
    }
    
    private void comboProfesoresRegistradosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProfesoresRegistradosItemStateChanged
        String profeSeleccionado = this.comboProfesoresRegistrados.getSelectedItem().toString();
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(profeSeleccionado.equals("Todos los profesores")){
                this.cargarTablaAcademias();
            }else{
                cargarTablaProfes(profeSeleccionado);
            }
        }
    }//GEN-LAST:event_comboProfesoresRegistradosItemStateChanged

    public void cargarTablaAcademias(){
        DefaultTableModel modelo = new  DefaultTableModel();
        ArrayList<Object>headAcademia = new ArrayList<>();
        headAcademia.add("Nombre academia");
        headAcademia.add("ID Academia");
        headAcademia.add("Coordinador");
        headAcademia.forEach((columna) -> {
            modelo.addColumn(columna);
        });
        this.tablaAcademias.setModel(modelo);
        
        ArrayList<Academia> academiasRegistradas = controlAcademia.obtenerAcademias();
        Object[] datosAcademia = new Object[tablaAcademias.getColumnCount()];
        for(Academia academiaRegistrada: academiasRegistradas){
            datosAcademia[0] = academiaRegistrada.getNombreAcademia();
            datosAcademia[1] = academiaRegistrada.getIdAcademia();
            if(academiaRegistrada.getNombreCoordinador() == null){
                datosAcademia[2] = "Sin asignar";
            }else {
                datosAcademia[2] = academiaRegistrada.getNombreCoordinador();
            }
            modelo.addRow(datosAcademia);
        }
        this.tablaAcademias.setModel(modelo);
        
    }
    
    public void cargarTablaProfes(String profe){
        DefaultTableModel modelo = new  DefaultTableModel();
        ArrayList<Object>headAcademia = new ArrayList<>();
        headAcademia.add("Nombre academia");
        headAcademia.add("ID Academia");
        headAcademia.add("Coordinador");
        headAcademia.forEach((columna) -> {
            modelo.addColumn(columna);
        });
        this.tablaAcademias.setModel(modelo);

        ArrayList<Curso> listaCursos = controlCurso.obtenerCursosPorDocente(profe);
        ArrayList<ExperienciaEducativa> listaEE = controlEE.obtenerEEPorCursoDocente(listaCursos);
        ArrayList<Academia> academiasRegistradas = controlAcademia.obtenerAcademiasPorEEDocente(listaEE);
        Object[] datosAcademia = new Object[tablaAcademias.getColumnCount()];
        for(Academia academiaRegistrada: academiasRegistradas){
            datosAcademia[0] = academiaRegistrada.getNombreAcademia();
            datosAcademia[1] = academiaRegistrada.getIdAcademia();
            if(academiaRegistrada.getNombreCoordinador() == null){
                datosAcademia[2] = "Sin asignar";
            }else {
                datosAcademia[2] = academiaRegistrada.getNombreCoordinador();
            }
            modelo.addRow(datosAcademia);
        }
        this.tablaAcademias.setModel(modelo);
        
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
            java.util.logging.Logger.getLogger(GUIAcademias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAcademias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAcademias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAcademias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAcademias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarInfo;
    private javax.swing.JButton botonEliminarAcademia;
    private javax.swing.JButton botonGuardarAcademia;
    private javax.swing.JButton botonModificarAcademia;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JTextField campoClaveCoordinador;
    private javax.swing.JTextField campoIDAcademia;
    private javax.swing.JTextField campoNombreAcademia;
    private javax.swing.JComboBox<String> comboProfesoresRegistrados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaAcademias;
    // End of variables declaration//GEN-END:variables
}
