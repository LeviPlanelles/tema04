package com.leviplanelles.tema04.fechas;
import com.leviplanelles.tema04.lib.IO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
    V = Espacio / Tiempo
    tiempo = distanciaPromedio / velcidadPromedio
*/
public class Ejercicio5 {
    /**
     * Este método te calcula cuanto tiempo tardarías en llegar a marte dependiendo de una fecha de salida y una velociad que marcarás
     * @param fechaSalida la fecha de salida
     * @param velocidadPromedio velocidad crucero
     * @return te devuelve un LocalDateTime con la cantidad de tiempo que tardarias en llegar a marte
     */
    public static LocalDateTime FechaYHoraLlegadaMarte(LocalDateTime fechaSalida, float velocidadPromedio) {
        final long distanciaPromedio = 225_000_000;
        float resultadoEnHoras = distanciaPromedio / velocidadPromedio;
        long horas = (long)resultadoEnHoras;
        float resto = resultadoEnHoras - horas;

        float restoMin = resto * 60;
        long minutos = (long) restoMin;

        float resto2 = restoMin - minutos;
        float restoSeg = resto2 * 60;
        long segundos = (long) restoSeg;


        LocalDateTime fechaLlegada = fechaSalida.plusHours(horas);
        fechaLlegada = fechaLlegada.plusMinutes(minutos);
        fechaLlegada = fechaLlegada.plusSeconds(segundos);



        return fechaLlegada;
    }


    public static void main(String[] args) {
        String fechaSalida;
        float velocidad;

        fechaSalida = IO.solicitarString("Ingresa una fechaSalida(dd/mm/yyyy hh:mm:ss):",0,100);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime fechaYHora = LocalDateTime.parse(fechaSalida,formatter);
        velocidad = IO.solicitarInt("Ingresa la velocidad constante que llevarás en el trayecto (km/h):", 0, 100000);
        LocalDateTime fechaLlegada = FechaYHoraLlegadaMarte(fechaYHora,velocidad);
        System.out.printf("Si sales el día %s a una velocidad de %.2f llegarás a marte el %s",fechaSalida,velocidad,fechaLlegada.format(formatter));
    }
}
