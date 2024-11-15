package com.leviplanelles.tema04.ampliacion;

public class Ejercicio2 {
    public static int sumaNumerosN(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumaNumerosN(n - 1);
        }

    }
    public static void main(String[] args) {
        int suma = sumaNumerosN(3);
        System.out.println(suma);
    }
}
