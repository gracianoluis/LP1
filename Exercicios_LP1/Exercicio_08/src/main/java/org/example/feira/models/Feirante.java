package org.example.feira.models;

public class Feirante {

private String nome;
private int numeroBarraca;
private double faturamentoDiario;

public Feirante(String nome, int numeroBarraca, double faturamentoDiario) {
    this.nome = nome;
    this.numeroBarraca = numeroBarraca;
    this.faturamentoDiario = faturamentoDiario;
}

public String getNome() {
    return nome;
}

public int getNumeroBarraca() {
    return numeroBarraca;
}

public double getFaturamentoDiario() {
    return faturamentoDiario;
}

 public void abrirBarraca() {
    System.out.println("Barraca " + this.numeroBarraca + " aberta");
 }

 public void registarVenda(double valorDaVenda) {
    this.faturamentoDiario += valorDaVenda;
    System.out.println("Venda registada: R$ " + valorDaVenda" registrada. Faturamento atual: R$ " + faturamentoDiario);
 }

 public void fecharCaixa() {
    System.out.println("Caixa fechcado! Faturamento total: R$ "+ nome + " faturou R$ " + faturamentoDiario + " hoje.");
 }

}

