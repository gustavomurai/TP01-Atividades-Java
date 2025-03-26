// TP01Ex01 Enunciado do Exercício 1:
// Entrar via teclado com a base e a altura de um retângulo,
// calcular e exibir sua área.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex01 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para inserir a base do retângulo
        System.out.print("Digite a base do retângulo: ");
        double base = scanner.nextDouble();
        
        // Pedindo ao usuário para inserir a altura do retângulo
        System.out.print("Digite a altura do retângulo: ");
        double altura = scanner.nextDouble();
        
        // Calculando a área do retângulo (área = base * altura)
        double area = base * altura;
        
        // Exibindo o resultado
        System.out.println("A área do retângulo é: " + area);
        
        // Fechando o scanner para evitar problemas de memória
        scanner.close();
    }
}
