/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class EjemploEjercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu peso");
        double peso;
        peso = leer.nextDouble();
        boolean sobrepeso;
        sobrepeso = peso > 150.50;
        System.out.println("Veamos si tienes sobre peso o no " + sobrepeso);
        System.out.println("Tu tipo de sangre es + o -");
        char tipoSangre;
        tipoSangre = leer.next().charAt(0);
    }
    
}
