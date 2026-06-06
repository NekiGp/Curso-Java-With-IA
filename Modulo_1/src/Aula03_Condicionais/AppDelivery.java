package Aula03_Condicionais;

public class AppDelivery {
    public static void main(String[] args) {
        //Variaveis de entrada
        double valorCompra = 120.0;
        double valorFrete;
        boolean cupomVip = true;
        System.out.println("--- FATURA APPDELIVERY ---");
        if (valorCompra >= 150 || cupomVip) {
            valorFrete = 0.0;
            System.out.println("Parabéns!!! Voce ganhou FRETE GRÁTIS");
        }

        else if (valorCompra >= 80) {
            valorFrete = 10.00;
            System.out.println("Seu frete está saindo por R$" + valorFrete);
        }
        else {
            valorFrete = 20.00;
            System.out.println("Seu frete está saindo por R$" + valorFrete);
        }
        System.out.println("E sua compra está custando R$" + valorCompra);
        System.out.println("Portanto. Sua fatura total é de R$" + (valorCompra + valorFrete));
    }
}
