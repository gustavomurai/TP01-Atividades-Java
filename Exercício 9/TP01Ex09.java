// TP01Ex09 Enunciado: Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
// Dupla: Gustavo Murai e Igor Murai

import java.util.Scanner;

public class TP01Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da resistência (em ohms): ");
        double resistencia = scanner.nextDouble();
        
        System.out.print("Digite o valor da corrente (em amperes): ");
        double corrente = scanner.nextDouble();
        
        // Fórmula de Ohm: Tensão (V) = Resistência (R) * Corrente (I)
        double tensao = resistencia * corrente;
        
        System.out.println("A tensão é: " + tensao + " volts");
        
        scanner.close();
    }
}
