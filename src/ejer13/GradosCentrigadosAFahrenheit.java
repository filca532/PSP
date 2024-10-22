package ejer13;

import java.util.Scanner;

public class GradosCentrigadosAFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius = sc.nextInt();
        double fahrenheit;

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " grados centígrados son " + fahrenheit + " grados Fahrenheit.");
    }
}
