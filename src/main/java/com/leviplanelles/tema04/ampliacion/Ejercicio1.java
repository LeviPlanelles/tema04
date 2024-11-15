package com.leviplanelles.tema04.ampliacion;

public class Ejercicio1 {
    public static void recursividad(int n) {
        if (n <= 0) {
            return;
        }else {
            System.out.print(n);
            recursividad(n-1);

        }

    }
    public static void main(String[] args) {
        recursividad(5);
    }
}
