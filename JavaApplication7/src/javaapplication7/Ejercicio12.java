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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
       
        
        System.out.print("Ingrese el 1º número: ");
        int num1 = leer.nextInt();
        System.out.print("Ingrese el 2º número: ");
        int num2 = leer.nextInt();
        
        boolean resultado = EsMultiplo (num1,num2);
        
        System.out.println("¿El 1º número es multiplo del 2º número? " + resultado);
        
    }
    
    
public static boolean EsMultiplo (int num1,int num2) {
        
        boolean multiplo = (num1%num2 == 0);
        
        return multiplo;
    }
}
