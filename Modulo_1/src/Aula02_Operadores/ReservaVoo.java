package Aula02_Operadores;

public class ReservaVoo {
    public static void main(String[] args) {
        //VARIAVEIS DE ENTRADA
        double precoPassagem = 1000.0;
        double pesoMala = 25.0;
        boolean temExcessoBagagem = pesoMala > 23.0;
        boolean clubeOuro = true;
        boolean cupomDesconto = true;

        //REGRAS DE NEGOCIOS
            //Taxa de excesso de bagagem
        double taxaBagagem = 90.00;
        precoPassagem += taxaBagagem;
        boolean acessoLoungerVip = clubeOuro || precoPassagem >= 1500.00;
        boolean embarquePrioritario = cupomDesconto && !clubeOuro;

        System.out.println("Valor final da passagem: " + precoPassagem);
        System.out.println("Tem acesso ao LoungerVip? " + acessoLoungerVip);
        System.out.println("Tem direito ao embarque prioritario? " + embarquePrioritario);

    }
}
