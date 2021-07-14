package Control;

import Objetos.Academia;
import Objetos.Curso;
import Objetos.ExperienciaEducativa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ControlExperiencia {

    
    
    //METODO PARA GUARDAR UNA EXPERIENCIA EDUCATIVA
    public boolean guardarExperienciaEducativa(ExperienciaEducativa experienciaGuardar){
        boolean guardado = false;   
        File f = null;
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try{
            f = new File("EE.dat");
            fo = new FileOutputStream(f, true);
            oo = new ObjectOutputStream(fo);
            oo.writeObject(experienciaGuardar);
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
    
    public ExperienciaEducativa buscarEE(String clave){
        ArrayList<ExperienciaEducativa> eeLista = new ArrayList<>();
        eeLista = obtenerEE();
        ExperienciaEducativa eeBuscar = null;
        for(ExperienciaEducativa elementos:eeLista){
            if(clave.equals(elementos.getClave())){
                eeBuscar = elementos;
                break;
            }
        }
        return eeBuscar;
    }
    
     public ExperienciaEducativa buscarPorNombre(String nombre){
        ArrayList<ExperienciaEducativa> eeLista = new ArrayList<>();
        eeLista = obtenerEE();
        ExperienciaEducativa eeBuscar = null;
        for(ExperienciaEducativa elementos:eeLista){
            if(nombre.equals(elementos.getNombreExperiencia())){
                eeBuscar = elementos;
                break;
            }
        }
        return eeBuscar;
    }
    
    public void modificarCliente(ExperienciaEducativa eeModificar){
        ArrayList<ExperienciaEducativa> eeAux = new ArrayList<>();
        File f = null;
        eeAux = obtenerEE();
        for(ExperienciaEducativa elementos : eeAux){
            if(elementos.getClave().equals(eeModificar.getClave())){
                eeAux.remove(elementos);
                eeAux.add(eeModificar);
                break;
            }
        }
     
        eliminarArchivo();
        
        for(ExperienciaEducativa eeGuardar: eeAux){
            this.guardarExperienciaEducativa(eeGuardar);
        }
    }
    
    public boolean comprobarRegistro(String nombreAcademia){
         boolean tieneRegistros = true;
        ArrayList<ExperienciaEducativa> listaEE= new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("EE.dat");
            fi = new FileInputStream(f);
            ExperienciaEducativa ee = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                ee = (ExperienciaEducativa) oi.readObject();
                if(ee.getNombreAcademia().equals(nombreAcademia)){
                    listaEE.add(ee);
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
        if(listaEE.isEmpty()){
            tieneRegistros = false;
        }
         return tieneRegistros;
     }
    
    public void eliminarEE(String clave){
        ArrayList<ExperienciaEducativa> eeAux = new ArrayList<>(); //CREAMOS UNA LISTA AUXILIAR
        File f = null;
        
        eeAux = obtenerEE(); //REUTILIZAMOS EL METODO Y OBTENEMOS TODAS LAS ACADEMIAS REGISTRADAS
        for(ExperienciaEducativa elementos : eeAux){
            if(elementos.getClave().equals(clave)){
                eeAux.remove(elementos); //BUSCAMOS Y COMPARAMOS DENTRO DE LA LISTA Y SI DA MATCH ELIMINAMOS
                break;
            }
        }

        eliminarArchivo(); // ELIMINAMOS EL ARCHIVO CON EL OBJETO A ELIMINAR
        
        for(ExperienciaEducativa eeGuardar : eeAux){
            this.guardarExperienciaEducativa(eeGuardar); //FINALMENTE GUARDAMOS UNO POR UNO DE LAS ACADEMIAS AL ARCHIVO PERO SIN LA ACADEMIA ELIMINADA
        }
    }
    
    public void eliminarArchivo(){
        File f = null;
        f = new File("EE.dat");
        f.delete();
    }
    
    public boolean comprobarExistencia(String eeID){
        ArrayList<ExperienciaEducativa> eeLista = new ArrayList<>();
        boolean noExiste = true;
        File f = null;
        FileInputStream fi = null;
        eeLista = obtenerEE();
        for(ExperienciaEducativa ee:eeLista){
            if(eeID.equals(ee.getClave())){
                noExiste = false;
                break;
            }
        }
        return noExiste;
    }
    
    public ArrayList<ExperienciaEducativa> obtenerEEPorCursoDocente(ArrayList<Curso> listaCursos){
        ArrayList<ExperienciaEducativa> listaEE= new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("EE.dat");
            fi = new FileInputStream(f);
            ExperienciaEducativa ee = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                ee = (ExperienciaEducativa) oi.readObject();
               for(Curso curso: listaCursos){
                   if(ee.getNombreExperiencia().equals(curso.getNombreExperiencia())){
                       listaEE.add(ee);
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
        return listaEE;
    }
    
    public ArrayList<ExperienciaEducativa> obtenerEEPorAcademia(String academia){
        ArrayList<ExperienciaEducativa> listaEE= new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("EE.dat");
            fi = new FileInputStream(f);
            ExperienciaEducativa ee = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                ee = (ExperienciaEducativa) oi.readObject();
                if(academia.equals(ee.getNombreAcademia())){
                    listaEE.add(ee);
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
        return listaEE;
    }
    
    
    //METODO PARA OBTENER UNA LISTA DE EE
    public ArrayList<ExperienciaEducativa> obtenerEE(){
        ArrayList<ExperienciaEducativa> listaEE= new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("EE.dat");
            fi = new FileInputStream(f);
            ExperienciaEducativa ee = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                ee = (ExperienciaEducativa) oi.readObject();
                listaEE.add(ee);
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
        return listaEE;
    }
}
