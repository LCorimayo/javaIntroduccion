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
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de compañeros de equipo");
        int cant = leer.nextInt();
        String[] Equipo = new String[cant]; 
        Equipo[0]=leer.nextLine();
        
        System.out.println("Ingrese los nombres de tus compañeros de equipo");
        for (int i=0; i<cant; i++){
            Equipo[i]=leer.nextLine();
        }
        
        System.out.println("Elementos del vector:");
        for (int i=0; i<cant; i++){
            System.out.println(Equipo[i]);
        }
    }
    
}
