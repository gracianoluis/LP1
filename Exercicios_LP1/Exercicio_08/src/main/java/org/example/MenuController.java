package org.example;

import javafx.fxml.FXML;
import java.io.IOException;

public class MenuController {

    @FXML
    private void irParaFrutas() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    private void irParaMedicamentos() throws IOException {
        System.out.println("Indo para Medicamentos...");
    }

    @FXML
    private void irParaServicos() throws IOException {
        System.out.println("Indo para Serviços...");
    }
}