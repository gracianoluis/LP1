package org.example;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;

public class PrimaryController {

    // Campos de Entrada
    @FXML
    private TextField txtTipo;
    @FXML
    private TextField txtPreco;
    @FXML
    private TextField txtPeso;

    // Campos de Saída
    @FXML
    private Label lblResultadoTipo; // Certifique-se que o fx:id da label embaixo de 'Tipo' seja este
    @FXML
    private Label lblResultadoPrecoQuilo;
    @FXML
    private Label lblPeso;
    @FXML
    private Label lblPrecoFinal;

    @FXML
    private void voltarMenu() throws IOException {
        App.setRoot("menu");
    }
    @FXML
    private void clicarCadastrar() {
        try {
            // 1. Coleta os dados digitados
            String tipo = txtTipo.getText();
            double preco = Double.parseDouble(txtPreco.getText().replace(",", "."));
            double peso = Double.parseDouble(txtPeso.getText().replace(",", "."));

            // 2. Cria o objeto Fruta
            Fruta novaFruta = new Fruta(tipo, preco, peso);

            // 3. Calcula o valor total
            double valorTotal = novaFruta.getprecoQuilo() * novaFruta.getpeso();

            // 4. EXIBE NA TELA
            lblResultadoTipo.setText(novaFruta.getTipo());
            lblResultadoPrecoQuilo.setText(String.format("R$ %.2f", novaFruta.getprecoQuilo()));
            lblPeso.setText(String.format("%.2f kg", novaFruta.getpeso()));
            lblPrecoFinal.setText(String.format("R$ %.2f", valorTotal));

            System.out.println("Sucesso! Tudo exibido.");

        } catch (NumberFormatException e) {
            System.out.println("Erro: Verifique os números digitados!");
        }
    }
}