package ejer24;

import java.util.Scanner;
import java.util.Random;

public class NumeroAleatorioPremio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número entre 1 y 10: ");
        int numeroUsuario = scanner.nextInt();

        if (numeroUsuario < 1 || numeroUsuario > 10) {
            System.out.println("El número no está entre 1 y 10. Intenta de nuevo.");
            return;
        }

        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;

        System.out.println("Tu número: " + numeroUsuario);
        System.out.println("Número generado: " + numeroAleatorio);

        if (numeroUsuario == numeroAleatorio) {
            System.out.println("¡Felicidades! Has ganado un premio: un viaje a la playa.");
        } else {
            System.out.println("Lo siento, no has ganado. ¡Intenta de nuevo!");
        }

        scanner.close();
    }
}