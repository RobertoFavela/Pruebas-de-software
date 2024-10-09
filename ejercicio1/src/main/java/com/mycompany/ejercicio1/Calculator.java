/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Dr
 */
public class Calculator {
     // Suma
    public double add(double a, double b) {
        return a + b;
    }

    // Resta
    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplicación
    public double multiply(double a, double b) {
        return a * b;
    }

    // División
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre cero.");
        }
        return a / b;
    }

    // Potencia
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Raíz cuadrada
    public double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(a);
    }

    // Módulo
    public double modulus(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede calcular el módulo con divisor cero.");
        }
        return a % b;
    }

    // Factorial (solo para enteros no negativos)
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
