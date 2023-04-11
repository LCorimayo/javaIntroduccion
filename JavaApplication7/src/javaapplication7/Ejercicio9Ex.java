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
public class Ejercicio9Ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int numero, suma=0; 
        int i=0;
        
        do {
            System.out.println("ingresa un número: ");
            numero = scanner.nextInt();
            if (numero == 0) {
                System.out.println("Se capturó el nro 0");
                break;
            } 
            if (numero > 0) {
                suma += numero; // s = s + n
            }
            i++; // i = i + 1; 
        } while (i<20);
            System.out.println("La suma de los números positivos ingresados es: " + suma);
    }
    }
