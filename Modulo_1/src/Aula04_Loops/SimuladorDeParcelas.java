package Aula04_Loops;

public class SimuladorDeParcelas {
    public static void main(String[] args) {
        // Variaveis de entrada
        double valorTotalFatura = 250.00;

        System.out.println("--- SIMULADOR DE PARCELAMENTO ---");

        for (int i = 1; i <= 10; i++) {
            if (i < 6) {
                System.out.println("Opção " + i + ": " + i + "x de R$ " + (valorTotalFatura / i));
            }
            else {
                System.out.println("Opção " + i + ": " + i + "x de R$ " + (valorTotalFatura / i) + " (Com Juros do Banco)");
            }
        }
    }
}
