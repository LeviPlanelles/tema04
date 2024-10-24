package com.leviplanelles.tema04.metodos;

import com.leviplanelles.tema04.lib.IO;

public class Ejercicio13 {
    /**
     * Te da un saludito
     * @param nombre un nombre
     * @param idioma el idioma en un char
     * @return devuelve el saludo según el idioma
     */
    public static String saludo(String nombre, char idioma) {
        return switch (idioma) {
            case 'c' -> "Buenos días " + nombre + "!!!";
            case 'v' -> "Bon dia " + nombre + "!!!";
            case 'i' -> "Good morning " + nombre + "!!!";
            default -> "Idioma incorrecto";
        };
    }

    public static void main(String[] args) {
        String nombre,saludo;
        char idioma;

        nombre = IO.solicitarString("Dime tú nombre: ",0,100);

        System.out.println("Selecciona un idioma: Valenciano [v] Castellano [c] Inglés [i]");
        idioma = IO.scanner.nextLine().charAt(0);
        saludo = saludo(nombre,idioma);
        System.out.println(saludo);
        IO.close();




    }
}
