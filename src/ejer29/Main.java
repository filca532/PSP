package ejer29;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        String tipo;

        System.out.print("Introduce el tipo de vehículo (o 'salir' para terminar): ");
        tipo = sc.nextLine();

        while (!tipo.equalsIgnoreCase("salir")) {
            System.out.print("Introduce la marca del vehículo: ");
            String marca = sc.nextLine();

            System.out.print("Introduce el modelo del vehículo: ");
            String modelo = sc.nextLine();

            vehiculos.add(new Vehiculo(tipo, marca, modelo));

            System.out.print("Introduce el tipo de vehículo (o 'salir' para terminar): ");
            tipo = sc.nextLine();
        }

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}