// TP01Ex06 Enunciado: Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();
        
        System.out.print("Digite o quarto valor: ");
        double valor4 = scanner.nextDouble();
        
        // Fórmula para calcular a média aritmética: (v1 + v2 + v3 + v4) / 4
        double media = (valor1 + valor2 + valor3 + valor4) / 4;
        
        System.out.println("A média aritmética é: " + media);
        
        scanner.close();
    }
}
