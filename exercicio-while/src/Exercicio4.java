import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Escreva um programa em Java que solicita ao usuário um número inteiro positivo e
        calcula a soma de seus dígitos usando um loop while. Ex: 1234 = 10, 3333 = 12, ...
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro positivo: ");
        int numero = scanner.nextInt();


        int somaDosDigitos = 0;

        while (numero > 0) {
            int digito = numero % 10; // Obtém o último dígito
            System.out.println("Digito: " + digito);
            somaDosDigitos += digito; // Adiciona o dígito à soma
            numero /= 10; // Remove o último dígito
        }

        System.out.println("A soma dos dígitos é: " + somaDosDigitos);

    }
}