
package Control;

import Objetos.Alumno;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ControlAlumno {

    
    public void eliminarAlumno(String matricula){
        ArrayList<Alumno> alumnos = new ArrayList<>(); //CREAMOS UNA LISTA AUXILIAR
        File f = null;
        
        alumnos = obtenerAlumnos(); //REUTILIZAMOS EL METODO Y OBTENEMOS TODAS LAS ACADEMIAS REGISTRADAS
        for(Alumno elementos:alumnos){
            if(elementos.getMatricula().equals(matricula)){
                alumnos.remove(elementos); //BUSCAMOS Y COMPARAMOS DENTRO DE LA LISTA Y SI DA MATCH ELIMINAMOS
                break;
            }
        }

        eliminarArchivo(); // ELIMINAMOS EL ARCHIVO CON EL OBJETO A ELIMINAR
        
        for(Alumno alumnoGuardar:alumnos){
            this.guardarAlumnos(alumnoGuardar); //FINALMENTE GUARDAMOS UNO POR UNO DE LAS ACADEMIAS AL ARCHIVO PERO SIN LA ACADEMIA ELIMINADA
        }
    }
    public void modificarAlumno(Alumno alumnoModificar){
        ArrayList<Alumno> alumnos= new ArrayList<>();
        File f = null;
        alumnos = obtenerAlumnos();
        for(Alumno elementos : alumnos){
            if(elementos.getMatricula().equals(alumnoModificar.getMatricula())){
                alumnos.remove(elementos);
                alumnos.add(alumnoModificar);
                break;
            }
        }
     
        eliminarArchivo();
        
        for(Alumno alumnoGuardar:alumnos){
            this.guardarAlumnos(alumnoGuardar);
        }
    }
     public void eliminarArchivo(){
        File f = null;
        f = new File("Alumnos.dat");
        f.delete();
    }
    public Alumno buscarAlumno(String matricula){
        ArrayList<Alumno> alumnos= new ArrayList<>();
        alumnos = obtenerAlumnos();
        Alumno alumnoBuscar = null;
        for(Alumno elementos:alumnos){
            if(matricula.equals(elementos.getMatricula())){
                alumnoBuscar = elementos;
                break;
            }
        }
        return alumnoBuscar;
    }
     public boolean comprobarExistencia(String matricula){
        ArrayList<Alumno> alumnos= new ArrayList<>();
        boolean noExiste = true;
        File f = null;
        FileInputStream fi = null;
        alumnos = obtenerAlumnos();
        for(Alumno alumno:alumnos){
            if(matricula.equals(alumno.getMatricula())){
                noExiste = false;
                break;
            }
        }
        return noExiste;
    }
    public ArrayList<Alumno> obtenerAlumnos(){
        ArrayList<Alumno> alumnos= new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("Alumnos.dat");
            fi = new FileInputStream(f);
            Alumno alumno = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                alumno = (Alumno) oi.readObject();
                alumnos.add(alumno);
            }
            
        }
        catch(IOException | ClassNotFoundException e1){
            
        }
        finally{
            try{
                fi.close();
            }
            catch(java.io.IOException e1){
                System.out.println("Excepción:" + e1.toString());
            }catch(java.lang.NullPointerException n1){
            }
        }
        return alumnos;
    }
    public boolean guardarAlumnos(Alumno alumnoGuardar){
        boolean guardado = false;   
        File f = null;
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try{
            f = new File("Alumnos.dat");
            fo = new FileOutputStream(f, true);
            oo = new ObjectOutputStream(fo);
            oo.writeObject(alumnoGuardar);
            guardado = true;
            
            fo.close();
            oo.close();
           }
            catch(java.io.IOException e1){
                guardado = false;
            }
            catch(Exception e1){
                guardado = false;
            }
            finally{
               if(oo!=null){
                   try {
                       oo.close();
                   } catch (IOException ex) {
                       
                   }
               }
            }
           return guardado;
    }
}
