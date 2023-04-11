/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Corimayo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=4;
        int num2=78;
        
        int suma= num1 + num2;
        long multi= num1*num2;
        double divi= num2/num1;
        int mod=num2%num1;
        boolean mayor = num1>num2;
        int incre= num1++;
        
        System.out.println("La suma de los numeros es " + suma);
        System.out.println("El producto de los numeros es " + multi);
        System.out.println("El resultado de la division es de " + divi);
        System.out.println("El resto de la division es " + mod);
        System.out.println("El numero 1 es mayor que el numero 2? " + mayor);
        System.out.println(incre);
        
    }
    
}
