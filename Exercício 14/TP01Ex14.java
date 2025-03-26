// TP01Ex14 Enunciado: Calcular e exibir o custo de uma viagem.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita os dados da viagem
        System.out.print("Digite o preço do combustível (por litro): ");
        double precoCombustivel = scanner.nextDouble();
        
        System.out.print("Digite o consumo do carro (km/l): ");
        double consumo = scanner.nextDouble();
        
        System.out.print("Digite a distância da viagem (em quilômetros): ");
        double distancia = scanner.nextDouble();
        
        // Calcula o custo total da viagem
        double combustivelNecessario = distancia / consumo;
        double custoViagem = combustivelNecessario * precoCombustivel;
        
        System.out.println("O custo total da viagem será: " + custoViagem + " reais");
    }
}
