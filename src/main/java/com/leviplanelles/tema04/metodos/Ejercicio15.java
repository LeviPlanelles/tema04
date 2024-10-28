package com.leviplanelles.tema04.metodos;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {
    public static void bienvenida() {
        System.out.println("**********");
        System.out.println("BLACK JACK");
        System.out.println("**********");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String confirmacion,respuesta;
        int porras = 0;
        int porrasOrdenador = 0;
        int tirada,tiradaOrdenador;
        int puntuacion = 0;
        int puntuacionOrdenador = 0;
        int ronda = 0;
        bienvenida();

        do {
            ronda++;
            puntuacion = 0;
            puntuacionOrdenador = 0;
            System.out.println("Porras jugador: " + porras);
            System.out.println("Porras ordenador: " + porrasOrdenador);
            do {
                System.out.println("¿Estas listo para la ronda num " + ronda + "? (s/n)");
                respuesta = scanner.nextLine();

            }while (respuesta.equals("n"));

            while (puntuacion <= 11) {
                System.out.println("Lanzando dados...");
                tirada = random.nextInt(1,7);
                System.out.println("Has sacado un: " + tirada);
                puntuacion += tirada;
                System.out.println("Tu puntuación es de: " + puntuacion);
                System.out.println("¿Quieres volver a tirar? (s/n)");
                confirmacion = scanner.nextLine();
                if (confirmacion.equals("n")) {
                    break;
                }

            }
            if (puntuacion == 11) {
                porras += 2;
                System.out.println("Has conseguido la puntuación exacta para ganar, ganas dos porras");
                System.out.println("Actualmente tienes: " + porras + " porras");
                continue;
            } else if (puntuacion > 11) {
                porrasOrdenador++;
                System.out.println("Ohh, te has pasado, el ordenador gana 1 porra");
                System.out.println("El ordenador tiene " + porrasOrdenador + " porras");
                continue;
            }else {
                System.out.println("Has obtenido una puntuación de " + puntuacion + " por lo que no te has pasado.");
            }
            System.out.println("TURNO DEL ORDENADOR");

            do {
                tiradaOrdenador = random.nextInt(1,7);
                if (puntuacionOrdenador + tiradaOrdenador > 11) {
                    break;
                }else {
                    puntuacionOrdenador += tiradaOrdenador;
                }

            }while (puntuacionOrdenador <= 11);

            System.out.println("El ordenador ha tirado y sus tiradas suman " + puntuacionOrdenador);

            if (puntuacionOrdenador >= puntuacion && puntuacionOrdenador <= 11) {
                porrasOrdenador++;
                System.out.println("La puntuación del ordenador es " + puntuacionOrdenador + ", es mayor que tú puntuación: " + puntuacion);
                System.out.println("El ordenador gana 1 porra y tiene " + porrasOrdenador);
            }

        }while (porrasOrdenador < 5);

        if (porras >= 5) {
            System.out.println("¡¡HAS GANADO!!");
        } else if (puntuacionOrdenador > 4) {
            System.out.println("HA GANADO EL ORDENADOR");
        }


    }
}
