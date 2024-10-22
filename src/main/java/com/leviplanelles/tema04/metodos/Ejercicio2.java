package com.leviplanelles.tema04.metodos;

import com.leviplanelles.tema04.lib.IO;

import java.util.Scanner;

public class Ejercicio2 {
    /**
     * Para calcular el area de un circulo se multiplica PI por el radio al cuadrado
     * @param radio El radio de la circunferencia
     * @return El area del circulo
     */
    public static double calcularArea(float radio) {
        return Math.PI * (radio * radio);
    }

    /**
     * Para calcular la longitud de un circulo de multiplica el diametro por PI
     * @param radio
     * @return
     */
    public static double calcularLongitud(float radio) {
        return (radio * 2) * Math.PI;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float r;
        double area,longitud;

        System.out.println("Indica un número: ");
        r = Float.parseFloat(scanner.nextLine());
        scanner.close();
        area = calcularArea(r);
        longitud = calcularLongitud(r);

        System.out.printf("El area es: %.2f\n",area);
        System.out.printf("La longitud es: %.2f",longitud);


    }
}
