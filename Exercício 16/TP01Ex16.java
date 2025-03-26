// TP01Ex16 Enunciado: Calcular e exibir a área de um círculo.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o valor do raio
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        
        // Calcula a área do círculo
        double area = Math.PI * Math.pow(raio, 2);
        
        System.out.println("A área do círculo é: " + area);
    }
}
