package org.example;

public class Fruta {
    private String tipo;
    private double precoQuilo;
    private double peso;

    public Fruta(String tipo, double precoQuilo, double peso) {
        this.tipo = tipo;
        this.precoQuilo = precoQuilo;
        this.peso = peso;
    }
    public String getTipo() {
        return tipo;
    }

    public double getprecoQuilo() {
        return precoQuilo;
    }

    public double getpeso() {
        return peso;
    }

    public void calcularPreco(double peso) {
        System.out.println("Preço total: " + (this.precoQuilo * peso));
    }
}