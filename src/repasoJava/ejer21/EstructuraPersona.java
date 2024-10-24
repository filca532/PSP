package ejer21;

import java.util.Scanner;

public class EstructuraPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = sc.nextLine();
        }

        System.out.println("Los nombres introducidos son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}