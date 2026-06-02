package org.example;

import org.example.farmacia.models.Medicamento;
import org.example.feira.models.Fruta;
import org.example.salao.Servico;

public class Main07 {
    public static void main(String[] args) {
        Medicamento med = new Medicamento("Amoxicilina", 50.0, true);
        Fruta morango = new Fruta("Morango", 15.0, 10.0);
        Servico corte = new Servico("Corte de Cabelo", 45.0, 30);

        System.out.println("--- Teste Farmácia ---");
        med.vender();
        med.aplicarDesconto();

        System.out.println("\n--- Teste Feira ---");
        morango.calcularPreco(2.5);

        System.out.println("\n--- Teste Salão ---");
        corte.agendar();
        corte.realizarProcedimento();
    }
}