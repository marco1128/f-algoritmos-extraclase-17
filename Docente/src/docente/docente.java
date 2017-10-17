/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docente;

/**
 *
 * @author BVB09
 */
class docente {
    private String nombre_1;
    private String apellido_1;
    private String titulo_tercer_nivel_1;
    private String titulo_cuarto_nivel_1;
    
    private String nombre_2;
    private String apellido_2;
    private String titulo_tercer_nivel_2;
    private String titulo_cuarto_nivel_2;
    
    public void agregar_nombre_1(String n){
        nombre_1 = n;
    }
    public String obtener_nombre_1(){
        return nombre_1;
        
    }
    public void agregar_apellido_1(String n){
        apellido_1 =n;
    }
    public String obtener_apellido_1(){
        return apellido_1;
    }
    public void agregar_titulo_tercer_nivel_1(String n){
        titulo_tercer_nivel_1 =n;
    }
    public String obtener_titulo_tercer_nivel_1(){
        return titulo_tercer_nivel_1;
    }
    public void agregar_titulo_cuarto_nivel_1(String n){
        titulo_cuarto_nivel_1 =n;
    }
    public String obtener_cuarto_tercer_nivel_1(){
        return titulo_cuarto_nivel_1;
    }
    public void agregar_nombre_2(String n){
        nombre_2 = n;
    }
    public String obtener_nombre_2(){
        return nombre_2;
        
    }
    public void agregar_apellido_2(String n){
        apellido_2 =n;
    }
    public String obtener_apellido_2(){
        return apellido_2;
    }
    public void agregar_titulo_tercer_nivel_2(String n){
        titulo_tercer_nivel_2 =n;
    }
    public String obtener_titulo_tercer_nivel_2(){
        return titulo_tercer_nivel_2;
    }
    public void agregar_titulo_cuarto_nivel_2(String n){
        titulo_cuarto_nivel_2 =n;
    }
    public String obtener_cuarto_tercer_nivel_2(){
        return titulo_cuarto_nivel_2;
    }
    
}
