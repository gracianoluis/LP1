package Exercicio_06;
class Medicamento {
    private String nome;
    private double preco;
    private boolean precisaReceita;

    public Medicamento(String nome, double preco, boolean precisaReceita) {
        this.nome = nome;
        this.preco = preco;
        this.precisaReceita = precisaReceita;
    }

    public void verificarVenda() {
        if (precisaReceita) {
            System.out.println("O remédio " + nome + " exige receita médica!");
        } else {
            System.out.println("Venda de " + nome + " autorizada.");
        }
    }
}