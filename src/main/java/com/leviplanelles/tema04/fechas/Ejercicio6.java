package com.leviplanelles.tema04.fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Timer;
import java.util.TimerTask;

public class Ejercicio6 {
    /**
     * Este metodo te imprime por pantalla la fecha actual de ahora mismo y lo que queda para año nuevo
     // @param fechaActual recibe una fecha actual para poder hacer los calculos correspondientes
     */
    public static void CuentaAtras() {
        LocalDateTime anyoNuevo = LocalDateTime.of(2024,12, 31, 23, 59,59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String anyoFormateado = anyoNuevo.format(formatter);


        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                LocalDateTime fechaActual = LocalDateTime.now();
                fechaActual = fechaActual.plusSeconds(1);
                long meses = fechaActual.until(anyoNuevo, ChronoUnit.MONTHS);
                LocalDateTime fechaTemporal = fechaActual.plusMonths(meses);

                long dias = fechaTemporal.until(anyoNuevo, ChronoUnit.DAYS);
                fechaTemporal = fechaTemporal.plusDays(dias);

                long horas = fechaTemporal.until(anyoNuevo, ChronoUnit.HOURS);
                fechaTemporal = fechaTemporal.plusHours(horas);

                long minutos = fechaTemporal.until(anyoNuevo, ChronoUnit.MINUTES);
                fechaTemporal = fechaTemporal.plusMinutes(minutos);

                long segundos = fechaTemporal.until(anyoNuevo, ChronoUnit.SECONDS);
                fechaTemporal = fechaTemporal.plusSeconds(segundos);

                LocalDateTime tiempoParaAnyoNuevo = LocalDateTime.of(2024, (int) meses,(int) dias,(int) horas,(int) minutos,(int) segundos);
                tiempoParaAnyoNuevo = tiempoParaAnyoNuevo.minusSeconds(1);
                // Mostrar la cuenta atrás en tiempo real
                System.out.printf("Cuenta Atrás: %2s meses, %2s días, %2s horas, %2s minutos, %2s segundos\n",
                        tiempoParaAnyoNuevo.getMonthValue(), tiempoParaAnyoNuevo.getDayOfMonth(), tiempoParaAnyoNuevo.getHour(), tiempoParaAnyoNuevo.getMinute(), tiempoParaAnyoNuevo.getSecond());
            }
        }, 0 ,1000);
    }

    public static void main(String[] args) {
        LocalDateTime actual = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormat = actual.format(formatter);
        System.out.println("Fecha Actual: " + fechaFormat);
        CuentaAtras();
    }
}
