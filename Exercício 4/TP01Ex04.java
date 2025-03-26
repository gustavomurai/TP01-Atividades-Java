// TP01Ex04 Enunciado: A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da base do triângulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite o valor da altura do triângulo: ");
        double altura = scanner.nextDouble();
        
        // Fórmula para calcular a área do triângulo: A = (base * altura) / 2
        double area = (base * altura) / 2;
        
        System.out.println("A área do triângulo é: " + area);
        
        scanner.close();
    }
}
