package com.leviplanelles.tema04.metodos;

import com.leviplanelles.tema04.lib.IO;
import static com.leviplanelles.tema04.metodos.Ejercicio7.calcFactorial;


public class Ejercicio14 {
    /**
     *El número combinatorio, es el resultado de hallar las Combinaciones de n elementos, tomados de k en k (n≥k), es el número de maneras en que se pueden agrupar los n elementos en grupos de k elementos, de tal manera que cada grupo se diferencie, por lo menos, en un elemento, sin interesar el orden de sus elementos.
     * @param n número total de los elementos
     * @param m número de elementos existentes en cada grupo
     * @return devuelve el número combinatorio
     */
    public static long numCombinatorio(int n, int m) {
        long resN = calcFactorial(n);
        long resM = calcFactorial(m);
        long resMN = calcFactorial(n-m);
        return resN / (resM * resMN);
    }

    public static void main(String[] args) {
        int n,m;
        n = IO.solicitarInt("Ingresa un número: ",0,100);
        m = IO.solicitarInt("Ingresa otro número: ",0,100);
        long combinatorio = numCombinatorio(n,m);
        System.out.println("El número combinatorio entre "+ n +" y " + m + " es: " + combinatorio);
    }
}
