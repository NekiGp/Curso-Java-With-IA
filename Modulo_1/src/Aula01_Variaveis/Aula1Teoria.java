package Aula01_Variaveis;

public class Aula1Teoria {
    public static void main(String[] args) {
        // DECLARAÇÃO E INICIALIZAÇÃO
        String nomeDoAluno = "Você";
        int aulasConcluidas = 0;
        double notaFinal = 9.8;
        boolean compilaSemErros = true;

        // EXIBIÇÃO NO CONSOLE
        // O símbolo de '+' serve para JUNTAR (concatenar) o texto com a variável
        System.out.println("Aluno: " + nomeDoAluno);
        System.out.println("Aulas feitas: " + aulasConcluidas);
        System.out.println("Nota esperada: " + notaFinal);
        System.out.println("O código funciona? " + compilaSemErros);
    }
}