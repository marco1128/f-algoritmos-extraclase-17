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
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // creamos el objeto de tipo titulo en el caso 1
        titulo t1 = new titulo ();
        //agregamos los datos  del objeto para llenar cada uno de sus atributos del caso 1
        //llenamos los objetos con la inofrmacion requerida 
        t1.agregar_universidad_1("Universidad Politecnica"); 
        t1.agregar_universidad_2 ("Universidad Valenciana");
        //creamos el objeto de tipo titulo para el caso 2
        titulo t2 = new titulo();
        // agrgamos los datos para lenar los atributos del caso 2
         //llenamos los objetos con la inofrmacion requerida 
        t2.agregar_universidad_3 ("Universidad Salesiana");
        t2.agregar_universidad_4("Universidad Cataluña");
        //creamos el objeto de tipo asignatura para el caso 1
        asignatura ag1 = new asignatura();
        //llenamos los objetos con la inofrmacion dada de las materias y el nuemro de creditos para el caso 1
        ag1.agregar_asignatura1("Matematica");
        ag1.agregar_asignatura_2("Fisica");
        ag1.agregar_credito_1(8);
        ag1.agregar_credito_2(6);
        //creamos el objeto de tipo asignatura para el caso 2
        asignatura ag2 = new asignatura();
        //llenamos los objetos con la inofrmacion dada de las materias y el nuemro de creditos para el caso 2
        ag2.agregar_asigantura_3("Sociales");
        ag2.agregar_asignatura_4("Lietratura");
        ag2.agregar_credito_3(9);
        ag2.agregar_credito_4(10);
       // creamos el objeto docente para el caso 1 
        docente dt1 = new docente();
        //llenamos lo objetjos  de tipo docente con la informacion de nombre, apellido titulos de 3er y 4to nivel del caso 1
        dt1.agregar_nombre_1("Luis V.");
        dt1.agregar_apellido_1("Perez J.");
        dt1.agregar_titulo_tercer_nivel_1(" Licenciado en Físico Matemáticas");
        dt1.agregar_titulo_cuarto_nivel_1("Magister en Docencia Matemática ");
        
        //llenamos lo objetjos  de tipo docente con la informacion de nombre, apellido titulos de 3er y 4to nivel del caso 2
        docente dt2 = new docente(); 
        dt2.agregar_nombre_2("Ana M.");
        dt2.agregar_apellido_2("Velez P.");
        dt2.agregar_titulo_tercer_nivel_2(" Licenciado en Ciencias Sociales");
        dt2.agregar_titulo_cuarto_nivel_2("Magister en Docencia Social");
        
       // procedemos mostrar en pantalla  todos los objetos que nos pide tal como se muestra en el deber (CASO 1)
        System.out.println("caso 1\n\nDatos del Docente:");
        System.out.printf("Nombres: %s \nApellidos: %s\n", dt1.obtener_nombre_1(), dt1.obtener_apellido_1());
        System.out.println("Tiene a su cargo las asignaturas:");
        System.out.printf("Asignatura 1:%s con numeros de creditos %d\nAsignatura 2: %s con numeros de creditos %d\n" 
                , ag1.obtener_asignatura_1(), ag1.obtener_credito_1(), ag1.obtener_asignatura_2(),ag1.obtener_credito_2());
        System.out.println("El docente tiene los siguientes títulos académicos:");  
        System.out.printf("Titulo de 3er nivel:%s-%s\nTitulo de 4to nvel:%s-%s\n"
                ,dt1.obtener_titulo_tercer_nivel_1(),t1.obtener_universidad_1(), dt1.obtener_cuarto_tercer_nivel_1(),t1.obtener_universidad_2());
    
        // procedemos mostrar en pantalla  todos los objetos que nos pide tal como se muestra en el deber (CASO 2)

        System.out.println("\nCaso 2\n\nDatos del Docente:");
        System.out.printf("Nombres: %s \nApellidos: %s\n", dt2.obtener_nombre_2(), dt2.obtener_apellido_2());
        System.out.println("Tiene a su cargo las asignaturas:");
        System.out.printf("Asignatura 1:%s con numeros de creditos %d\nAsignatura 2: %s con numeros de creditos %d\n" 
                , ag2.obtener_asigantura_3(), ag2.obtener_credito_3(), ag2.obtener_asignatura_4(),ag2.obtener_credito_4());
        System.out.println("El docente tiene los siguientes títulos académicos:");  
        System.out.printf("Titulo de 3er nivel:%s-%s\nTitulo de 4to nvel:%s-%s"
                ,dt2.obtener_titulo_tercer_nivel_2(),t2.obtener_universidad_3(), dt2.obtener_cuarto_tercer_nivel_2(),t2.obtener_universidad_4());
    }
    
}
