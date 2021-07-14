package Objetos;

import java.io.Serializable;

public class Alumno implements Serializable{
    String matricula, nombre, apellidos, correoElectronico, creditos;

    public Alumno(String matricula, String nombre, String apellidos, String correoElectronico, String creditos) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.creditos = creditos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    
    
}
