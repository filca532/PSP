package ejer29;

import java.util.Objects;

public class Vehiculo {
    private String tipo;
    private String marca;
    private String modelo;

    public Vehiculo(String tipo, String marca, String modelo) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehiculo vehiculo = (Vehiculo) o;
        return Objects.equals(tipo, vehiculo.tipo) && Objects.equals(marca, vehiculo.marca) && Objects.equals(modelo, vehiculo.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, marca, modelo);
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipo='" + tipo + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}