package com.leviplanelles.tema04.ampliacion;

public class Ejercicio6 {
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
