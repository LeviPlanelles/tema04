package com.leviplanelles.tema04.metodos;

import com.leviplanelles.tema04.lib.IO;

public class Ejercicio7 {
    /**
     * Calcula el factorial de un número entero
     * @param entero número entero
     * @return devuelve el factorial del número
     */
    public static long calcFactorial(int entero) {
        if (entero == 0) {
            return 1;
        }
        long res = 1;
        for (int i = 1; i <= entero; i++) {
            res = res * i;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = IO.solicitarInt("Ingresa un número y te calculo su factorial: ",0, 1000);
        long fact = calcFactorial(num);
        System.out.printf("%d! es igual a %d",num,fact);
    }
}
