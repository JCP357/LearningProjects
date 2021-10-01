/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquina;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import jdk.jfr.events.FileReadEvent;

/**
 *
 *
 */
public class Maquina {

    public static String Ventas;
    public static double venta;

    public static void main(String[] args) throws FileNotFoundException, IOException {

        FileReader fr = new FileReader("gol.txt");
        BufferedReader br = new BufferedReader(fr);

        String Index = br.readLine();

        int ind = Integer.parseInt("" + Index);

        double[][] precios = new double[ind][ind];
        int[][] Cantidad = new int[ind][ind];
        String[][] nombres = new String[4][4];

        String linea = "";

        for (int x = 0; x < ind; x++) {

            linea = br.readLine();
            System.out.println(linea);
            nombres[x] = linea.split(",");

        }

        for (int q = 0; q < ind; q++) {

            linea = br.readLine();
            System.out.println(linea);
            String[] dob = linea.split(",");
            double[] prc = new double[dob.length];
            for (int i = 0; i < dob.length; i++) {
                prc[i] = Double.parseDouble(dob[i]);
            }

            precios[q] = prc;

        }

        for (int q = 0; q < ind; q++) {

            linea = br.readLine();
            System.out.println(linea);
            String[] dob = linea.split(",");
            int[] prc = new int[dob.length];
            for (int i = 0; i < dob.length; i++) {
                prc[i] = Integer.parseInt(dob[i]);
            }

            Cantidad[q] = prc;

        }

        Scanner l = new Scanner(System.in);
        boolean salida = true;
        int opcion = 0;

        do {
            System.out.println("Introduzca una opcion");

            System.out.println("1-Pedir golosina");

            System.out.println("2-Muestra golosina");

            System.out.println("3-Rellenar golosina");

            System.out.println("4-Resumen y salida ");

            opcion = l.nextInt();
            switch (opcion) {

                case 1:

                    PideGolosina(nombres, Cantidad, precios);
                    break;

                case 2:

                    MuestraGolosina(precios, nombres);

                    break;

                case 3:

                    RellenaGolosina(Cantidad);

                    break;

                case 4:

                    salida = false;
                    System.out.println("Se han vendido los siguentes items:");
                    System.out.println(Ventas);
                    System.out.println("Los beneficios han sido :" + venta);

                    break;

            }

        } while (salida);

    }

    private static void PideGolosina(String[][] nombres, int[][] Cantidad, double[][] precios) {
        System.out.println("Introduzca El codigo de la golosina deseada");
        boolean salida = true;
        Scanner lee = new Scanner(System.in);

        int opcion = 0;
        String cod = "";
        do {

            try {
                opcion = lee.nextInt();
                cod = Integer.toString(opcion);
                int ex=opcion%10;
                if (cod.length() < 2 || cod.length() > 2 || opcion < 0 || ex>=4) {
                    throw new IllegalArgumentException();
                }
                salida = false;
            } catch (Exception e) {
                System.out.println("Introduzca correctamente el codigo del producto");
                salida = true;
            }

        } while (salida);

        int columna = Integer.parseInt(cod.substring(0, cod.length() - 1));
        int fila = opcion % 10;
       

        if (Cantidad[fila][columna] > 0) {
            Cantidad[fila][columna] = Cantidad[fila][columna] - 1;

            System.out.println("Recoja su golosina");
            Venta(nombres, fila, columna, precios);
        } else {
            System.out.println("Esa golosina esta agotada");
        }

    }

    private static void MuestraGolosina(double[][] precios, String[][] nombres) {

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres.length; j++) {
                int fila = i;
                int columna = j;
                System.out.println("Nombre: " + nombres[i][j] + " Codigo: " + fila + columna + " Precio: " + precios[i][j]);

            }

        }

    }

    private static void RellenaGolosina(int[][] Cantidad) {

        String contrasena = "maquina";
        boolean salida2 = true;
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("Por favor, introduzca la contraseña");
            String pass = leer.nextLine();

            if (pass.equals(contrasena)) {

                System.out.println("Por favor, introduzca el codigo del producto a rellenar");

                int opcion = 0;
                String cod = "";
                boolean salida3 = true;
                
                do {

                    try {
                        Scanner les=new Scanner(System.in);
                        opcion = les.nextInt();
                       
                        cod = Integer.toString(opcion);

                        if (cod.length() < 2 || cod.length() > 2 || opcion < 0 || opcion >= 45) {
                            throw new IllegalArgumentException();
                        }
                        salida3 = false;
                    } catch (Exception e) {
                        System.out.println("Introduzca correctamente el codigo del producto");
                        salida3 = true;
                    }
                    
                     } while (salida3);
                    
        int columna = Integer.parseInt(cod.substring(0, cod.length() - 1));
        int fila = opcion % 10;
        if (!(fila == 0)) {
            fila = fila - 1;
        }
        if (!(columna == 0)) {
            columna = columna - 1;
        }
        
        int cantidad=0;
        
        boolean salidax=true;
        Scanner l2=new Scanner(System.in);
                    do {                        
                    try {
                    System.out.println("Introduzca la cantidad a rellenar");   
                    
                    cantidad=l2.nextInt();
                    salidax=false;
                    
                    } catch (Exception e) {
                          
                        System.out.println("Introduzca solo numeros");
                        salidax=true;
                    }   
                    
                    int anterior= Cantidad[fila][columna];
                     Cantidad[fila][columna]=Cantidad[fila][columna]+cantidad;
                        System.out.println("La cantidad anterior era de "+anterior);
                        
                        System.out.println("Se ha añadido "+cantidad);
                        
                        
                        System.out.println("Ahora hay "+anterior+cantidad);
                    } while (salidax);
                    
        

               
salida2=false;
            }else{
                System.out.println("La contraseña no es correcta");
                salida2=true;
            }

        } while (salida2);

    }

    private static void ResumenGolosina() {

    }

    private static void Venta(String[][] nombres, int fila, int columna, double[][] precios) {

        Ventas +=" | "+ nombres[fila][columna];
        venta += precios[fila][columna];
        Ventas=Ventas.replace("null", "");
    }

}
