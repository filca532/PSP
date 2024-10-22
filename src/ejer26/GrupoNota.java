package ejer26;

import java.util.ArrayList;
import java.util.Scanner;

public class GrupoNota {
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

        for (int nota : notas) {
            String clasificacion = clasificarNota(nota);
            switch (clasificacion) {
                case "suspenso":
                    suspensos.add(nota);
                    break;
                case "aprobado":
                    aprobados.add(nota);
                    break;
                case "notable":
                    notables.add(nota);
                    break;
                case "sobresaliente":
                    sobresalientes.add(nota);
                    break;
                case "matricula":
                    matriculas.add(nota);
                    break;
            }
        }

        System.out.println("Suspensos: " + suspensos.size());
        System.out.println("Aprobados: " + aprobados.size());
        System.out.println("Notables: " + notables.size());
        System.out.println("Sobresalientes: " + sobresalientes.size());
        System.out.println("Matrículas: " + matriculas.size());
    }

    public static String clasificarNota(int nota) {
        if (nota < 5) {
            return "suspenso";
        } else if (nota >= 5 && nota < 7) {
            return "aprobado";
        } else if (nota >= 7 && nota < 9) {
            return "notable";
        } else if (nota >= 9 && nota < 10) {
            return "sobresaliente";
        } else if (nota == 10) {
            return "matricula";
        }
        return "";
    }
}
