/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

/**
 *
 * @author BVB09
 */
public class Tecnico {
    private String nombre;
    private String funcion;
    private int edad;

    public Tecnico(String nombre, String funcion, int edad) {
        this.nombre = nombre;
        this.funcion = funcion;
        this.edad = edad;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void agregar_nombre(String n) {
        this.nombre = n;
    }

    public String obtener_funcion() {
        return funcion;
    }

    public void agregar_funcion(String n) {
        this.funcion = n;
    }

    public int obtener_edad() {
        return edad;
    }

    public void agregar_edad(int n) {
        this.edad = n;
    }
    
    
}
