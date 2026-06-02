package org.example.farmacia.models;

public class Cliente {

    private String nome;
    private double cpf;
    private int pontosFidelidade;


    public Cliente(String nome, String cpf, int pontosFidelidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.pontosFidelidade = pontosFidelidade;
    }


    public String getNome() {
        return nome;
    }

    public double getCpf() {
        return cpf;
    }

    public int getPontosFidelidade() {
        return pontosFidelidade;
    }

    public void cadastrar() {
        System.out.println("O cliente " + nome + " (CPF: " + cpf + ") foi cadastrado no sistema da farmácia.");
    }

    public void adicionarPontos(int pontos) {
        this.pontosFidelidade += pontos;
        System.out.println("Foram adicionados " + pontos + " pontos. Saldo atual do cliente " + nome + ": " + pontosFidelidade);
    }

    public void resgatarBrinde() {
        if (this.pontosFidelidade >= 100) {
            this.pontosFidelidade -= 100;
            System.out.println("Brinde resgatado com sucesso! Saldo restante de pontos: " + pontosFidelidade);
        } else {
            System.out.println("Pontos insuficientes para resgatar brinde. Faltam " + (100 - pontosFidelidade) + " pontos.");
        }
    }

}
