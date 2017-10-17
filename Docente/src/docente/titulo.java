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
class titulo {
    private String nombre_universidad_1;
    private String nombre_universidad_2;
    private String nombre_universidad_3;
    private String nombre_universidad_4;

public void agregar_universidad_1 (String n){
    nombre_universidad_1= n;
    
}
public String obtener_universidad_1(){
    return nombre_universidad_1;

}
public void agregar_universidad_2(String n){
   nombre_universidad_2 = n; 
}

public String obtener_universidad_2(){
    return nombre_universidad_2;
}
public void agregar_universidad_3(String n){
    nombre_universidad_3= n;
    
}
public String obtener_universidad_3(){
    return nombre_universidad_3;

}
public void agregar_universidad_4(String n){
   nombre_universidad_4 = n; 
}

public String obtener_universidad_4(){
    return nombre_universidad_4;
}

}
