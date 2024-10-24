package ejer16;

import java.util.Scanner;

public class NumeroSuerte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu fecha de nacimiento (dd/mm/yyyy): ");
        String fechaNacimiento = sc.nextLine();

        String[] partes = fechaNacimiento.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int año = Integer.parseInt(partes[2]);

        int suma = dia + mes + año;
        int numeroSuerte = sumarDigitos(suma);

        System.out.println("Tu número de la suerte es: " + numeroSuerte);
    }

    private static int sumarDigitos(int numero) {
        while (numero > 9) {
            int suma = 0;
            while (numero != 0) {
                suma += numero % 10;
                numero /= 10;
            }
            numero = suma;
        }
        return numero;
    }
}