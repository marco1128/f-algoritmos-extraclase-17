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
public class Equipo {
    private String nombre;
    private String siglas;
    private int anio_fundacion;
    private Jugador jugadores[];
    private Tecnico tecnicos[];
    
    
    public Equipo(String nombre, Jugador[] jugadores, Tecnico[] tecnicos) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.tecnicos = tecnicos;
    }

    
    public Equipo(String nombre, String siglas, int anio_fundacion, Jugador[] jugadores, Tecnico[] tecnicos) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.anio_fundacion = anio_fundacion;
        this.jugadores = jugadores;
        this.tecnicos = tecnicos;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void agregar_nombre(String n) {
        this.nombre = n;
    }

    public String obtener_siglas() {
        return siglas;
    }

    public void agregar_siglas(String n) {
        this.siglas = n;
    }

    public int obtener_anio_fundacion() {
        return anio_fundacion;
    }

    public void agregar_anio_fundacion(int n) {
        this.anio_fundacion = n;
    }

    public Jugador[] obtener_jugadores() {
        return jugadores;
    }

    public void agregar_jugadores(Jugador[] n) {
        this.jugadores = n;
    }

    public Tecnico[] obtener_tecnicos() {
        return tecnicos;
    }

    public void agregar_tecnicos(Tecnico[] n) {
        this.tecnicos = n;
    }
    
    public double obtener_promedio_edad_jugadores(){
        double p_jugador=0;
        for (Jugador jugador : this.jugadores) {
            p_jugador+=jugador.obtener_edad();
        }
        p_jugador/=this.jugadores.length;
        return p_jugador;
    }
    
    public double obtener_promedio_edad_tecnicos(){
        double p_tecnico=0;
        for (Tecnico tecnico : this.tecnicos) {
            p_tecnico+=tecnico.obtener_edad();
        }
        p_tecnico/=this.tecnicos.length;
        return p_tecnico;
    }
    
    @Override
    public String toString(){
        
        String jugador_cadena= "Sus jugadores son:\n";
        String tecnico_cadena= "Sus tecnicos son: \n";
        //cadena para todos los jugadores
        for (Jugador jugador : jugadores) {
            jugador_cadena+=String.format("%s - %s - %d años\n",jugador.obtener_nombre(),jugador.obtener_posicion(),jugador.obtener_edad());
        }
        //cadena para todos los tecnicos
        for (Tecnico tecnico : tecnicos) {
            tecnico_cadena+=String.format("%s - %s - %d años\n",tecnico.obtener_nombre(),tecnico.obtener_funcion(),tecnico.obtener_edad());
        }
        return String.format("Equipo: %s\n"
                + "%s"
                + "%s"
                + "Promedio de edad de:\n"
                + "Tecnicos: %.1f años\n"
                + "Jugadores: %.1f años\n",obtener_nombre(),tecnico_cadena,jugador_cadena,obtener_promedio_edad_tecnicos(),obtener_promedio_edad_jugadores());
    }
}
