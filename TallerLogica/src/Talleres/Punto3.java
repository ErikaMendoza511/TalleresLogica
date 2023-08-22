/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Talleres;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Punto3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese la base del rectangulo:");
        int bs = sc.nextInt();
        
        System.out.println("Ingrese la altura del rectangulo: ");
        int alt = sc.nextInt();
        
        System.out.println("El area del rectangulo es: " + bs * alt);
        System.out.println("El perimetro del rectangulo es " + (bs + alt)*2);
        
    }
    
}

//incio
//se imprime la solicitando el numero de base por medio en escanner
// se imprime una segunda vez soicitando el numero de la altura del rectangulo por medio en scanner
//  se hace impresion 