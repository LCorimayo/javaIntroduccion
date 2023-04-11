/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar 
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author Corimayo
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 20 numeros");
        int suma;
        suma = 0;
        for (int i=0 ; i<=20; i++){
            int num=leer.nextInt();
            if (num>0){
            suma=suma+num;
            } else if (num==0){
                System.out.println("Se capturo el numero 0");
                break;
            }
    }
        System.out.println("La suma de los numeros positivos es de: " + suma);
    }
}
    
