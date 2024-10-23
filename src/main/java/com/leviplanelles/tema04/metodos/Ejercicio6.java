package com.leviplanelles.tema04.metodos;

import com.leviplanelles.tema04.lib.IO;

import java.util.Scanner;

public class Ejercicio6 {

    /**
     * Este método te pide un caracter y dos numeros enteros con los que cofiguraras que quieres imprimir, cuantas veces y cuantas lineas
     * @param ch Un caracter
     * @param tamanio El número de veces que se imprimirá el caracter
     * @param lineas El numero de lineas que imprimirá el número de veces que se imprimirá el caracter
     */
    public static String imprimirNum(char ch,int tamanio, int lineas) {
        String cadena = "";
        for (int j = 1; j <= lineas; j++) {
            for (int i = 1; i <= tamanio; i++) {
                cadena += ch;
            }
            cadena += "\n";
        }
        return cadena;
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lineas, cantidad;
        System.out.println("Dime un caracter: ");
        char caracter = leer.next().charAt(0);
        cantidad = IO.solicitarInt("Dime un número(0-10000): ",0,10000);
        lineas = IO.solicitarInt("Dime un número(0-10000): ",0,10000);
        String texto = imprimirNum(caracter,cantidad,lineas);
        System.out.println(texto);
        leer.close();
    }
}
