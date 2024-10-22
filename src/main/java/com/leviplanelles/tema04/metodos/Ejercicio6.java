package com.leviplanelles.tema04.metodos;

import com.leviplanelles.tema04.lib.IO;

import java.util.Scanner;

public class Ejercicio6 {

    public static void imprimirNum(char ch,int tamanio, int lineas) {
        for (int j = 1; j <= lineas; j++) {
            for (int i = 1; i <= tamanio; i++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lineas, cantidad;
        System.out.println("Dime un caracter: ");
        char caracter = leer.next().charAt(0);
        cantidad = IO.solicitarInt("Dime un número(0-10000): ",0,10000);
        lineas = IO.solicitarInt("Dime un número(0-10000): ",0,10000);
        imprimirNum(caracter,cantidad,lineas);
        leer.close();
    }
}
