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
public class Alumno {
    
String nombre,numAlumno; 
double nota1; double nota2;

    public Alumno(String nombre, String numAlumno ) {
        this.nombre = nombre;
        this.numAlumno = numAlumno;
       
    }


  

///////////////SET////////////////
    
    
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumAlumno(String numAlumno) {
        this.numAlumno = numAlumno;
    }
    
public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }
    
    
public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
    
    
    
    
//////////////GET/////////////////////////
    public String getNombre() {
        return nombre;
    }

    public String getNumAlumno() {
        return numAlumno;
    }


public Double getNota1() {
        return nota1;
    }
    
    
public Double getNota2() {
       return nota2;
    }

    
}
