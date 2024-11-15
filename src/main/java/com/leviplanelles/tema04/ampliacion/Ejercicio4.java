package com.leviplanelles.tema04.ampliacion;

public class Ejercicio4 {
    public static int sumatorioDigitos(int n) {
        if (n < 10) {
            return n;
        }else {
            return (n % 10) + sumatorioDigitos(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumatorioDigitos(55));
    }
}
