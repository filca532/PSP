package ejer27;

import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el DNI: ");
        int dni = sc.nextInt();

        char letra = calcularLetraDNI(dni);

        System.out.println("La letra del DNI es: " + letra);
    }

    public static char calcularLetraDNI(int dni) {
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
                "H", "L", "C", "K", "E"};
        return letras[dni % 23].charAt(0);
    }
}