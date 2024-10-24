package com.leviplanelles.tema04.metodos;

import com.leviplanelles.tema04.lib.IO;

public class Ejercicio9 {
    /**
     * Te calcula el sumatorio de ese número
     * @param entero número entero
     * @return el resultado del sumatorio del número entero
     */
    public static int calcSumatorio(int entero) {
        int res = 0;
        for (int i = 1; i <= entero; i++) {
            res = res + i;
        }
        return res;
    }

    public static void main(String[] args) {
        int num;
        num = IO.solicitarInt("Ingresa un número y te calculo el sumatorio:",0,10000);
        int resultado = calcSumatorio(num);
        System.out.printf("El sumatorio de %d es igual a %d", num, resultado) ;
    }
}
