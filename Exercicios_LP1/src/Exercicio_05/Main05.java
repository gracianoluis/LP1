package Exercicio_05;
import java.util.Scanner;
public class Main05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Cálculo de Média LP1");
        System.out.print("Digite a nota da primeira prova (P1): ");
        double p1 = leitor.nextDouble();
        System.out.print("Digite a nota da segunda prova (P2): ");
        double p2 = leitor.nextDouble();
        double media = (p1 + p2) / 2;
        System.out.println("A média de LP1 é " + media);
        leitor.close();
    }
}