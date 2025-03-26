// TP01Ex03 Enunciado: Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da diagonal do quadrado: ");
        double diagonal = scanner.nextDouble();
        
        // Fórmula para calcular a área a partir da diagonal: A = (d²) / 2
        double area = (diagonal * diagonal) / 2;
        
        System.out.println("A área do quadrado é: " + area);
        
        scanner.close();
    }
}
