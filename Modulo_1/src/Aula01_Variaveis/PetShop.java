package Aula01_Variaveis;

public class PetShop {

    // Escreva exatamente assim para garantir o padrão de mercado:
    public static void main(String[] args) {

    // VARIAVEIS
        String nomeDoCachorro = "Dexter";
        int idadeDoCachorro = 3;
        double peso = 10.5;
        boolean vacinado = true;

    // SAIDA
        System.out.println("--- DADOS DO PACIENTE ---");
        System.out.println("Nome do Cão: " + nomeDoCachorro );
        System.out.println("Idade: " + idadeDoCachorro + " anos");
        System.out.println("Peso: " + peso);
        System.out.println("Já está vacinado? " + vacinado);

    }
}
