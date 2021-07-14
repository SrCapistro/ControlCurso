
package Objetos;

import java.io.Serializable;



public class Academia implements Serializable{
    private String nombreAcademia, nombreCoordinador, idAcademia, idCoordinador;

    public Academia(String nombreAcademia, String idAcademia) {
        this.nombreAcademia = nombreAcademia;
        this.idAcademia = idAcademia;
    }

    public Academia(String nombreAcademia, String nombreCoordinador, String idAcademia) {
        this.nombreAcademia = nombreAcademia;
        this.nombreCoordinador = nombreCoordinador;
        this.idAcademia = idAcademia;
    }

    public Academia(String nombreAcademia, String nombreCoordinador, String idAcademia, String idCoordinador) {
        this.nombreAcademia = nombreAcademia;
        this.nombreCoordinador = nombreCoordinador;
        this.idAcademia = idAcademia;
        this.idCoordinador = idCoordinador;
    }

    public String getIdCoordinador() {
        return idCoordinador;
    }

    public void setIdCoordinador(String idCoordinador) {
        this.idCoordinador = idCoordinador;
    }
    
    

    public String getNombreAcademia() {
        return nombreAcademia;
    }

    public void setNombreAcademia(String nombreAcademia) {
        this.nombreAcademia = nombreAcademia;
    }

    public String getNombreCoordinador() {
        return nombreCoordinador;
    }

    public void setNombreCoordinador(String nombreCoordinador) {
        this.nombreCoordinador = nombreCoordinador;
    }

    public String getIdAcademia() {
        return idAcademia;
    }

    public void setIdAcademia(String idAcademia) {
        this.idAcademia = idAcademia;
    }

    

    
    
    
}
