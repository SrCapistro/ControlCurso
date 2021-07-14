package Control;

import Objetos.Alumno;
import Objetos.Curso;
import Objetos.ExperienciaEducativa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ControlCurso {

    
    
    
    public boolean comprobarRegistro(String nombreEE){
         boolean tieneRegistros = true;
        ArrayList<Curso> listaCursos = new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("Cursos.dat");
            fi = new FileInputStream(f);
            Curso curso = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                curso = (Curso) oi.readObject();
                if(curso.getNombreExperiencia().equals(nombreEE)){
                    listaCursos.add(curso);
                }
               
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
        if(listaCursos.isEmpty()){
            tieneRegistros = false;
        }
         return tieneRegistros;
     }
     public Curso buscarCurso(String nrc){
        ArrayList<Curso> listaCursos = new ArrayList<>();
        listaCursos = obtenerCursos(); 
        Curso cursoBuscar = null;
        for(Curso curso:listaCursos){
            if(nrc.equals(curso.getNrc())){
                cursoBuscar = curso;
                break;
            }
        }
        return cursoBuscar;
    }
     public void modificarCurso(Curso cursoModificar){
        ArrayList<Curso> listaCursos = new ArrayList<>();
        File f = null;
        listaCursos = obtenerCursos();
        for(Curso curso:listaCursos){
            if(curso.getNrc().equals(cursoModificar.getNrc())){
                listaCursos.remove(curso);
                listaCursos.add(cursoModificar);
                break;
            }
        }
     
        eliminarArchivo();
        
        for(Curso cursoGuardar : listaCursos){
            this.guardarCurso(cursoGuardar);
        }
    }
    public void eliminarCurso(String nrc){
        ArrayList<Curso> listaCursos = new ArrayList<>(); //CREAMOS UNA LISTA AUXILIAR
        File f = null;
        
        listaCursos = obtenerCursos(); //REUTILIZAMOS EL METODO Y OBTENEMOS TODAS LAS ACADEMIAS REGISTRADAS
        for(Curso curso: listaCursos){
            if(curso.getNrc().equals(nrc)){
                listaCursos.remove(curso); //BUSCAMOS Y COMPARAMOS DENTRO DE LA LISTA Y SI DA MATCH ELIMINAMOS
                break;
            }
        }

        eliminarArchivo(); // ELIMINAMOS EL ARCHIVO CON EL OBJETO A ELIMINAR
        
        for(Curso cursoGuardar:listaCursos){
            this.guardarCurso(cursoGuardar); //FINALMENTE GUARDAMOS UNO POR UNO DE LAS ACADEMIAS AL ARCHIVO PERO SIN LA ACADEMIA ELIMINADA
        }
    }
    public void eliminarArchivo(){
        File f = null;
        f = new File("Cursos.dat");
        f.delete();
    }
    public boolean guardarCurso(Curso cursoGuardar){
        boolean guardado = false;   
        File f = null;
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try{
            f = new File("Cursos.dat");
            fo = new FileOutputStream(f, true);
            oo = new ObjectOutputStream(fo);
            oo.writeObject(cursoGuardar);
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
    
    
    public ArrayList<Curso> obtenerCursosPorEstudiante(String estudiante){
        ArrayList<Curso> listaCursos= new ArrayList<>();
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("Cursos.dat");
            fi = new FileInputStream(f);
            Curso curso = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                curso = (Curso) oi.readObject();
                if(curso.getListaAlumnos() != null){
                    listaAlumnos = curso.getListaAlumnos();
                     for(Alumno alumno: listaAlumnos){
                    if(estudiante.equals(alumno.getMatricula())){
                        listaCursos.add(curso);
                    }
                }
                }
               
                
                
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
        return listaCursos;
    }
    
    
    public ArrayList<Curso> obtenerCursosPorDocente(String nombreDocente){
        ArrayList<Curso> listaCursos= new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("Cursos.dat");
            fi = new FileInputStream(f);
            Curso curso = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                curso = (Curso) oi.readObject();
                if(curso.getNombreDocente().equals(nombreDocente)){
                    listaCursos.add(curso);
                }
                
                
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
        return listaCursos;
    }
    
    
     public ArrayList<Curso> obtenerCursosPorAcademia(ArrayList<ExperienciaEducativa> listaEE){
        ArrayList<Curso> listaCursos= new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("Cursos.dat");
            fi = new FileInputStream(f);
            Curso curso = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                curso = (Curso) oi.readObject();
                for(ExperienciaEducativa ee:listaEE){
                    if(curso.getNombreExperiencia().equals(ee.getNombreExperiencia())){
                        listaCursos.add(curso);
                    }
                }
                
                
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
        return listaCursos;
    }
    
    
    public ArrayList<Curso> obtenerCursosPorEE(String ee){
        ArrayList<Curso> listaCursos= new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("Cursos.dat");
            fi = new FileInputStream(f);
            Curso curso = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                curso = (Curso) oi.readObject();
                if(ee.equals(curso.getNombreExperiencia())){
                    listaCursos.add(curso);
                }
                
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
        return listaCursos;
    }
  
    
    public ArrayList<Curso> obtenerCursos(){
        ArrayList<Curso> listaCursos= new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("Cursos.dat");
            fi = new FileInputStream(f);
            Curso curso = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                curso = (Curso) oi.readObject();
                listaCursos.add(curso);
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
        return listaCursos;
    }
    
    public boolean comprobarExistencia(String nrc){
        ArrayList<Curso> listaCursos = new ArrayList<>();
        boolean noExiste = true;
        File f = null;
        FileInputStream fi = null;
        listaCursos = obtenerCursos();
        for(Curso curso:listaCursos){
            if(nrc.equals(curso.getNrc())){
                noExiste = false;
                break;
            }
        }
        return noExiste;
    }
}
