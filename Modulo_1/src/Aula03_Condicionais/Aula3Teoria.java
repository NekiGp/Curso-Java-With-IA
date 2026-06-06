package Aula03_Condicionais;

public class Aula3Teoria {
    public static void main(String[] args) {
        // Variáveis de entrada
        int idadePassageiro = 12;
        double precoBasePassagem = 300.0;
        double precoFinal;

        // Regra de negócio com estruturas condicionais
        if (idadePassageiro < 2) {
            // Bebês pagam apenas 10% da passagem
            precoFinal = precoBasePassagem * 0.10;
            System.out.println("Desconto aplicado: Categoria Bebê (90% OFF).");
        } else if (idadePassageiro <= 12) {
            // Crianças pagam meia-passagem
            precoFinal = precoBasePassagem * 0.50;
            System.out.println("Desconto aplicado: Categoria Criança (50% OFF).");
        } else {
            // Todos os outros pagam tarifa inteira
            precoFinal = precoBasePassagem;
            System.out.println("Tarifa aplicada: Categoria Adulto (Sem desconto).");
        }

        // Exibindo o resultado final usando a concatenação tradicional (+)
        System.out.println("O valor final da passagem é: R$" + precoFinal);
    }
}
