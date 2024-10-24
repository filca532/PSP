package ejer22;

import java.util.ArrayList;
import java.util.Scanner;

public class EstructuraPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();

        while (true) {
            System.out.print("Introduce el nombre de la persona (o 0 para terminar): ");
            String nombre = sc.nextLine();
            if (nombre.equals("0")) {
                break;
            }
            nombres.add(nombre);
        }

        System.out.println("Los nombres introducidos son:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}