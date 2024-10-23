package com.leviplanelles.tema04.metodos;

import java.util.Random;

public class Ejercicio11 {
    public static int contador = 0;
    public static int numAleatorio(int min, int max) {
        Random random = new Random();
        int num;
        num = random.nextInt(min,max);
        return num;

    }
    public static void resQuiniela(int equipo1, int equipo2) {
        char ganar, empate, perder;
        ganar = '1';
        empate = 'X';
        perder = '2';
        String partido = "PARTIDO";
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

        for (int i = 1; i <= 15 ; i++) {
            local = numAleatorio(min,max);
            visitante = numAleatorio(min,max);
            resQuiniela(local,visitante);
        }

    }
}
