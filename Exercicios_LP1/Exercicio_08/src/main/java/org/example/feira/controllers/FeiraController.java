package org.example.feira.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

import org.example.feira.models.Fruta;
import org.example.feira.models.Feirante;
import org.example.feira.models.Balanca;
import org.example.App;

public class FeiraController {

    @FXML private TextField txtTipoFruta;
    @FXML private TextField txtPrecoFruta;
    @FXML private TextField txtPesoFruta;
    @FXML private Label lblStatusFruta;

    @FXML private TextField txtNomeFeirante;
    @FXML private TextField txtNumeroBarraca;
    @FXML private TextField txtFaturamentoDiario;
    @FXML private Label lblStatusFeirante;

    @FXML private TextField txtMarcaBalanca;
    @FXML private TextField txtPesoMaximo;
    @FXML private CheckBox chkEstaCalibrada;
    @FXML private Label lblStatusBalanca;


    @FXML
    private void voltarMenu() throws IOException {
        App.setRoot("menu");
    }

    @FXML
    private void cadastrarFruta() {
        try {
            String tipo = txtTipoFruta.getText();
            double preco = Double.parseDouble(txtPrecoFruta.getText().replace(",", "."));
            double peso = Double.parseDouble(txtPesoFruta.getText().replace(",", "."));

            Fruta novaFruta = new Fruta(tipo, preco, peso);

            lblStatusFruta.setStyle("-fx-text-fill: green;");
            lblStatusFruta.setText("Fruta " + novaFruta.getTipo() + " criada com sucesso!");

            txtTipoFruta.clear();
            txtPrecoFruta.clear();
            txtPesoFruta.clear();

        } catch (NumberFormatException e) {
            lblStatusFruta.setStyle("-fx-text-fill: red;");
            lblStatusFruta.setText("Erro: Digite apenas números no Preço e no Peso.");
        }
    }

    @FXML
    private void cadastrarFeirante() {
        try {
            String nome = txtNomeFeirante.getText();
            int barraca = Integer.parseInt(txtNumeroBarraca.getText());
            double faturamento = Double.parseDouble(txtFaturamentoDiario.getText().replace(",", "."));

            Feirante novoFeirante = new Feirante(nome, barraca, faturamento);


            lblStatusFeirante.setStyle("-fx-text-fill: green;");
            lblStatusFeirante.setText("Feirante " + novoFeirante.getNome() + " registrado!");

            txtNomeFeirante.clear();
            txtNumeroBarraca.clear();
            txtFaturamentoDiario.clear();

        } catch (NumberFormatException e) {
            lblStatusFeirante.setStyle("-fx-text-fill: red;");
            lblStatusFeirante.setText("Erro: Verifique os números digitados.");
        }
    }

    @FXML
    private void cadastrarBalanca() {
        try {
            String marca = txtMarcaBalanca.getText();
            double pesoMax = Double.parseDouble(txtPesoMaximo.getText().replace(",", "."));

            boolean estaCalibrada = chkEstaCalibrada.isSelected();

            Balanca novaBalanca = new Balanca(marca, pesoMax, estaCalibrada);

            lblStatusBalanca.setStyle("-fx-text-fill: green;");
            lblStatusBalanca.setText("Balança " + novaBalanca.getMarca() + " registrada!");

            txtMarcaBalanca.clear();
            txtPesoMaximo.clear();
            chkEstaCalibrada.setSelected(false);

        } catch (NumberFormatException e) {
            lblStatusBalanca.setStyle("-fx-text-fill: red;");
            lblStatusBalanca.setText("Erro: O Peso Máximo deve ser um número válido.");
        }
    }
}