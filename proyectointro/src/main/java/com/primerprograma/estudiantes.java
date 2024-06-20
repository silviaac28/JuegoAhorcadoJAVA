package com.primerprograma;

import java.util.Scanner;

public class estudiantes {

    private String nombre;
    private String apellidos;
    private int edad;

    public estudiantes() {
    }

    public estudiantes(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese los apellidos del estudiante:");
        String apellidos = sc.nextLine();

        System.out.println("Ingrese la edad del estudiante:");
        int edad = sc.nextInt();

        estudiantes estudiante = new estudiantes(nombre, apellidos, edad);

        System.out.println("\nDatos del estudiante:");
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Apellidos: " + estudiante.getApellidos());
        System.out.println("Edad: " + estudiante.getEdad());

        sc.close();
    }
}
