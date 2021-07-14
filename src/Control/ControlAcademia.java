package Control;

import Objetos.Academia;
import Objetos.ExperienciaEducativa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


//CLASE DE CONTROL DE ACADEMIA, AQUI VAN TODOS LOS METODOS PARA LEER, ESCRIBIR Y MODIFICAR DENTRO DEL ARCHIVO PARA ACADEMIA
public class ControlAcademia {
    
    
    
    //METODO PARA ELIMINAR UNA ACADEMIA
     public void eliminarAcademia(String idAcademia){
        ArrayList<Academia> academiasAux = new ArrayList<>(); //CREAMOS UNA LISTA AUXILIAR
        File f = null;
        
        academiasAux = obtenerAcademias(); //REUTILIZAMOS EL METODO Y OBTENEMOS TODAS LAS ACADEMIAS REGISTRADAS
        for(Academia elementos : academiasAux){
            if(elementos.getIdAcademia().equals(idAcademia)){
                academiasAux.remove(elementos); //BUSCAMOS Y COMPARAMOS DENTRO DE LA LISTA Y SI DA MATCH ELIMINAMOS
                break;
            }
        }

        eliminarArchivo(); // ELIMINAMOS EL ARCHIVO CON EL OBJETO A ELIMINAR
        
        for(Academia academiasGuardar : academiasAux){
            this.guardarAcademia(academiasGuardar); //FINALMENTE GUARDAMOS UNO POR UNO DE LAS ACADEMIAS AL ARCHIVO PERO SIN LA ACADEMIA ELIMINADA
        }
    }
     
     //METODO QUE SIRVE PARA BUSCAR UNA ACADEMIA POR SU ID
     public Academia buscarAcademia(String idAcademia){
        ArrayList<Academia> academias = new ArrayList<>();
        academias = obtenerAcademias();
        Academia academiaBuscar = null;
        for(Academia academia:academias){
            if(idAcademia.equals(academia.getIdAcademia())){
                academiaBuscar = academia;
                break;
            }
        }
        return academiaBuscar;
    }
     
     //ESTE METODO ES PARA MODIFICAR UNA ACADEMIA COMPLETAMENTE
     public void modificarAcademia(Academia academiaModificar){
        ArrayList<Academia> academiasAux = new ArrayList<>();
        File f = null;
        academiasAux = obtenerAcademias();
        for(Academia elementos : academiasAux){
            if(elementos.getIdAcademia().equals(academiaModificar.getIdAcademia())){
                academiasAux.remove(elementos);
                academiasAux.add(academiaModificar);
                break;
            }
        }
        eliminarArchivo();
        
        for(Academia academiasGuardar: academiasAux){
            this.guardarAcademia(academiasGuardar);
        }
    }
     
     //ESTE METODO ELIMINA UN ARCHIVO DE GUARDADO
     public void eliminarArchivo(){
        File f = null;
        f = new File("Academias.dat");
        f.delete();
    }
     
    //METODO PARA COMPROBAR LA EXISTENCIA DE UNA ACADEMIA (MISMO ID)
     public boolean comprobarExistencia(String academiaID){
        ArrayList<Academia> academias = new ArrayList<>();
        boolean noExiste = true;
        File f = null;
        FileInputStream fi = null;
        academias = obtenerAcademias();
        for(Academia academia:academias){
            if(academiaID.equals(academia.getIdAcademia())){
                noExiste = false;
                break;
            }
        }
        return noExiste;
    }
    
    //METODO PARA GUARDAR ACADEMIA
    public boolean guardarAcademia(Academia academiaGuardar){
        boolean guardado = false;   
        File f = null;
        FileOutputStream fo = null;
        ObjectOutputStream oo = null;
        try{
            f = new File("Academias.dat");
            fo = new FileOutputStream(f, true);
            oo = new ObjectOutputStream(fo);
            oo.writeObject(academiaGuardar);
            guardado = true;
            
            fo.close();
            oo.close();
           }
            catch(java.io.IOException e1){
                guardado = false;
            }
            catch(Exception e1){
                e1.printStackTrace();
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
    
   
    
      public ArrayList<Academia> obtenerAcademiasPorEEDocente(ArrayList<ExperienciaEducativa> listaEE){
        ArrayList<Academia> academiasRegistradas= new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("Academias.dat");
            fi = new FileInputStream(f);
            Academia academiaRegistrada = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                academiaRegistrada = (Academia) oi.readObject();
                for(ExperienciaEducativa ee: listaEE){
                    if(ee.getNombreAcademia().equals(academiaRegistrada.getNombreAcademia())){
                         academiasRegistradas.add(academiaRegistrada);
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
        return academiasRegistradas;
    }
    
    //METODO QUE OBTIENE UNA LISTA DE TODAS LAS ACADEMIAS REGISTRADAS
     public ArrayList<Academia> obtenerAcademias(){
        ArrayList<Academia> academiasRegistradas= new ArrayList<>();
        File f = null;
        FileInputStream fi = null;
        try{
            f = new File ("Academias.dat");
            fi = new FileInputStream(f);
            Academia academiaRegistrada = null;
            while(true){
                ObjectInputStream oi = new ObjectInputStream(fi);
                academiaRegistrada = (Academia) oi.readObject();
                academiasRegistradas.add(academiaRegistrada);
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
        return academiasRegistradas;
    }
}
