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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        if (num1>25 && num2>25) {
        System.out.println ("Ambos numeros son mayores a 25");
    }else {
           System.out.println("Uno o ambos numeros son menores a 25");     
    }   
    }
    
}
