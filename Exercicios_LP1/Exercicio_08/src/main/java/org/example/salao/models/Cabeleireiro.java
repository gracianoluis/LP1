package org.example.salao.models;

public class Cabeleireiro {
    private String nome;
    private String especialidade;
    private double comissao; // Saldo de comissão a receber

    // Construtor
    public Cabeleireiro(String nome, String especialidade, double comissao) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.comissao = comissao;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public double getComissao() {
        return comissao;
    }

    // Os 3 Métodos de Ação
    public void atenderCliente(String nomeCliente) {
        System.out.println("O(a) especialista em " + especialidade + " " + nome + " está atendendo o cliente " + nomeCliente + ".");
    }

    public void receberComissao(double valorDoServico) {
        // Exemplo: O cabeleireiro ganha 40% do valor do serviço
        double valorGanho = valorDoServico * 0.40;
        this.comissao += valorGanho;
        System.out.println(nome + " recebeu R$ " + valorGanho + " de comissão. Saldo total: R$ " + this.comissao);
    }

    public void fazerPausa() {
        System.out.println("O profissional " + nome + " entrou em pausa para descanso/almoço.");
    }
}
