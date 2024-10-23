package com.leviplanelles.tema04.metodos;

import com.leviplanelles.tema04.lib.IO;

import java.util.Scanner;

public class Ejercicio10 {
    public static void tablaMultiplicar(int num) {
        int res;
        for (int i = 1; i <= 10 ; i++) {
            if (num < 0) {
                break;
            }
            res = num * i;
            System.out.println(num + " * " + i + " es igual a " + res);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (num >= 0) {
            System.out.println("Introduce número y te digo su tabla(número negativo para terminar la ejecución): ");
            num = Integer.parseInt(scanner.nextLine());
            tablaMultiplicar(num);
        }
        scanner.close();
    }
}
