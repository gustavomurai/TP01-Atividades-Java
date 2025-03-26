// TP01Ex05 Enunciado: Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do diâmetro da esfera: ");
        double diametro = scanner.nextDouble();
        
        // Fórmula para calcular o volume da esfera: V = (4/3) * pi * (r³)
        double raio = diametro / 2;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        
        System.out.println("O volume da esfera é: " + volume);
        
        scanner.close();
    }
}
