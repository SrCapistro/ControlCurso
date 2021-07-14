package Objetos;

import java.io.Serializable;
import java.util.ArrayList;


public class Curso implements Serializable {
    private String nombreExperiencia, creditosExp, nrc, bloqueCurso, seccionCurso, espaciosDisponibles,  nombreDocente, numeroPersonalDocente;
    private ArrayList<Alumno> listaAlumnos;

    public Curso(String nombreExperiencia, String creditosExp, String nrc, String bloqueCurso, String seccionCurso, String espaciosDisponibles) {
        this.nombreExperiencia = nombreExperiencia;
        this.creditosExp = creditosExp;
        this.nrc = nrc;
        this.bloqueCurso = bloqueCurso;
        this.seccionCurso = seccionCurso;
        this.espaciosDisponibles = espaciosDisponibles;
    }

    public Curso(String nombreExperiencia, String creditosExp, String nrc, String bloqueCurso, String seccionCurso, String espaciosDisponibles, String nombreDocente, String numeroPersonalDocente) {
        this.nombreExperiencia = nombreExperiencia;
        this.creditosExp = creditosExp;
        this.nrc = nrc;
        this.bloqueCurso = bloqueCurso;
        this.seccionCurso = seccionCurso;
        this.espaciosDisponibles = espaciosDisponibles;
        this.nombreDocente = nombreDocente;
        this.numeroPersonalDocente = numeroPersonalDocente;
    }

    public Curso(String nombreExperiencia, String creditosExp, String nrc, String bloqueCurso, String seccionCurso, String espaciosDisponibles, String nombreDocente, String numeroPersonalDocente, ArrayList<Alumno> listaAlumnos) {
        this.nombreExperiencia = nombreExperiencia;
        this.creditosExp = creditosExp;
        this.nrc = nrc;
        this.bloqueCurso = bloqueCurso;
        this.seccionCurso = seccionCurso;
        this.espaciosDisponibles = espaciosDisponibles;
        this.nombreDocente = nombreDocente;
        this.numeroPersonalDocente = numeroPersonalDocente;
        this.listaAlumnos = listaAlumnos;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    

    

    public String getNombreExperiencia() {
        return nombreExperiencia;
    }

    public void setNombreExperiencia(String nombreExperiencia) {
        this.nombreExperiencia = nombreExperiencia;
    }

    public String getCreditosExp() {
        return creditosExp;
    }

    public void setCreditosExp(String creditosExp) {
        this.creditosExp = creditosExp;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public String getBloqueCurso() {
        return bloqueCurso;
    }

    public void setBloqueCurso(String bloqueCurso) {
        this.bloqueCurso = bloqueCurso;
    }

    public String getSeccionCurso() {
        return seccionCurso;
    }

    public void setSeccionCurso(String seccionCurso) {
        this.seccionCurso = seccionCurso;
    }

    public String getEspaciosDisponibles() {
        return espaciosDisponibles;
    }

    public void setEspaciosDisponibles(String espaciosDisponibles) {
        this.espaciosDisponibles = espaciosDisponibles;
    }

    public String getNumeroPersonalDocente() {
        return numeroPersonalDocente;
    }

    public void setNumeroPersonalDocente(String numeroPersonalDocente) {
        this.numeroPersonalDocente = numeroPersonalDocente;
    }

    
    
}
