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
public class Jugador {
    private String nombre;
    private String posicion;
    private int edad;

    public Jugador(String nombre, String posicion, int edad) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void agegar_nombre(String n) {
        this.nombre = n;
    }

    public String obtener_posicion() {
        return posicion;
    }

    public void agegar_posicion(String n) {
        this.posicion = n;
    }

    public int obtener_edad() {
        return edad;
    }

    public void agregar_edad(int n) {
        this.edad = n;
    }   
}
