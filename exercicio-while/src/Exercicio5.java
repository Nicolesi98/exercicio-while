import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Crie um programa em Java que solicita ao usuário um número inteiro positivo e, em
        seguida, use um loop while para exibir uma contagem regressiva, começando do
        número inserido até 1.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo: ");
        int numero = scanner.nextInt(); // 5

        System.out.println("Começando contagem regressiva: ");

        while (numero >= 1) {
            System.out.println(numero);
            numero--; // numero = numero - 1;
        }



    }
}