package org.example.salao.models;

public class ProdutoCabelo {
    private String marca;
    private String funcao;
    private int quantidade;

    public ProdutoCabelo(String marca, String funcao, int quantidade) {
        this.marca = marca;
        this.funcao = funcao;
        this.quantidade = quantidade;

    }

    public String getMarca() {
        return marca;
    }

    public String getFuncao() {
        return funcao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void abrirEmbalagem() {
        System.out.println("Embalagem do produto " + marca + " (Função: " + funcao + ") foi aberta no salão.");
    }

    public void aplicarNoCabelo(int mlUtilizado) {
        if (mlUtilizado <= this.quantidade) {
            this.quantidade -= mlUtilizado;
            System.out.println("Foram aplicados " + mlUtilizado +  marca + ". Restante na embalagem: " + this.quantidade + "ml.");
        } else {
            System.out.println("Erro: Produto insuficiente para a aplicação. Há apenas " + this.quantidade + "ml disponíveis.");
        }
    }

    public void verificarNivel() {
        if (this.quantidade < 50) {
            System.out.println("Aviso: O produto " + marca + " está acabando (" + this.quantidade + "ml). É necessário comprar mais.");
        } else {
            System.out.println("Nível do produto " + marca + " está adequado: " + this.quantidade + "ml.");
        }
    }
}
