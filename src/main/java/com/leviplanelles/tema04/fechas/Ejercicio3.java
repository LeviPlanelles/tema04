package com.leviplanelles.tema04.fechas;

import com.leviplanelles.tema04.lib.IO;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio3 {
    public enum Planeta {
        MERCURIO, VENUS, LA_TIERRA, MARTE, JUPITER, SATURNO, URANO, NEPTUNO
    }

    /**
     *
     * @param fechaNacimiento
     * @param planeta
     * @return
     */
    public static float calculadoraEdadPlanetaria(LocalDate fechaNacimiento, Planeta planeta) {
        float diasVueltaSol = switch (planeta) {
            case MERCURIO -> 87.9f;
            case VENUS -> 224.7f;
            case LA_TIERRA -> 365.25f;
            case MARTE -> 687f;
            case JUPITER -> 4333f;
            case SATURNO -> 10759f;
            case URANO -> 30668f;
            case NEPTUNO -> 60182f;

        };
        long edadEnDias = Ejercicio2.calculadoraDias(fechaNacimiento);
        return edadEnDias / diasVueltaSol;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fecha = IO.solicitarString("Ingresa una fecha(dd/mm/yyyy):",0,100);
        System.out.println("Ingresa un planeta de los siguientes:");
        for (int i = 0; i < Planeta.values().length; i++) {
            System.out.println((i+1) + ". " + Planeta.values()[i].toString());
        }
        int numPlaneta = Integer.parseInt(scanner.nextLine());
        Planeta planeta = Planeta.values()[numPlaneta - 1];

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fecha,formatter);

        float edadPlanetaria = calculadoraEdadPlanetaria(fechaNacimiento,planeta);
        System.out.printf("Tu edad planetaria en %s sería de %.2f años",planeta,edadPlanetaria);
    }
}
