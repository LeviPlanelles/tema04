package com.leviplanelles.tema04.ampliacion;

public class Ejercicio4 {
    /**
     * Te va sumando los digitos que tiene ese numero, es decir, 21 = 2+1 = 3
     * @param n un numero
     * @return el resultado de la suma de los numeros
     */
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
