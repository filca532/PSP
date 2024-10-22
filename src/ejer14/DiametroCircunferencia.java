package ejer14;

import java.util.Scanner;

public class DiametroCircunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        double diametro = 2 * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.printf("Diámetro: %.3f\n", diametro);
        System.out.printf("Área: %.3f\n", area);
    }
}
