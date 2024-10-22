package com.leviplanelles.tema04.metodos;

import com.leviplanelles.tema04.lib.IO;

public class Ejercicio4 {
    /**
     * Hace el número máximo de dos ingresados
     * @param num1 Primer número
     * @param num2 Segundo número
     * @param num3 Tercer número
     * @param num4 Cuarto número
     * @return devuelve el numero mayor entre los introducidos
     */
    public static int numMax(int num1, int num2, int num3, int num4) {
        int numMax1 = num1 >= num2 ? num1 : num2;
        int numMax2 = num3 >= num4 ? num3 : num4;
        int Max = numMax1 >= numMax2 ? numMax1 : numMax2;
        return Max;

    }
    public static void main(String[] args) {
        int res;
        int n1 = IO.solicitarInt("Pon un número(0-10000): ", 0,10000);
        int n2 = IO.solicitarInt("Pon un número(0-10000): ", 0,10000);
        int n3 = IO.solicitarInt("Pon un número(0-10000): ", 0,10000);
        int n4 = IO.solicitarInt("Pon un número(0-10000): ", 0,10000);

        res = numMax(n1,n2,n3,n4);
        System.out.println("El número más grande entre todos los que has puesto es el: " + res);
    }
}
