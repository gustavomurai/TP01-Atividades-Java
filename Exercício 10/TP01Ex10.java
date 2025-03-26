// TP01Ex10 Enunciado: Calcular e exibir o valor do salário líquido.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o salário bruto
        System.out.print("Digite o valor do salário bruto: ");
        double salarioBruto = scanner.nextDouble();
        
        // Calcula o salário líquido
        double salarioLiquido = salarioBruto * 0.85; // Desconto de 15%
        
        System.out.println("O valor do salário líquido é: " + salarioLiquido);
    }
}
