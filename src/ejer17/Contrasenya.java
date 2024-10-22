package ejer17;

import java.util.Scanner;

public class Contrasenya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una contraseña: ");
        String contrasenya = sc.nextLine();

        if (esContrasenyaValida(contrasenya)) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos.");
        }
    }

    private static boolean esContrasenyaValida(String contrasenya) {
        String regex = "^(?=.*[0-9])(?=.*[A-Z]).{5,}$";
        return contrasenya.matches(regex);
    }
}
