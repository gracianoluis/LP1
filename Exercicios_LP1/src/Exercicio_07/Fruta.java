package Exercicio_07;

public class Fruta {
    private String tipo;
    private double precoQuilo;
    private double pesoEstoque;

    public Fruta(String tipo, double precoQuilo, double pesoEstoque) {
        this.tipo = tipo;
        this.precoQuilo = precoQuilo;
        this.pesoEstoque = pesoEstoque;
    }

    public void calcularPreco(double peso) { System.out.println("Preço total para " + peso + "kg: R$ " + (peso * precoQuilo)); }
    public void verificarQualidade() { System.out.println("Qualidade da " + tipo + " verificada."); }
    public void reporBanca() { System.out.println("Banca de " + tipo + " reabastecida."); }
}