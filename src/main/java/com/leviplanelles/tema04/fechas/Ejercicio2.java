package com.leviplanelles.tema04.fechas;

import com.leviplanelles.tema04.lib.IO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ejercicio2 {
    /**
     * método para saber la cantidad de días que llevas vivo
     * @param fechaNacimiento tu fecha de nacimiento
     * @return devuelve la cantidad de dias que llevas vivo
     */
    public static long calculadoraDias(LocalDate fechaNacimiento) {
        LocalDate hoy = LocalDate.now();
        return ChronoUnit.DAYS.between(fechaNacimiento,hoy);
    }

    public static void main(String[] args) {
        String fecha = IO.solicitarString("Ingresa una fecha(dd/mm/yyyy):",0,100);
        IO.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fecha,formatter);
        System.out.printf("Desde que naciste han pasado %d días",calculadoraDias(fechaNacimiento));
    }
}
