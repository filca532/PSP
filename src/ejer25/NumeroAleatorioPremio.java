package ejer25;

import java.util.Random;
import java.util.Scanner;

public class NumeroAleatorioPremio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el primer número entre 1 y 10: ");
        int numeroUsuario1 = scanner.nextInt();

        System.out.print("Introduce el segundo número entre 1 y 10: ");
        int numeroUsuario2 = scanner.nextInt();

        System.out.print("Introduce el tercer número entre 1 y 10: ");
        int numeroUsuario3 = scanner.nextInt();

        if ((numeroUsuario1 < 1 || numeroUsuario1 > 10) ||
                (numeroUsuario2 < 1 || numeroUsuario2 > 10) ||
                (numeroUsuario3 < 1 || numeroUsuario3 > 10)) {
            System.out.println("Alguno de los números no está entre 1 y 10. Intenta de nuevo.");
            return;
        }

        Random random = new Random();
        int numeroAleatorio = random.nextInt(10) + 1;

        System.out.println("Tus números: " + numeroUsuario1 + ", " + numeroUsuario2 + ", " + numeroUsuario3);
        System.out.println("Número generado: " + numeroAleatorio);

        if (numeroUsuario1 == numeroAleatorio || numeroUsuario2 == numeroAleatorio || numeroUsuario3 == numeroAleatorio) {
            System.out.println("¡Felicidades! Has ganado un premio: un viaje a la playa.");
        } else {
            System.out.println("Lo siento, no has ganado. ¡Intenta de nuevo!");
        }

        scanner.close();
    }
}