package Exercicio_04;
public class Main04 {
    public static void main(String[] args) {
        double gastosJaneiro = 15000.0;
        double gstosFevereiro = 23000.0;
        double gstosMarco = 17000.0;
        double despesasTotal = gastosJaneiro + gstosFevereiro + gstosMarco;
        double mediaMensal = despesasTotal / 3;

        System.out.println("Despesas total no trimestre: R$" + despesasTotal);
        System.out.println("Média mensal de gastos: R$" + mediaMensal);
    }
}
