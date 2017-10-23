/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_estudiante;
import paquete_academico.Asignatura;
import paquete_academico.Docente;
import paquete_academico.Universidad;


/**
 *
 * @author BVB09
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private Asignatura asignatura1;
    private Asignatura asignatura2;
    private Universidad universidad;
    private Docente docente;
    
    public String obtener_nombre(){
        return nombre;
    }
    public void agregar_nombre(String nombre){
        this.nombre = nombre;
    }
    public String obtener_apellido(){
        return apellido;
    }
    public void agregar_apellido(String apellido){
        this.apellido = apellido;
    }
    public Asignatura obtener_asignatura1(){
        return asignatura1;
    }
    public void agregar_asignatura1(Asignatura asignatura1){
        this.asignatura1 =asignatura1;
    }
    public Asignatura obtener_asignatura2(){
        return asignatura2;
    }
    public void agregar_asignatura2(Asignatura asignatura2){
        this.asignatura2 =asignatura2;
    }
    public Universidad obtener_universidad(){
        return universidad;
    }
    public void agregar_universidad(Universidad universidad){
        this.universidad= universidad;
    }
    public Docente obtener_docente(){
        return docente;
    }
    public void agregar_docente(Docente docente){
        this.docente = docente;
    }
    
}
