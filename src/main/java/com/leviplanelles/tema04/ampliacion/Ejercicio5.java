package com.leviplanelles.tema04.ampliacion;
public class Ejercicio5 {
    /**
     * Te dice el numero fibonacci de la posicion n
     * @param n un numero
     * @return te devuelve la posicion n en la secuencia fibonacci
     */
    public static int funcionFibonacci(int n) {
        if(n == 0 || n == 1)
            return n;
        else
            return funcionFibonacci(n-1) + funcionFibonacci(n-2);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.print(funcionFibonacci(i) + " ");
        }
    }
}
