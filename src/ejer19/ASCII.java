package ejer19;

public class ASCII {
    public static void main(String[] args) {
        for (int i = 0; i < 128; i++) {
            System.out.printf("Código: %d, Carácter: %c%n", i, (char) i);
        }
    }
}