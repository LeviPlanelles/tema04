package com.leviplanelles.tema04.ampliacion;

public class Ejercicio3 {
    /**
     * Te cuenta la cantidad de digitos que tiene un numero
     * @param n un numero
     * @return te devuelve el numero de digitos que tiene un digito
     */
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
