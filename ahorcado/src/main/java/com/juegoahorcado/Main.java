package com.juegoahorcado;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String palabraSecreta = getPalabraSecreta();
        char[] palabraGuiones = getGuionesFromPalabra(palabraSecreta);
        boolean juegoTerminado = false;
        Scanner lector = new Scanner(System.in);
        int intentos = 3;

        while (intentos > 0 && !juegoTerminado) {
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.println();
            System.out.println(String.valueOf(palabraGuiones));
            System.out.println("Introduce una letra: ");
            char letra = lector.next().charAt(0);
            boolean algunaLetraAcertada = false;
            boolean letraYaUsada = false;

            for (char c : palabraGuiones) {
                if (c == letra) {
                    letraYaUsada = true;
                    System.out.println("Esta letra ya ha sido utilizada, intenta con otra.");
                    System.out.println();
                    break;
                }
            }

            if (!letraYaUsada) {
                for (int i = 0; i < palabraSecreta.length(); i++) {
                    if (palabraSecreta.charAt(i) == letra) {
                        palabraGuiones[i] = letra;
                        algunaLetraAcertada = true;
                    }
                }

                if (!algunaLetraAcertada) {
                    System.out.println("No has acertado ninguna letra");
                    System.out.println();
                    intentos--;
                } else {
                    boolean juegoGanado = !hayGuiones(palabraGuiones);
                    if (juegoGanado) {
                        System.out.println("Felicidades, has ganado el juego !!");
                        juegoTerminado = true;
                    }
                }
            }
        }

        if (intentos == 0) {
            System.out.println("Te quedaste sin intentos. X AHORCADO X");
        }

        lector.close();
    }

    public static String getPalabraSecreta() {
        String[] palabras = { "gato", "abecedario", "universidad", "azucar", "nube", "computador", "estrella", "puente",
                "murcielago", "naranja" };
        Random r = new Random();
        int n = r.nextInt(palabras.length);
        return palabras[n];
    }

    public static char[] getGuionesFromPalabra(String palabra) {
        char[] guiones = new char[palabra.length()];
        for (int i = 0; i < guiones.length; i++) {
            guiones[i] = '_';
        }
        return guiones;
    }

    public static boolean hayGuiones(char[] palabraGuiones) {
        for (char c : palabraGuiones) {
            if (c == '_') {
                return true;
            }
        }
        return false;
    }
}
