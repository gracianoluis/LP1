package Exercicio_07;

public class Medicamento {
    private String nome;
    private double preco;
    private boolean exigeReceita;

    public Medicamento(String nome, double preco, boolean exigeReceita) {
        this.nome = nome;
        this.preco = preco;
        this.exigeReceita = exigeReceita;
    }

    public void vender() { System.out.println("Venda do medicamento " + nome + " processada."); }
    public void verificarValidade() { System.out.println("Validade de " + nome + " dentro do prazo."); }
    public void aplicarDesconto() { System.out.println("Desconto aplicado ao " + nome); }
}