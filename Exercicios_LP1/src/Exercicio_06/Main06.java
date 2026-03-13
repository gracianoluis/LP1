package Exercicio_06;

public class Main06 {
    public static void main(String[] args) {
        Sapato s1 = new Sapato("Nike", 42, 299.90);
        s1.vender();
        Medicamento m1 = new Medicamento("Dipirona", 15.00, false);
        m1.verificarVenda();
    }
}

