package com.primerprograma;

import java.util.Scanner;
       
       public class ejercicio2 { // Cambié el nombre de la clase a mayúscula por convención
           public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int edad=0;
            System.out.println("Ingrese la edad");
            edad= sc.nextInt();
            if (edad>=18){
                System.out.println("Persona mayor de edad");
            }else{
                System.out.println("Persona menor de edad");
            }
           }
       }
       