package ejer7;

import java.util.Scanner;

public class SumaBucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumaTotal = 0;
        int contador = 0;

        do {
            System.out.print("Introduzca el numero " + (contador + 1) + ": ");
            int num = sc.nextInt();

            sumaTotal += num;
            contador++;
        } while (contador < 5);

        System.out.println(sumaTotal);
    }
}

