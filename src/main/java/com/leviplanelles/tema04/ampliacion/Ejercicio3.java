package com.leviplanelles.tema04.ampliacion;

public class Ejercicio3 {

    public static int calcularDigitos(int n) {
        if (n < 10) {
            return 1;
        }else {
            return 1 + calcularDigitos(n / 10);
        }
    }
    public static void main(String[] args) {
        System.out.println(calcularDigitos(200));
    }
}
