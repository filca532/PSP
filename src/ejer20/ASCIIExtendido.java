package ejer20;

public class ASCIIExtendido {
    public static void main(String[] args) {
        for (int i = 0; i < 256; i++) {
            System.out.printf("Código: %d, Carácter: %c%n", i, (char) i);
        }
    }
}
