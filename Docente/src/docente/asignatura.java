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
class asignatura {
    private String asignatura_1;
    private String asignatura_2;
    private int credito_1;
    private int credito_2;
    private String asignatura_3;
    private String asignatura_4;
    private int credito_3;
    private int credito_4;
    
    public void  agregar_asignatura1(String n){
        asignatura_1 = n;
        
    }
    public String obtener_asignatura_1(){
        return asignatura_1;
    }
    public void agregar_asignatura_2(String n){
        asignatura_2 = n;
    }
    public String obtener_asignatura_2(){
        return asignatura_2;
    }
    public void agregar_credito_1(int n){
        credito_1 = n;
    }
    
    public int obtener_credito_1(){
        return credito_1;
    }
    public void agregar_credito_2(int n){
        credito_2 = n;
    }
    public int obtener_credito_2(){
        return credito_2;
    }
    public void agregar_asigantura_3(String n){
        asignatura_3 = n;
    }
    public String obtener_asigantura_3(){
        return asignatura_3;
    }
    public void agregar_asignatura_4(String n){
        asignatura_4 = n;
    }
    public String obtener_asignatura_4(){
        return asignatura_4;
    }
     public void agregar_credito_3(int n){
        credito_3 = n;
    }
    
    public int obtener_credito_3(){
        return credito_3;
    }
    public void agregar_credito_4(int n){
        credito_4 = n;
    }
    public int obtener_credito_4(){
        return credito_4;
    }
    
}
