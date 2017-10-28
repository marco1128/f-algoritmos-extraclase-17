/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_pirncipal;

import paquete_deportes.Equipo;
import paquete_deportes.Jugador;
import paquete_deportes.Tecnico;

/**
 *
 * @author BVB09
 */
public class principal {

    public static void main(String[] args) {
        //creamos arreglos para los paramemtros de jugadores y tecnicos
        
        Jugador jugadores[]= new Jugador[6];
        Tecnico tecnicos[]= new Tecnico[3];
        
        //llenamos el arrego de los tenicicos con los datps solicitados y enviamos los datos para que llenen los atributos
        
        tecnicos[0]= new Tecnico("Luis Gomez","Tecnico Principal",45);
        tecnicos[1]= new Tecnico("Julio Neto","Asistente Tecnico",46);
        tecnicos[2]= new Tecnico("Marco Silva","Preparador Físico",47);
        
         //llenamos el arrego de los tenicicos con los datps solicitados y enviamos los datos para que llenen los atributos

        jugadores[0]= new Jugador("Manuel Alvares","portero",20);
        jugadores[1]= new Jugador("Eduardo Valencia","Defensa",21);
        jugadores[2]= new Jugador("Fabian Cevallos","Defensa",30);
        jugadores[3]= new Jugador("Antonio Lara","Centrocampista",32);
        jugadores[4]= new Jugador("Luis Delgado","Centrocampista",17);
        jugadores[5]= new Jugador("Xavier Lopez","Delantero",25);
        // creamos  el objeto equipo y enviamos los arreglos jugadores y tecnicos 
        Equipo equipo= new Equipo("Boca Juniors",jugadores,tecnicos);
       // imprimios el reporte desde la clase equipo 
        System.out.println(equipo);
    }

}
