package Control;

import Objetos.ExperienciaEducativa;
import Objetos.Profesor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ControlProfesor {
    
    public void modificarProfesor(Profesor profeModificar){
        ArrayList<Profesor> listaAux = new ArrayList<>();
        File f = null;
        listaAux = obtenerProfesores();
        for(Profesor profe: listaAux){
            if(profe.getNumeroDePersonal().equals(profeModificar.getNumeroDePersonal())){
                listaAux.remove(profe);
                listaAux.add(profeModificar);
                break;
            }
        }
     
        eliminarArchivo();
        
        for(Profesor profeGuardar:listaAux){
            this.guardarProfesor(profeGuardar);
        }
    }
    public Profesor buscarProfesor(String clave){
        ArrayList<Profesor> profeLista = new ArrayList<>();
        profeLista = obtenerProfesores();
        Profesor profesorBuscar = null;
        for(Profesor profe:profeLista){
            if(clave.equals(profe.getNumeroDePersonal())){
                profesorBuscar = profe;
                break;
            }
        }
        return profesorBuscar;
    }
    public void eliminarProfesor(String clave){
        ArrayList<Profesor> profesorAux = new ArrayList<>(); //CREAMOS UNA LISTA AUXILIAR
        File f = null;
        
        profesorAux = obtenerProfesores(); //REUTILIZAMOS EL METODO Y OBTENEMOS TODAS LAS ACADEMIAS REGISTRADAS
        for(Profesor elementos : profesorAux){
            if(elementos.getNumeroDePersonal().equals(clave)){
                profesorAux.remove(elementos); //BUSCAMOS Y COMPARAMOS DENTRO DE LA LISTA Y SI DA MATCH ELIMINAMOS
                break;
            }
        }

        eliminarArchivo(); // ELIMINAMOS EL ARCHIVO CON EL OBJETO A ELIMINAR
        
        for(Profesor profeGuardar : profesorAux){
            this.guardarProfesor(profeGuardar); //FINALMENTE GUARDAMOS UNO POR UNO DE LAS ACADEMIAS AL ARCHIVO PERO SIN LA ACADEMIA ELIMINADA
        }
    }
    public void eliminarArchivo(){
        File f = null;
        f = new File("Profesores.dat");
        f.delete();
    }
    public boolean comprobarExistencia(String clavePersonal){
        ArrayList<Profesor> profesores = new ArrayList<>();
        boolean noExiste = true;
        File f = null;
        FileInputStream fi = null;
        profesores = obtenerProfesores();
        for(Profesor profesor:profesores){
            if(clavePersonal.equals(profesor.getNumeroDePersonal())){
                noExiste = false;
                break;
            }
        }
        return noExiste;
    }
    public boolean guardarProfesor(Profesor profesor){
        boolean guardado = false;   
        File f = null;
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try{
            f = new File("Profesores.dat");
            fo = new FileOutputStream(f, true);
            oo = new ObjectOutputStream(fo);
            oo.writeObject(profesor);
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
    public ArrayList<Profesor> obtenerProfesores(){
        ArrayList<Profesor> listaProfesores= new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("Profesores.dat");
            fi = new FileInputStream(f);
            Profesor profesor= null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                profesor = (Profesor) oi.readObject();
                listaProfesores.add(profesor);
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
        return listaProfesores;
    }
}
