package com.leviplanelles.tema04.fechas;

import com.leviplanelles.tema04.lib.IO;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Ejercicio1 {
    /**
     * Método para calcular los años segun una fecha de nacimiento
     * @param fechaNacimiento tu fecha de nacimiento
     * @return devuelve los años que tienes
     */
    public static int calcularFecha(LocalDate fechaNacimiento) {
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, hoy);
        return periodo.getYears();

    }
    public static void main(String[] args) {
        String fecha = IO.solicitarString("Ingresa una fecha(dd-mm-yyyy):",0,100);
        IO.close();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fecha,formatter);
        System.out.printf("Tienes %d años",calcularFecha(fechaNacimiento));

    }
}
