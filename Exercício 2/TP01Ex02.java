// TP01Ex02 Enunciado: Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner; // Importa a classe Scanner para entrada de dados

public class TP01Ex02 {
    public static void main(String[] args) {
        
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário o valor da aresta do quadrado
        System.out.print("Digite o valor da aresta do quadrado: ");
        double aresta = scanner.nextDouble(); // Lê o valor digitado
        
        // Calcula a área do quadrado (área = aresta * aresta)
        double area = aresta * aresta;
        
        // Exibe a área do quadrado
        System.out.println("A área do quadrado é: " + area);
        
        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
