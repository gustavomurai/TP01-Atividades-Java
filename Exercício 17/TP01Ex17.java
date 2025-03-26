// TP01Ex17 Enunciado: Calcular e exibir o valor da hipotenusa.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita os catetos
        System.out.print("Digite o valor do primeiro cateto: ");
        double cateto1 = scanner.nextDouble();
        
        System.out.print("Digite o valor do segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        
        // Calcula a hipotenusa usando o Teorema de Pitágoras
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
    }
}
