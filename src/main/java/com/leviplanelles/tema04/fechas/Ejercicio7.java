package com.leviplanelles.tema04.fechas;
import com.leviplanelles.tema04.lib.IO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio7 {
    /**
     * Método que suma años a una fecha
     * @param fechaSobreElCalculo la fecha a la que se va a aplicar el cambio
     * @return suma
     */
    public static LocalDate sumarAnios(LocalDate fechaSobreElCalculo) {
        int num = IO.solicitarInt("Cantidad: ",0,100);
        return fechaSobreElCalculo.plusYears(num);
    }
    /**
     * Método que suma meses a una fecha
     * @param fechaSobreElCalculo la fecha a la que se va a aplicar el cambio
     * @return suma
     */
    public static LocalDate sumarMeses(LocalDate fechaSobreElCalculo) {
        int num = IO.solicitarInt("Cantidad: ",0,100);
        return fechaSobreElCalculo.plusMonths(num);
    }
    /**
     * Método que suma días a una fecha
     * @param fechaSobreElCalculo la fecha a la que se va a aplicar el cambio
     * @return suma
     */
    public static LocalDate sumarDias(LocalDate fechaSobreElCalculo) {
        int num = IO.solicitarInt("Cantidad: ",0,100);
        return fechaSobreElCalculo.plusDays(num);
    }
    /**
     * Método que resta años a una fecha
     * @param fechaSobreElCalculo la fecha a la que se va a aplicar el cambio
     * @return resta
     */
    public static LocalDate restarAnios(LocalDate fechaSobreElCalculo) {
        int num = IO.solicitarInt("Cantidad: ",0,100);
        return fechaSobreElCalculo.minusYears(num);
    }
    /**
     * Método que resta meses a una fecha
     * @param fechaSobreElCalculo la fecha a la que se va a aplicar el cambio
     * @return resta
     */
    public static LocalDate restarMeses(LocalDate fechaSobreElCalculo) {
        int num = IO.solicitarInt("Cantidad: ",0,100);
        return fechaSobreElCalculo.minusMonths(num);
    }
    /**
     * Método que resta días a una fecha
     * @param fechaSobreElCalculo la fecha a la que se va a aplicar el cambio
     * @return resta
     */
    public static LocalDate restarDias(LocalDate fechaSobreElCalculo) {
        int num = IO.solicitarInt("Cantidad: ",0,100);
        return fechaSobreElCalculo.minusDays(num);
    }
    /**
     * Imprime por pantalla el menú
     * @param fecha la fecha con la que va a salir el menú
     */
    public static void menuPrincipal(LocalDate fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormat = fecha.format(formatter);
        System.out.println("*********************************");
        System.out.printf("*** FECHA CALCULADA: %s *\n",fechaFormat);
        System.out.println("*********************************");

        System.out.println("1. Modificar fecha calculada");
        System.out.println("2. Operaciones ...");
        System.out.println("------------------------------------------");
        System.out.print("0. Salir del programa");
    }
    /**
     * Imprime por pantalla el submenú
     * @param fecha la fecha con la que va a salir el submenú
     */
    public static void subMenu(LocalDate fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormat = fecha.format(formatter);
        System.out.println("*********************************");
        System.out.println("***         OPERACIONES       ***");
        System.out.printf("*** FECHA CALCULADA: %s *\n",fechaFormat);
        System.out.println("*********************************");
        System.out.println("1. Sumar años");
        System.out.println("2. Sumar meses");
        System.out.println("3. Sumar días");
        System.out.println("4. Restar años");
        System.out.println("5. Restar meses");
        System.out.println("6. Restar días");
        System.out.println("------------------------------------------");
        System.out.print("0. Volver al menu principal");

    }
    /**
     * Este método te permite seleccionar desde una opcion del menú, y depende de la opcion hace una cosa o otra
     * @param fecha la fecha con la que se harán los cambios
     * @return devuelve el resultado del calculo, si se quiere volver al menu principal simplemente se devuelve la misma fecha
     */
    public static LocalDate seleccion(LocalDate fecha) {
        int eleccion = IO.solicitarInt("",0,6);

        return switch (eleccion) {
            case 1 -> sumarAnios(fecha);
            case 2 -> sumarMeses(fecha);
            case 3 -> sumarDias(fecha);
            case 4 -> restarAnios(fecha);
            case 5 -> restarMeses(fecha);
            case 6 -> restarDias(fecha);
            default -> fecha;
        };
    }
    /**
     * Este método te permite cambiar la fecha inicial a la que quieras
     * @return te devuelve la nueva fecha que se establecerá
     */
    public static LocalDate establecerFecha() {
        String nuevaFecha = IO.solicitarString("Introduce la nueva fecha (dd/mm/yyyy): ",0,10);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(nuevaFecha,formatter);
    }
    public static void main(String[] args) {
        int choice;
        String fechaInicial = IO.solicitarString("Introduce una fecha inicial (dd/mm/yyyy): ",0,10);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaInicialParseada = LocalDate.parse(fechaInicial,formatter);

        do {
            menuPrincipal(fechaInicialParseada);
            choice = IO.solicitarInt("",0,100);
            switch (choice) {
                case 1 -> fechaInicialParseada = establecerFecha();
                case 2 -> {
                    subMenu(fechaInicialParseada);
                    fechaInicialParseada = seleccion(fechaInicialParseada);
                }
                case 0 -> {
                    break;
                }
                default -> System.err.println("Número introducido incorrecto, vuélvelo a intentar.");
            }
        }while (choice != 0);



    }
}
