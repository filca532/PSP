package ejer12;

import java.util.ArrayList;
import java.util.Scanner;

public class AgruparNotasAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> notas = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce la nota del alumno " + (i + 1) + ": ");
            notas.add(sc.nextInt());
        }

        ArrayList<Integer> suspensos = new ArrayList<>();
        ArrayList<Integer> aprobados = new ArrayList<>();
        ArrayList<Integer> notables = new ArrayList<>();
        ArrayList<Integer> sobresalientes = new ArrayList<>();
        ArrayList<Integer> matriculas = new ArrayList<>();

        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) < 5) {
                suspensos.add(notas.get(i));
            } else if (notas.get(i) >= 5 && notas.get(i) < 7) {
                aprobados.add(notas.get(i));
            } else if (notas.get(i) >= 7 && notas.get(i) < 9) {
                notables.add(notas.get(i));
            } else if (notas.get(i) >= 9 && notas.get(i) < 10) {
                sobresalientes.add(notas.get(i));
            } else if (notas.get(i) == 10) {
                matriculas.add(notas.get(i));
            }
        }

        System.out.println("Suspensos: " + suspensos.size());
        System.out.println("Aprobados: " + aprobados.size());
        System.out.println("Notables: " + notables.size());
        System.out.println("Sobresalientes: " + sobresalientes.size());
        System.out.println("Matrículas: " + matriculas.size());
    }
}
