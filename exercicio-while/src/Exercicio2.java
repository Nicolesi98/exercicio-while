import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        Implemente uma calculadora de fatorial em Java usando um loop while. O programa
        deve solicitar ao usuário um número inteiro não negativo e calcular o fatorial desse
        número. Cuidado com números muito grandes!
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para calcular o seu fatorial: ");
        int numero = scanner.nextInt();

        System.out.println("Segue os números pares de 1 até " + numero + ":");

        long resultado = 1;

        while (numero > 1) {
            resultado *= numero;
            numero--;
        }

        System.out.println("O fatorial é: " + resultado);

    }
}