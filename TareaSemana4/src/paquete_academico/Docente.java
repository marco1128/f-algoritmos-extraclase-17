/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

import paquete_general.Pais;

/**
 *
 * @author BVB09
 */
public class Docente {
    private String nombre;
    private String apellido;
    private Pais pais;
    
    
    public String obtener_nombre() {
        return nombre;
    }

    public void agregar_nombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtener_apellido() {
        return apellido;
    }

    public void agregar_apellido(String apellido) {
        this.apellido = apellido;
    }
     public Pais obtener_pais() {
        return pais;
    }

    public void agregar_pais(Pais pais) {
        this.pais = pais;
    }
    
   
}
