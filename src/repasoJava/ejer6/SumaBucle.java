package ejer6;

import java.util.Scanner;

public class SumaBucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumaTotal = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduzca el numero " + (i + 1) + ": ");
            int num = sc.nextInt();

            sumaTotal += num;
        }

        System.out.println(sumaTotal);
    }
}
