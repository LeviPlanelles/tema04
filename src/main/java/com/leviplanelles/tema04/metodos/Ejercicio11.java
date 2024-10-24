package com.leviplanelles.tema04.metodos;

import java.util.Random;

public class Ejercicio11 {
    private static int contador = 0;

    /**
     * Esto es un programa que sirve para que te dé número aleatorio entre dos números introducidos
     * @param min número mínimo
     * @param max número máximo
     * @return devuelve un número aleatorio entre dos números introducidos
     */
    public static int numAleatorio(int min, int max) {
        Random random = new Random();
        int num;
        num = random.nextInt(min,max);
        return num;

    }

    /**
     * Este programa te imprime por pantalla el resultado de la quiniela
     * @param equipo1 primer equipo
     * @param equipo2 segundo equipo
     */
    public static void resQuiniela(int equipo1, int equipo2) {
        char ganar, empate, perder;
        ganar = '1';
        empate = 'X';
        perder = '2';
        if (equipo1 > equipo2) {
            contador++;
            System.out.printf("PARTIDO %-2d %5s\n",contador,ganar);

        } else if (equipo1 == equipo2) {
            contador++;
            System.out.printf("PARTIDO %-2d %5s\n",contador,empate);
        } else {
            contador++;
            System.out.printf("PARTIDO %-2d %5s\n",contador,perder);

        }
    }

    public static void main(String[] args) {
        int local, visitante;
        int min = 1;
        int max = 10;
        String partido = "Partido:";
        String resultado ="Resultado:";
        System.out.printf("%-15s%s\n",partido,resultado);
        for (int i = 1; i <= 15 ; i++) {
            local = numAleatorio(min,max);
            visitante = numAleatorio(min,max);
            resQuiniela(local,visitante);
        }

    }
}
