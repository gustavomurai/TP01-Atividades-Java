// TP01Ex12 Enunciado: Calcular e exibir o valor de um empréstimo.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita os dados do empréstimo
        System.out.print("Digite o valor do empréstimo: ");
        double emprestimo = scanner.nextDouble();
        
        System.out.print("Digite a taxa de juros (em %): ");
        double taxaJuros = scanner.nextDouble();
        
        System.out.print("Digite o número de parcelas: ");
        int parcelas = scanner.nextInt();
        
        // Calcula o valor total do empréstimo
        double valorTotal = emprestimo + (emprestimo * taxaJuros / 100);
        
        System.out.println("O valor total do empréstimo será: " + valorTotal);
    }
}
