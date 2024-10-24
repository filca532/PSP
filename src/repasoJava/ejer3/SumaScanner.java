package ejer3;

import java.util.Scanner;

public class SumaScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int suma = num1 + num2;

        System.out.println(suma);
    }
}
