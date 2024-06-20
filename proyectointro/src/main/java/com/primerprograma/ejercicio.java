package com.primerprograma;

import java.util.Scanner;

public class ejercicio { // Cambié el nombre de la clase a mayúscula por convención
    public static void main(String[] args) {
        String mensaje = "Hola\nMundo";
        String tabla = "Nombre\tApellido\tedad";
        String retroceder = "123\b45"; // Corrigí el nombre a "retroceder"
        String ruta = "C:\\Users\\usuario\\Documentos"; // Corrigí la ruta
        String comillas = "\"Esto es una cita\"";

        System.out.println(mensaje);
        System.out.println(tabla);
        System.out.println(retroceder);
        System.out.println(ruta);
        System.out.println(comillas);

        Scanner sc = new Scanner(System.in);
        int edad = 0;

        System.out.println("Ingrese la edad");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Persona mayor de edad");
        } else {
            System.out.println("Persona menor de edad");
        }

        sc.close(); // Cerramos el Scanner al final
    }
}
