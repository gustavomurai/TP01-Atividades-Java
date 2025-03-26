// TP01Ex13 Enunciado: Calcular e exibir a quantidade de litros de combustível necessária para uma viagem.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a distância e o consumo do carro
        System.out.print("Digite a distância (em quilômetros): ");
        double distancia = scanner.nextDouble();
        
        System.out.print("Digite o consumo do carro (km/l): ");
        double consumo = scanner.nextDouble();
        
        // Calcula a quantidade de combustível necessária
        double combustivelNecessario = distancia / consumo;
        
        System.out.println("A quantidade de combustível necessária é: " + combustivelNecessario + " litros");
    }
}
