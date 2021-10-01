
package Vista;

import Modelo.Alumno;
import java.util.Scanner;



public class Main {
static Scanner l=new Scanner(System.in);

    
    public static void main(String[] args) {
         String nombre="";
          String numAl="";
      boolean salida=false;
        do {    
            
            try {
                salida=false;
              System.out.println(" Introduce el nombre: ");
         nombre=l.nextLine();
        System.out.println(" Introduce el nº del alumno: ");
         numAl=l.nextLine();
        int a=Integer.parseInt(numAl);
        
                if (nombre.trim()==""||numAl.trim()==""||a<1) {
                    throw new IllegalArgumentException();
                }
        
            } catch (Exception e) {
            salida=true;
           
            System.out.println("Introduzca los argumentos correctamente");
            
            
            
            }
            
            
           } while (salida);
      
        
        Alumno al=new Alumno(nombre,numAl);
        
        ponNota(al);
        MuestrAlumno(al);
    
/*Realizar una clase de nombre Alumno que cumpla las siguientes
especificaciones:
        
        
El constructor admite como argumento el número de matricula del alumno
el nombre y almacena estos en los correspondientes atributos.

Contiene los siguientes métodos:
        
o ponNota: con los argumentos de tipo double que corresponden a dos
notas de un examen. El método almacena estos en sendas variables
de tipo double

        
o dameMedia: retorna la media dlas notas.

o muestraAlumno: retorna una descripción del alumno con el número
de la matrícula, el nombre y la nota media.

Realizar una aplicación de nombre VerAlumno que solicite los datos de un
alumno y sus notas, construya un objeto de a clase Alumno y muestre los
datos de este con la media de las notas al usuario.
        
        
El resultado del ejercicio debe ser:

Introduce el nombre: Manolo
Introduce el no del alumno: 156
Introduce la primera nota: 7,5
Introduce la segunda nota: 6
156 Manolo nota media 6,75
*/
        
    
    
    
    
    
    
    
    
    
    
    
    }

    private static void ponNota(Alumno al) {
        
        boolean salida=false;
        do {    
            
            try {
                salida=false;
                System.out.println("Introduzca la primera nota");
                double n1=l.nextDouble();
               
                System.out.println("Introduzca la segunda nota");
                
                double n2=l.nextDouble();
            
                if (n2<0 || n1<0) {
                  throw new NumberFormatException();
                }else{al.setNota1(n1);
                
                al.setNota2(n2);}
                
            } catch (Exception e) {
            salida=true;
           
                System.out.println("Introduzca los argumentos correctamente");
            
            
            
            }
            
            
           } while (salida);
        
        
        
        
    }

    private static double DameMedia(Alumno al) {
       
        return (al.getNota1()+al.getNota2() ) /2;
        
        
    }

    private static void MuestrAlumno(Alumno al) {
      
        System.out.println(" | "+al.getNumAlumno()+" | "+al.getNombre()+" nota media "+DameMedia(al));
        
    }
    
}
