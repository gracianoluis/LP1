package org.example.feira.models; // Ajuste o pacote conforme a sua organização

public class Fruta {
    private String tipo;
    private double precoQuilo;
    private double pesoEstoque;

    // Construtor
    public Fruta(String tipo, double precoQuilo, double pesoEstoque) {
        this.tipo = tipo;
        this.precoQuilo = precoQuilo;
        this.pesoEstoque = pesoEstoque;
    }

    // Getters (Necessários para o DAO puxar os dados e salvar no banco)
    public String getTipo() {
        return tipo;
    }

    public double getPrecoQuilo() {
        return precoQuilo;
    }

    public double getPesoEstoque() {
        return pesoEstoque;
    }

    // Os 3 Métodos de Ação
    public void calcularPreco(double quantidadeComprada) {
        double valorTotal = this.precoQuilo * quantidadeComprada;
        System.out.println("Preço calculado para " + quantidadeComprada + "kg de " + tipo + ": R$ " + valorTotal);
    }

    public void verificarQualidade() {
        System.out.println("A qualidade da fruta " + tipo + " foi verificada para a feira.");
    }

    public void reporBanca(double quantidadeAdicionada) {
        this.pesoEstoque += quantidadeAdicionada;
        System.out.println("Estoque reposto. Novo estoque de " + tipo + ": " + pesoEstoque + "kg.");
    }
}