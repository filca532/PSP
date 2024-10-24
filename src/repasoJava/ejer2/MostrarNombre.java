package ejer2;

import java.util.Scanner;

public class MostrarNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escriba su nombre: ");
        String nombre = sc.next();

        System.out.println("Hola " + nombre);
    }
}
