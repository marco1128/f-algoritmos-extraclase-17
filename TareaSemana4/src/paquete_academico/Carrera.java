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
public class Carrera {
    private String nombre;
    private String modalidad;
    public String obtener_carrera (){
        return nombre;
    }
    public void agregar_carrera(String nombre){
        this.nombre = nombre;
        
    }
    public String obtener_modalidad(){
        return modalidad;
    }
    public void agregar_modalidad(String modalidad){
        this.modalidad = modalidad;
    }
   
    
    
}
