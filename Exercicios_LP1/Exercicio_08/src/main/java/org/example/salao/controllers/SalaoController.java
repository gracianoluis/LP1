package org.example.salao.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

import org.example.salao.models.Servico;
import org.example.salao.models.Cabeleireiro;
import org.example.salao.models.ProdutoCabelo;
import org.example.App;

public class SalaoController {

    @FXML private TextField txtDescricaoServico;
    @FXML private TextField txtValorServico;
    @FXML private TextField txtTempoServico;
    @FXML private Label lblStatusServico;

    @FXML private TextField txtNomeCabeleireiro;
    @FXML private TextField txtEspecialidadeCabeleireiro;
    @FXML private TextField txtComissaoCabeleireiro;
    @FXML private Label lblStatusCabeleireiro;

    @FXML private TextField txtMarcaProduto;
    @FXML private TextField txtFuncaoProduto;
    @FXML private TextField txtQuantidadeProduto;
    @FXML private Label lblStatusProduto;

    @FXML
    private void voltarMenu() throws IOException {
        App.setRoot("menu");
    }

    @FXML
    private void cadastrarServico() {
        try {
            String descricao = txtDescricaoServico.getText();
            double valor = Double.parseDouble(txtValorServico.getText().replace(",", "."));
            int tempo = Integer.parseInt(txtTempoServico.getText());

            Servico novoServico = new Servico(descricao, valor, tempo);

            lblStatusServico.setStyle("-fx-text-fill: green;");
            lblStatusServico.setText("Serviço '" + novoServico.getDescricao() + "' registado com sucesso!");

            txtDescricaoServico.clear();
            txtValorServico.clear();
            txtTempoServico.clear();

        } catch (NumberFormatException e) {
            lblStatusServico.setStyle("-fx-text-fill: red;");
            lblStatusServico.setText("Erro: Valor e Tempo devem ser números válidos.");
        }
    }

    @FXML
    private void cadastrarCabeleireiro() {
        try {
            String nome = txtNomeCabeleireiro.getText();
            String especialidade = txtEspecialidadeCabeleireiro.getText();
            double comissao = Double.parseDouble(txtComissaoCabeleireiro.getText().replace(",", "."));

            Cabeleireiro novoCabeleireiro = new Cabeleireiro(nome, especialidade, comissao);

            lblStatusCabeleireiro.setStyle("-fx-text-fill: green;");
            lblStatusCabeleireiro.setText("Profissional " + novoCabeleireiro.getNome() + " registado(a)!");

            txtNomeCabeleireiro.clear();
            txtEspecialidadeCabeleireiro.clear();
            txtComissaoCabeleireiro.clear();

        } catch (NumberFormatException e) {
            lblStatusCabeleireiro.setStyle("-fx-text-fill: red;");
            lblStatusCabeleireiro.setText("Erro: A comissão deve ser um número válido.");
        }
    }

    @FXML
    private void cadastrarProduto() {
        try {
            String marca = txtMarcaProduto.getText();
            String funcao = txtFuncaoProduto.getText();
            int quantidade = Integer.parseInt(txtQuantidadeProduto.getText());

            ProdutoCabelo novoProduto = new ProdutoCabelo(marca, funcao, quantidade);

            lblStatusProduto.setStyle("-fx-text-fill: green;");
            lblStatusProduto.setText("Produto da marca " + novoProduto.getMarca() + " registado!");

            txtMarcaProduto.clear();
            txtFuncaoProduto.clear();
            txtQuantidadeProduto.clear();

        } catch (NumberFormatException e) {
            lblStatusProduto.setStyle("-fx-text-fill: red;");
            lblStatusProduto.setText("Erro: A quantidade (ml) deve ser um número inteiro.");
        }
    }
}