package Exercicio_06;

public class Sapato {
    private String marca;
    private int tamanho;
    private double preco;

    public Sapato(String marca, int tamanho, double preco) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void vender() {
        System.out.println("Sapato " + marca + " vendido por R$ " + preco);
    }
}