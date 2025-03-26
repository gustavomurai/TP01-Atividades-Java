// TP01Ex08 Enunciado: Converter milhas marítimas em quilômetros.
// Dupla: Gustavo Mura e Igor Murai

import java.util.Scanner;

public class TP01Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor em milhas marítimas: ");
        double milhasMaritimas = scanner.nextDouble();
        
        // 1 milha marítima = 1852 metros
        // 1 quilômetro = 1000 metros
        double quilometros = milhasMaritimas * 1852 / 1000;
        
        System.out.println("O valor em quilômetros é: " + quilometros);
        
        scanner.close();
    }
}
