/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author josca
 */
public class DVD {

    String titulo, director, reparto, genero,  resumen;
    int duracion;
    
    public DVD(String titulo, String director, String reparto, String genero, String duracion, String resumen) {
        this.setTitulo(titulo);
        this.setDirector(director);
        this.setReparto(reparto);
        this.setGenero(genero);
        this.setDuracion(duracion); 
        this.setResumen(resumen);
    }

    public void setTitulo(String titulo) {
        
        this.titulo = titulo;
        
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(String duracion) {
        int dur=0;
      
        dur=Integer.parseInt(duracion);
         /*try {
            
    
         dur=Integer.parseInt(duracion);
        
         if (dur<1) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("La duracion debe ser un numero o esta debe ser mayor de 0");
        }
        */
        this.duracion = dur;
    
    
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }
    
    
    
    public boolean EsThriller() {
        String gen=this.genero.toLowerCase().trim();
        
        if (gen.equals("thriller")) {
            return true;
        }else{
        return false;
        
        }
    }
    
   public boolean TieneResumen() {
        String gen=resumen.toLowerCase().trim();
        
        if (gen.length()>1) {
            return true;
        }else{
        return false;
        
        }
    }
    
    public String MuestraDuracion(){
    
    return this.duracion+" mins ";
    
    }
    
    public String MuestraDVDCine(){
    
   return titulo+" Del Director "+director+" Con los actores "+reparto+" Del genero "+genero+" con una duracion de "+MuestraDuracion()+" Resumen: "+resumen;
    
    }
    
    
//GET
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public String getReparto() {
        return reparto;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getResumen() {
        return resumen;
    }

}
