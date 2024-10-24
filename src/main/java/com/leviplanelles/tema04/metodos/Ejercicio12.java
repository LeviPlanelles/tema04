package com.leviplanelles.tema04.metodos;

import java.util.Random;



public class Ejercicio12 {
    public enum Calificacion {
        INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, EXCELENTE, ERROR
    }

    /**
     * Genera notas aleatorias (1-10) y llama al metodo que comprueba las notas para saber que nota es
     * @param numCalificaciones el número de notas que va a generar
     * @return devuelve un String con todas las calificaciones
     */
    public static String generarCalificaciones(int numCalificaciones) {
        Random random = new Random();
        Calificacion resultado;
        String generacion = "";
        for (int i = 1; i <= numCalificaciones; i++) {
            int calificacion = random.nextInt(0,11);
            resultado = obtenerCalificacion(calificacion);
            generacion += resultado + "\n";

        }
        return generacion;
    }

    /**
     * Este metodo recibe una nota que después checkea cual sería su equivalente alfabético
     * @param calificacion es una nota
     * @return devuelve el enum correspondiente dependiendo de la nota
     */
    public static Calificacion obtenerCalificacion(int calificacion) {
        Calificacion nota;
        if (calificacion >= 0 && calificacion < 5) {
            nota = Calificacion.INSUFICIENTE;
        } else if (calificacion < 6) {
            nota = Calificacion.SUFICIENTE;
        } else if (calificacion < 7) {
            nota = Calificacion.BIEN;
        } else if (calificacion < 9) {
            nota = Calificacion.NOTABLE;
        } else if (calificacion <= 10) {
            nota = Calificacion.EXCELENTE;
        } else {
            nota = Calificacion.ERROR;
        }
        return nota;

    }

    public static void main(String[] args) {
        String notas = generarCalificaciones(50);
        System.out.println(notas);
    }
}
