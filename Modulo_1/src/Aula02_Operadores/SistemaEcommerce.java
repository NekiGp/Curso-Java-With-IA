package Aula02_Operadores;

public class SistemaEcommerce {
    public static void main(String[] args) {
        //Variáveis de entrada
        double precoOriginal = 200.0 ;
        double desconto = 30.0;
        boolean vip = true;
        double saldoCarteira = 500.0;

        //Calcular
        double precoFinal = precoOriginal - desconto;
        precoFinal += 20.0;
        boolean freteGratis = precoFinal >= 150.00 && !vip;
        boolean compraValida = saldoCarteira >= precoFinal;

        //Saida
        System.out.println("--- Amazon E-commerce ---");
        System.out.println("Preço Final: R$" + precoFinal);
        System.out.println("Frete Grátis: " + freteGratis);
        System.out.println("Compra Válida? " + compraValida);

}
}
