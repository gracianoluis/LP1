package org.example.feira.models;

public class Balanca {
    private String marca;
    private double pesoMaximo;
    private boolean estaCalibrada;

    public Balanca(String marca, double pesoMaximo, boolean estaCalibrada) {
        this.marca = marca;
        this.pesoMaximo = pesoMaximo;
        this.estaCalibrada = estaCalibrada;
    }

    public String getMarca() {
        return marca;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public boolean isEstaCalibrada() {
        return estaCalibrada;
    }

    public void ligar() {
        System.out.println("A balança " + marca + " está ligada e pronta para uso.");
    }

    public void pesarProduto(double peso) {
        if (peso > pesoMaximo) {
            System.out.println("Aviso: O peso excede a capacidade máxima de " + pesoMaximo + "kg.");
        } else {
            System.out.println("Peso registrado na balança: " + peso + "kg.");
        }
    }

    public void calibrar() {
        this.estaCalibrada = true;
        System.out.println("A balança " + marca + " foi calibrada com sucesso e está pronta para uso preciso.");
    }
}