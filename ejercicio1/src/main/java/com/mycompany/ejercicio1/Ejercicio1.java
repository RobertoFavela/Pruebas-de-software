/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1;

/**
 *
 * @author Dr
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        System.out.println("Suma: " + calculator.add(5, 3)); // 8.0
        System.out.println("Resta: " + calculator.subtract(5, 3)); // 2.0
        System.out.println("Multiplicacion: " + calculator.multiply(5, 3)); // 15.0
        System.out.println("Division: " + calculator.divide(5, 3)); // 1.666...
        System.out.println("Potencia: " + calculator.power(5, 3)); // 125.0
        System.out.println("Raiz cuadrada: " + calculator.squareRoot(25)); // 5.0
        System.out.println("Modulo: " + calculator.modulus(5, 3)); // 2.0
        System.out.println("Factorial: " + calculator.factorial(5)); // 120
    }
}
