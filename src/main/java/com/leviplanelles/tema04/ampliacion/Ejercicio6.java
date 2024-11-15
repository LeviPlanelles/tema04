package com.leviplanelles.tema04.ampliacion;

public class Ejercicio6 {
    /**
     * Te hace el factorial de un numero n
     * @param n un numero
     * @return te devuelve el factorial del numero n
     */
    public static int factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        }else {
            return n * factorialRecursivo(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(factorialRecursivo(5));
    }
}
