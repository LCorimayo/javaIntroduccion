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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int nota;
        System.out.println("Por favor ingrese una nota");
                nota=leer.nextInt();
        while (nota>10){
            System.out.println("No es una nota valida, ingrese otra");
            nota=leer.nextInt();
        }        
                
                
    }
    
}
