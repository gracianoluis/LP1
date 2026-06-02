package org.example.farmacia.models;

public class Medicamento {
    private String nome;
    private double preco;
    private boolean exigeReceita;

    // Construtor
    public Medicamento(String nome, double preco, boolean exigeReceita) {
        this.nome = nome;
        this.preco = preco;
        this.exigeReceita = exigeReceita;
    }

    // Getters para o DAO
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isExigeReceita() {
        return exigeReceita;
    }

    // Os 3 Métodos de Ação
    public void vender() {
        System.out.println("Venda do medicamento " + nome + " processada no valor de R$ " + preco + ".");
    }

    public void verificarValidade() {
        System.out.println("O medicamento " + nome + " está dentro do prazo de validade e apto para venda.");
    }

    public void aplicarDesconto(double percentual) {
        double valorDesconto = preco * (percentual / 100);
        this.preco -= valorDesconto;
        System.out.println("Desconto aplicado! O novo preço de " + nome + " é R$ " + this.preco);
    }
}