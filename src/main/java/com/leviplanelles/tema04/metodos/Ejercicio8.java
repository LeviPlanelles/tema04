package com.leviplanelles.tema04.metodos;

import com.leviplanelles.tema04.lib.IO;

public class Ejercicio8 {
    public static boolean capicua(int n1, int n2, int n3, int n4) {
        return n1 == n4 && n2 == n3;
    }

    public static void main(String[] args) {
        int num,n1,n2,n3,n4;
        String numATexto;
        num = IO.solicitarInt("Ponme un número de 4 cifras:",1000,9999);
        numATexto = Integer.toString(num);
        n1 = numATexto.charAt(0);
        n2 = numATexto.charAt(1);
        n3 = numATexto.charAt(2);
        n4 = numATexto.charAt(3);
        String res = (capicua(n1,n2,n3,n4)) ? "El número "+ num +" es un número capicua":"El número "+ num +" no es un número capicua";
        System.out.println(res);
    }
}
