package Objetos;

import java.io.Serializable;


public class ExperienciaEducativa implements Serializable{
    private String nombreAcademia, clave, nombreExperiencia, creditos;

    public ExperienciaEducativa(String nombreAcademia, String clave, String nombreExperiencia, String creditos) {
        this.nombreAcademia = nombreAcademia;
        this.clave = clave;
        this.nombreExperiencia = nombreExperiencia;
        this.creditos = creditos;
    }

    public String getNombreAcademia() {
        return nombreAcademia;
    }

    public void setNombreAcademia(String nombreAcademia) {
        this.nombreAcademia = nombreAcademia;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }
    

  
    
}
