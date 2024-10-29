package com.leviplanelles.tema04.fechas;

import com.leviplanelles.tema04.lib.IO;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class Ejercicio4 {
    public enum SignoZodiacal {
        ACUARIO, PISCIS, ARIES, TAURO, GEMINIS, CANCER, LEO, VIRGO, LIBRA, ESCORPIO, OFIUCO, SAGITARIO, CAPRICORNIO, ERROR
    }

    /**
     * Metodo que te pide una fecha de nacimiento y te devuelve tu signo de zodiaco
     * @param nacimiento es una fecha que normalmente es de nacimiento
     * @return te devuelve el signo del zodiaco dependiendo de la fecha de nacimiento
     */
    public static SignoZodiacal signoZodiacal(LocalDate nacimiento) {
        SignoZodiacal signo;
        MonthDay mesDia = MonthDay.of(nacimiento.getMonth(), nacimiento.getDayOfMonth());

        if (mesDia.isAfter(MonthDay.of(Month.FEBRUARY,17)) && mesDia.isBefore(MonthDay.of(Month.MARCH,12))) {
            signo = SignoZodiacal.ACUARIO;
        } else if (mesDia.isAfter(MonthDay.of(Month.MARCH,11)) && mesDia.isBefore(MonthDay.of(Month.APRIL,17))) {
            signo = SignoZodiacal.PISCIS;
        } else if (mesDia.isAfter(MonthDay.of(Month.APRIL,16)) && mesDia.isBefore(MonthDay.of(Month.MAY,15))) {
            signo = SignoZodiacal.ARIES;
        } else if (mesDia.isAfter(MonthDay.of(Month.MAY,14)) && mesDia.isBefore(MonthDay.of(Month.JUNE,22))) {
            signo = SignoZodiacal.TAURO;
        } else if (mesDia.isAfter(MonthDay.of(Month.JUNE,21)) && mesDia.isBefore(MonthDay.of(Month.JULY,20))) {
            signo = SignoZodiacal.GEMINIS;
        } else if (mesDia.isAfter(MonthDay.of(Month.JULY,19)) && mesDia.isBefore(MonthDay.of(Month.AUGUST,11))) {
            signo = SignoZodiacal.CANCER;
        } else if (mesDia.isAfter(MonthDay.of(Month.AUGUST,10)) && mesDia.isBefore(MonthDay.of(Month.SEPTEMBER,17))) {
            signo = SignoZodiacal.LEO;
        } else if (mesDia.isAfter(MonthDay.of(Month.SEPTEMBER,16)) && mesDia.isBefore(MonthDay.of(Month.OCTOBER,31))) {
            signo = SignoZodiacal.VIRGO;
        } else if (mesDia.isAfter(MonthDay.of(Month.OCTOBER,30)) && mesDia.isBefore(MonthDay.of(Month.NOVEMBER,23))) {
            signo = SignoZodiacal.LIBRA;
        } else if (mesDia.isAfter(MonthDay.of(Month.NOVEMBER,22)) && mesDia.isBefore(MonthDay.of(Month.NOVEMBER,29))) {
            signo = SignoZodiacal.ESCORPIO;
        } else if (mesDia.isAfter(MonthDay.of(Month.NOVEMBER,28)) && mesDia.isBefore(MonthDay.of(Month.DECEMBER,18))) {
            signo = SignoZodiacal.OFIUCO;
        } else if (mesDia.isAfter(MonthDay.of(Month.DECEMBER,17)) && mesDia.isBefore(MonthDay.of(Month.JANUARY,21))) {
            signo = SignoZodiacal.SAGITARIO;
        } else if (mesDia.isAfter(MonthDay.of(Month.JANUARY,20)) && mesDia.isBefore(MonthDay.of(Month.FEBRUARY,18))) {
            signo = SignoZodiacal.CAPRICORNIO;
        } else {
            signo = SignoZodiacal.ERROR;
        }
        return signo;
    }
    public static void main(String[] args) {

        String fecha = IO.solicitarString("Ingresa una fecha(dd/mm/yyyy):",0,100);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNacimiento = LocalDate.parse(fecha,formatter);
        SignoZodiacal signo = signoZodiacal(fechaNacimiento);
        if (signo.equals(SignoZodiacal.ERROR)) {
            System.out.println("No se ha encontrado tu signo zodiacal ¿?");
        } else {
            System.out.println("Tu signo zodiacal es "+signo);
        }

    }
}
