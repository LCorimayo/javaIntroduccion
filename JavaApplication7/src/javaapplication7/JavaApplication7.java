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
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in); 
 System.out.println("Ingresa tu nombre");
 String nombre = leer.nextLine();
 
 System.out.println("Ingresa tu edad");
 int edad = leer.nextInt();
 char letra= nombre.charAt(0);
 System.out.println("Mi nombre empieza con la letra: " + letra);
 }
    }
    

