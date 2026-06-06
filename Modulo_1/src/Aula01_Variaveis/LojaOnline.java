package Aula01_Variaveis;

public class LojaOnline {
    public static void main(String[] args) {
        // VARIAVEIS
            String nomeDoProduto = "Smartwatch Premium";
            char categoria = 'E';
            int quantidadeDeEstoque = 14;
            double preco = 1899.90;
            boolean freteGratis = true;

        // SAIDA
            System.out.println("--- FICHA DO PRODUTO ---");
            System.out.println("Produto: %s".formatted(nomeDoProduto));
            System.out.println("Categoria: %d)".formatted(quantidadeDeEstoque));
            System.out.println("Estoque: " + quantidadeDeEstoque);
            System.out.println("Preço: " + preco);
            System.out.println("Frete Grátis: " + freteGratis);
    }
}
