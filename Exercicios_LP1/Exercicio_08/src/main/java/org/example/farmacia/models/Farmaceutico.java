package org.example.farmacia.models;

public class Farmaceutico {

    private String nome;
    private String cpf;
    private double salario;

    public Farmaceutico(String nome, String crf, double salario) {
        this.nome = nome;
        this.crf = crf;
        this.salario = salario;

    }

    public String getNome() {
        return nome;
    }

    public String getcrf() {
        return getcrf();
    }

    public double getSalario() {
        return salario;
    }


    public void autorizarReceita(Medicamento medicamento) {
        if (medicamento.isExigeReceita()) {
            System.out.println("O farmacêutico " + nome + " (CRF: " + crf + ") autorizou a venda controlada do medicamento " + medicamento.getNome() + ".");
        } else {
            System.out.println("Este medicamento não necessita de autorização especial.");
        }
    }

    public void baterPonto(String horario) {
        System.out.println("O farmacêutico " + nome + " registrou o ponto às " + horario + ".");
    }

    public void calcularFerias() {
        double valorFerias = salario + (salario / 3);
        System.out.println("O valor calculado para as férias de " + nome + " é R$ " + valorFerias);
    }
}