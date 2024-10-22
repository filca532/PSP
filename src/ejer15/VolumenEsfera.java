package ejer15;

import java.util.Scanner;

public class VolumenEsfera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        double diametro = 2 * radio;
        double area = Math.PI * Math.pow(radio, 2);
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.printf("Diámetro: %.3f\n", diametro);
        System.out.printf("Área: %.3f\n", area);
        System.out.printf("Volumen: %.3f\n", volumen);
    }
}
