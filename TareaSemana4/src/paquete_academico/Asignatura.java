/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

/**
 *
 * @author BVB09
 */
public class Asignatura {
    private int creditos;
    private String asignatura;
    private Carrera carrera;
    private Docente docente;

    public int obtener_creditos() {
        return creditos;
    }

    public void agregar_creditos(int creditos) {
        this.creditos = creditos;
    }

    public String obtener_asignatura() {
        return asignatura;
    }


    public void agregar_asignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    public Carrera obtener_carrera(){
        return carrera;
    }
    public void agregar_carrera(Carrera carrera){
        this.carrera=carrera;
    }
    public Docente obtener_docente(){
        return docente;
    }
    public void agregar_docente (Docente docente){
        this.docente = docente;
    }
    
    
    
    
}
