package Exercicio_07;

public class Servico {
    private String descricao;
    private double valor;
    private int tempoEstimado;

    public Servico(String descricao, double valor, int tempoEstimado) {
        this.descricao = descricao;
        this.valor = valor;
        this.tempoEstimado = tempoEstimado;
    }

    public void agendar() { System.out.println("Serviço de " + descricao + " agendado."); }
    public void realizarProcedimento() { System.out.println("Realizando: " + descricao); }
    public void cancelarAgendamento() { System.out.println("Agendamento de " + descricao + " cancelado."); }
}