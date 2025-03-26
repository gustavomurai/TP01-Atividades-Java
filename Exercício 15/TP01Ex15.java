// TP01Ex15 Enunciado: Calcular e exibir o desconto em uma compra.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita o valor da compra e o desconto
        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        
        System.out.print("Digite o percentual de desconto: ");
        double descontoPercentual = scanner.nextDouble();
        
        // Calcula o valor do desconto
        double desconto = valorCompra * (descontoPercentual / 100);
        double valorComDesconto = valorCompra - desconto;
        
        System.out.println("O valor do desconto é: " + desconto + " reais");
        System.out.println("O valor com desconto é: " + valorComDesconto + " reais");
    }
}
