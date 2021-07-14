

package Objetos;

import java.io.Serializable;

public class Profesor implements Serializable{
    private String nombreCompleto, telefono, correo, edad, numeroDePersonal, tipoContratacion, CursoImpartido;

    public Profesor(String nombreCompleto, String telefono, String correo, String edad, String numeroDePersonal, String tipoContratacion) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
        this.numeroDePersonal = numeroDePersonal;
        this.tipoContratacion = tipoContratacion;
    }

    
    
    
    public Profesor(String nombreCompleto, String telefono, String correo, String edad, String numeroDePersonal, String tipoContratacion, String CursoImpartido) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.correo = correo;
        this.edad = edad;
        this.numeroDePersonal = numeroDePersonal;
        this.tipoContratacion = tipoContratacion;
        this.CursoImpartido = CursoImpartido;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getNumeroDePersonal() {
        return numeroDePersonal;
    }

    public void setNumeroDePersonal(String numeroDePersonal) {
        this.numeroDePersonal = numeroDePersonal;
    }

    public String getTipoContratacion() {
        return tipoContratacion;
    }

    public void setTipoContratacion(String tipoContratacion) {
        this.tipoContratacion = tipoContratacion;
    }

    public String getCursoImpartido() {
        return CursoImpartido;
    }

    public void setCursoImpartido(String CursoImpartido) {
        this.CursoImpartido = CursoImpartido;
    }
    
    
}
