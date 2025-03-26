// TP01Ex11 Enunciado: Calcular e exibir a velocidade média.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o tempo e a distância
        System.out.print("Digite o tempo gasto (em horas): ");
        double tempo = scanner.nextDouble();
        
        System.out.print("Digite a distância percorrida (em quilômetros): ");
        double distancia = scanner.nextDouble();
        
        // Calcula a velocidade média
        double velocidadeMedia = distancia / tempo;
        
        System.out.println("A velocidade média é: " + velocidadeMedia + " km/h");
    }
}
