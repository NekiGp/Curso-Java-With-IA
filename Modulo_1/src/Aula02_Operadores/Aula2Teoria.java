package Aula02_Operadores;

public class Aula2Teoria {
    public static void main(String[] args) {
        // 1. Entrada de dados (Nossas gavetas da Aula 1)
        double salarioMensal = 4000.0;
        double valorParcelaDesejada = 1100.0;
        int idadeDoCliente = 22;
        boolean temNomeLimpo = true;

        // 2. Operadores Aritméticos e de Atribuição
        // O banco diz que a parcela não pode passar de 30% (0.3) do salário do cliente
        double limiteMaximoParcela = salarioMensal * 0.3;

        // 3. Operadores Relacionais e Lógicos
        // Condição 1: A parcela cabe no bolso?
        boolean parcelaEValida = valorParcelaDesejada <= limiteMaximoParcela;

        // Condição 2: A idade está dentro da faixa aceitável (entre 18 e 65 anos)?
        boolean idadeEValida = idadeDoCliente >= 18 && idadeDoCliente <= 65;

        // Condição Final: O crédito só é aprovado se: Parcela válida E Idade válida E Nome limpo
        boolean creditoAprovado = parcelaEValida && idadeEValida && temNomeLimpo;

        // 4. Exibindo os resultados (Estilo tradicional que você escolheu)
        System.out.println("Salário do Cliente: R$ " + salarioMensal);
        System.out.println("Limite máximo permitido para a parcela: R$ " + limiteMaximoParcela);
        System.out.println("A parcela é válida para o perfil? " + parcelaEValida);
        System.out.println("A idade é permitida? " + idadeEValida);
        System.out.println("--- RESULTADO DA ANÁLISE ---");
        System.out.println("Financiamento Aprovado? " + creditoAprovado);
}
}
