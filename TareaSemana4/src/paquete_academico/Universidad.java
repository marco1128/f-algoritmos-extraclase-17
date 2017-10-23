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
public class Universidad {
    private String nombre;
    private String siglas;
    private Pais pais;
    
    public String obtener_universidad(){
        return nombre;
    } 
    public void agregar_universidad(String nombre){
        this.nombre =nombre;
    }
    public String obtener_siglas(){
        return siglas;
        
    }
    public void agregar_siglas(String siglas){
        this.siglas = siglas;
    }
    public Pais obtener_pais(){
        return pais;
    }
    public void  agregar_pais(Pais pais){
        this.pais = pais;
    
}
}