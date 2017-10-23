/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_general.Pais;
import paquete_academico.Universidad;
import paquete_academico.Carrera;
import paquete_academico.Docente;
import paquete_academico.Asignatura;
import paquete_estudiante.Estudiante;

/**
 *
 * @author BVB09
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Pais p1 = new Pais();
        p1.agregar_pais("Ecuador");
        Pais p2 = new Pais();
        p2.agregar_pais("Colombia");
        Pais p3 = new Pais();
        p3.agregar_pais("Peru");

        Universidad u1 = new Universidad();
        u1.agregar_universidad("Universidad Tecnica Particular de Loja");
        u1.agregar_siglas("UTPL");
        u1.agregar_pais(p1);
        Universidad u2 = new Universidad();
        u2.agregar_universidad("Universidad Técnica Equinoccial");
        u2.agregar_siglas("UTE");
        u2.agregar_pais(p1);

        Carrera ca1 = new Carrera();
        ca1.agregar_carrera("Sistemas");
        ca1.agregar_modalidad("Presencial");
        Carrera ca2 = new Carrera();
        ca2.agregar_carrera("Quimica");
        ca2.agregar_modalidad("Distancia");

        Docente dt1 = new Docente();
        dt1.agregar_nombre("Mario");
        dt1.agregar_apellido("Alcivar");
        dt1.agregar_pais(p2);
        Docente dt2 = new Docente();
        dt2.agregar_nombre("Maria");
        dt2.agregar_apellido("Ruiz");
        dt2.agregar_pais(p3);

        Asignatura ag1 = new Asignatura();
        ag1.agregar_asignatura("Matemáticas");
        ag1.agregar_creditos(10);
        ag1.agregar_carrera(ca1);
        ag1.agregar_docente(dt1);

        Asignatura ag2 = new Asignatura();
        ag2.agregar_asignatura("Física");
        ag2.agregar_creditos(8);
        ag2.agregar_carrera(ca1);
        ag2.agregar_docente(dt2);

        Estudiante est1 = new Estudiante();
        est1.agregar_nombre("Luis V.");
        est1.agregar_apellido("Perez J.");
        est1.agregar_universidad(u1);
        est1.agregar_asignatura1(ag1);
        est1.agregar_docente (dt1);
        est1.agregar_asignatura2(ag2);
        
        System.out.println("Datos del Estudiante:");
        System.out.printf("Nombres: %s \n Apellidos: %s\n",est1.obtener_nombre(), est1.obtener_apellido());
        System.out.printf("Universidad: %s(%s)-%s\n", u1.obtener_universidad(), u1.obtener_siglas(),p1.obtener_pais());
        System.out.println("Tiene las siguientes asignaturas:");
        System.out.printf("Asignatura 1 : %s (%d creditos)", ag1.obtener_asignatura(), ag1.obtener_creditos());
        System.out.printf("de la carrera: %s - modalidad (%s)\n",ca1.obtener_carrera(),ca1.obtener_modalidad());
        System.out.printf("Docente:%s %s-Pais %s\n",dt1.obtener_nombre(), dt1.obtener_apellido(),p2.obtener_pais());
        System.out.printf("Asignatura 2 : %s (%d creditos)", ag2.obtener_asignatura(), ag2.obtener_creditos());
        System.out.printf("de la carrera: %s - modalidad (%s)\n",ca1.obtener_carrera(),ca1.obtener_modalidad());
        System.out.printf("Docente:%s %s-Pais %s\n",dt2.obtener_nombre(), dt2.obtener_apellido(),p3.obtener_pais());




        
        
    }

}
