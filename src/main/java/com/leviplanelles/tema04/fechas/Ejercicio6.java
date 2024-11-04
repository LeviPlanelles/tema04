package com.leviplanelles.tema04.fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;

public class Ejercicio6 {
    /**
     * Este metodo te imprime por pantalla la fecha actual de ahora mismo y lo que queda para año nuevo
     * @param fechaActual recibe una fecha actual para poder hacer los calculos correspondientes
     */
    public static void CuentaAtras(LocalDateTime fechaActual) {
        LocalDateTime anyoNuevo = LocalDateTime.of(2024,12, 31, 23, 59,59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String anyoFormateado = anyoNuevo.format(formatter);


        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                //NI IDEA
            }
        }, 0 ,1000);
    }

    public static void main(String[] args) {
        LocalDateTime actual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormat = actual.format(formatter);
        System.out.println("Fecha Actual: " + fechaFormat);
        CuentaAtras(actual);
    }
}
