// TP01Ex18 Enunciado: Calcular e exibir a diferença de idades entre duas pessoas.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita as idades das pessoas
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();
        
        // Calcula a diferença de idades
        int diferencaIdade = Math.abs(idade1 - idade2);
        
        System.out.println("A diferença de idades é: " + diferencaIdade + " anos");
    }
}
