package com.leviplanelles.tema04.metodos;

import com.leviplanelles.tema04.lib.IO;


public class Ejercicio3 {
    /**
     * Hace el número máximo de dos ingresados
     * @param num1 Un número
     * @param num2 Segundo número
     * @return devuelve el numero mayor entre los introducidos
     */
    public static int numMax(int num1, int num2) {
        return num1 >= num2 ? num1 : num2;
    }
    public static void main(String[] args) {
        int res;
        int n1 = IO.solicitarInt("Pon un número: ", 0,10000);
        int n2 = IO.solicitarInt("Pon un número: ", 0,10000);
        res = numMax(n1,n2);
        System.out.printf("El número más grande entre el %d y el %d es el %d",n1,n2,res);



    }
}
