/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese 4 numeros");
        
        for (int i=0; i<=4; i++){
            int num= leer.nextInt();
            if (num<20 && num>0){
            for (int j=0; j<num; j++){
                System.out.print("*");
            }
 
    } else {
                System.out.println("Numero fuera del rango");
                
            }
        }
    }
}  