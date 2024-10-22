package ejer28;

public class Main {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[5];

        vehiculos[0] = new Vehiculo("Coche", "Toyota", "Corolla");
        vehiculos[1] = new Vehiculo("Motocicleta", "Yamaha", "MT-07");
        vehiculos[2] = new Vehiculo("Coche", "Ford", "Mustang");
        vehiculos[3] = new Vehiculo("Motocicleta", "Honda", "CBR500R");
        vehiculos[4] = new Vehiculo("Coche", "Tesla", "Model S");

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
    }
}