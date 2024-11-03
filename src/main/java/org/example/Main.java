package org.example;


public class Main {
    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 3;

        System.out.println("Suma: " + suma(numero1, numero2));
        System.out.println("Resta: " + resta(numero1, numero2));
        System.out.println("Multiplicacion: " + multiplicacion(numero1, numero2));
        System.out.println("Division: " + division(numero1, numero2));
    }

    /**
     * Funcion para sumar dos numeros enteros
     * @param num1 numero 1
     * @param num2 numero 2
     * @return devuelve el numero del resultado
     */
    public static int suma(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Funcion para restar dos numeros enteros
     * @param num1 numero1
     * @param num2 numero2
     * @return devuelve el numero del resultado
     */
    public static int resta(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Funcion para multiplicar dos numeros enteros
     * @param num1 numero 1
     * @param num2 numero 2
     * @return devuelve el numero del resultado
     */
    public static int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Funcion para dividir dos numeros enteros
     * @param num1 numero 1
     * @param num2 numero 2
     * @return devuelve el numero del resultado
     */
    public static double division(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero.");
        }
        return (double) num1 / num2;
    }
}