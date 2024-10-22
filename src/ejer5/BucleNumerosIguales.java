package ejer5;

import java.util.Scanner;

public class BucleNumerosIguales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        do {
            System.out.print("Introduzca el primer numero: ");
            num1 = sc.nextInt();

            System.out.print("Introduzca el segundo numero: ");
            num2 = sc.nextInt();

        } while (num1 != num2);

        System.out.println("Los numeros son iguales");
    }
}
