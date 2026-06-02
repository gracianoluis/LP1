package org.example.farmacia.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

import org.example.farmacia.models.Medicamento;
import org.example.farmacia.models.Cliente;
import org.example.farmacia.models.Farmaceutico;
import org.example.App;

public class FarmaciaController {

    @FXML private TextField txtNomeMedicamento;
    @FXML private TextField txtPrecoMedicamento;
    @FXML private CheckBox chkExigeReceita;
    @FXML private Label lblStatusMedicamento;

    @FXML private TextField txtNomeCliente;
    @FXML private TextField txtCpfCliente;
    @FXML private TextField txtPontosFidelidade;
    @FXML private Label lblStatusCliente;

    @FXML private TextField txtNomeFarmaceutico;
    @FXML private TextField txtCrfFarmaceutico;
    @FXML private TextField txtSalarioFarmaceutico;
    @FXML private Label lblStatusFarmaceutico;

    @FXML
    private void voltarMenu() throws IOException {
        App.setRoot("menu");
    }

    @FXML
    private void cadastrarMedicamento() {
        try {
            String nome = txtNomeMedicamento.getText();
            double preco = Double.parseDouble(txtPrecoMedicamento.getText().replace(",", "."));
            boolean exigeReceita = chkExigeReceita.isSelected();

            Medicamento novoMedicamento = new Medicamento(nome, preco, exigeReceita);

            lblStatusMedicamento.setStyle("-fx-text-fill: green;");
            lblStatusMedicamento.setText("Medicamento " + novoMedicamento.getNome() + " registado com sucesso!");

            txtNomeMedicamento.clear();
            txtPrecoMedicamento.clear();
            chkExigeReceita.setSelected(false);

        } catch (NumberFormatException e) {
            lblStatusMedicamento.setStyle("-fx-text-fill: red;");
            lblStatusMedicamento.setText("Erro: O preço deve ser um número válido.");
        }
    }

    @FXML
    private void cadastrarCliente() {
        try {
            String nome = txtNomeCliente.getText();
            String cpf = txtCpfCliente.getText();
            int pontos = Integer.parseInt(txtPontosFidelidade.getText());

            Cliente novoCliente = new Cliente(nome, cpf, pontos);

            lblStatusCliente.setStyle("-fx-text-fill: green;");
            lblStatusCliente.setText("Cliente " + novoCliente.getNome() + " registado!");

            txtNomeCliente.clear();
            txtCpfCliente.clear();
            txtPontosFidelidade.clear();

        } catch (NumberFormatException e) {
            lblStatusCliente.setStyle("-fx-text-fill: red;");
            lblStatusCliente.setText("Erro: Os pontos devem ser um número inteiro.");
        }
    }

    @FXML
    private void cadastrarFarmaceutico() {
        try {
            String nome = txtNomeFarmaceutico.getText();
            String crf = txtCrfFarmaceutico.getText();
            double salario = Double.parseDouble(txtSalarioFarmaceutico.getText().replace(",", "."));

            Farmaceutico novoFarmaceutico = new Farmaceutico(nome, crf, salario);

            lblStatusFarmaceutico.setStyle("-fx-text-fill: green;");
            lblStatusFarmaceutico.setText("Farmacêutico(a) " + novoFarmaceutico.getNome() + " registado(a)!");

            txtNomeFarmaceutico.clear();
            txtCrfFarmaceutico.clear();
            txtSalarioFarmaceutico.clear();

        } catch (NumberFormatException e) {
            lblStatusFarmaceutico.setStyle("-fx-text-fill: red;");
            lblStatusFarmaceutico.setText("Erro: O salário deve ser um número válido.");
        }
    }
}