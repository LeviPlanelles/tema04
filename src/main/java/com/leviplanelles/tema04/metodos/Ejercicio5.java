package com.leviplanelles.tema04.metodos;

import com.leviplanelles.tema04.lib.IO;

import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Este metodo te pide un caracter y un numero y te imprime el carcter el numero de veces indicada
     * @param ch Un caracter
     * @param num El número de veces que se imprimirá el caracter
     */
    public static void imprimirNum(char ch,int num) {
        String cadena = "";
        for (int i = 1; i <= num; i++) {
            cadena += ch;
        }
        System.out.println(cadena);
    }

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Dime un caracter: ");
        char caracter = leer.next().charAt(0);
        int num = IO.solicitarInt("Dime un número(0-10000): ",0,10000);
        imprimirNum(caracter,num);
    }
}
