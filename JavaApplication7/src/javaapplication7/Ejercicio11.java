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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String frase = leer.nextLine();
        
        reemplazar(frase);
 
    }
    

public static void reemplazar(String cadena){
        
        for (int i=0; i<cadena.length();i++){
            
            char letra = cadena.charAt(i);
            
            switch (letra){
                case 'a':
                    System.out.print("@");
                    break;
                case 'e':
                    System.out.print("#");
                    break;
                case 'i':
                    System.out.print("$");
                    break;
                case 'o':
                    System.out.print("%");
                    break;
                case 'u':
                    System.out.print("*");
                    break;
                default:
                    System.out.print(letra);
            }
 
        }
        
        System.out.println("");

    }
}
