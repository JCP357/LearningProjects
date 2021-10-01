
package Vista;

import java.util.Scanner;
import Modelo.DVD;

public class Pelicula {

    public static void main(String[] args) {
        Scanner l=new Scanner(System.in); 
  boolean salida=true;
      
       String[] atributos=new String[6];// titulo,  director,  reparto,  genero,  duracion,  resumen
        System.out.println(" Introduzca el titulo");
        atributos[0]=l.nextLine(); 
        System.out.println("Introduzca el director");
        atributos[1]=l.nextLine();
         System.out.println("Introduzca el reparto");
        atributos[2]=l.nextLine();
         System.out.println("Introduzca el genero");
        atributos[3]=l.nextLine();
  
  do {            
    
      System.out.println("Introduzca la duracion ");
      
   try {
             atributos[4]=l.nextLine();
    
         int dur=Integer.parseInt(atributos[4]);
        
         if (dur<1) {
                throw new NumberFormatException();
            }else{
         salida=false;
         }
        } catch (NumberFormatException e) {
            System.out.println("La duracion debe ser un numero o esta debe ser mayor de 0");
        
        }    
      
      
      
        } while (salida);
        
  
    System.out.println("Introduzca el resumen");
        atributos[5]=l.nextLine();
        
        DVD d=new DVD( atributos[0], atributos[1], atributos[2], atributos[3], atributos[4], atributos[5]);
        
        
        boolean entro=true;
        do {            
            System.out.println("Introduzca una opcion");
            
            
            System.out.println("1. Muestra la informacion integra de la pelicula");
            
            
            System.out.println("2. Muestrala duracion de la pelicula");
            
            
            System.out.println("3. Muestra el resumen de la pelicula");
            
            System.out.println("4. Muestra si la pelicula es un thriller");
            
            System.out.println("5. Salida");
            
        int opc=l.nextInt();    
        
        switch(opc) {
            case 1:
                System.out.println("---------------------- ");
                      System.out.println(d.MuestraDVDCine());
                      System.out.println("---------------------- ");
                break;
        
                
          case 2:
              System.out.println("---------------------- ");
                System.out.println(d.MuestraDuracion());
                System.out.println("---------------------- ");
                break;      
        
        case 3:
                
        if (d.TieneResumen()) {
            System.out.println("---------------------- ");
            System.out.println(d.getResumen());
            System.out.println("---------------------- ");
        }else{
        System.out.println("---------------------- ");
            System.out.println("La pelicula no tiene resumen");
        System.out.println("---------------------- ");
        }
            
            
            
                break;
                
                
                
        case 4:
            
                if (d.EsThriller()) {
                    System.out.println("---------------------- ");
                    System.out.println("La pelicula es un thriller");
                    System.out.println("---------------------- ");
                    
                    
        }else{      
                    
                    System.out.println("---------------------- ");
                    
                    System.out.println("La pelicula no es un thriller");
                
                 System.out.println("---------------------- ");
                }
            
            break;
                
        case 5:
            entro=false;
            break;
            
        default:
            System.out.println("Introduzca una opcion valida");
        }
        
        
        
        } while (entro);
        
        
        
    
        
        
        
    }

    
    
}
