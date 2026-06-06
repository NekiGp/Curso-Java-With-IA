package Aula04_Loops;

public class Aula4Teoria {
    public static void main(String[] args) {
        int distanciaKm = 3; // Condição inicial

        System.out.println("--- RASTREAMENTO DO PEDIDO ---");

        // O loop vai rodar ENQUANTO a distância for maior que zero
        while (distanciaKm > 0) {
            System.out.println("O motoboy está a " + distanciaKm + " km de distância...");

            // ATENÇÃO: Reduzimos a distância a cada volta para evitar o loop infinito!
            distanciaKm--;
        }

        // Quando a distância chega a 0, o loop quebra e o código continua aqui
        System.out.println("Pedido entregue! Bom apetite! 🍕");
    }
}
