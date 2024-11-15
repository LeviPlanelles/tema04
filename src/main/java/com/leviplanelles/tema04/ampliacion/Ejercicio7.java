package com.leviplanelles.tema04.ampliacion;

public class Ejercicio7 {
    /**
     * Te hace la potencia de un numero
     * @param a base
     * @param b potencia
     * @return el resultado de hacer la potencia(a) de la base(b)
     */
    public static int potenciaRecursivo(int a, int b) {
        if (b == 0) {
            return 1;
        }else if (b == 1){
            return a;
        }else {
            return a * potenciaRecursivo(a,b-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(potenciaRecursivo(2,3));
    }
}
