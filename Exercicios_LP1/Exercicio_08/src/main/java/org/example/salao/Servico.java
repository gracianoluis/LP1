package org.example.salao.models;

public class Servico {
    private String descricao;
    private double valor;
    private int tempoEstimado; // em minutos

    // Construtor
    public Servico(String descricao, double valor, int tempoEstimado) {
        this.descricao = descricao;
        this.valor = valor;
        this.tempoEstimado = tempoEstimado;
    }

    // Getters para o DAO
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getTempoEstimado() {
        return tempoEstimado;
    }

    // Os 3 Métodos de Ação
    public void agendar(String dataHorario) {
        System.out.println("O serviço de " + descricao + " foi agendado para " + dataHorario + ".");
    }

    public void realizarProcedimento() {
        System.out.println("Realizando o procedimento: " + descricao + ". Tempo estimado: " + tempoEstimado + " minutos.");
    }

    public void cancelarAgendamento() {
        System.out.println("O agendamento do serviço " + descricao + " foi cancelado pelo cliente.");
    }
}